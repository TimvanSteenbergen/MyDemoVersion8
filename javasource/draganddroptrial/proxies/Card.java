// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package draganddroptrial.proxies;

public class Card
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject cardMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DragAndDropTrial.Card";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		CardId("CardId"),
		Title("Title"),
		Description("Description"),
		Card_Lane("DragAndDropTrial.Card_Lane");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Card(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DragAndDropTrial.Card"));
	}

	protected Card(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject cardMendixObject)
	{
		if (cardMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DragAndDropTrial.Card", cardMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DragAndDropTrial.Card");

		this.cardMendixObject = cardMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Card.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static draganddroptrial.proxies.Card initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return draganddroptrial.proxies.Card.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static draganddroptrial.proxies.Card initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new draganddroptrial.proxies.Card(context, mendixObject);
	}

	public static draganddroptrial.proxies.Card load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return draganddroptrial.proxies.Card.initialize(context, mendixObject);
	}

	public static java.util.List<draganddroptrial.proxies.Card> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<draganddroptrial.proxies.Card> result = new java.util.ArrayList<draganddroptrial.proxies.Card>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DragAndDropTrial.Card" + xpathConstraint))
			result.add(draganddroptrial.proxies.Card.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of CardId
	 */
	public final java.lang.Integer getCardId()
	{
		return getCardId(getContext());
	}

	/**
	 * @param context
	 * @return value of CardId
	 */
	public final java.lang.Integer getCardId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.CardId.toString());
	}

	/**
	 * Set value of CardId
	 * @param cardid
	 */
	public final void setCardId(java.lang.Integer cardid)
	{
		setCardId(getContext(), cardid);
	}

	/**
	 * Set value of CardId
	 * @param context
	 * @param cardid
	 */
	public final void setCardId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer cardid)
	{
		getMendixObject().setValue(context, MemberNames.CardId.toString(), cardid);
	}

	/**
	 * @return value of Title
	 */
	public final java.lang.String getTitle()
	{
		return getTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of Title
	 */
	public final java.lang.String getTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Title.toString());
	}

	/**
	 * Set value of Title
	 * @param title
	 */
	public final void setTitle(java.lang.String title)
	{
		setTitle(getContext(), title);
	}

	/**
	 * Set value of Title
	 * @param context
	 * @param title
	 */
	public final void setTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String title)
	{
		getMendixObject().setValue(context, MemberNames.Title.toString(), title);
	}

	/**
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of Card_Lane
	 */
	public final draganddroptrial.proxies.Lane getCard_Lane() throws com.mendix.core.CoreException
	{
		return getCard_Lane(getContext());
	}

	/**
	 * @param context
	 * @return value of Card_Lane
	 */
	public final draganddroptrial.proxies.Lane getCard_Lane(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		draganddroptrial.proxies.Lane result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Card_Lane.toString());
		if (identifier != null)
			result = draganddroptrial.proxies.Lane.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Card_Lane
	 * @param card_lane
	 */
	public final void setCard_Lane(draganddroptrial.proxies.Lane card_lane)
	{
		setCard_Lane(getContext(), card_lane);
	}

	/**
	 * Set value of Card_Lane
	 * @param context
	 * @param card_lane
	 */
	public final void setCard_Lane(com.mendix.systemwideinterfaces.core.IContext context, draganddroptrial.proxies.Lane card_lane)
	{
		if (card_lane == null)
			getMendixObject().setValue(context, MemberNames.Card_Lane.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Card_Lane.toString(), card_lane.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return cardMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final draganddroptrial.proxies.Card that = (draganddroptrial.proxies.Card) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "DragAndDropTrial.Card";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}