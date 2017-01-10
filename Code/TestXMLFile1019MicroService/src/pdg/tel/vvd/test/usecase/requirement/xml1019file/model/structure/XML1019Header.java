/**
 * 
 */
package pdg.tel.vvd.test.usecase.requirement.xml1019file.model.structure;

import java.util.Calendar;

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

	/**
	 * In the XML 1019 file header is the shipping date in the year.
	 * Type:datetime, Length:19, Format:AAAA-MM-DDTHH:MM:SS. Attachment
	 * restriction.
	 */
	private Calendar shippingDate;

	/**
	 * In the XML 1019 file header is the minimum date in the content.
	 * Type:date, Length:10, Format:AAAA-MM-DD. Attachment restriction.
	 */
	private Calendar initialDate;

	/**
	 * In the XML 1019 file header is the maximum date in the content.
	 * Type:date, Length:10, Format:AAAA-MM-DD. Attachment restriction.
	 */
	private Calendar finalDate;

	/**
	 * In the XML 1019 file header is the sum of all CODEXes of "movcuenta" XML
	 * element in the content. Type:double, Length:20. Attachment restriction.
	 */
	private Double totalValue;

	/**
	 * In the XML 1019 file header is the sum of all "movcuenta" XML elements in
	 * the content. Type:int, Length:4. 5000 registers per XML file as maximum.
	 * Attachment restriction.
	 */
	private Double numberOfRegisters;

	public XML1019Header(int year, int CptCode, int format) {

		loadInvariants();
	}

	/**
	 * Verify the attributes values restrictions.
	 */
	private void loadInvariants() {
		assert year.toString().length() == 4 : "Year lenght must be equal four (4)."; // Attachment
		// restriction.
		assert CptCode.toString().length() == 2 : "Concept code lenght must be equal two (2)."; // Attachment
		// restriction.
		assert format.toString().length() == 5 : "Format lenght must be equal five (5)."; // Attachment
																							// restriction.
		assert version.toString().length() == 2 : "Version lenght must be equal two (2)."; // Attachment
		// restriction.
		assert shippingNumber.toString().length() == 8 : "Shipping number lenght must be equal eight (8)."; // Attachment
		// restriction.
		assert shippingDate.toString().length() == 19 : "Shipping date lenght must be equal nineteen (19)."; // Attachment
		// restriction.
		assert initialDate.toString().length() == 10 : "Initial date lenght must be equal ten (10)."; // Attachment
		// restriction.
		assert finalDate.toString().length() == 10 : "Final date lenght must be equal ten (10)."; // Attachment
		// restriction.
		assert totalValue.toString().length() == 20 : "Total value lenght must be equal twenty (20)."; // Attachment
		// restriction.
		assert numberOfRegisters.toString().length() == 4 : "Number of registers lenght must be equal four (4)."; // Attachment
		// restriction.
		assert numberOfRegisters >= 0
				&& numberOfRegisters < 5000 : "Number of registers must be between zero (0) and five thousand."; // Attachment
		// restriction.
	}

}
