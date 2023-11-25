package dominio;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;
import java.time.LocalDate;

@Entity
@Table(name = "tb_paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paciente_id")
    private Integer id;
    @Column(name = "nom_paciente", nullable = false, unique = true)
    private String nome;
    @Column(name = "des_rg", nullable = false, unique = true)
    private String rg;
    @Column(name = "des_endereco", nullable = false, unique = true)
    private String endereco;
    @Column(name = "num_telefone", nullable = false, unique = true)
    private String telefone;
    @Column(name = "dta_nascimento", nullable = false, unique = true)
    private LocalDate dataNascimento;
    @Column(name = "des_profissao", nullable = false, unique = true)
    private String profissao;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="paciente_id")
    private List<Exame> exames;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return Objects.equals(id, paciente.id) && Objects.equals(nome, paciente.nome) && Objects.equals(rg, paciente.rg) && Objects.equals(endereco, paciente.endereco) && Objects.equals(telefone, paciente.telefone) && Objects.equals(dataNascimento, paciente.dataNascimento) && Objects.equals(profissao, paciente.profissao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, rg, endereco, telefone, dataNascimento, profissao);
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", rg='" + rg + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", profissao='" + profissao + '\'' +
                '}';
    }
}

