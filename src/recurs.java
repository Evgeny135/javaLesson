public class recurs {
    
    public static void main(String[] args){
        int val = calcSum(2, -2);
        System.out.println(val);
    }
    //Это метод
    static int calcSum( int a, int b/*Здесь перечисляем параметры*/){
        int sum = a + b;
        if(sum ==0){
            sum = calcSum(1,1);
        }
        return sum; //Рекурсия- возможность внутри метода вызвать метод
    
    }
    
    
}
