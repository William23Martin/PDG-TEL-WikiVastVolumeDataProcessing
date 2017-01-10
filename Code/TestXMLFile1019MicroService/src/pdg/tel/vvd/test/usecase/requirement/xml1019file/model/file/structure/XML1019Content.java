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

	public XML1019Content(int documentType, String identificationNumber) {
		this.documentType = new Integer(documentType);
		this.identificationNumber = identificationNumber;
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
	}

}
