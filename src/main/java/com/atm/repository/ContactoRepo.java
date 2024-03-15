package com.atm.repository;

import com.atm.entyti.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ContactoRepo extends JpaRepository<Contacto, Integer> {
}
