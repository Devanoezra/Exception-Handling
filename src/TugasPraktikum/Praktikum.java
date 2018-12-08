package TugasPraktikum;
public class Praktikum extends Exception 
{
    private int bilangan;
    Praktikum(){}
    Praktikum(String pesan)
    {
        super(pesan);
    }
    Praktikum(String pesan, int nilai)
    {
        super (pesan);
        bilangan = nilai;
    }
    public int getBilangan()
    {
        return bilangan;
    }
}
