package Estudos.Aprendizado; // Corrigido com ponto e vírgula

// Sintaxe básica
public class folhaDeDicas { // Nome da classe com a primeira letra maiúscula
    public static void main(String[] args) {
        System.out.println("Hello World"); // Imprime Hello World

        // Variáveis
        // Declaração de variáveis dentro do método
        int num = 10; // Declaração de uma variável inteira
        System.out.println("Número: " + num); // Imprime o valor de 'num'
        
        double decimal = 5.5; // Declaração de uma variável de ponto flutuante
        System.out.println("Decimal: " + decimal); // Imprime o valor de 'decimal'
        
        char letra = 'A'; // Declara uma variável do tipo char que corresponde a uma letra
        System.out.println("Letra: " + letra); // Imprime o valor de 'letra'
        
        String texto = "Hello everyone"; // Declara variaveis em formato de texto
        System.out.println("Texto: " + texto); // Imprime o valor de 'texto'






// Tipos de dados
        // Tipos primitivos: byte, short, int, long, float, double, char, boolean.
        // Tipos de referência: String, Arrays, Objects.






// Arrays
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[0]); // Acessa o primeiro elemento "0"





// Métodos/Funções
        saudar("Hallan"); // Chamada do método, agora corretamente fora do método main
    }

    public static void saudar(String nome) {
        System.out.println("Hello, " + nome); // Melhorando a formatação
    }
}






// Classes e Objetos
        class Pessoa {
            String nome;
            int idade;

            Pessoa(String nome, int idade) {
                this.nome = nome;
                this.idade = idade;
            }
            void introduzir() {
                System.out.println("Meu nome e " + nome + " e eu tenho " + idade + "anos." );
            }
        }
            class Main {
                public static void main(String[] args) {
        // Criar objeto da classe Pessoa
        Pessoa pessoa = new Pessoa("Bob ", 30);
        pessoa.introduzir(); // Chamar método introduzir
                }
            }





// heranca
        class Animal{
            void comer() {
                System.out.println("comendo...");
            }
        }
        // Classe Dog que estende a classe Animal
        class Dog extends Animal {
            void latir() {
                System.out.println("Woof!");
            }
        class Cat extends Animal {
            void miar() {
                System.out.println("Meow");
            }
        }







// Classe principal para testar herança
                public static void main(String[] args) {
                Dog dog = new Dog(); // Criando um objeto Dog
                dog.comer(); // Chamando o método comer da classe Animal
                dog.latir(); // Chamando o método latir da classe Dog
                }
                {
                Cat cat = new Cat(); // Criando um objeto Dog
                cat.comer(); // Chamando o método comer da classe Animal
                cat.miar(); // Chamando o método latir da classe Dog
                }
        }


        