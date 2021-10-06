package com.G46Tienda.Tienda.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.G46Tienda.Tienda.model.Persona;


@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {

}
