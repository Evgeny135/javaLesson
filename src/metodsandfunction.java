public class metodsandfunction {
    public static void main(String[] args){
        int val = calcSum(2 ,3);
        System.out.println(val);
    }
//Это метод
    static int calcSum( int a, int b/*Здесь перечисляем параметры*/){
        int sum = a + b;
        
        return sum;

    }
}
