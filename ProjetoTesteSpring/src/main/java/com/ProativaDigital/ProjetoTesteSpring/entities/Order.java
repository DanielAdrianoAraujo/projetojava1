package com.ProativaDigital.ProjetoTesteSpring.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.ProativaDigital.ProjetoTesteSpring.entities.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order") // Criando a tabela tb_order
public class Order implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id // tb_user com ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Chave unica
	private Long id;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant moment;
	
	private Integer orderStatus;
	
	@ManyToOne // Muito pedidos para um cliente
	@JoinColumn(name = "client_id") // Especifica o nome da chave estrangeira
	private User client;
	
	public Order() {
	}

	public Order(Long id, Instant moment, OrderStatus orderStatus, User client) {
		super();
		this.id = id;
		this.moment = moment;
		setOrderstatus(orderStatus);
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}
	
	
	public OrderStatus getOrderstatus() {
		return OrderStatus.valueOf(orderStatus);
	}

	public void setOrderstatus(OrderStatus orderstatus) {
		if (orderstatus != null) {
			this.orderStatus = orderstatus.getCode();
		}
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
