package entities;

public class ProdutoImportado extends Produto {

	private double customsFee;
	
	
	
	public ProdutoImportado() {
	}

	public ProdutoImportado(String name, double price, double customeFee) {
		super(name, price);
		this.customsFee = customeFee;
	}

	public double getCustomeFee() {
		return customsFee;
	}

	public void setCustomeFee(double customeFee) {
		this.customsFee = customeFee;
	}
	
	public double totalPrice() {
		return getPrice() + customsFee;
	}
	
	
	@Override
	public String priceTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customsFee)
				+ ")";
	}
	
}
