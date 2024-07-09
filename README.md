# Desafios de Ordenação e Coleções

Este repositório contém desafios práticos do meu curso de Java: Trabalhando com listas e coleções de dados. Foram utilizados para consolidar o conhecimento sobre ordenação de dados em Java, as interfaces `List`, `Comparable` e `Collection`, além das classes `ArrayList` e `LinkedList`.

**Objetivo:**

- Compreender o funcionamento do método `Collections.sort` e sua aplicação na ordenação de listas.
- Implementar a interface `Comparable` para definir a ordem de comparação entre objetos.
- Utilizar a interface `List` para trabalhar com diferentes implementações de listas, como `ArrayList` e `LinkedList`.

**Desafios:**

1. **Ordenando uma Lista de Inteiros:**
    - Crie uma lista de números inteiros e utilize o método `Collections.sort` para ordená-la em ordem crescente.
    - Imprima a lista ordenada.
2. **Ordenando Objetos:**
    - Crie uma classe `Titulo` com um atributo `nome` do tipo `String`.
    - Implemente a interface `Comparable` na classe `Titulo` para que seja possível ordenar uma lista de objetos `Titulo`.
    - Crie alguns objetos da classe `Titulo` e adicione-os a uma lista.
    - Utilize o método `Collections.sort` para ordenar a lista e, em seguida, imprima os títulos ordenados.
3. **Trocando Implementações de Listas:**
    - Crie uma lista utilizando a interface `List` e instancie-a tanto como `ArrayList` quanto como `LinkedList`.
    - Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.
4. **Polimorfismo com Listas:**
    - Modifique o Exercício 3 para declarar a variável de lista como a interface `List`, demonstrando o uso de polimorfismo.

**Dicas passadas pelos meus professores:**

- Utilize o método `compareTo` da interface `Comparable` para definir a ordem de comparação entre objetos.
- Explore a documentação da API Java para entender melhor o funcionamento das classes e interfaces utilizadas.
- Teste seus códigos com diferentes entradas para garantir que eles funcionam corretamente.

**Observações:**

- Os desafios são opcionais e servem como complemento ao aprendizado.
- Sinta-se à vontade para adaptar os desafios e criar seus próprios testes.
- Boa sorte e divirta-se aprendendo!
