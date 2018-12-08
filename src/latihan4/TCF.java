package latihan4;
public class TCF {
    public TCF(){
    }
    public static void main (String args[]){
        int nol = 0;
        int angka = 10;
    try{
        int hasil = angka/nol;
        System.out.println("Hasil = "+hasil);
    }
    catch(ArithmeticException e){
        System.out.println("Terjadi pembagian dengan nol.Exception ditangkap.");
    }
    finally{
        System.out.println("Kalimat di blok finally");
    }
        System.out.println("Kalimat di luar blok try-catch-finally");
    }
}
