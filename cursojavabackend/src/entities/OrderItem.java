package entities;

public class OrderItem {
	
	private Integer quantity;
	private double price;
	
	private Product product;
	
	public OrderItem() {
	}
	
	public OrderItem(Integer quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}


	public Integer getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public double subTotal() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return getProduct().getName() +
				", $" +
				String.format("%.2f", price) +
				", Quantity: " +
				String.format("%.2f", subTotal());
	}
	
	

}
