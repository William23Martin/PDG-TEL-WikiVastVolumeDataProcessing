/**
 * 
 */
package pdg.tel.vvd.test.configurator.stage.model.bankmodel;

/**
 * @author William Martín Chávez González.
 * Systems Engineer and Communications Engineering Student.
 * Icesi University, Cali, Colombia. 
 */
public class BankingTransaction {

	
	private String type;
	private String value;
	
	public BankingTransaction(String type, String value){
		this.type=type;
		this.value=value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
	
}
