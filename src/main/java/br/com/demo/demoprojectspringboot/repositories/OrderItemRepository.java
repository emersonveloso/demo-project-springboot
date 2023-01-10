package br.com.demo.demoprojectspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.demo.demoprojectspringboot.entities.OrderItem;
import br.com.demo.demoprojectspringboot.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}