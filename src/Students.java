import java.util.ArrayList;
import java.util.Arrays;

public class Students {
    String name;
    String lastName;
    int group;
    int[]marks = new int[5] ;
    static double averageValue ;
    static Students student1 = new Students(); 

     

    @Override
    public String toString() {
        return "Students [averageValue=" + averageValue + ", group=" + group + ", lastName=" + lastName + ", marks="
                + Arrays.toString(marks) + ", name=" + name + ", student1=" + student1 + "]";
    }



    public static void main(String[] args){
        // double average = (marks[0] +marks[1]+marks[2]+marks[3]+marks[4])/5;
        student1.name = "Васек";
        student1.lastName = "Васьков";
        student1.group = 12 ;
        student1.marks = new int[5] ;
        ArrayList.append(student1.marks)    ;
        System.out.println(student1);   
        

    }
}
