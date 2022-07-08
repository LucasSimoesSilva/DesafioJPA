package jpaproject.academia.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor //Construtor vazio
@AllArgsConstructor // Construtor com todos os argumentos
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nome;

    @Column(unique = true)
    private String cpf;

    private String bairro;
    private LocalDate dataDeNascimento;

    @OneToMany(mappedBy = "aluno",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private List<AvaliacaoFisica> avaliacao = new ArrayList<>();

}
