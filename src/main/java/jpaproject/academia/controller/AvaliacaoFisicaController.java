package jpaproject.academia.controller;

import jpaproject.academia.entity.AvaliacaoFisica;
import jpaproject.academia.entity.form.AvaliacaoFisicaForm;
import jpaproject.academia.entity.form.AvaliacaoFisicaUpdateForm;
import jpaproject.academia.service.Impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacao")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl service;

    @GetMapping("/listar")
    public List<AvaliacaoFisica> listarAvaliacoes(){
        return service.getAll();
    }

    @PostMapping("/salvar")
    public AvaliacaoFisica criarAvaliacao(@RequestBody AvaliacaoFisicaForm form){
        return service.create(form);
    }

    @DeleteMapping("/deletar/{id}")
    public AvaliacaoFisica deletarAvaliacao(@PathVariable Long id){
        return service.delete(id);
    }

    @PutMapping("/atualizar")
    public AvaliacaoFisica atualizarAvaliacao(@RequestBody AvaliacaoFisicaUpdateForm form){
        return service.update(form);
    }
}
