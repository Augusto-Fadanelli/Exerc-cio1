
public class Operations
{
    public double getValues(int op, double value1, double value2)
    {
            double result = 0;
            
                switch (op){
            case 1:
                //Adição
                result = sum(value1, value2);
            break;
            case 2:
                //Subtração
                result = sub(value1, value2);
            break;
            case 3:
                //Multiplicação
                result = mult(value1, value2);
            break;
            case 4:
                //Divisão
                result = div(value1, value2);
            break;
            default:
                System.out.println("Error: Invalid option!");
            }
            
            return result;
    }
    
    private double sum(double number1, double number2) //addition operation
    {
        double calc = number1 + number2;
        
        return calc;
    }
    
    private double sub(double number1, double number2) //subtraction operation
    {
        double calc = number1 - number2;
        
        return calc;
    }
    
    private double mult(double number1, double number2) //multiplication operation
    {
        double calc = number1 * number2;
        
        return calc;
    }
    
    private double div(double number1, double number2) //division operation
    {
        double calc = number1 / number2;
        
        return calc;
    }
}
