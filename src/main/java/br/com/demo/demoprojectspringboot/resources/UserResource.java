package br.com.demo.demoprojectspringboot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.demo.demoprojectspringboot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1l, "Maria", "maria@gmail.com", "999999", "12345");
        return ResponseEntity.ok().body(user);
    }
}
