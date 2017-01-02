package pdg.tel.vvd.test.configurator.stage.model;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

import pdg.tel.vvd.test.configurator.stage.model.bankmodel.BankingAccount;
import pdg.tel.vvd.test.configurator.stage.model.bankmodel.BankingClient;
import pdg.tel.vvd.test.configurator.stage.model.constants.BankingData;
import pdg.tel.vvd.test.configurator.stage.model.constants.BankingDataInitializer;

/**
 * MovementsFileGenerator is the java class that get the configuration
 * parameters and write a file with random credit/debit account movements for
 * all the clients in a Banking Context.
 * 
 * @author William Martín Chávez González Systems Engineer and Communications
 *         Engineering Student. Icesi University, Cali, Colombia.
 */
public class TransactionsFileGenerator {

	/**
	 * File Writer.
	 */
	private static PrintWriter writer;

	/**
	 * File that will be written.
	 */
	private static File file;

	public static void main(String args[]) {

		// File Size Limit initialization:
		int limiteTransaccionesPorDefecto = 72000000;
		int limiteTransaccionesUsuario = Integer.parseInt(JOptionPane.showInputDialog(
				"Introduzca el número de transacciones que debe tener su archivo de transacciones.\nNOTA: Por defecto serán 72 millones.\nSólo se permiten valores enteros y terminados en miles."));
		String limite = String.valueOf(limiteTransaccionesUsuario);
		// ------------------------

		// Test Banking Data Initializer Object:
		BankingDataInitializer testBankingDataInitializer = new BankingDataInitializer();
		// ---------------------------------------

		System.out.println("File parameters initializing...");

		file = new File("C:/Users/WMC/Desktop/ArchivoCuentas2.TXT");

		try {
			writer = new PrintWriter(file);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Configuración de archivo de salida finalizado: " + file.getAbsolutePath());

		System.out.println("Escribiendo archivo ... (el proceso puede durar varios minutos)");
		
		Random randomNumber = new Random();
		int j = 0;
		while (j <= ((limite == null) ? limiteTransaccionesPorDefecto : limiteTransaccionesUsuario)) {
			int accountNumber=randomNumber.nextInt(12)+1;
			BankingAccount bankingAccount=(BankingAccount)testBankingDataInitializer.getAccounts().get(accountNumber);
			BankingClient bankingClient=bankingAccount.getOwner();
			// Datos de clientes y cuentas:
			String pais = BankingData.BANKING_DATA_COUNTRIES[randomNumber.nextInt(4) + 1] + "|";
			String tdoc = tdocs[randomNumber.nextInt(4) + 1] + "|";
			String tper = tiposPersona[randomNumber.nextInt(2)] + "|";
			String prenid = String.valueOf(randomNumber.nextInt(1107082726) + 1);
			String newNid = calcularNewNid(prenid.length());
			String nid = newNid + prenid + "|";
			String dv = verdigits[randomNumber.nextInt(10) + 1] + "|";
			String apl1 = apellidosConocidos[randomNumber.nextInt(11) + 1] + "|";
			String apl2 = apellidosConocidos[randomNumber.nextInt(11) + 1] + "|";
			String nom1 = nombresConocidos[randomNumber.nextInt(11) + 1] + "|";
			String nom2 = nombresConocidos[randomNumber.nextInt(11) + 1] + "|";
			String raz = (tper == "PN|") ? "|"
					: String.valueOf(nom1.split("|")[1]) + " " + String.valueOf(nom2.split("|")[0]) + " "
							+ String.valueOf(apl1.split("|")[0]) + " " + String.valueOf(apl2.split("|")[0]) + " " + "|";
			String dpto = (pais == "COL|") ? departamentos[randomNumber.nextInt(4) + 1] + "|" : "|";
			String mun = (pais == "COL|") ? municipios[randomNumber.nextInt(4) + 1] + "|" : "|";
			String cta = numerosCuentaCCA[randomNumber.nextInt(10) + 1] + "|";
			String tipcta = tiposCuenta[j % 2] + "|";
			String tipoOperacion = tiposOperaciones[randomNumber.nextInt(1) + 1] + "|";
			// ----------------------------
			// FECHA--------------------------------
			// Adaptado
			// de:http://www.aprenderaprogramar.com/foros/index.php?topic=948.0
			SimpleDateFormat formato = new SimpleDateFormat("yyyy|MM|dd|HH:mm:ss");
			Calendar objFecha = Calendar.getInstance();
			objFecha.set(randomNumber.nextInt(1) + 2015, randomNumber.nextInt(12) + 1, randomNumber.nextInt(30) + 1,
					randomNumber.nextInt(24) + 1, randomNumber.nextInt(59) + 1, randomNumber.nextInt(59) + 1);
			String fecha = formato.format(objFecha.getTime()) + "|";
			// --------------------------------------
			// Datos de transacción:
			double valorMov = ThreadLocalRandom.current().nextDouble() * 10000000 + 100;
			String mov = String.valueOf(valorMov);
			// ----------------------------

			try {
				writer.print(j + "|" + fecha + tipcta + pais + tdoc + apl1 + apl2 + nom1 + nom2 + raz + mun + dpto + cta
						+ tipcta + tper + dv + nid + tipoOperacion + mov);
				writer.println("|");
				j++;

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		writer.close();

		System.out.println("Escritura de archivo finalizada.");

	}

	private static String calcularNewNid(int length) {
		String newNid = "";
		for (int i = 0; i < (20 - length); i++) {
			newNid += "0";
		}
		return newNid;
	}

}
