package jpaproject.academia.controller;

import jpaproject.academia.entity.Matricula;
import jpaproject.academia.entity.form.MatriculaForm;
import jpaproject.academia.service.Impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;


    @GetMapping("/listar")
    public List<Matricula> listarMatriculas(){
        return service.getAll();
    }

    @PostMapping("/salvar")
    public Matricula criarMatricula(@Valid @RequestBody MatriculaForm form){

        return service.create(form);
    }

    @DeleteMapping("/deletar/{id}")
    public Matricula deletarMatricula(@PathVariable Long id){
        return service.delete(id);
    }
}
