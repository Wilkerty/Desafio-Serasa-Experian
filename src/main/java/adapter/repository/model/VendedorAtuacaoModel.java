package adapter.repository.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="ATUACAO", schema = "SERASA")
public class VendedorAtuacaoModel{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="regiao")
    @NotNull
    private String regiao;

    @Column(name="estados")
    @NotNull
    private List estados;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public VendedorAtuacaoModel() {
    }

    public VendedorAtuacaoModel(String regiao, ArrayList estados) {
        this.regiao = regiao;
        this.estados = estados;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public ArrayList getEstados() {
        return estados;
    }

    public void setEstados(ArrayList estados) {
        this.estados = estados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VendedorAtuacaoModel)) return false;
        VendedorAtuacaoModel that = (VendedorAtuacaoModel) o;
        return Objects.equals(regiao, that.regiao) && Objects.equals(estados, that.estados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regiao, estados);
    }
}