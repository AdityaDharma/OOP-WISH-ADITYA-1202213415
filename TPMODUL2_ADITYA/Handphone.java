package TPMODUL2_ADITYA;
public class Handphone extends Perangkat{
    public boolean fingerprint;
    public Handphone(String drive,int ram, float processor,boolean fingerprint){
        super(drive,ram,processor);
        this.fingerprint = fingerprint;
        if (fingerprint == true){
            System.out.print("juga");
        }
        else{
            System.out.print("TIDAKKK");
        }
    }
    @Override
    public void informasi(){
        System.out.println("Handphone ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" dan processor secepat "+processor+" Ghz. Selain itu laptop ini "+fingerprint+" memiliki Webcam ");
    }
    public void telfon(int nohp){
        System.out.println("Handphone berhasil menyambungkan ke no "+nohp);
    }
    public void sendmsg(int nohp){
        System.out.println("Handphone berhasil mengirim SMS ke no "+nohp);
    }
    public void sendsms(int nohp1, int nohp2){
        System.out.println("Handphone berhasil mengirim SMS ke no "+nohp1+" dan no "+nohp2);
    }
    
}
