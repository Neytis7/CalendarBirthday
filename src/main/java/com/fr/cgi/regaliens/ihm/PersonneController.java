package com.fr.cgi.regaliens.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.fr.cgi.regaliens.bll.PersonneService;
import com.fr.cgi.regaliens.bo.Personne;

@Controller
public class PersonneController {

  @Autowired
  private PersonneService service;

  @GetMapping("/show")
  public String show() {
    return "PersonneRegister";
  }

  @PostMapping("/inscription")
  public String savePersonne(@ModelAttribute Personne personne) {
    service.savePersonne(personne);
    return "PersonneRegister";
  }

  @GetMapping(" ")
  public String getAll() {
    return "Calendar";
  }

}
