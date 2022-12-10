package MODUL2_ADITYA;
public class MainApp {
    public static void main(String[]args)throws Exception{
        TransportasiAir trp = new TransportasiAir(4, 20000);
        trp.informasi();
        trp.berlayar();
        trp.berlabuh();
        System.out.println();
        Sampan smp = new Sampan(20, 50000, 2);
        smp.informasi();
        smp.berlayar();
        smp.berlabuh();
        smp.berLabuh(2);
        System.out.println();
        Kapal kpl = new Kapal(50, 100000, "Diesel");
        kpl.informasi();
        kpl.berlayar();
        kpl.berLayar(20);
        kpl.berlabuh();
    }
}
