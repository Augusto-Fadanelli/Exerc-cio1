import java.util.Scanner;

public class Clinica
{       
    String name;
    String cnpj;
    static Paciente[] paciente = new Paciente[20];
    
    private static boolean setValues(final int i){ //i - contador
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        
        paciente[i] = new Paciente();
        System.out.println("Digite o nome do paciente ('fim' - para sair):");
        paciente[i].setName(inputString.nextLine());
        
        boolean flag = false; //flag que indica o fim do vetor
        boolean flagSex;
        if(!paciente[i].getName().equalsIgnoreCase("fim")){
            
            do{
                flagSex = false;
                System.out.print("Insira [M/F] para o sexo do paciente: ");
                paciente[i].setSex(inputString.next().charAt(0));
                
                if(paciente[i].getSex() != 'M' && paciente[i].getSex() != 'm' && paciente[i].getSex() != 'F' && paciente[i].getSex() != 'f'){
                    System.out.println("Sexo inválido!");
                    flagSex = true;
                }
            }while(flagSex);
            
            System.out.print("Insira o peso (Kg) do paciente: ");
            paciente[i].setWeight(input.nextDouble());
            
            System.out.print("Insira a idade do paciente: ");
            paciente[i].setAge(input.nextInt());
            
            System.out.print("Insira a altura (cm) do paciente: ");
            paciente[i].setHeight(input.nextInt());
            flag = true;
        }
        
        return flag;
    }
    
    public static void main(String[] args)
    {        
        int i = 0; //Serve para identificar o paciente no vetor e para contar o total de pacientes
        boolean flag = true;
        double averageAgeM = 0; //Média de idade entre pacientes homens
        int numberM = 0; //Quantidade de pacientes homens
        int numberFHW = 0; //Quantidade de mulheres com altura entre 160cm e 170cm e peso acima de 70Kg
        int numberAge18_25 = 0; //Quantidade de pessoas com idade >=18 e <=25
        int posOlder = 0; //Posição do vetor do paciente mais velho
        //boolean flagOlder = true; //indica se alguem foi cadastrado (Usado para impedir que apareça a palavra fim se ninguem for cadastrado)
        int posShorterW = 0; //Posição do vetor da mulher mais baixa
        boolean flagShorterW = true; //indica se alguma mulher foi cadastrada (Usado para impedir que o primero nome seja usado caso não haja nenhuma mulher cadastrada)
        
        do{
            if(setValues(i)){ //se retornar verdadeiro então ainda não foi escrito "fim" no nome
            
                if(paciente[i].getSex() == 'M' || paciente[i].getSex() == 'm'){
                    averageAgeM += paciente[i].getAge();
                    numberM++;
                }else{ //F
                    if(paciente[i].getHeight() >= 160 && paciente[i].getHeight() <= 170 && paciente[i].getWeight() > 70){
                        numberFHW++;
                    }
                    if(paciente[i].getHeight() < paciente[posShorterW].getHeight()){
                        posShorterW = i;
                        flagShorterW = false;
                    }
                }
                
                if(paciente[i].getAge() >= 18 && paciente[i].getAge() <= 25){
                    numberAge18_25++;
                }
                
                if(paciente[i].getAge() > paciente[posOlder].getAge()){
                    posOlder = i;   
                }
            
            i++;
            }else{
               flag = false;
            }
        }while(flag);
        
        if(numberM == 0){ //impede divisão por 0 se não houver nenhum homem
            averageAgeM = 0;
        }else{
            averageAgeM /= numberM;   
        }
        
        System.out.printf("Há %d paciente(s).\n", i);
        System.out.printf("Média de idade entre os pacientes homens: %f\n", averageAgeM);
        System.out.printf("Quantidade de mulheres com altura entre 160cm e 170cm e peso acima de 70Kg: %d\n", numberFHW);
        System.out.printf("Quantidade de pessoas com idade entre 18 e 25: %d\n", numberAge18_25);
        if(!paciente[0].getName().equalsIgnoreCase("fim")){
            System.out.printf("Nome do paciente mais velho: %s\n", paciente[posOlder].getName());
        }
        if(flagShorterW == false){
            System.out.printf("Nome da mulher mais baixa: %s\n", paciente[posShorterW].getName());
        }
        
        //Testa se os valores inseridos no vetor estão corretos
        /*for(int j=0; j<i; j++){
            System.out.println(paciente[j].getName());
            System.out.println(paciente[j].getSex());
            System.out.println(paciente[j].getWeight());
            System.out.println(paciente[j].getAge());
            System.out.println(paciente[j].getHeight());
        }*/
    }
    
}

