package br.com.demo.demoprojectspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.demo.demoprojectspringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
