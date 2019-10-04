package br.edu.infnet.cepapp.app.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.edu.infnet.cepapp.app.model.Cep;
import br.edu.infnet.cepapp.app.model.persistence.CepDao;
import br.edu.infnet.cepapp.app.model.persistence.UsuarioDao;



@Service
public class CepService {
 
	@Autowired
	private CepDao dao;

	public CepService() {
	}
	
	@Transactional(propagation = Propagation.NEVER)
	public List<Cep> getCeps() {
		return dao.getAll();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void persite(Cep cep) {
		dao.salvar(cep);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void update(Cep cep) {
		dao.editar(cep);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(Integer id) {
		dao.deletar(id);
	}

	@Transactional(propagation = Propagation.NEVER)
	public Cep getCep(String id) {
		Objects.requireNonNull(id, "vai para lá com esse id nullo");
		
		Integer integer = Integer.valueOf(id);
		return dao.findOne(integer);
	}

	public CepDao getDao() {
		return dao;
	}

	public void setDao(CepDao dao) {
		this.dao = dao;
	}

}
