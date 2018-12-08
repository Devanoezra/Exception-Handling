package latihan3;
public class multiplecatch {
    public static void main(String[] args) {
        try{
            int a = 3/0;
            int num = Integer.parseInt(args[0]);
            System.out.println("Perintah selanjutnya...");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Malang" + e);
        }
        catch(NullPointerException e){
            System.out.println("Malang" + e);
        }
        catch(Exception e){
            System.out.println("Malang" + e);
        }
    }
}
