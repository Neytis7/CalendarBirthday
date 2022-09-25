package com.fr.cgi.regaliens.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fr.cgi.regaliens.bo.Personne;
import com.fr.cgi.regaliens.dal.PersonneRepository;

@Service
public class PersonneServiceImpl implements PersonneService {

  @Autowired
  private PersonneRepository repo;

  @Override
  public void savePersonne(Personne personne) {
    repo.save(personne);
  }


}
