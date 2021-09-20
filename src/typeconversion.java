public class typeconversion {
    static int a = 2;
    static double b = 4.9;
    static char c1 = 'd';

    static Integer in = 2;
    static Float fl = 2.6f;
    static Short s = 3;
    static Double f = 7.8;
    static String st = "27";
    public static void main(String[] args){
        int c = (int) b;

        double b1 = a;

        System.out.println(c);

        int v = c1 ;

        System.out.println(v); 
        // Все выше приведенные типы относятся к значимым типам
        // Ниже приведение ссылочных типов данных

        Number n = fl;
        Number n1 = new Double(2.6f);

        Integer f1 = n.intValue();
        Integer r2 = n1.intValue();
        System.out.println();
        System.out.println(f1); 

        Number n3 =f;
        int ns = n3.intValue();
    }
}
