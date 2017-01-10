/**
 * 
 */
package pdg.tel.vvd.test.usecase.requirement.xml1019file.model.structure;

/**
 * @author William Martín Chávez González. Systems Engineer and Communications
 *         Engineering Student. Icesi University, Cali, Colombia.
 */
public class XML1019Header {

	/**
	 * In the XML 1019 file header is the shipping year. Type:int, Length:4,
	 * Format: AAAA. Attachment restriction.
	 */
	private Integer year;

	/**
	 * In the XML 1019 file header is the concept code (1-insertion,
	 * 2-replacement). Type:int, Length:2. Attachment restriction.
	 */
	private Integer CptCode;

	/**
	 * In the XML 1019 file header is the format (1019 for CC or CA). Type:int,
	 * Length:5. Attachment restriction.
	 */
	private Integer format;

	/**
	 * In the XML 1019 file header is the version (9). Type:int, Length:2.
	 * Attachment restriction.
	 */
	private Integer version;

	/**
	 * In the XML 1019 file header is the shipping number in the year. Type:int,
	 * Length:8. Attachment restriction.
	 */
	private Integer shippingNumber;

	public XML1019Header(int year, int CptCode, int format) {

		loadInvariants();
	}

	/**
	 * Verify the attributes values restrictions.
	 */
	private void loadInvariants() {
		assert year.toString().length() == 4 : "Year lenght can not be more than four (4)."; // Attachment
		// restriction.
		assert CptCode.toString().length() == 2 : "Concept code lenght can not be more than two (2)."; // Attachment
		// restriction.
		assert format.toString().length() == 5 : "Format lenght can not be more than five (5)."; // Attachment
																									// restriction.
		assert version.toString().length() == 2 : "Version lenght can not be more than two (2)."; // Attachment
		// restriction.
		assert shippingNumber.toString().length() == 8 : "Shipping number lenght can not be more than eight (8)."; // Attachment
		// restriction.

	}

}
