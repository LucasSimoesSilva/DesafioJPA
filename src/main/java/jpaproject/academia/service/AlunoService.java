package jpaproject.academia.service;

import jpaproject.academia.entity.Aluno;
import jpaproject.academia.entity.AvaliacaoFisica;
import jpaproject.academia.entity.form.AlunoForm;
import jpaproject.academia.entity.form.AlunoUpdateForm;

import java.util.List;

public interface AlunoService {

    /**
     * Cria um Aluno e salva no banco de dados.
     * @param form formulário referente aos dados para criação de um Aluno no banco de dados.
     * @return Aluno recém-criado.
     */
    Aluno create(AlunoForm form);

    /**
     * Retorna um Aluno que está no banco de dados conforme o seu Id.
     * @param id id do Aluno que será exibido.
     * @return Aluno de acordo com o Id fornecido.
     */
    Aluno get(Long id);

    /**
     * Retorna os Alunos que estão no banco de dados.
     * @return Uma lista os Alunos salvas no DB.
     */
    List<Aluno> getAll();

    /**
     * Atualiza o Aluno.
     * @param id id do Aluno que será atualizado.
     * @param formUpdate formulário referente aos dados necessários para atualização do Aluno
     * no banco de dados.
     * @return Aluno recém-atualizado.
     */
    Aluno update(AlunoUpdateForm formUpdate);

    /**
     * Deleta um Aluno específico.
     * @param id id do Aluno que será removido.
     * @return Aluno que foi deletado.
     */
    Aluno delete(Long id);

    /**
     *
     * @param id 'id' do aluno que será recuperada a lista de avaliações
     * @return uma lista com todas as avaliações do aluno conforme o Id
     */
    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);


}
