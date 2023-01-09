package br.com.demo.demoprojectspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.demo.demoprojectspringboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
