package pdg.tel.vvd.test.configurator.stage.model;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import pdg.tel.vvd.test.configurator.stage.model.constants.BankingData;

/**
 *MovementsFileGenerator is the java class that get the
 *configuration parameters and write a file with
 *random credit/debit account movements for all the
 *clients in a Banking Context. 
 * @author William Martín Chávez González
 * Systems Engineer and Communications Engineering Student.
 * Icesi University, Cali, Colombia. 
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
		
		int limite=72000000;
		
		System.out.println("Inicializando variables de configuración de archivo...");
				
		 file = new File ("C:/Users/WMC/Desktop/ArchivoCuentas2.TXT");
		 try {
				
			 writer = new PrintWriter (file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Configuración de archivo de salida finalizado: " + file.getAbsolutePath());
		
		System.out.println("Escribiendo archivo ... (el proceso puede durar varios minutos)");
		
		int j = 0;
		while (j<=limite) {
			Random numAleatorio=new Random();
			String pais= BankingData.BANKING_DATA_COUNTRIES[numAleatorio.nextInt(4)+1]+"|";
			String tdoc= tdocs[numAleatorio.nextInt(4)+1]+"|";
			String tper =  tiposPersona[numAleatorio.nextInt(2)]+"|";
			String prenid = String.valueOf(numAleatorio.nextInt(1107082726)+1);
			String newNid=calcularNewNid(prenid.length());
			String nid=newNid + prenid+"|"; 
			String dv= verdigits[numAleatorio.nextInt(10)+1]+"|";
			String apl1= apellidosConocidos[numAleatorio.nextInt(11)+1]+"|";
			String apl2= apellidosConocidos[numAleatorio.nextInt(11)+1]+"|";
			String nom1= nombresConocidos[numAleatorio.nextInt(11)+1]+"|";
			String nom2= nombresConocidos[numAleatorio.nextInt(11)+1]+"|";
			String raz= (tper=="PN|") ? "|" : String.valueOf(nom1.split("|")[1])+" "+String.valueOf(nom2.split("|")[0])+" "+String.valueOf(apl1.split("|")[0])+" "+String.valueOf(apl2.split("|")[0])+" "+"|"; 
			String dpto = (pais=="COL|") ? departamentos[numAleatorio.nextInt(4)+1]+"|":"|";
			String mun=(pais=="COL|") ? municipios[numAleatorio.nextInt(4)+1]+"|":"|";
			String cta= numerosCuentaCCA[numAleatorio.nextInt(10)+1]+"|";
			String tipcta = tiposCuenta[j%2]+"|";
			String tipoOperacion = tiposOperaciones[numAleatorio.nextInt(1)+1]+"|";
			int valorMov = ThreadLocalRandom.current().nextInt(500000, 10000000 + 1);
			String mov=String.valueOf(valorMov);
			
			//FECHA----------
			//Adaptado de:http://www.aprenderaprogramar.com/foros/index.php?topic=948.0
			 Calendar objFecha = Calendar.getInstance();
			 objFecha.set(2016, numAleatorio.nextInt(12)+1, numAleatorio.nextInt(30)+1,numAleatorio.nextInt(24)+1,numAleatorio.nextInt(59)+1,numAleatorio.nextInt(59)+1);
		     SimpleDateFormat formato = new SimpleDateFormat("yyyy|MM|dd|HH:mm:ss");
		     String fecha= formato.format(objFecha.getTime())+"|";
			//----------------
		     
			try {
				 writer.print(j+"|"+fecha+tipcta+pais+tdoc+apl1+apl2+nom1+nom2+raz+mun+dpto+cta+tipcta+tper+dv+nid+tipoOperacion+mov);
				 writer.println("|");
				 j++;
				 
			} catch (Exception e) {
				e.printStackTrace();
			}
						
		}
		
		writer.close (); 
		
		System.out.println("Escritura de archivo finalizada.");
		
	
	}
	private static String calcularNewNid(int length) {
		String newNid="";
		for(int i=0;i<(20-length);i++){
			newNid+="0";
		}
		return newNid;
	}

}
