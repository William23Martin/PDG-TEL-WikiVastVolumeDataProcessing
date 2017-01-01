package pdg.tel.vvd.test.configurator.stage.model.bankmodel;

/**
 * @author William Martín Chávez González. 
 * Systems Engineer and Communications Engineering Student.
 * Icesi University, Cali, Colombia.
 */
public class BankingAccount {

	private String type;
	private String number;
	private String codex;
	
	public BankingAccount(String type, String num, String cdx){
		this.type=type;
		this.number=num;
		this.codex=cdx;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCodex() {
		return codex;
	}

	public void setCodex(String codex) {
		this.codex = codex;
	}
	
	
}
