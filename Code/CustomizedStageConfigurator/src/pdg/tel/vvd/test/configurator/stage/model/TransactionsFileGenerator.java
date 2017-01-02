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
 * @author William Martín Chávez González. Systems Engineer and Communications
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

	/**
	 * Test Banking Data Initializer Object
	 */
	private static BankingDataInitializer testBankingDataInitializer;

	public static void main(String args[]) {

		// File Size Limit initialization:
		int deafultTransactionsNumber = 24*12*100*2;//(Months in two years)*(#BankingAccounts)*(#OneSheetExtractTransactions)*(#OneSheetExtractAveragePerNaturalPersonAccount)
		int mode = Integer.parseInt(JOptionPane.showInputDialog(
				"Introduzca un 1 si es desea la generación automática\no 2 si la desea manual."));
		if(mode==2){//Si es automática
			deafultTransactionsNumber = Integer.parseInt(JOptionPane.showInputDialog(
					"Introduzca el número de transacciones que debe tener su archivo de transacciones.\nNOTA: Por defecto serán 72 millones.\nSólo se permiten valores enteros y terminados en miles."));
		}
		String separator = JOptionPane.showInputDialog("Input one caracter for separate every data in the file");
		// ------------------------

		// Test Banking Data Initializer Object:
		testBankingDataInitializer = new BankingDataInitializer();
		// ---------------------------------------

		System.out.println("File parameters initializing...");

		file = new File("C:/Users/WMC/Desktop/BankingTransactionsTestData2015-2016.TXT");

		try {
			writer = new PrintWriter(file);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Configuración de archivo de salida finalizado: " + file.getAbsolutePath());

		System.out.println("Escribiendo archivo ... (el proceso puede durar varios minutos)");

		Random randomNumber = new Random();
		int j = 0;
		while (j <= deafultTransactionsNumber) {
			int accountNumber = randomNumber.nextInt(11);
			BankingAccount bankingAccount = (BankingAccount) testBankingDataInitializer.getAccounts()
					.get(BankingData.BANKING_DATA_ACCOUNT_NUMBERS[accountNumber]);
			BankingClient bankingClient = bankingAccount.getOwner();
			// Test Client and Account Data:
			String pais = bankingClient.getCountry() + separator;
			String tdoc = bankingClient.getDocumentType() + separator;
			String tper = bankingClient.getPersonType() + separator;
			String prenid = bankingClient.getIdentification();
			String newNid = processNewNid(prenid.length());
			String nid = newNid + prenid + separator;
			String dv = bankingClient.getVerificationDigit() + separator;
			String apl1 = bankingClient.getLastName().split(" ")[0] + separator;
			String apl2 = bankingClient.getLastName().split(" ")[1] + separator;
			String nom1 = bankingClient.getName().split(" ")[0] + separator;
			String nom2 = bankingClient.getName().split(" ")[1] + separator;
			String dpto = (pais.equals(BankingData.BANKING_DATA_COUNTRIES[0] + separator))
					? bankingClient.getDepartment() + separator : separator;
			String mun = (pais.equals(BankingData.BANKING_DATA_COUNTRIES[0] + separator))
					? bankingClient.getTown() + separator : separator;
			String dir = (pais.equals(BankingData.BANKING_DATA_COUNTRIES[0] + separator))
					? bankingClient.getAddress() + separator : separator;
			String cta = bankingAccount.getNumber() + separator;
			String tipcta = bankingAccount.getType() + separator;
			String codex = bankingAccount.getCodex() + separator;
			String tipoOperacion = BankingData.BANKING_DATA_TRANSACTION_TYPE[(int) (Math.random() * 2)] + separator;
			// ----------------------------
			// Date--------------------------------
			// From:http://www.aprenderaprogramar.com/foros/index.php?topic=948.0
			SimpleDateFormat formato = new SimpleDateFormat("yyyy|MM|dd|HH:mm:ss");
			Calendar objFecha = Calendar.getInstance();
			objFecha.set(randomNumber.nextInt(1) + 2015, randomNumber.nextInt(12) + 1, randomNumber.nextInt(30) + 1,
					randomNumber.nextInt(24) + 1, randomNumber.nextInt(59) + 1, randomNumber.nextInt(59) + 1);
			String fecha = formato.format(objFecha.getTime()) + separator;
			// --------------------------------------
			// Test Transation data:
			double transactionValue = ThreadLocalRandom.current().nextDouble() * 10000000 + 100;
			String transaction = String.valueOf(transactionValue);
			// ----------------------------

			try {
				writer.print(j + separator + fecha + tipcta + codex + pais + tdoc + apl1 + apl2 + nom1 + nom2 + mun
						+ dpto + dir + cta + tper + dv + nid + tipoOperacion + transaction);
				writer.println(separator);
				j++;

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		writer.close();

		System.out.println("Escritura de archivo finalizada.");

	}

	private static String processNewNid(int length) {
		String newNid = "";
		for (int i = 0; i < (20 - length); i++) {
			newNid += "0";
		}
		return newNid;
	}

}
