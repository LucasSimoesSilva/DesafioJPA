package jpaproject.academia.service.Impl;

import jpaproject.academia.entity.Aluno;
import jpaproject.academia.entity.AvaliacaoFisica;
import jpaproject.academia.entity.form.AvaliacaoFisicaForm;
import jpaproject.academia.entity.form.AvaliacaoFisicaUpdateForm;
import jpaproject.academia.repository.AlunoRepository;
import jpaproject.academia.repository.AvaliacaoFisicaRepository;
import jpaproject.academia.service.AvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements AvaliacaoFisicaService {

    @Autowired
    AvaliacaoFisicaRepository avaliacaoRepository;

    @Autowired
    AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacao = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacao.setAluno(aluno);
        avaliacao.setPeso(form.getPeso());
        avaliacao.setAltura(form.getAltura());
        return avaliacaoRepository.save(avaliacao);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return avaliacaoRepository.findAll();
    }

    @Override
    public AvaliacaoFisica update(AvaliacaoFisicaUpdateForm formUpdate) {
        AvaliacaoFisica avaliacaoFisica = avaliacaoRepository.findById(formUpdate.getId()).get();
        avaliacaoFisica.setAltura(formUpdate.getAltura());
        avaliacaoFisica.setPeso(formUpdate.getPeso());

        avaliacaoRepository.save(avaliacaoFisica);

        return avaliacaoFisica;
    }

    @Override
    public AvaliacaoFisica delete(Long id) {
        AvaliacaoFisica avaliacaoFisica = avaliacaoRepository.findById(id).get();

        avaliacaoRepository.delete(avaliacaoFisica);
        return avaliacaoFisica;
    }
}
