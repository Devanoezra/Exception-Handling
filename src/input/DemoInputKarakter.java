package input;
import java.io.*;
class DemoInputKarakter {
    public static void main(String[] args)throws IOException{
        System.out.print("Masukkan sembarang karakter: ");
        char ch;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ch = (char) br.read();
        System.out.println("Karakter yang dimasukkan adalah \'"+ch+"\'");
    }
}
