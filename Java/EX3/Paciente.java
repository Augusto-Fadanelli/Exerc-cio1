import java.util.Scanner;

public class Paciente
{
    // variáveis de instância
    private String name;
    private char sex;
    private double weight;
    private int age;
    private int height;

    public String getName() {
    return name;
    }

    public char getSex() {
    return sex;
    }
    
    public double getWeight() {
    return weight;
    }
    
    public int getAge() {
    return age;
    }
    
    public int getHeight() {
    return height;
    }
    
    
    public void setName(String n) {
    this.name = n;
    }
    
    public void setSex(char s) {
    this.sex = s;
    }
    
    public void setWeight(double h) {
    this.weight = h;
    }
    
    public void setAge(int a) {
    this.age = a;
    }
    
    public void setHeight(int h) {
    this.height = h;
    }
    
    }
