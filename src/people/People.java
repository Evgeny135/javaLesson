package people;

public class People  {


    private int age;
    private String name;
    String lastName;

    

    

    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }



    public String getName() {
        return name;
    }

    
    
    public void setName(String name) {
        this.name = name;
    }
    



    @Override
    public String toString() {
        return "People [age=" + age + ", cat=" + cat + ", lastName=" + lastName + ", name=" + name + "]";
    }

        
}
