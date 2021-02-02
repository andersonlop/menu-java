import java.util.Scanner;

public class Menu2 {

    public static void main(String[] args) {
        menu();
        System.out.println("Programa encerrado.");
        
        private static void menu(){
            int opcao = 0;
        do {

            System.out.println("|   MENU                    |");
            System.out.println("| Opções                    |");
            System.out.println("|         1. Opção 1        |");
            System.out.println("|         2. Opção 2        |");
            System.out.println("|         3. Sair           |");

            opcao = Console.readInt("Opção -> ");         
            System.out.print("\n");    
            switch (opcao) {    
                case 1:
                    System.out.println("Opção 1 selecionada");
                    break;
                case 2:
                  System.out.println("Opção 2 selecionada");
                  break;
                  
                case 3:
                    System.out.println("O programa foi encerrado.");
                    break;
                default:
                System.out.println("Seleção inválida");
                break;                
            }
            while(opcao !=0);            
        }     
        }
    }    
}
