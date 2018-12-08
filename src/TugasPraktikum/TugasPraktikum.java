package TugasPraktikum;
import java.io.*;
public class TugasPraktikum {
    public static void main(String[] args) throws Praktikum, IOException{
        try{
            System.out.println("Nomor presensi = ");
            String nomor;
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            nomor = br.readLine();
            System.out.println("Nama = ");
            String nama;
            nama = br.readLine();
            System.out.println("Nilai = ");
            String temp;
            int bilangan = 0;
            temp = br.readLine();
        }
        
        catch(NumberFormatException nfe){
            System.out.println("Data yang dimasukkan bukan bilangan bulat");
            System.exit(1);
        }
        catch(IllegalArgumentException e){
        }
        catch(Exception e){
        }
        
        System.out.println("DATA NILAI SISWA");
        System.out.println("Nomor = " + nomor);
    }
}
