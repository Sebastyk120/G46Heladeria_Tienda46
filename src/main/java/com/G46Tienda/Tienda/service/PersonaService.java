package com.G46Tienda.Tienda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.G46Tienda.Tienda.interfaces.IPersona;
import com.G46Tienda.Tienda.interfeceService.IpersonaService;
import com.G46Tienda.Tienda.model.Persona;

@Service
public class PersonaService implements IpersonaService{
	
	@Autowired
	private IPersona data;

	@Override
	public List<Persona> listar() {
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int Cedula) {
		return data.findById(Cedula);
	}

	@Override
	public int save(Persona p) {
		int res = 0;
		Persona persona=data.save(p);
		if(!persona.equals(null))
			res=1;
		
		return res;
	}

	@Override
	public void delete(int Cedula) 
	{
		data.deleteById(Cedula);
	}

}
