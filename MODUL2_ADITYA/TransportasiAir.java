package MODUL2_ADITYA;
public class TransportasiAir {
   protected int jumlahKursi; int biaya; 
   public TransportasiAir(int jumlahKursi,int biaya){
    this.jumlahKursi = jumlahKursi;
    this.biaya = biaya;
   }
   public void informasi(){
    System.out.println("Transportasi Air dengan jenis tidak diketahui dengan kursi berjumlah"+jumlahKursi+"ditetapkan dengan biaya sebesar Rp. "+biaya);
   }
   public void berlayar(){
    System.out.println("Transportasi Air dengan jenis tidak diketahui sedang berlayar");
   }
   public void berlabuh(){
    System.out.println("Transportasi Air dengan jenis tidak diketahui berlabuh di pantai");
   }
}