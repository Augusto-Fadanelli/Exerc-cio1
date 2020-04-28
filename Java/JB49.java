// 49 - Exiba os 50 primeiros números da seqüência de Fibonacci.

public class JB49
{
    public static void main(String[] args)
    {        
        int anterior = 1;
        int atual = 1;
        int aux;
        
        System.out.print(anterior + "; ");
        
        for(int i=0; i<50; i++){
            System.out.print(atual + "; ");
            
            aux = atual;
            atual += anterior;
            anterior = aux;
        }
    }
}
