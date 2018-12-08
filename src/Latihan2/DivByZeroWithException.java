package Latihan2;
public class DivByZeroWithException {
    public static void main(String args[]){
        try{
            System.out.println(5/0);
            System.out.println("Keluaran program");
        }
        catch(ArithmeticException exc){
            // Dibagi dengan -> ArithmeticException
            System.out.println("Exception yang ditangkap : " + exc);
        }
        System.out.println("Setelah exception..");
    }
}
