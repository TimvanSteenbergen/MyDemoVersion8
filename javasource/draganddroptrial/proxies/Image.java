// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package draganddroptrial.proxies;

public class Image extends system.proxies.Image
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DragAndDropTrial.Image";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PublicThumbnailPath("PublicThumbnailPath"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		Image_Thing("DragAndDropTrial.Image_Thing");

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

	public Image(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DragAndDropTrial.Image"));
	}

	protected Image(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject imageMendixObject)
	{
		super(context, imageMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("DragAndDropTrial.Image", imageMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DragAndDropTrial.Image");
	}

	/**
	 * @deprecated Use 'Image.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static draganddroptrial.proxies.Image initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return draganddroptrial.proxies.Image.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static draganddroptrial.proxies.Image initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new draganddroptrial.proxies.Image(context, mendixObject);
	}

	public static draganddroptrial.proxies.Image load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return draganddroptrial.proxies.Image.initialize(context, mendixObject);
	}

	public static java.util.List<draganddroptrial.proxies.Image> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<draganddroptrial.proxies.Image> result = new java.util.ArrayList<draganddroptrial.proxies.Image>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DragAndDropTrial.Image" + xpathConstraint))
			result.add(draganddroptrial.proxies.Image.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Image_Thing
	 */
	public final draganddroptrial.proxies.Thing getImage_Thing() throws com.mendix.core.CoreException
	{
		return getImage_Thing(getContext());
	}

	/**
	 * @param context
	 * @return value of Image_Thing
	 */
	public final draganddroptrial.proxies.Thing getImage_Thing(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		draganddroptrial.proxies.Thing result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Image_Thing.toString());
		if (identifier != null)
			result = draganddroptrial.proxies.Thing.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Image_Thing
	 * @param image_thing
	 */
	public final void setImage_Thing(draganddroptrial.proxies.Thing image_thing)
	{
		setImage_Thing(getContext(), image_thing);
	}

	/**
	 * Set value of Image_Thing
	 * @param context
	 * @param image_thing
	 */
	public final void setImage_Thing(com.mendix.systemwideinterfaces.core.IContext context, draganddroptrial.proxies.Thing image_thing)
	{
		if (image_thing == null)
			getMendixObject().setValue(context, MemberNames.Image_Thing.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Image_Thing.toString(), image_thing.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final draganddroptrial.proxies.Image that = (draganddroptrial.proxies.Image) obj;
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
		return "DragAndDropTrial.Image";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}