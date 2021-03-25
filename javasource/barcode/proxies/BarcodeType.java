// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package barcode.proxies;

public enum BarcodeType
{
	Codabar(new java.lang.String[][] { new java.lang.String[] { "en_US", "Codabar" } }),
	Code_128(new java.lang.String[][] { new java.lang.String[] { "en_US", "Code 128" } }),
	Code_39(new java.lang.String[][] { new java.lang.String[] { "en_US", "Code 39" } }),
	Interleaved_2_of_5(new java.lang.String[][] { new java.lang.String[] { "en_US", "Interleaved 2 of 5" } }),
	Postnet(new java.lang.String[][] { new java.lang.String[] { "en_US", "Postnet" } }),
	EAN13(new java.lang.String[][] { new java.lang.String[] { "en_US", "EAN13" } }),
	EAN8(new java.lang.String[][] { new java.lang.String[] { "en_US", "EAN8" } }),
	UPCA(new java.lang.String[][] { new java.lang.String[] { "en_US", "UPCA" } }),
	UPCE(new java.lang.String[][] { new java.lang.String[] { "en_US", "UPCE" } }),
	EAN128(new java.lang.String[][] { new java.lang.String[] { "en_US", "EAN128" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private BarcodeType(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}