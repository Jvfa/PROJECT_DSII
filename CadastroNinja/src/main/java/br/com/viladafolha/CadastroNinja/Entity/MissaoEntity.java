package br.com.viladafolha.CadastroNinja.Entity;

import jakarta.persistence.*;
<<<<<<< HEAD
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
=======
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
>>>>>>> ad23d0235b774d0f7657a2262f0f44e67b01e3e8
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
<<<<<<< HEAD
import org.hibernate.validator.constraints.br.CPF;
=======
>>>>>>> ad23d0235b774d0f7657a2262f0f44e67b01e3e8

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="missao")
<<<<<<< HEAD

public class MissaoEntity {
=======
public class MissaoEntity {

>>>>>>> ad23d0235b774d0f7657a2262f0f44e67b01e3e8
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_missao")
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
<<<<<<< HEAD
    @Size(min = 3, max = 255, message = "Nome deve ter entre 3 e 50 caracteres")
    @Column(name="nome_missao", nullable = false)
    private String nome;

    @NotBlank(message = "Classificacao é obrigatório.")
    @Size(min = 1, max = 1, message = "A classificação deve ter 1 caractere")
    @Column(name="classificacao_missao", unique = true, nullable = false)
    private String classificacao;

    @Column(name="status_missao")
    private Boolean status;
}
=======
    @Size(min = 5, max = 150, message = "Nome deve ter entre 5 e 50 caracteres")
    @Column(name="nome_missao", nullable = false)
    private String nome;

    @Column(name="classificacao_missao", length = 1)
    private Character classificacao;

    @NotNull(message = "Status é obrigatório.")
    @Column(name="status", nullable = false)
    private Boolean status;

}

>>>>>>> ad23d0235b774d0f7657a2262f0f44e67b01e3e8
