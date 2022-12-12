package com.cursodemo.cursodemo.controller;

import com.cursodemo.cursodemo.models.User;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

  @RequestMapping(value = "user/{id}")
  public User getUser(@PathVariable Long id){
    User user = new User();
    user.setId(id);
    user.setNombre("Juan");
    user.setApellido("Lopez");
    user.setEmail("lope@gmail.com");
    return user;
  }

  @RequestMapping(value = "userdd")
  public User editar(){
    User user = new User();
    user.setNombre("Juan");
    user.setApellido("Lopez");
    user.setEmail("lope@gmail.com");
    return user;
  }

  @RequestMapping(value = "userss")
  public User eliminar(){
    User user = new User();
    user.setNombre("Juan");
    user.setApellido("Lopez");
    user.setEmail("lope@gmail.com");
    return user;
  }

  @RequestMapping(value = "userssa")
  public User buscar(){
    User user = new User();
    user.setNombre("Juan");
    user.setApellido("Lopez");
    user.setEmail("lope@gmail.com");
    return user;
  }
}
