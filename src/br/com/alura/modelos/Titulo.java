package br.com.alura.modelos;

public class Titulo implements Comparable<Titulo>{
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    //realiza a comparação entre títulos
    @Override
    public int compareTo(Titulo o) {
        return this.getNome().compareTo(o.getNome());
    }

    @Override
    public String toString() {
        return "Título: " + nome + "\n";
    }
}
