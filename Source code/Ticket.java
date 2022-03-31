/**
 * Ticket
 */
public class Ticket {

    String maskapai,asal,tujuan;
    int harga;

    Ticket(String m, int h, String a, String t){
        maskapai = m;
        asal = a;
        harga = h;
        tujuan = t;
    }

    void tampil(){
        System.out.println("Maskapai penerbangan = "+maskapai);
        System.out.println("Asal penerbangan = "+asal);
        System.out.println("Tujuan penerbangan = "+tujuan);
        System.out.println("harga ticket = "+harga);
    }
}