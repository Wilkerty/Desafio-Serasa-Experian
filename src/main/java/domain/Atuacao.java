package domain;

import java.util.ArrayList;
import java.util.Objects;

public class Atuacao {

    private String regiao;
    private ArrayList estados;

    public Atuacao() {
    }

    public Atuacao(String regiao, ArrayList estados) {
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
        if (!(o instanceof Atuacao)) return false;
        Atuacao atuacao = (Atuacao) o;
        return Objects.equals(regiao, atuacao.regiao) && Objects.equals(estados, atuacao.estados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regiao, estados);
    }
}
