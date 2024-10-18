package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String nome;
    private String descricao;
    // setado como final para não ser alterado
    private final LocalDate dataInicio = LocalDate.now();
    //o bootcamp se encerra 45 dias depois da inscrição.
    private final LocalDate dataFim = dataInicio.plusDays(45);
    // a ordem dos conteudos importa, e eles não podem ser repetidos
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private Set<Dev> devsInscritos = new HashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(getNome(), bootcamp.getNome()) && Objects.equals(getDescricao(), bootcamp.getDescricao()) && Objects.equals(getDataInicio(), bootcamp.getDataInicio()) && Objects.equals(getDataFim(), bootcamp.getDataFim()) && Objects.equals(getConteudos(), bootcamp.getConteudos()) && Objects.equals(getDevsInscritos(), bootcamp.getDevsInscritos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getDataInicio(), getDataFim(), getConteudos(), getDevsInscritos());
    }
}
