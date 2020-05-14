
public class Menu
{
    private int count = 0;
    
    public void displayMenu()
    {
        
        System.out.println("=========================\n ***Simple Calculator***\n=========================");
        System.out.printf("[1] - Adição\n[2] - Subtração\n[3] - Multiplicação\n[4] - Divisão\n");
    }
    
    public void displayValues(boolean flag)
    {
        count++;
        System.out.printf("Insira o %d valor: ", count);
        if(flag == true){
            count = 0;
        }
    }
    
    public void displayResult(double result)
    {
        System.out.println(result);
    }
    
    public void displayQuit()
    {
        System.out.printf("Continuar?...\n s/n\n");
    }
}
