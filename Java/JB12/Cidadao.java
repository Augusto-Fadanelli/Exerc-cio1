public class Cidadao
{
    int idade;
    
    void votar(int age)
    {        
        if(age < 16){
            System.out.println("Não é permitido votar!");
        } else if(age > 17 && age <= 70){
            System.out.println("Voto Obrigatório!");
        } else {
            System.out.println("Voto Facultativo!");
        }
    }

}
