import java.util.Scanner;

public class calculadora {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int num1, num2;

    System.out.println("digite um numero: ");
    num1 = input.nextInt();
    System.out.println("Digite outro numero: ");
    num2 = input.nextInt();

    System.out.println("Soma: " + (num1 + num2));
    System.out.println("Subtração: " +  (num1 - num2));
    System.out.println("Multiplicação: " + (num1 * num2));
    System.out.println("Divisão: " + (num1 / num2));
    System.out.println("Resto: " + (num1 % num2));
    }    
}
/* 
Calculadora simples 
Feito por: MiguelADB */