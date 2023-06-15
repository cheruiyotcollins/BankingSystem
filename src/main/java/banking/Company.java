package banking;

public class Company {
	private String companyName;

	public Company(String companyName, int taxId) {
		this.companyName=companyName;
	}

	public String getCompanyName() {
		try{
			return companyName;
		}catch(RuntimeException e){
			throw new RuntimeException("Company name not found");
		}

	}
}
