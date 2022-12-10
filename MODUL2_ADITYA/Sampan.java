package MODUL2_ADITYA;
public class Sampan extends TransportasiAir{
    protected int layar;
    public Sampan(int jumlahKursi,int biaya,int layar){
        super(jumlahKursi,biaya);
        this.layar = layar;
    }
    @Override
    public void informasi(){
        System.out.println("Transportasi Air dengan jenis Sampan dengan kursi berjumlah"+jumlahKursi+"ditetapkan dengan biaya sebesar Rp. "+biaya);
    }
    @Override
    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis Sampan sedang berlayar menggunakan 2 layar");
    }
    @Override
    public void berlabuh(){
        System.out.println("Transportasi Air dengan jenis Sampan berlabuh di pantai tanpa jangkar");
    }
    public void berLabuh(int jangkar){
        System.out.println("Transportasi Air dengan jenis Sampan berlabuh di pantai menggunakan"+jangkar+"jangkar");
    }
}
