package jpaproject.academia.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoUpdateForm {

    private Long id;

    private String nome;

    private String bairro;

    private LocalDate dataDeNascimento;
}
