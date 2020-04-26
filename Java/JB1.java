/*
Determine qual é a idade que o usuário faz no ano atual.
Para isso solicite o ano de nascimento do usuário e o ano atual.
*/
import java.util.Scanner;
public class Exercicio01 {
public static void main(String[] args) {
int anoAtual, anoNascimento, qtdeAnos;
System.out.println("Entre com o ano atual:");
anoAtual = new Scanner(System.in).nextInt();
System.out.println("Entre com o ano de nascimento:");
anoNascimento = new Scanner(System.in).nextInt();
qtdeAnos = anoAtual - anoNascimento;
System.out.println("Em "+anoAtual+" você faz (ou já fez) "+qtdeAnos+"
anos!");
}
}
