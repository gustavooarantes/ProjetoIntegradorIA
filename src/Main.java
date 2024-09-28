import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, usersChoice;

        do {
            System.out.println("===============================================");
            System.out.println("Bem vindo! Como podemos ajudar?");
            System.out.println("Selecione uma das alternativas para continuar!");
            System.out.println("===============================================");
            System.out.println();
            System.out.println("(1) - Dúvidas sobre Teoria dos Números");
            System.out.println("(2) - Dúvidas sobre Otimização");
            System.out.println("(3) - Dúvidas sobre Cálculo");
            System.out.println("(4) - Dúvidas sobre Álgebra Abstrata");
            System.out.println("(5) - Dúvidas sobre Álgebra Linear");
            System.out.println();
            System.out.println("Selecione (0) para encerrar o programa.");
            System.out.print("Sua seleção: ");

            i = scanner.nextInt();

            if (i == 1) {
                System.out.println("Selecione sua dúvida abaixo:");
                System.out.println("(1) - O que significa congruẽncia módulo m?");
                System.out.println("(2) - O que é o Máximo Divisor Comum?");
                System.out.println("(3) - Qual é o Princípio da Indução Finita?");
                System.out.println();
                System.out.print("Sua seleção: ");

                usersChoice = scanner.nextInt();

                if (usersChoice == 1) {
                    System.out.println("Dizemos que a é congruente a b módulo m (m > 0) se m divide a - b");
                } else if (usersChoice == 2) {
                    System.out.println("O MDC de dois inteiros a e b, denotado por (a, b), é o maior inteiro que divide a e b");
                } else if (usersChoice == 3) {
                    System.out.println("Seja B um conjunto de números inteiros positivos. Se 1 pertence a B e k + 1 pertence a B sempre que k pertence a B, então B contém todos os inteiros positivos");
                }
            } else if (i == 2) {
                System.out.println("Selecione sua dúvida abaixo:");
                System.out.println("(1) - O que diz o Teorema de Weierstrass?");
                System.out.println("(2) - O que é o Conjunto de Nível?");
                System.out.println("(3) - Qual a condição necessária de primeira ordem para que um ponto seja minimizador local do problema?");
                System.out.println();
                System.out.print("Sua seleção: ");

                usersChoice = scanner.nextInt();

                if (usersChoice == 1) {
                    System.out.println("Seja D contido no Rn um conjunto compacto não-vazio e f:D->R uma função contínua. Então o problema de minimizar f em D possui soluções globais");
                } else if (usersChoice == 2) {
                    System.out.println("O Conjunto de Nível da função f:D->R associado a c pertencente aos Reais é o conjunto dos pontos x tais que f(x) é menor ou igual a c");
                } else if (usersChoice == 3) {
                    System.out.println("Suponhamos que a função seja diferenciável no ponto x pertencente ao Domínio. Se x é um minimizador local irrestrito da função, então sua derivada é igual a zero");
                }
            } else if (i == 3) {
                System.out.println("Selecione sua dúvida abaixo:");
                System.out.println("(1) - Qual a definição formal de Limite?");
                System.out.println("(2) - Qual a definição formal de Derivada?");
                System.out.println("(3) - Qual a definição formal de Integral?");
                System.out.println();
                System.out.print("Sua seleção: ");

                usersChoice = scanner.nextInt();

                if (usersChoice == 1) {
                    System.out.println("Dizemos que o limite de f(x) quando x tende a b é L se para todo E > 0 existir um K > 0 tal que, se 0 < |x-b| < K, então |f(x)-L| < E");
                } else if (usersChoice == 2) {
                    System.out.println("Dizemos que a derivada de f(x) em um número a é o limite quando h tende a 0 de f(a+h)-f(a)/x-a");
                } else if (usersChoice == 3) {
                    System.out.println("Dizemos que a integral de f(x) num intervalo [a, b] é o limite do somatório da multiplicação dos valores de f em um determinado subintervalo vezes o comprimento desse subintervalo");
                }
            } else if (i == 4) {
                System.out.println("Selecione sua dúvida abaixo:");
                System.out.println("(1) - O que é um grupo?");
                System.out.println("(2) - O que é um anel?");
                System.out.println("(3) - O que é um corpo?");
                System.out.println();
                System.out.print("Sua seleção: ");

                usersChoice = scanner.nextInt();

                if (usersChoice == 1) {
                    System.out.println("Seja G um conjunto e * uma operação binária fechada em G. Então, (G, *) é um grupo se existe asssociatividade, elemento identidade e inversos para cada elememto");
                } else if (usersChoice == 2) {
                    System.out.println("Seja R um conjunto e + e * operações binárias fechadas em R. Então, (R, +, *) é um anel se existe associatividade, elemento identidade e inversos para a operação + e distributividade à esquerda para + e *");
                } else if (usersChoice == 3) {
                    System.out.println("Um corpo é um anel com comutatividade para a operação *, com elemento unidade, onde cada elemento diferente de zero é uma unidade");
                }
            } else if (i == 5) {
                System.out.println("Selecione sua dúvida abaixo:");
                System.out.println("(1) - O que é uma base de um espaço vetorial?");
                System.out.println("(2) - O que é a dimensão de um espaço vetorial?");
                System.out.println("(3) - O que é um subespaço vetorial?");
                System.out.println();
                System.out.print("Sua seleção: ");

                usersChoice = scanner.nextInt();

                if (usersChoice == 1) {
                    System.out.println("A base de um espaço vetorial é um conjunto de vetores linermente independentes tal que suas combinações linerares formam todos os outros vetores do espaço");
                } else if (usersChoice == 2) {
                    System.out.println("A dimensão de um espaço vetorial é o número de vetores da base");
                } else if (usersChoice == 3) {
                    System.out.println("UM subespaço vetorial é um subconjunto de um espaço vetorial que também é, por si próprio, um espaço vetorial");
                }
            }
        } while (i != 0);
    }
}