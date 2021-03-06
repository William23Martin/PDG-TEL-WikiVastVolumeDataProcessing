/**
 * 
 */
package pdg.tel.vvd.test.usecase.requirement.xml1019file.model.constants;

/**
 * @author William Mart�n Ch�vez Gonz�lez. Systems Engineer and Communications
 *         Engineering Student. Icesi University, Cali, Colombia.
 */
public enum XML1019FileConstants {
	;

	// XML 1019 File Name constants.
	public final static String ARCHIVO_NOMBRE_PREFIJO = "Dmuisca_";// Attachment
																	// restriction.
	public final static String ARCHIVO_NOMBRE_CONCEPTO_INSERCION = "01";// Attachment
																		// restriction.
	public final static String ARCHIVO_NOMBRE_CONCEPTO_REEMPLAZO = "02";// Attachment
																		// restriction.
	public final static String ARCHIVO_NOMBRE_FORMATO = "00019"; // Attachment
																	// restriction.
	public final static String ARCHIVO_NOMBRE_VERSION = "09";// Attachment
																// restriction.

	// XML 1019 File Header constants.
	public final static String ARCHIVO_ENCABEZADO_RAIZ = "mas";// Attachment
																// restriction.
	public final static String ARCHIVO_ENCABEZADO_ELEMENTO = "Cab";// Attachment
																	// restriction.
	public final static String ARCHIVO_ENCABEZADO_FORMATO_ANIO = "AAAA";// Attachment
	// restriction.
	public final static String ARCHIVO_ENCABEZADO_FORMATO_FECHA_ENVIO = "AAAA-MM-DDTHH:MM:SS";// Attachment
	// restriction.
	public final static String ARCHIVO_ENCABEZADO_FORMATO_FECHA_INICIAL = "AAAA-MM-DD";// Attachment
	// restriction.
	public final static String ARCHIVO_ENCABEZADO_FORMATO_FECHA_FINAL = "AAAA-MM-DD";// Attachment
	// restriction.

	// XML 1019 File Content constants.
	public final static String ARCHIVO_CONTENIDO_ELEMENTO = "movcta";// Attachment
	// restriction.
	
}
