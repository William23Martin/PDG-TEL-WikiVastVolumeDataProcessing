/**
 * 
 */
package pdg.tel.vvd.test.configurator.stage.model.constants;

import java.util.Random;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

import pdg.tel.vvd.test.configurator.stage.model.bankmodel.BankingAccount;
import pdg.tel.vvd.test.configurator.stage.model.bankmodel.BankingClient;


/**
 * @author William Martín Chávez González Systems Engineer and Communications
 *         Engineering Student. Icesi University, Cali, Colombia.
 */
public class BankingDataInitializer {

	/**
	 * Hash Table that will be initialize with identification, name, last name,
	 * verification digit document type, person type, country, department, town
	 * of every banking client.
	 */
	private Hashtable clients;

	/**
	 * Hash Table that will be initialize with type, name, number and codex of
	 * every banking account.
	 */
	private Hashtable accounts;

	public BankingDataInitializer() {
		clients = new Hashtable(12);
		accounts = new Hashtable(12);
		this.setBankingNaturalPersonClientsData();
		this.setBankingAccountsData();
	}

	/**
	 * Method that initialize the clients HashTable with clients information.
	 */
	public void setBankingNaturalPersonClientsData() {
		Random randomNumber=new Random();
		for (int i = 0; i < BankingData.BANKING_DATA_IDENTIFICATIONS.length; i++) {
			int randomDPTNumber = randomNumber.nextInt(4);//0-4
			int randomVDNumber = randomNumber.nextInt(10);//0-10
			int randomDTNumber = randomNumber.nextInt(4);//0-4
			clients.put(BankingData.BANKING_DATA_IDENTIFICATIONS[i],
					new BankingClient(BankingData.BANKING_DATA_IDENTIFICATIONS[i], BankingData.BANKING_DATA_NAMES[i],
							BankingData.BANKING_DATA_LAST_NAMES[i], "",
							BankingData.BANKING_DATA_VERIFICATION_DIGITS[randomVDNumber],
							BankingData.BANKING_DATA_DOCUMENT_TYPES[randomDTNumber],
							BankingData.BANKING_DATA_PERSON_TYPES[1], BankingData.BANKING_DATA_COUNTRIES[0],
							BankingData.BANKING_DATA_DEPARTMENTS[randomDPTNumber],
							BankingData.BANKING_DATA_TOWNS[randomDPTNumber], BankingData.BANKING_DATA_ADDRESSES[i]));
		}
	}

	/**
	 * Method that initialize the accounts HashTable with accounts information.
	 */
	public void setBankingAccountsData() {
		Random randomNumber=new Random();
		for (int i = 0; i < BankingData.BANKING_DATA_IDENTIFICATIONS.length; i++) {
			int randomATYNumber = randomNumber.nextInt(2);//0-1
			int randomCODEXGMFNumber = randomNumber.nextInt(2);//0-1
			String randomInitBalance=String.valueOf(randomNumber.nextInt(10000000));
			String accountNumber=BankingData.BANKING_DATA_ACCOUNT_NUMBERS[i];
			BankingClient actualBankingClient=(BankingClient) clients.remove(BankingData.BANKING_DATA_IDENTIFICATIONS[i]);
			BankingAccount newAccount=new BankingAccount(BankingData.BANKING_DATA_ACCOUNT_TYPES[randomATYNumber], accountNumber, BankingData.BANKING_DATA_CODEX_TYPES[randomCODEXGMFNumber], randomInitBalance,actualBankingClient);
			accounts.put(accountNumber, newAccount);
		}
	}

	public Hashtable getClients() {
		return clients;
	}

	public void setClients(Hashtable clients) {
		this.clients = clients;
	}

	public Hashtable getAccounts() {
		return accounts;
	}

	public void setAccounts(Hashtable accounts) {
		this.accounts = accounts;
	}

}
