package com.ProativaDigital.ProjetoTesteSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProativaDigital.ProjetoTesteSpring.entities.OrderItem;
import com.ProativaDigital.ProjetoTesteSpring.entities.pk.OrderItemPK;

// Apenas essa interface já capaz de instanciar um obj repository, e já tem uma
// implmentação para essa interface no JPAREPOSITORY GENÉRICS
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	

}
