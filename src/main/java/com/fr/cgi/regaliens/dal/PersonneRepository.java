package com.fr.cgi.regaliens.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fr.cgi.regaliens.bo.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Integer> {

}
