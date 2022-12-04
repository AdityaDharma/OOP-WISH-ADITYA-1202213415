package TPMODUL2_ADITYA;
public class MainApp {
    public static void main(String[]args){
        Perangkat prngkt = new Perangkat("Seagate", 8, 2.60f);
        prngkt.informasi();
        Laptop leptop = new Laptop("Adata", 16, 3.70f, true);
        leptop.informasi();
        leptop.opengame("dota");
        leptop.send_email("asassa@gmail.com");
        leptop.email_send("aaii@gmail.com", "uui@gmail.com");
        Handphone hp = new Handphone("Sandisk", 2, 2.56f, false);
        hp.informasi();
        hp.telfon(12020);
        hp.sendmsg(120221342);
        hp.sendsms(29038092, 48859494);
    }
}
