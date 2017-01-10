/**
 * 
 */
package pdg.tel.vvd.test.usecase.requirement.xml1019file.model.file.structure;

/**
 * @author William Martín Chávez González. Systems Engineer and Communications
 *         Engineering Student. Icesi University, Cali, Colombia.
 */
public class XML1019Content {

	/**
	 * In the XML 1019 file content is the document type of CC/CA owner.
	 * Type:int, Length:2. Mandatory:False. Attachment restriction.
	 */
	private Integer documentType;

	/**
	 * In the XML 1019 file content is the identification number of CC/CA owner.
	 * Type:string, Length:20. Mandatory:True. Must not have points(.),
	 * hyphens(-), commas(,), or blank spaces (" "). Attachment restriction.
	 */
	private String identificationNumber;

	/**
	 * In the XML 1019 file content is the verification digit of CC/CA owner.
	 * Type:int, Length:1. Mandatory:Only if document type equals 31 (NIT).
	 * Attachment restriction.
	 */
	private Integer verificationDigit;

	/**
	 * In the XML 1019 file content is the first last name of CC/CA owner.
	 * Type:string, Length:60. Mandatory:Only if the owner is a Natural Person
	 * (PN). Attachment restriction.
	 */
	private String firstLastName;

	/**
	 * In the XML 1019 file content is the second last name of CC/CA owner.
	 * Type:string, Length:60. Mandatory:False. Attachment restriction.
	 */
	private String secondLastName;

	/**
	 * In the XML 1019 file content is the first name of CC/CA owner.
	 * Type:string, Length:60. Mandatory:Only if the owner is a Natural Person
	 * (PN). Attachment restriction.
	 */
	private String firstName;

	public XML1019Content(int documentType, String identificationNumber, int verificationDigit, String firstLastName,
			String secondLastName) {
		this.documentType = new Integer(documentType);
		this.identificationNumber = identificationNumber;
		this.verificationDigit = new Integer(verificationDigit);
		this.firstLastName = firstLastName;
		this.secondLastName = secondLastName;
		loadInvariants();
	}

	/**
	 * Verify the attributes values restrictions.
	 */
	private void loadInvariants() {
		assert documentType.toString().length() == 2 : "CC/CA Owner document type lenght must be equal two (2)."; // Attachment
		// restriction.
		assert identificationNumber != null : "CC/CA Owner identification number must be exists"; // Attachment
		// restriction.
		assert identificationNumber
				.length() == 20 : "CC/CA Owner identification number lenght must be equal twenty (20).";// Attachment
		// restriction.
		assert (!identificationNumber.contains(".") || !identificationNumber.contains("-")
				|| !identificationNumber.contains(",")
				|| !identificationNumber.contains(" ")) : "CC/CA Owner identification number must be exists"; // Attachment
		// restriction.
		assert verificationDigit.toString()
				.length() == 1 : "CC/CA Owner verification digit lenght must be equal one (1)."; // Attachment
		// restriction.
		assert firstLastName.length() == 60 : "CC/CA Owner first last name lenght must be equal sixty (60).";// Attachment
		// restriction.
		assert secondLastName.length() == 60 : "CC/CA Owner second last name lenght must be equal sixty (60).";// Attachment
		// restriction.
	}

}
