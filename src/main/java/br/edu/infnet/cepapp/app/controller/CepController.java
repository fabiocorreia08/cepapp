package br.edu.infnet.cepapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.infnet.cepapp.app.model.Cep;

@Controller
public class CepController {

	@Autowired
	private CepService service;
	
	@RequestMapping(value = "/ceps/list", method = RequestMethod.GET)
	public String list(Model model) {
		List<Cep> ceps = service.getCeps();
		model.addAttribute("listaCeps", ceps);
		return "ceps/list";
	}
	
	@RequestMapping(value = "/ceps/form" , method = RequestMethod.GET)
	public String viewForm(Model model) {
		return "ceps/form";
	}
	
	
	@RequestMapping(value = "/ceps/add", method = RequestMethod.POST)
	public String save(Model model, Cep todo) {
		service.persite(todo);
		return "redirect:/ceps/list";
	}
	
	@RequestMapping(value = "/ceps/edit/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable("id") String id, Model model) {
		Cep cep = service.getCep(id);
		model.addAttribute("cep", cep);
		return "ceps/edit";
	}
	
	@RequestMapping(value = "/ceps/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") String id, Model model) {
		model.addAttribute("id", service.getCep(id));
		return "ceps/list";
	}
	
	@RequestMapping(value = "/ceps/update", method = RequestMethod.POST)
	public String update(Model model, Cep cep) {
		service.update(cep);
		return "redirect:/ceps/list";
	}
	
	public CepService getService() {
		return service;
	}

	public void setService(CepService service) {
		this.service = service;
	}
	
}
