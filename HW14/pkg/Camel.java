package pkg;

public class Camel implements Pet{
    String name;
    int age;
    boolean trained;
    
    
    public Camel(){
        name = "freddy";
        age = 3;
        trained = false;
        this.interact();
    }
    
    public Camel(int age){
        this.age = age;
        this.interact();
    }
    
    public Camel(boolean trained){
        this.trained = trained;
        this.interact();
    }
    public Camel(String name){
        this.name = name;
        this.interact();
    }
    public Camel(String name, boolean trained){
        this.name = name;
        this.trained = trained;
        this.interact();
    }
    
    public Camel(String name, int age, boolean trained){
        this.name = name;
        this.age = age;
        this.trained = trained;
        this.interact();
    }
    
    
    
    
    
    public void setName(String name){
        this.name = name;
        
    }
    
    public void setAge(int age){
        this.age = age;
    }
    public void setIsTrained(boolean trained){
        this.trained = trained;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean getIsTrained(){
        return trained;
    }
    public void interact(){
        System.out.println(this.getName()+"meOOOW");
    }
    public void trick(){
        if(this.trained == true){
            System.out.println("jump");
        }
    }
    
}