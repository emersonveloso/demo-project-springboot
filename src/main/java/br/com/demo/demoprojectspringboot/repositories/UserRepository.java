package br.com.demo.demoprojectspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.demo.demoprojectspringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
