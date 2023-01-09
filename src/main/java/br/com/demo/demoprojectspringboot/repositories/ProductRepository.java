package br.com.demo.demoprojectspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.demo.demoprojectspringboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
