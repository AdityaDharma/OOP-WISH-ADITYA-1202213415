package TPMODUL2_ADITYA;
public class Laptop extends Perangkat {
    public boolean webcam;
    public Laptop(String drive, int ram, float processor,boolean webcam){
        super(drive,ram,processor);
        this.webcam = webcam;
        if (webcam == true){
            System.out.print("juga");
        }
        else{
            System.out.print("TIDAKKK");
        }
    }
    @Override
    public void informasi(){
        System.out.println("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" dan processor secepat "+processor+" Ghz. Selain itu laptop ini "+webcam+" memiliki Webcam");
    }
    public void opengame(String game_name){
        System.out.println("Laptop berhasil membuka game "+game_name);
    }
    public void send_email(String email){
        System.out.println("Laptop berhasil mengirim email ke "+email);
    }
    public void email_send(String email1,String email2){
        System.out.println("Laptop berhasil mengirim email ke "+email1+" dan ke "+email2);
    }

    
}
