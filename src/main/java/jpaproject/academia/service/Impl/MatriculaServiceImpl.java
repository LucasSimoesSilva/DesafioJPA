package jpaproject.academia.service.Impl;

import jpaproject.academia.entity.Aluno;
import jpaproject.academia.entity.Matricula;
import jpaproject.academia.entity.form.MatriculaForm;
import jpaproject.academia.repository.AlunoRepository;
import jpaproject.academia.repository.MatriculaRepository;
import jpaproject.academia.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class MatriculaServiceImpl implements MatriculaService {

    @Autowired
    MatriculaRepository matriculaRepository;

    @Autowired
    AlunoRepository alunoRepository;


    @Override
    public Matricula create(MatriculaForm form) {
        try {
            matriculaRepository.findById(form.getAlunoId()).get().getAluno().getId();
            return null;

        } catch (NoSuchElementException e) {
            Matricula matricula = new Matricula();
            Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

            matricula.setAluno(aluno);
            return matriculaRepository.save(matricula);
        }

    }


    @Override
    public List<Matricula> getAll() {
        return matriculaRepository.findAll();
    }

    @Override
    public Matricula delete(Long id) {
        Matricula matricula = matriculaRepository.findById(id).get();

        matriculaRepository.delete(matricula);
        return matricula;
    }
}
