package br.com.alura;

import br.com.alura.modelos.Pessoa;
import br.com.alura.modelos.Titulo;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        //exercicio 1
        System.out.println("\nExercício 1:");
        List<Integer> listaNumeros = new LinkedList<>();
        Random gerador = new Random();

        //insere números aleatórios na lista
        for (int i = 0; i < 5; i++) {
            int numAleatorio = gerador.nextInt(100) + 1;
            listaNumeros.add(numAleatorio);
        }

        //saídas do exercício 1
        System.out.println("\nLista de números antes de ordenar: " + listaNumeros);
        Collections.sort(listaNumeros);
        System.out.println("\nLista de números após ordenar: " + listaNumeros);

        //exercicio 2
        System.out.println("\nExercício 2:");
        List<Titulo> listaTitulos = new LinkedList<>();

        //criação dos títulos
        Titulo titulo1 = new Titulo("Paperman");
        Titulo titulo2 = new Titulo("La Jetée");
        Titulo titulo3 = new Titulo("Presto");
        Titulo titulo4 = new Titulo("The Red Balloon");
        Titulo titulo5 = new Titulo("Geri's Game");

        //insere nomes na lista
        listaTitulos.add(titulo1);
        listaTitulos.add(titulo2);
        listaTitulos.add(titulo3);
        listaTitulos.add(titulo4);
        listaTitulos.add(titulo5);

        System.out.println("\nLista de títulos antes de organizar alfabeticamente:\n" + listaTitulos);

        //exercicio 3
        //acessa os elementos da lista de títulos e os organiza em ordem alfabetica
        //é possível utilizar também -> listaTitulos.sort(Comparator.comparing(Titulo::getNome));
        System.out.println("\nExercício 3");
        Collections.sort(listaTitulos);
        System.out.println("\nLista de títulos depois de organizar alfabeticamente:\n" + listaTitulos);

        //exercicio 4
        System.out.println("\nExercício 4:");
        List<Pessoa> listaPessoas = new ArrayList<>();

        //adiciona objetos na lista já criando objetos
        listaPessoas.add(new Pessoa("Alice", 30));
        listaPessoas.add(new Pessoa("Bob", 25));
        listaPessoas.add(new Pessoa("Charlie", 35));

        System.out.println("\nLista de pessoas com ArrayList:\n" + listaPessoas);

        List<Pessoa> listaPessoasLinkedlist = new LinkedList<>();
        listaPessoasLinkedlist.add(new Pessoa("David", 28));
        listaPessoasLinkedlist.add(new Pessoa("Eva", 22));
        listaPessoasLinkedlist.add(new Pessoa("Frank", 40));

        System.out.println("\nLista de pessoas com Linkedlist:\n" + listaPessoasLinkedlist);
    }
}
