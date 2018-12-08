package input;
import java.io.*;

class DemoInputString {
    public static void main(String[] args)throws IOException{
        System.out.print("Masukkan nama anda: ");
        String nama;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        nama = br.readLine();
        System.out.println("Halo "+nama+", sudahkah Anda mengerti Java?");
    }
}
