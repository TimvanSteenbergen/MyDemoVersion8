/*global logger*/
/*
    MonthandYearPicker
    ========================

    @file      : MonthandYearPicker.js
    @version   : 1.0
    @author    : Javith  Baig
    @date      : Fri, 28 Aug 2020 06:33:23 GMT
    @copyright : indiumsoft
    @license   : Apache V2

    Documentation
    ========================
    Describe your widget here.
*/

// Required module list. Remove unnecessary modules, you can always get them back from the boilerplate.
define([
    'dojo/_base/declare',  
	'mxui/widget/_WidgetBase',  
    'mxui/dom', 
	'dojo/dom-construct',
	'dojo/_base/lang', 
	'dojo/text', 
	'dojo/_base/kernel', 
	'dojo/dom-class',
    'MonthandYearPicker/lib/jquery',  
	'MonthandYearPicker/lib/bootstrap-datepicker'
	 
], function (declare, _WidgetBase, dom, domConstruct, lang, text, kernel, domClass, _jquery, btdatepicker) {
    'use strict';
    var $ = _jquery.noConflict(true);
    // Declare widget's prototype.
    return declare('MonthandYearPicker.widget.MonthandYearPicker', [ _WidgetBase, ], {

        // Internal variables. Non-primitives created in the prototype are shared between all widget instances.
        _handle: [],
        _contextObj: null,
		selector: null, 
		enabled: true,
		date1: null,
		date2: null,

        constructor: function () {
			dom.addCss('widgets/MonthandYearPicker/widget/ui/bootstrap-datepicker3.css');
			this.loadTranslations();
        },


        postCreate: function () {
			var id = this.id + "_cal";
            var div = dom.create('div' , { 'id' : id } );
			this.domNode.appendChild(div);
			this.selector = '#' + id + ' input';
			if (this.displaytype==="range" && (this.dateattrto===null || this.dateattrto===undefined || this.dateattr===this.dateattrto)) {
				this.displaytype = "textinput";
				logger.debug("range without second date attribute provided: fallback to text input");
			}
			var ro = this.readonly?{ readonly : 'true'}:{};
			switch (this.displaytype) { 
				case "textinput": 
					this.selector = '#' + id + ' input';
					div.appendChild(dom.create('input', $.extend({ 'class': 'form-control', 'type': 'text'}, ro)));
					break;
				case "component": 
					this.selector = '#' + id + ' .input-group.date';
					var groupdiv = div.appendChild(dom.create('div', { 'class': 'input-group date' }));
					groupdiv.appendChild(dom.create('input', $.extend({ 'class': 'form-control', 'type': 'text'}, ro)));
					var span = dom.create('span', { 'class': 'input-group-addon' });
					groupdiv.appendChild(span);
					span.appendChild(dom.create('i', { 'class': 'glyphicon glyphicon-th' }));					
					break;
				case "embedded": 
					this.selector = '#' + id + '';
					break;
				case "range": 
					this.selector = '#' + id + ' .input-daterange';
					var rangediv = div.appendChild(dom.create('div', { 'class': 'input-daterange input-group', 'id' : 'datepicker' }));
					rangediv.appendChild(dom.create('input', $.extend({ 'class': 'input-sm form-control', 'type': 'text', 'name': 'start', 'id': 'startTime' }, ro)));
					rangediv.appendChild(dom.create('span', { 'class': 'input-group-addon' }, this.totext||"To"));
					rangediv.appendChild(dom.create('input', $.extend({ 'class': 'input-sm form-control', 'type': 'text', 'name': 'end', 'id' : 'endTime' }, ro)));
					break;
			}

			$(this.selector).datepicker({
                format:this.format,
                viewMode:"years",
                viewMode:"months",
                minViewMode:"years",
                minViewMode:"months",
				language: dojo.locale,
				calendarWeeks: this.calendarweeks,
				weekStart: this.weekstart,
				todayBtn: this.todaybutton===true?"Linked":false,
				clearBtn: this.clearbutton,
				autoclose: this.autoclose,
				daysOfWeekDisabled: this.daysofweekdisabled,
				todayHighlight: this.todayhighlight,
				startDate: this.limitstart,
				endDate: this.limitend,
				enableOnReadonly: false
			}).on('changeDate', dojo.hitch(this, this.dateChanged));
        },
		
		dateChanged: function (ev) {
			logger.debug('datechanged', ev);
			var d = new Date(ev.date);
			if (this._contextObj && ev.type=="changeDate" && ev.date && (!isNaN(d.getTime())) && (d.getYear()>0)) {
				ev.date.setHours(this.defaulthours);
				// second field for range?
				if(ev.target.attributes.name && ev.target.attributes.name.value=="end" && this.dateattrto) {
					this._contextObj.set(this.dateattrto, ev.date);
				} else {
					logger.debug('set date', ev.date);
					this._contextObj.set(this.dateattr, ev.date);
				}
				this.callmf();
			}
		},
		
		callmf: function () {
			if (this.mfToExecute) {
				mx.data.action({
					params: {
						applyto: 'selection',
						actionname: this.mfToExecute,
						guids: [this._contextObj.getGuid()]
					},
					callback: function (obj) {
					},
					error: function (error) {
						logger.debug(this.id + ': An error occurred while executing microflow: ' + error.description);
					}
				}, this);		
			}
		},
		
		update: function (obj, callback) {
			logger.debug('update');
			if (this._contextObj != obj) {
				this._contextObj = obj;
				this.resetSubscriptions();
				this._updateRendering(obj);
			}
			
            if (callback) {
				callback();
			}
        },

        _updateRendering: function () {
            var obj = this._contextObj;
			var date1 = obj.get(this.dateattr);
			var enabled = true;
			if (this.editableattr) {
				enabled = obj.get(this.editableattr); 
			}
			if (enabled) {
				this.enable();
			} else {
				this.disable();
			}
			if (this.displaytype=="range" && this.dateattrto) {
				// undocumented feature to set start end: https://groups.google.com/forum/#!msg/bootstrap-datepicker/9q5n35QCpgg/sznmzU7-yaYJ
				if (date1) {
					$(this.selector).find('#startTime').datepicker('update', new Date(date1)); 
				}
				var date2 = obj.get(this.dateattrto);
				if (date2) {
					$(this.selector).find('#endTime').datepicker('update', new Date(obj.get(this.dateattrto))); 
				}
				$(this.selector).data('datepicker').updateDates();				
			} else {
				if (date1 != this.date1) {
					console.log('selector', this.selector);
					$(this.selector).datepicker('update', new Date(date1));
					this.date1 = date1;
				}
			}
			if (this.dateattrstart && obj && obj.get(this.dateattrstart)) {
				$(this.selector).datepicker('setStartDate', new Date(obj.get(this.dateattrstart)));
			}
			if (this.dateattrend && obj && obj.get(this.dateattrend)) {
				$(this.selector).datepicker('setEndDate', new Date(obj.get(this.dateattrend)));
			}
			this._clearValidations();
        },

        enable: function () {
			if (!this.readonly) {
				this.enabled = true;
				$(this.selector).removeAttr("readonly");
				$(this.selector).add("readonly");
				domClass.remove(this.domNode, "btdatepicker-disabled");
			}
        },

        disable: function () {
			this.enabled = false;
			$(this.selector).attr("readonly", "true");
			domClass.add(this.domNode, "btdatepicker-disabled");
        },

        uninitialize: function () {
			if(this._handles){
				this._handles.forEach(function (handle, i) {
					if (handle) {
						mx.data.unsubscribe(handle);
					}
				});
			}
		},
		
		_handleValidation: function(validations) {
			this._clearValidations();
			
			var val = validations[0];
			var msg = val.getReasonByAttribute(this.dateattr);    

			if(this.readOnly){
				val.removeAttribute(this.dateattr);
			} else {                                
				if (msg) {
					this._addValidation(msg);
					val.removeAttribute(this.dateattr);
				}
			}
		},
		
		_clearValidations: function() {
			domConstruct.destroy(this._alertdiv);
		},
		
		_addValidation : function(msg) {
			this._alertdiv = domConstruct.create("div", { 
				'class' : 'alert alert-danger',
				innerHTML: msg });
			
			this.domNode.appendChild(this._alertdiv);
		},		
		
		resetSubscriptions: function () {
			var objHandle = null, 
				attrHandle = null, 
				attrHandleTo = null,
				validationHandle = null,
				attrHandle2 = null,
				attrHandleStart = null,
				attrHandleEnd = null;
			
			// Release handles on previous object, if any.
			if(this._handles){
				this._handles.forEach(function (handle, i) {
					mx.data.unsubscribe(handle);
				});
			}

            if (this._contextObj) {
				objHandle = this.subscribe({
					guid: this._contextObj.getGuid(),
					callback: lang.hitch(this,function(guid) {
						this._updateRendering();
					})
				});
				// 
                attrHandle = this.subscribe({
                    guid: this._contextObj.getGuid(),
                    attr: this.dateattr,
					callback: lang.hitch(this,function(guid,attr,attrValue) {
						logger.debug('update attr', new Date(attrValue), this.id, this.selector);
						if (attrValue != this.date1) {
							$(this.selector).datepicker('update', new Date(attrValue));
							this.date1 = attrValue;
						}
					})
                });
				if (this.dateattrto) {
					attrHandleTo = this.subscribe({
						guid: this._contextObj.getGuid(),
						attr: this.dateattrto,
						callback: lang.hitch(this,function(guid,attr,attrValue) {
							$(this.selector).find('#endTime').datepicker('update', new Date(attrValue)); 
							logger.debug('update attr', attr, attrValue);
							this._updateRendering();
						})
					});
				}
				if (this.dateattrstart) {
					attrHandleStart = this.subscribe({
						guid: this._contextObj.getGuid(),
						attr: this.dateattrstart,
						callback: lang.hitch(this,function(guid,attr,attrValue) {
							$(this.selector).datepicker('setStartDate', attrValue?new Date(attrValue):false);
							logger.debug('update start date ', attr, attrValue);
						})
					});
				}
				if (this.dateattrend) {
					attrHandleEnd = this.subscribe({
						guid: this._contextObj.getGuid(),
						attr: this.dateattrend,
						callback: lang.hitch(this,function(guid,attr,attrValue) {
							$(this.selector).datepicker('setEndDate', attrValue?new Date(attrValue):false);
							logger.debug('update end date', attr, attrValue);
						})
					});
				}				
				
				if (this.editableattr) {
					attrHandle2 = this.subscribe({
						guid: this._contextObj.getGuid(),
						attr: this.editableattr,
						callback: lang.hitch(this,function(guid,attr,attrValue) {
							if (attrValue) {
								this.enable();
							} else {
								this.disable();
							}
						})
					});		
				}
				
				validationHandle = mx.data.subscribe({
					guid     : this._contextObj.getGuid(),
					val      : true,
					callback : lang.hitch(this,this._handleValidation)
				});
			
				this._handles = [objHandle, attrHandle, validationHandle, attrHandle2, attrHandleTo, attrHandleStart, attrHandleEnd];
            }
        },
		loadTranslations: function () {
			// copy paste content from the locale file you want to extend
			$.fn.datepicker.dates.nl = {
				days: ["Zondag", "Maandag", "Dinsdag", "Woensdag", "Donderdag", "Vrijdag", "Zaterdag", "Zondag"],
				daysShort: ["Zo", "Ma", "Di", "Wo", "Do", "Vr", "Za", "Zo"],  
				daysMin: ["Zo", "Ma", "Di", "Wo", "Do", "Vr", "Za", "Zo"],
				months: ["Januari", "Februari", "Maart", "April", "Mei", "Juni", "Juli", "Augustus", "September", "Oktober", "November", "December"],
				monthsShort: ["Jan", "Feb", "Mrt", "Apr", "Mei", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dec"],
				today: "Vandaag",
				clear: "Wissen",
				weekStart: 1,
				format: "dd-mm-yyyy"
			};
			$.fn.datepicker.dates.de = {
				days: ["Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"],
				daysShort: ["Son", "Mon", "Die", "Mit", "Don", "Fre", "Sam", "Son"],
				daysMin: ["So", "Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"],
				months: ["Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"],
				monthsShort: ["Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"],
				today: "Heute",
				clear: "Löschen",
				weekStart: 1,
				format: "dd.mm.yyyy"
			};
			$.fn.datepicker.dates['en-GB'] = {
				days: ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"],
				daysShort: ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"],
				daysMin: ["Su", "Mo", "Tu", "We", "Th", "Fr", "Sa", "Su"],
				months: ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"],
				monthsShort: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"],
				today: "Today",
				clear: "Clear",
				weekStart: 1,
				format: "dd/mm/yyyy"
			};
			$.fn.datepicker.dates.gl = {
				days: ["Domingo", "Luns", "Martes", "Mércores", "Xoves", "Venres", "Sábado", "Domingo"],
				daysShort: ["Dom", "Lun", "Mar", "Mér", "Xov", "Ven", "Sáb", "Dom"],
				daysMin: ["Do", "Lu", "Ma", "Me", "Xo", "Ve", "Sa", "Do"],
				months: ["Xaneiro", "Febreiro", "Marzo", "Abril", "Maio", "Xuño", "Xullo", "Agosto", "Setembro", "Outubro", "Novembro", "Decembro"],
				monthsShort: ["Xan", "Feb", "Mar", "Abr", "Mai", "Xun", "Xul", "Ago", "Sep", "Out", "Nov", "Dec"],
				today: "Hoxe",
				clear: "Limpar",
				weekStart: 1,
				format: "dd/mm/yyyy"
			};	

			$.fn.datepicker.dates.es = {
				days: ["Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"],
				daysShort: ["Dom", "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"],
				daysMin: ["Do", "Lu", "Ma", "Mi", "Ju", "Vi", "Sa", "Do"],
				months: ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"],
				monthsShort: ["Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"],
				today: "Hoy",
				clear: "Borrar",
				weekStart: 1,
				format: "dd/mm/yyyy"
			};
			$.fn.datepicker.dates.fr = {
				days: ["Dimanche", "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"],
				daysShort: ["Dim", "Lun", "Mar", "Mer", "Jeu", "Ven", "Sam", "Dim"],
				daysMin: ["D", "L", "Ma", "Me", "J", "V", "S", "D"],
				months: ["Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"],
				monthsShort: ["Jan", "Fév", "Mar", "Avr", "Mai", "Jui", "Jul", "Aou", "Sep", "Oct", "Nov", "Déc"],
				today: "Aujourd'hui",
				clear: "Effacer",
				weekStart: 1,
				format: "dd/mm/yyyy"
			};			
		}

 
    });
});

require(["MonthandYearPicker/widget/MonthandYearPicker"], function () {
    "use strict";
    return;
});


