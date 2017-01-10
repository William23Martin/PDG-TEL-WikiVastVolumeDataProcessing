/**
 * 
 */
package pdg.tel.vvd.test.configurator.stage.model.constants;

/**
 * @author WMC Systems Engineer and Communications Engineering Student. Icesi
 *         University, Cali, Colombia.
 */
public enum BankingData {
	;
	// CLIENTS
	public final static String[] BANKING_DATA_IDENTIFICATIONS = { "111109854872", "221109854873", "331209954872",
			"441209894872", "5569854372", "661009854802", "7711098048709", "881109659802", "991109754872",
			"10101110854810", "11111109114811", "12121101254812" };// 0-11
	public final static String[] BANKING_DATA_DOCUMENT_TYPES = { "TI", "RC", "CC", "PS", "CE" };// 0-4
	public final static String[] BANKING_DATA_PERSON_TYPES = { "PJ", "PN" };// 0-1
	public final static String[] BANKING_DATA_COUNTRIES = { "COLOMBIA", "ESPAÑA", "HOLANDA", "BRASIL", "ARGENTINA" };// 0-4
	public final static String[] BANKING_DATA_DEPARTMENTS = { "NARIÑO", "VALLE", "SANTANDER", "ANTIOQUIA",
			"CUNDINAMARCA" };// 0-4
	public final static String[] BANKING_DATA_TOWNS = { "PASTO", "CALI", "BUCARAMANGA", "MEDELLIN", "BOGOTÁ" };// 0-4
	public final static String[] BANKING_DATA_VERIFICATION_DIGITS = { "9", "8", "7", "6", "5", "4", "3", "2", "1", "0",
			"N" };// 0-10
	public final static String[] BANKING_DATA_LAST_NAMES = { "APELLIDO1 APELLIDO2", "APELLIDO3 APELLIDO4",
			"APELLIDO5 APELLIDO6", "APELLIDO7 APELLIDO8", "APELLIDO9 APELLIDO10", "APELLIDO11 APELLIDO12",
			"APELLIDO13 APELLIDO14", "APELLIDO15 APELLIDO16", "APELLIDO17 APELLIDO18", "APELLIDO20 APELLIDO21",
			"APELLIDO22 APELLIDO23", "APELLIDO24 APELLIDO25" };// 0-11
	public final static String[] BANKING_DATA_NAMES = { "NOMBRE1 NOMBRE2", "NOMBRE3 NOMBRE4", "NOMBRE5 NOMBRE6",
			"NOMBRE7 NOMBRE8", "NOMBRE9 NOMBRE10", "NOMBRE11 NOMBRE12", "NOMBRE13 NOMBRE14", "NOMBRE15 NOMBRE16",
			"NOMBRE17 NOMBRE18", "NOMBRE19 NOMBRE20", "NOMBRE21 NOMBRE22", "NOMBRE23 NOMBRE24" };// 0-11
	public final static String[] BANKING_DATA_LEGAL_NAMES = { "COMPANY_ONE", "COMPANY_TWO", "COMPANY_THREE",
			"COMPANY_FOUR", "COMPANY_FIVE", "COMPANY_SIX", "COMPANY_SEVEN", "COMPANY_EIGHT", "COMPANY_NINE",
			"COMPANY_TEN", "COMPANY_ELEVEN", "COMPANY_TWELVE", "COMPANY_13", "COMPANY_14", "COMPANY_15", "COMPANY_16",
			"COMPANY_17", "COMPANY_18", "COMPANY_19", "COMPANY_20", "COMPANY_21", "COMPANY_22", "COMPANY_23",
			"COMPANY_24" };// 0-23
	public final static String[] BANKING_DATA_ADDRESSES = { "CALLE 3RA #24A-32", "AVENIDA 4TAN #4N-28", "CRR 5 #56-27",
			"CALLE 2DA #12B-65", "AVENIDA 5TAN #5N-19", "CRR 5 #32A-64", "CALLE 1RA #19C-87", "AVENIDA 1RA #7-48",
			"CRR 27 #32-30", "CALLE 3RA #12BIS-65", "CALLE 4TA #156-65", "CALLE 1RA #34C-56" };// 0-11

	// ACCOUNTS
	public final static String[] BANKING_DATA_ACCOUNT_TYPES = { "CC", "CA" };// 0-1
	public final static String[] BANKING_DATA_ACCOUNT_NUMBERS = { "1000657864", "2000658920", "3000765894",
			"4000789109", "5000378567", "6000538769", "7000276480", "8000675473", "90002554785", "1002452902",
			"2002729369", "3001768560" };// 0-11
	public final static String[] BANKING_DATA_CODEX_TYPES = { "SI", "NO" };// 0-1
																			// //TODO
																			// http://www.dian.gov.co/descargas/normatividad/2014/Resoluciones/Resolucion_74_del_06_marzo_2014.pdf
																			// HOJA
																			// 3

	// TRANSACTIONS
	public final static String[] BANKING_DATA_TRANSACTION_TYPE = { "CREDITO", "DEBITO" };// 0-1

}
