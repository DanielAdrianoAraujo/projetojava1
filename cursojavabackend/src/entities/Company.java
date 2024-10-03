package entities;

public class Company extends TaxPayer{

	private Double numberOfEmployees;
	
	
	public Company() {
	}


	public Company(String name, Double anualIncome, Double numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}


	public Double getNumberOfEmployees() {
		return numberOfEmployees;
	}


	public void setNumberOfEmployees(Double numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}


	@Override
	public Double tax() {
		if (numberOfEmployees > 10) {
			return getAnualIncome() * 0.14;
		}else {
			return getAnualIncome() * 0.16;
		}
	}

}
