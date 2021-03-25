// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package speechfunctions.proxies;

public class SoundRecord
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject soundRecordMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SpeechFunctions.SoundRecord";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Volume("Volume");

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

	public SoundRecord(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SpeechFunctions.SoundRecord"));
	}

	protected SoundRecord(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject soundRecordMendixObject)
	{
		if (soundRecordMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SpeechFunctions.SoundRecord", soundRecordMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SpeechFunctions.SoundRecord");

		this.soundRecordMendixObject = soundRecordMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SoundRecord.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static speechfunctions.proxies.SoundRecord initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return speechfunctions.proxies.SoundRecord.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static speechfunctions.proxies.SoundRecord initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new speechfunctions.proxies.SoundRecord(context, mendixObject);
	}

	public static speechfunctions.proxies.SoundRecord load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return speechfunctions.proxies.SoundRecord.initialize(context, mendixObject);
	}

	public static java.util.List<speechfunctions.proxies.SoundRecord> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<speechfunctions.proxies.SoundRecord> result = new java.util.ArrayList<speechfunctions.proxies.SoundRecord>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SpeechFunctions.SoundRecord" + xpathConstraint))
			result.add(speechfunctions.proxies.SoundRecord.initialize(context, obj));
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
	 * @return value of Volume
	 */
	public final java.math.BigDecimal getVolume()
	{
		return getVolume(getContext());
	}

	/**
	 * @param context
	 * @return value of Volume
	 */
	public final java.math.BigDecimal getVolume(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Volume.toString());
	}

	/**
	 * Set value of Volume
	 * @param volume
	 */
	public final void setVolume(java.math.BigDecimal volume)
	{
		setVolume(getContext(), volume);
	}

	/**
	 * Set value of Volume
	 * @param context
	 * @param volume
	 */
	public final void setVolume(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal volume)
	{
		getMendixObject().setValue(context, MemberNames.Volume.toString(), volume);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return soundRecordMendixObject;
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
			final speechfunctions.proxies.SoundRecord that = (speechfunctions.proxies.SoundRecord) obj;
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
		return "SpeechFunctions.SoundRecord";
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