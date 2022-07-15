package domain;

import java.util.Date;
import java.util.Objects;

public class Vendedor {

    private Long id;
    private Date data_inclusao;
    private String nome;
    private String telfone;
    private int idade;
    private String cidade;
    private String estado;
    private String regiao;

    public Vendedor() {
    }

    public Vendedor(Long id, Date data_inclusao, String nome, String telfone, int idade, String cidade, String estado, String regiao) {
        this.id = id;
        this.data_inclusao = data_inclusao;
        this.nome = nome;
        this.telfone = telfone;
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

    public String getTelfone() {
        return telfone;
    }

    public void setTelfone(String telfone) {
        this.telfone = telfone;
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
        if (!(o instanceof Vendedor)) return false;
        Vendedor vendedor = (Vendedor) o;
        return idade == vendedor.idade && Objects.equals(id, vendedor.id) && Objects.equals(data_inclusao, vendedor.data_inclusao) && Objects.equals(nome, vendedor.nome) && Objects.equals(telfone, vendedor.telfone) && Objects.equals(cidade, vendedor.cidade) && Objects.equals(estado, vendedor.estado) && Objects.equals(regiao, vendedor.regiao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data_inclusao, nome, telfone, idade, cidade, estado, regiao);
    }
}
