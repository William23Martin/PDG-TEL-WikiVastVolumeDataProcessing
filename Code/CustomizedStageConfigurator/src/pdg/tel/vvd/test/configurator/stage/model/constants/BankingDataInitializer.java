/**
 * 
 */
package pdg.tel.vvd.test.configurator.stage.model.constants;

import pdg.tel.vvd.test.configurator.stage.model.bankmodel.BankingClient;
import pdg.tel.vvd.test.configurator.stage.model.datastructures.HashTable;

/**
 * @author William Martín Chávez González
 * Systems Engineer and Communications Engineering Student.
 * Icesi University, Cali, Colombia. 
 */
public class BankingDataInitializer {

	/**
	 * Hash Table that will be initialize with
	 * identification, name, last name, verification digit
	 * document type, person type, country, department,
	 * town of every banking client.
	 */
	private HashTable<String, BankingClient> clients;
	
}
