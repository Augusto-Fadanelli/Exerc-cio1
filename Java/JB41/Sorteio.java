public class Sorteio
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    int num;

    int sortear(int n, int r)
    {   
        int flag = 0;
        if(n > r){
            System.out.println("Chute um numero menor!");
        }else if(n < r){
            System.out.println("Chute um numero maior!");   
        }else{
            System.out.println("Acertou!"); 
            flag = 1;
        }
        
        return flag;
    }
}
