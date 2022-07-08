package jpaproject.academia.service;

import jpaproject.academia.entity.AvaliacaoFisica;
import jpaproject.academia.entity.form.AvaliacaoFisicaForm;
import jpaproject.academia.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface AvaliacaoFisicaService {

    /**
     * Cria uma Avaliação Física e salva no banco de dados.
     * @param form — formulário referente aos dados para criação da Avaliação Física no banco de dados.
     * @return — Avaliação Física recém-criada.
     */
    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    /**
     * Retorna uma Avaliação Física que está no banco de dados conforme o seu Id.
     * @param id — 'id' da Avaliação Física que será exibida.
     * @return — Avaliação Física conforme o Id fornecido.
     */
    AvaliacaoFisica get(Long id);

    /**
     * Retorna todas as Avaliações Física que estão no banco de dados.
     * @return — Uma lista com todas as Avaliações Física salvas no DB.
     */
    List<AvaliacaoFisica> getAll();

    /**
     * Atualiza a avaliação física.
     * @param id — 'id' da Avaliação Física que será atualizada.
     * @param formUpdate — formulário referente aos dados necessários para atualização da Avaliação
     * Física no banco de dados.
     * @return — Avaliação Física recém-atualizada.
     */
    AvaliacaoFisica update(AvaliacaoFisicaUpdateForm formUpdate);

    /**
     * Deleta uma Avaliação Física específica.
     * @param id — 'id' da Avaliação Física que será removida.
     */
    AvaliacaoFisica delete(Long id);
}
