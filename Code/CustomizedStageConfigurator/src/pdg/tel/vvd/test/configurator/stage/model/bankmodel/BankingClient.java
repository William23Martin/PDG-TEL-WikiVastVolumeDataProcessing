/**
 * 
 */
package pdg.tel.vvd.test.configurator.stage.model.bankmodel;

/**
 * @author William Martín Chávez González. 
 * Systems Engineer and Communications Engineering Student.
 * Icesi University, Cali, Colombia.
 */
public class BankingClient {

	private String identification;
	private String name;
	private String legalName;
	private String lastName;
	private String verificationDigit;
	private String documentType;
	private String personType;
	private String country;
	private String department;
	private String town;
	private String address;

	public BankingClient(String id, String name, String lastName, String legalN, String vd, String dt, String pt, String co, String de,
			String tow, String add) {
		this.identification=id;
		this.name=name;
		this.legalName=legalN;
		this.lastName=lastName;
		this.verificationDigit=vd;
		this.documentType=dt;
		this.personType=pt;
		this.country=co;
		this.department=de;
		this.town=tow;
		this.address=add;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getVerificationDigit() {
		return verificationDigit;
	}

	public void setVerificationDigit(String verificationDigit) {
		this.verificationDigit = verificationDigit;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getPersonType() {
		return personType;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
