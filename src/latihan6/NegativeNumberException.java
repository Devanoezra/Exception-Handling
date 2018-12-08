package latihan6;
class NegativeNumberException extends Exception{
    private int bilangan;
    // default constructor
    NegativeNumberException() {
    }
    //constructor dengan parameter bertipe string
    NegativeNumberException(String pesan) {
        super(pesan);
    }
    // constructor dengan parameter bertipe string dan int
    NegativeNumberException(String pesan, int nilai) {
        super(pesan);
        bilangan = nilai;
    }
    public int getBilangan() {
        return bilangan;
    }
}

class DemoMembuatEksepsi3 {
    public static int hitungFaktorial(int n)
            throws NegativeNumberException{
        if (n < 0) {
            throw new NegativeNumberException("Bilangan tidak boleh negatif", n);
        }
        int hasil = 1;
        for (int i = n; i >= 1; i++) {
            hasil *= i;
        }
        return hasil;
    }
    
    public static void main(String[] args){
        System.out.println("Pada saat menghitung 5!");
        try {
            System.out.println("Hasil = "+ hitungFaktorial(5));
        } catch (NegativeNumberException nne) {
            System.out.println("Bilangan : "+nne.getBilangan());
        }
        System.out.println("\nPada saat menghitung -5!");
        try {
            System.out.println("Hasil = "+ hitungFaktorial(-5));
        } catch (NegativeNumberException nne) {
            System.out.println("Bilangan : "+nne.getBilangan());
            nne.printStackTrace();
        }
    }
}
