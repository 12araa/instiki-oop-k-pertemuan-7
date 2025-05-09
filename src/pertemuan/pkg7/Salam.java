package pertemuan.pkg7;

/**
 *
 *  @author Radhika Prema Nanda
 *  Tanggal : 9 Mei 2025
 * 
 */
public class Salam {
    private String tx="Tuliskan pesan anda";
    
    public void tulisPesan(){
        System.out.println(this.tx);
    }
    
    public void tulisPesan(String txt1){
        System.out.println(txt1);
    }
    public void tulisPesan(String nama, String nim){
        System.out.println("Nama saya "+nama+" dengan nim "+nim);
    }
}
