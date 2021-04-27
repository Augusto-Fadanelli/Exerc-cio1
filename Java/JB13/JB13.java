/* Solicite o nome e as três notas de uma disciplina que o usuário cursa. Em 
 * seguida informe se ele foi aprovado, ficou de recuperação ou foi reprovado. 
 * A média de aprovação é >= 7.0; a média de recuperação é >= 5.0 e < 7.0; e a
 * média do reprovado é < 5.0 */

/* Acrescente no problema anterior possibilidade dele fazer prova final em caso
 * de recuperação. Neste caso a nota de aprovação passa a ser >= 5.0 e a média
 * deve ser recalculada como sendo (média_anterior + nota de recuperação)/2 */

import java.util.Scanner;

public class JB13
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Aluno a1 = new Aluno();
        
        System.out.print("Insira o nome do aluno: ");
        a1.nome = input.nextLine();
        System.out.print("Insira a primeira nota: ");
        a1.nota1 = input.nextFloat();
        verificar(a1.nota1);
        System.out.print("Insira a segunda nota: ");
        a1.nota2 = input.nextFloat();
        verificar(a1.nota2);
        System.out.print("Insira a terceira nota: ");
        a1.nota3 = input.nextFloat();
        verificar(a1.nota3);
        
        float m;
        m = a1.media(a1.nota1, a1.nota2, a1.nota3);
        
        if(m >= 5){
            if(m >= 7){
                System.out.println("Aprovado!");   
            }else{
                System.out.println("Está de recuperação!");
                System.out.print("Insira a nota da AF de recuperação: ");
                a1.notaR = input.nextFloat();
                
                m = a1.media(m, a1.notaR, -1); //-1 indica q a media vai ser (n1+n2)/2
                
                if(m >= 5){
                    System.out.println("Aprovado!");
                }else{
                    System.out.println("Reprovado!");   
                }
            }
        }else{
            System.out.println("Reprovado!");  
        }
    }
    
    static void verificar(float n){
        if(n > 10 || n < 0){
            System.out.println("Nota Inválida!"); 
            System.exit(0);
        }
    }
}
