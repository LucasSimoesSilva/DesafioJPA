package jpaproject.academia.service.Impl;

import jpaproject.academia.entity.Aluno;
import jpaproject.academia.entity.AvaliacaoFisica;
import jpaproject.academia.entity.form.AlunoForm;
import jpaproject.academia.entity.form.AlunoUpdateForm;
import jpaproject.academia.repository.AlunoRepository;
import jpaproject.academia.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll() {
        return repository.findAll();
    }

    @Override
    public Aluno update(AlunoUpdateForm formUpdate) {
        Aluno aluno = repository.findById(formUpdate.getId()).get();
        aluno.setNome(formUpdate.getNome());
        aluno.setBairro(formUpdate.getBairro());
        aluno.setDataDeNascimento(formUpdate.getDataDeNascimento());

        return repository.save(aluno);
    }

    @Override
    public Aluno delete(Long id) {
        Aluno aluno = repository.findById(id).get();

        repository.delete(aluno);
        return aluno;
    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        Aluno aluno = repository.findById(id).get();


        return aluno.getAvaliacao();
    }
}
