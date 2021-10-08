public class Cat {
    
    int age; // private это пример инкапсуляции щапрещает доступ
    String poroda;
    String name;
    
    
    
    

    public Cat(int age, String poroda, String name) extends People{
        this.age = age;
        this.poroda = poroda;
        this.name = name;
    }

    void say(){
        System.out.println("Мяу");
        
    }
    
    @Override
    public String toString() {
        return "Cat [age=" + age + ", name=" + name + ", poroda=" + poroda + "]";
    }
    
    
    
    
    

    
}
