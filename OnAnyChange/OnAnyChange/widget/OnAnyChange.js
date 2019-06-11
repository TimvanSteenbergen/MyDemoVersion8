define([
    "dojo/_base/declare",
    "mxui/widget/_WidgetBase",
    "dojo/_base/lang"

], function (declare, _WidgetBase, lang ) {
    "use strict";

    return declare("OnAnyChange.widget.OnAnyChange", [ _WidgetBase ], {

        // Internal variables.
        _contextObj: null,

        // parameters
        microflowAction: null,
        nanoflowAction: null,

        update: function (obj, callback) {
            logger.debug(this.id + ".update");

            if ( this._contextObj && ( !obj || obj.getGuid() != this._contextObj.getGuid() )) {
                this.unsubscribeAll();
            }
            if ( obj && ( !this._contextObj || obj.getGuid() != this._contextObj.getGuid() )) {
                this._contextObj = obj;

                var attributes = this._contextObj.getAttributes();
                attributes.forEach( function( attr ) {
                    this.subscribe({
                        guid: this._contextObj.getGuid(),
                        attr: attr,
                        callback: lang.hitch(this, function( guid, attr, value ) {
                            this._runAction();
                        })
                    })
                }, this);
            }
            this._contextObj = obj;

            this._executeCallback(callback, "_update");
        },

        _runAction: function() {
            if ( this.microflowAction ) {
                this._execMf( this.microflowAction, this._contextObj.getGuid() );
            }
            if ( this.nanoflowAction.nanoflow && this.mxcontext ) {
                this._execNano( this.nanoflowAction );
            }
        },

        // Shorthand for running a microflow
        _execMf: function (mf, guid, cb) {
            logger.debug(this.id + "._execMf");
            if (mf && guid) {
                mx.ui.action(mf, {
                    params: {
                        applyto: "selection",
                        guids: [guid]
                    },
                    callback: lang.hitch(this, function (objs) {
                        if (cb && typeof cb === "function") {
                            cb(objs);
                        }
                    }),
                    error: function (error) {
                        console.debug(error.description);
                    }
                }, this);
            }
        },

        // Shorthand for running a microflow
        _execNano: function (nf, cb) {
            logger.debug(this.id + "._execNano");
            window.mx.data.callNanoflow({
                nanoflow: nf,
                origin: this.mxform,
                context: this.mxcontext,
                callback: lang.hitch(this, function (objs) {
                    if (cb && typeof cb === "function") {
                        cb(objs);
                    }
                }),
                error: function (error) {
                    console.debug(error.description);
                }
            }, this);  
        },

        // Shorthand for executing a callback, adds logging to your inspector
        _executeCallback: function (cb, from) {
            logger.debug(this.id + "._executeCallback" + (from ? " from " + from : ""));
            if (cb && typeof cb === "function") {
                cb();
            }
        }
    });
});

require(["OnAnyChange/widget/OnAnyChange"]);
