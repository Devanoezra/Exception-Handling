package latihan5;
class DemoThrows2 {
    public static void uji(int angka) throws NullPointerException,ArithmeticException{
        if (angka < 0) {
            throw new NullPointerException("Kesalahan: Null Pointer Exception");
        } else {
            throw new ArithmeticException("Kesalahan: Arithmetic Exception"); 
        }
    }
    
    public static void main(String[] args) {
        try{
            uji(0);
        }
        catch (ArithmeticException | NullPointerException e) {
            System.out.println("Exception ditangkap di sini...");
            System.out.println(e.getMessage());
        }
        System.out.println("Statemen setelah blok try-catch");
    }
}
    
