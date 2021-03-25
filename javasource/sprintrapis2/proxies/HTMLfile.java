// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sprintrapis2.proxies;

public class HTMLfile extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SprintrApis2.HTMLfile";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size");

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

	public HTMLfile(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SprintrApis2.HTMLfile"));
	}

	protected HTMLfile(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject hTMLfileMendixObject)
	{
		super(context, hTMLfileMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SprintrApis2.HTMLfile", hTMLfileMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SprintrApis2.HTMLfile");
	}

	/**
	 * @deprecated Use 'HTMLfile.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sprintrapis2.proxies.HTMLfile initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sprintrapis2.proxies.HTMLfile.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sprintrapis2.proxies.HTMLfile initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sprintrapis2.proxies.HTMLfile(context, mendixObject);
	}

	public static sprintrapis2.proxies.HTMLfile load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sprintrapis2.proxies.HTMLfile.initialize(context, mendixObject);
	}

	public static java.util.List<sprintrapis2.proxies.HTMLfile> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<sprintrapis2.proxies.HTMLfile> result = new java.util.ArrayList<sprintrapis2.proxies.HTMLfile>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SprintrApis2.HTMLfile" + xpathConstraint))
			result.add(sprintrapis2.proxies.HTMLfile.initialize(context, obj));
		return result;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sprintrapis2.proxies.HTMLfile that = (sprintrapis2.proxies.HTMLfile) obj;
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
		return "SprintrApis2.HTMLfile";
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