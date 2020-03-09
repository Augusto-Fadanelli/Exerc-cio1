import java.util.Scanner;

public class Aluno
{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       Scanner scanf = new Scanner(System.in);
       int qtdalunos = 3;
       double ap1[], ap2[], af[], media[];
       String nome[];
       boolean aprovado[];
       
       ap1 = new double[qtdalunos];
       ap2 = new double[qtdalunos];
       af = new double[qtdalunos];
       media = new double[qtdalunos];
       nome = new String[qtdalunos]; 
       aprovado = new boolean[qtdalunos];
       
       for(int i=0; i<qtdalunos; i++){           
           System.out.print("\nDigite o nome do " + (i+1) + "º aluno:");
           nome[i] = sc.nextLine();
           System.out.print("Digite a nota AP1 de " + nome[i] + " :");
           ap1[i] = scanf.nextDouble();
           System.out.print("Digite a nota AP2 de " + nome[i] + " :");
           ap2[i] = scanf.nextDouble();
           System.out.print("Digite a nota AF de " + nome[i] + " :");
           af[i] = scanf.nextDouble();
           
           media[i] = ((ap1[i] + ap2[i])/2 + af[i])/2;
           if(media[i] >= 5){
               aprovado[i] = true;
           }else{
               aprovado[i] = false;
           }
        }
        
       for(int i=0; i<qtdalunos; i++){
           System.out.print("O aluno " + nome[i] + " teve media de " + media[i]);
           
           if(aprovado[i] == true){
               System.out.println(" e esta APROVADO!");
           }else{
               System.out.println("e esta REPROVADO!");
           }
       }
       
    }
}
