package latihan5;
class DataMhs {
    private String nim, nama;
    private double nilai;
    
    public void setNim(String vnim){
        try{
            nim = vnim;
            if (nim == null) {
                throw new NullPointerException();
            }
        }
        catch (NullPointerException npe) {
            System.out.println("Kesalahan : "+"NIM mahasiswa tidak boleh null");
        }
    }
    
    public String getNim() {
        return nim;
    }
    
    public void setNama(String vNama){
        try{
            nama = vNama;
            if (nama == null) {
                throw new NullPointerException();
            }
        }
        catch (NullPointerException npe) {
            System.out.println("Kesalahan : "+"Nama mahasiswanya tidak boleh null");
        }
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNilai(int vnilai) {
        nilai = vnilai;
    }
    
    public double getNilai() {
        return nilai;
    }
    
}

class DemoThrow {
    public static void main(String[] args){
        DataMhs obj = new DataMhs();
        obj.setNim("101533402134");
        obj.setNama("Rudi");
        obj.setNilai(80);
        
        System.out.println("NIM : " + obj.getNim());
        System.out.println("Nama : " + obj.getNama());
        System.out.println("Nilai : " + obj.getNilai());
    }
}