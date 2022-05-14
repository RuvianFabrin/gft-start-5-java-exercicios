package one.digitalinnovation.basecamp;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws IOException, InterruptedException {
        System.out.println("Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(3d, 4d);
        Quadrilatero.area(3, 4, 5);
        Quadrilatero.area(3f, 4f);


        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);
        while(continuar){
            System.out.println("\nEscolha uma opção: ");
            System.out.println("0 : Sair \n");
            System.out.println("## Exercício calculadora ##");            
            System.out.println("1 : somar ");
            System.out.println("2 : subtrair ");
            System.out.println("3 : multiplicar ");
            System.out.println("4 : dividir ");
            System.out.println("\n## Exercício Mensagem ##");
            System.out.println("5 : saudação ");
            System.out.println("\n## Exercício Empréstimo ##");
            System.out.println("6 : empréstimo ");
            
            

            int opcao = scanner.nextInt();
            if(opcao>0 && opcao<7){
                double numero1 = 0;
                double numero2 = 0;
                int horario = 0;
                double valor = 0;
                int parcelas = 0;
                if(opcao<5){
                    System.out.println("Digite o primeiro número: ");
                    numero1 = scanner.nextDouble();

                    System.out.println("Digite o segundo número: ");
                    numero2 = scanner.nextDouble();
                }else if(opcao==5){
                    System.out.println("Digite o horário: ");
                    horario = scanner.nextInt();
                }else if(opcao==6){
                    System.out.println("Digite o valor a parcelar: ");
                    valor = scanner.nextDouble();
                    System.out.println("Só permitimos 2 ou 3 parcelas.");
                    System.out.println("Digite a quantidade de parcelas: ");
                    parcelas = scanner.nextInt();
                }
                

                

                switch (opcao) {
                    case 1:
                        Calculadora.soma(numero1, numero2);
                        break;
                    case 2:
                        Calculadora.subtracao(numero1, numero2);
                        break;
                    case 3:
                        Calculadora.multiplicacao(numero1, numero2);
                        break;
                    case 4:
                        Calculadora.divisao(numero1, numero2);
                        break; 
                    case 5:
                        Mensagem.avaliacaoDoHorario(horario);
                        break;                  
                    case 6:
                        Emprestimo.calcular(valor, parcelas);
                        break;                  
                    default:
                        continuar = false;
                        break;
                }
            }else{
                //Limpa a tela no windows, no linux e no MacOS
                if (System.getProperty("os.name").contains("Windows")){
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                }else{                    
                    Runtime.getRuntime().exec("clear");
                }
                System.out.println("Saiu da Aplicação.");
                continuar = false;
            }
        }   
        scanner.close();

    }
    
}
