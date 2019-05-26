package com.springbootdev.oauth2.examples.springbootoauth2resourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class WelcomeController {

  @GetMapping("/public")
  public String welcomePublic() {
    return "welcome public/guest user";
  }

  @RolesAllowed({"ROLE_ADMIN"})
  @GetMapping("/admin")
  public String welcomeAdmin() {
    return "welcome admin";
  }

  @RolesAllowed({"ROLE_USER"})
  @GetMapping("/user")
  public String welcomeUser() {
    return "welcome user";
  }
}
