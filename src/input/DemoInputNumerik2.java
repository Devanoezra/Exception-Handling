package input;
import java.io.*;
public class DemoInputNumerik2 {
    public static void main(String[] args)throws IOException {
        System.out.print("Masukkan sebuah bilangan riil: ");
        
        String temp;
        double bilangan = 0;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        temp = br.readLine();
        
    try{
        bilangan = Double.parseDouble(temp);
    } catch (NumberFormatException nfe) {
        System.out.println("Data yang dimasukkan bukan bilangan riil");
        System.exit(1);
    }
    System.out.println("Bilangan yang dimasukkan "+"adalah "+bilangan);
    }
}
