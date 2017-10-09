package projetogithuba;

import java.util.Scanner;

public class ProjetoGithubA {

 

   

    
   
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        double option;

        System.out.println("----------------------------------------------------");
        System.out.println("           Criando Menu ");
        System.out.println("   Selecione o numero para aplicação desejada");
        System.out.println("1. Calculadora");
        System.out.println("2. Cadastro");
        System.out.println("3. Relatorios ");
        option = e.nextDouble();

        if (option == 1) {

            System.out.println("Você escolheu a Calculadora");
            System.out.println("---------------------------");

            calculadora();
        }  
    }
    
public static void calculadora() {

        Scanner e = new Scanner(System.in);

        
        System.out.println("--------------------------");
        System.out.println("Criando menu...");
        System.out.println("--------------------");
        System.out.println("01. Somar numeros ");
        System.out.println("02. Calcular número²");
        System.out.println("03. Raiz quadrada");
        System.out.println("04. Calcular dobro");
        System.out.println("05. Calcular tabuada");
        System.out.println("0. Sair");
        System.out.println("--------------------");
        double optionn = e.nextDouble();

        if (optionn == 1) {
            System.out.println("Parabéns você escolheu somar 2 Numeros");
            somarNumeros();
        }else if (optionn == 2) {

            System.out.println("Você escolhou calcular o quadrado: ");
            System.out.println("-----------------------------");
            somarNumerosquadrado();
        }
    }
   public static double pedirNumero() {

        Scanner e = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double num = e.nextDouble();

        return num;

    }
   public static void somarNumeros() {
        Scanner e = new Scanner(System.in);

        double a, b, soma;

        a = pedirNumero();
        b = pedirNumero();
        soma = a + b;

        System.out.println("A soma é: " + soma);

    }
    public static void somarNumerosquadrado() {
Scanner e = new Scanner(System.in);

       double a,result;
       
       a = pedirNumero();
       result = a*a;
        
        
        System.out.println("O resultado é: "+result);

    }


    }


