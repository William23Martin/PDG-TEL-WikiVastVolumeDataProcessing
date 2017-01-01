/**
 * 
 */
package pdg.tel.vvd.test.configurator.stage.model.constants;

import com.sun.security.ntlm.Client;

import pdg.tel.vvd.test.configurator.stage.model.bankmodel.BankingAccount;
import pdg.tel.vvd.test.configurator.stage.model.bankmodel.BankingClient;
import pdg.tel.vvd.test.configurator.stage.model.bankmodel.BankingTransaction;
import pdg.tel.vvd.test.configurator.stage.model.datastructures.HashTable;

/**
 * @author William Martín Chávez González Systems Engineer and Communications
 *         Engineering Student. Icesi University, Cali, Colombia.
 */
public class BankingDataInitializer {

	private int numberOfTransactions;

	/**
	 * Hash Table that will be initialize with identification, name, last name,
	 * verification digit document type, person type, country, department, town
	 * of every banking client.
	 */
	private HashTable<String, BankingClient> clients;

	/**
	 * Hash Table that will be initialize with type, name, number and codex of
	 * every banking account.
	 */
	private HashTable<String, BankingAccount> accounts;

	/**
	 * Hash Table that will be initialize with account, type and value of every
	 * banking transaction.
	 */
	private HashTable<BankingAccount, BankingTransaction> transactions;

	public BankingDataInitializer(int numberOfTransactions) {
		this.numberOfTransactions = numberOfTransactions;
		clients = new HashTable<String, BankingClient>(12);
		accounts = new HashTable<String, BankingAccount>(12);
		transactions = new HashTable<BankingAccount, BankingTransaction>(numberOfTransactions);
	}

	public void setBankingClientsData() {
		for (int i = 0; i < BankingData.BANKING_DATA_IDENTIFICATIONS.length; i++) {
			clients.agregarElemento(BankingData.BANKING_DATA_IDENTIFICATIONS[i],
					new Client(BankingData.BANKING_DATA_[i], arg1, arg2, arg3, arg4));
		}
	}

	public void setBankingAccountsData() {

	}

	public void setBankingTransationsData() {

	}

}
