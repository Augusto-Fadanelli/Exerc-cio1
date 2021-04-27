public class Aluno
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    String nome;
    float nota1;
    float nota2;
    float nota3;
    float notaR; //Nota da AF de recuperação

    float media(float n1, float n2, float n3)
    {
        float media;
        
        if(n3 == -1){
            media = (n1 + n2)/2;
        }else{
            media = (n1 + n2 + n3)/3;
        }
        return media;
    }
}
