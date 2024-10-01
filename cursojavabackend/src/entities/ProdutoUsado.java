package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
	
	private Date dataFabricacao; 
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public ProdutoUsado() {
	}

	public ProdutoUsado(String name, Double price, Date dataFabricacao) {
		super(name, price);
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	
	@Override
	public String priceTag() {
		return getName() + " (used) " 
				+ " $ " 
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: " 
				+ sdf.format(dataFabricacao) + ")";
	}
}
