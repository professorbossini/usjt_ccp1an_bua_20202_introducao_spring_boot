package br.com.bossini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.bossini.model.Aluno;
import br.com.bossini.repository.AlunoRepository;

@Controller
public class AlunoController {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@GetMapping ("/alunos") 
	public ModelAndView listarAlunos () {
		
		ModelAndView mv = new ModelAndView("lista_alunos");
		
		List <Aluno> alunos = alunoRepository.findAll();
		
		
		mv.addObject(new Aluno());
		mv.addObject("alunos", alunos);
		
		return mv;
	}
	
	@PostMapping ("/alunos")
	public String salvar (Aluno aluno) {
		alunoRepository.save(aluno);
		return "redirect:/alunos";
	}
}













