package dominio;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_exame")

public class Exame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="exame_id")
    private Integer id;
    @Column(name = "des_exame", nullable = false, unique = true)
    private String descricao;
    @Column(name = "dta_exame", nullable = false, unique = true)
    private LocalDate data;
    @Column(name = "num_preco", nullable = false, unique = true)
    private Double preco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exame exame = (Exame) o;
        return Objects.equals(id, exame.id) && Objects.equals(descricao, exame.descricao) && Objects.equals(data, exame.data) && Objects.equals(preco, exame.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao, data, preco);
    }

    @Override
    public String toString() {
        return "Exame{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                ", preco=" + preco +
                '}';
    }
}

