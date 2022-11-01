// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package personswithsingleuseraccount.proxies;

/**
 * Official document recognized by the official government bodies. 
 * Proving the identity of a person.
 */
public class IdentityDocument extends system.proxies.Image
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "PersonsWithSingleUserAccount.IdentityDocument";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		IDNumber("IDNumber"),
		ValidFrom("ValidFrom"),
		ValidUntil("ValidUntil"),
		DocumentType("DocumentType"),
		PublicThumbnailPath("PublicThumbnailPath"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		IdentityDocument_Person("PersonsWithSingleUserAccount.IdentityDocument_Person");

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

	public IdentityDocument(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "PersonsWithSingleUserAccount.IdentityDocument"));
	}

	protected IdentityDocument(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject identityDocumentMendixObject)
	{
		super(context, identityDocumentMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("PersonsWithSingleUserAccount.IdentityDocument", identityDocumentMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a PersonsWithSingleUserAccount.IdentityDocument");
	}

	/**
	 * @deprecated Use 'IdentityDocument.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static personswithsingleuseraccount.proxies.IdentityDocument initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return personswithsingleuseraccount.proxies.IdentityDocument.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static personswithsingleuseraccount.proxies.IdentityDocument initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new personswithsingleuseraccount.proxies.IdentityDocument(context, mendixObject);
	}

	public static personswithsingleuseraccount.proxies.IdentityDocument load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return personswithsingleuseraccount.proxies.IdentityDocument.initialize(context, mendixObject);
	}

	public static java.util.List<personswithsingleuseraccount.proxies.IdentityDocument> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<personswithsingleuseraccount.proxies.IdentityDocument> result = new java.util.ArrayList<personswithsingleuseraccount.proxies.IdentityDocument>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//PersonsWithSingleUserAccount.IdentityDocument" + xpathConstraint))
			result.add(personswithsingleuseraccount.proxies.IdentityDocument.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of IDNumber
	 */
	public final java.lang.String getIDNumber()
	{
		return getIDNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of IDNumber
	 */
	public final java.lang.String getIDNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.IDNumber.toString());
	}

	/**
	 * Set value of IDNumber
	 * @param idnumber
	 */
	public final void setIDNumber(java.lang.String idnumber)
	{
		setIDNumber(getContext(), idnumber);
	}

	/**
	 * Set value of IDNumber
	 * @param context
	 * @param idnumber
	 */
	public final void setIDNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String idnumber)
	{
		getMendixObject().setValue(context, MemberNames.IDNumber.toString(), idnumber);
	}

	/**
	 * @return value of ValidFrom
	 */
	public final java.util.Date getValidFrom()
	{
		return getValidFrom(getContext());
	}

	/**
	 * @param context
	 * @return value of ValidFrom
	 */
	public final java.util.Date getValidFrom(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.ValidFrom.toString());
	}

	/**
	 * Set value of ValidFrom
	 * @param validfrom
	 */
	public final void setValidFrom(java.util.Date validfrom)
	{
		setValidFrom(getContext(), validfrom);
	}

	/**
	 * Set value of ValidFrom
	 * @param context
	 * @param validfrom
	 */
	public final void setValidFrom(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date validfrom)
	{
		getMendixObject().setValue(context, MemberNames.ValidFrom.toString(), validfrom);
	}

	/**
	 * @return value of ValidUntil
	 */
	public final java.util.Date getValidUntil()
	{
		return getValidUntil(getContext());
	}

	/**
	 * @param context
	 * @return value of ValidUntil
	 */
	public final java.util.Date getValidUntil(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.ValidUntil.toString());
	}

	/**
	 * Set value of ValidUntil
	 * @param validuntil
	 */
	public final void setValidUntil(java.util.Date validuntil)
	{
		setValidUntil(getContext(), validuntil);
	}

	/**
	 * Set value of ValidUntil
	 * @param context
	 * @param validuntil
	 */
	public final void setValidUntil(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date validuntil)
	{
		getMendixObject().setValue(context, MemberNames.ValidUntil.toString(), validuntil);
	}

	/**
	 * Set value of DocumentType
	 * @param documenttype
	 */
	public final personswithsingleuseraccount.proxies.Enum_IdentityDocumentType getDocumentType()
	{
		return getDocumentType(getContext());
	}

	/**
	 * @param context
	 * @return value of DocumentType
	 */
	public final personswithsingleuseraccount.proxies.Enum_IdentityDocumentType getDocumentType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.DocumentType.toString());
		if (obj == null)
			return null;

		return personswithsingleuseraccount.proxies.Enum_IdentityDocumentType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of DocumentType
	 * @param documenttype
	 */
	public final void setDocumentType(personswithsingleuseraccount.proxies.Enum_IdentityDocumentType documenttype)
	{
		setDocumentType(getContext(), documenttype);
	}

	/**
	 * Set value of DocumentType
	 * @param context
	 * @param documenttype
	 */
	public final void setDocumentType(com.mendix.systemwideinterfaces.core.IContext context, personswithsingleuseraccount.proxies.Enum_IdentityDocumentType documenttype)
	{
		if (documenttype != null)
			getMendixObject().setValue(context, MemberNames.DocumentType.toString(), documenttype.toString());
		else
			getMendixObject().setValue(context, MemberNames.DocumentType.toString(), null);
	}

	/**
	 * @return value of IdentityDocument_Person
	 */
	public final personswithsingleuseraccount.proxies.Person getIdentityDocument_Person() throws com.mendix.core.CoreException
	{
		return getIdentityDocument_Person(getContext());
	}

	/**
	 * @param context
	 * @return value of IdentityDocument_Person
	 */
	public final personswithsingleuseraccount.proxies.Person getIdentityDocument_Person(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		personswithsingleuseraccount.proxies.Person result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.IdentityDocument_Person.toString());
		if (identifier != null)
			result = personswithsingleuseraccount.proxies.Person.load(context, identifier);
		return result;
	}

	/**
	 * Set value of IdentityDocument_Person
	 * @param identitydocument_person
	 */
	public final void setIdentityDocument_Person(personswithsingleuseraccount.proxies.Person identitydocument_person)
	{
		setIdentityDocument_Person(getContext(), identitydocument_person);
	}

	/**
	 * Set value of IdentityDocument_Person
	 * @param context
	 * @param identitydocument_person
	 */
	public final void setIdentityDocument_Person(com.mendix.systemwideinterfaces.core.IContext context, personswithsingleuseraccount.proxies.Person identitydocument_person)
	{
		if (identitydocument_person == null)
			getMendixObject().setValue(context, MemberNames.IdentityDocument_Person.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.IdentityDocument_Person.toString(), identitydocument_person.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final personswithsingleuseraccount.proxies.IdentityDocument that = (personswithsingleuseraccount.proxies.IdentityDocument) obj;
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
		return "PersonsWithSingleUserAccount.IdentityDocument";
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
