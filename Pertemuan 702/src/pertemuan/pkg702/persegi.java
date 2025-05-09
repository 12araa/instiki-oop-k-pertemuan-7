package pertemuan.pkg702;

/**
 *
 * @author Radhika Prema Nanda
 * Tanggal : 9 Mei 2025
 * 
 */
public class persegi extends BangunRuang{
    private int panjang, lebar;
    
   public void setPanjang(int pj){
       this.panjang = pj;
   }
   public void setLebar(int lb){
       this.lebar = lb;
   }
    @Override
   void hitungLuas(){
       this.luas = this.panjang*this.lebar;
       
       System.out.printf("Hitung luas persegi panjang\n");
       System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
       System.out.printf("Luas = panjang x lebar\n");
       System.out.printf("     = %d x %d\n", this.panjang, this.lebar);
       System.out.printf("     = %.2f \n",this.luas);
   }
}
