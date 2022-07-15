package adapter.repository.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name= "VENDEDOR", schema = "SERASA")
public class VendedorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VENDEDOR_SEQUENCE")
    @SequenceGenerator(sequenceName = "vendedor_seq", allocationSize = 1, name = "VENDEDOR_SEQUENCE", schema = "SERASA")
    @Column(name="id")
    private Long id;

    @Column(name="data_inclusao", unique = true)
    @NotNull
    private Date data_inclusao;

    @Column(name="nome", unique = true)
    @NotNull
    private String nome;

    @Column(name="telefone", unique = true)
    @NotNull
    private String telefone;

    @Column(name="idade", unique = true)
    @NotNull
    private int idade;

    @Column(name="cidade", unique = true)
    @NotNull
    private String cidade;

    @Column(name="estado", unique = true)
    @NotNull
    private String estado;

    @Column(name="regiao", unique = true)
    @NotNull
    private String regiao;

    @ManyToOne
    @JoinColumn(name = "estados")
    private VendedorAtuacaoModel estados;


    public VendedorModel() {
    }

    public VendedorModel(Long id, Date data_inclusao, String nome, String telefone, int idade, String cidade, String estado, String regiao) {
        this.id = id;
        this.data_inclusao = data_inclusao;
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
        this.cidade = cidade;
        this.estado = estado;
        this.regiao = regiao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData_inclusao() {
        return data_inclusao;
    }

    public void setData_inclusao(Date data_inclusao) {
        this.data_inclusao = data_inclusao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VendedorModel)) return false;
        VendedorModel that = (VendedorModel) o;
        return idade == that.idade && Objects.equals(id, that.id) && Objects.equals(data_inclusao, that.data_inclusao) && Objects.equals(nome, that.nome) && Objects.equals(telefone, that.telefone) && Objects.equals(cidade, that.cidade) && Objects.equals(estado, that.estado) && Objects.equals(regiao, that.regiao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data_inclusao, nome, telefone, idade, cidade, estado, regiao);
    }
}
