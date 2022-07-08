package jpaproject.academia.controller;

import jpaproject.academia.entity.Aluno;
import jpaproject.academia.entity.AvaliacaoFisica;
import jpaproject.academia.entity.form.AlunoForm;
import jpaproject.academia.entity.form.AlunoUpdateForm;
import jpaproject.academia.service.Impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @GetMapping("/listar")
    public List<Aluno> listarAlunos(){
        return service.getAll();
    }

    @PostMapping("/salvar")
    public Aluno criarAluno(@RequestBody AlunoForm form){
        return service.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> listarAvaliacoes(@PathVariable Long id){
        return service.getAllAvaliacaoFisicaId(id);
    }

    @DeleteMapping("/deletar/{id}")
    public Aluno deletarAluno(@PathVariable Long id){
        return service.delete(id);
    }

    @PutMapping("/atualizar")
    public Aluno atualizarAluno(@RequestBody AlunoUpdateForm form){
        return service.update(form);
    }
}
