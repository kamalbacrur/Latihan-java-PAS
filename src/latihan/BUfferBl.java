package latihan;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BUfferBl {
    public static void main(String[] args) throws IOException {
        
        String ringan,elektronik,gadget,nm_ksr, nm_pmbl;
        int bayar,pilih,pilih1 = 0, belanjaan = 0,jml_brg = 0,jmlh = 0;
        int gery= 25000, clts= 28000, tango= 30000, nissin= 45000, nabati=31000;
        int Led= 2000000,lcd=3000000,kipas=250000,kulkas=2500000,dispenser=300000;
        int hp=1500000, lptp=4500000,kmptr= 1500000,kmra= 5000000;
        int disc1 = 0,disc;
        int jmlh_pulsa;
        
        
        InputStreamReader scan = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader(scan);
        System.out.println("=======================================");
        System.out.println("      SELAMAT DATANG DI BUKALAVALAK");
        System.out.println("=======================================");
        System.out.print("Masukan nama kasir    : ");
        nm_ksr = br.readLine();
        System.out.print("Masukan nama konsumen : ");
        nm_pmbl = br.readLine();
        System.out.println("=======================================");
        System.out.println("         SILAHKAN PILIH KATEGORI");
        System.out.println("=======================================");
        System.out.println("1. Makanan Ringan");
        System.out.println("2. Elektronik");
        System.out.println("3. Gadget");
        System.out.println("4. Pulsa");
        System.out.print("Pilih No 1 - 4: ");
        pilih = Integer.parseInt(br.readLine());
        
        switch (pilih) {
            case 1: 
                System.out.println("1.Wafer Gery");
                System.out.println("2.Wafer Chocolatos");
                System.out.println("3.Wafer Tango");
                System.out.println("4.Wafer Nissin");
                System.out.println("5.Wafer Nabati");
                System.out.print("Pilih no 1-5: ");
                pilih1= Integer.parseInt(br.readLine());
                switch (pilih1){
                    case 1 : 
                        System.out.println("Anda memilih wafer gery : Rp.25000");
                        System.out.print("Beli berapa barang: ");
                        int jmlh_brg = Integer.parseInt(br.readLine());
                        jmlh = jmlh_brg * gery;
                        if (jmlh>= 50000) {
                            disc= (int) (jmlh*0.5);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                    case 2 : 
                        System.out.println("Anda memilih wafer gery : Rp.25000");
                        System.out.print("Beli berapa barang: ");
                        jmlh_brg = Integer.parseInt(br.readLine());
                        jmlh = jmlh_brg * clts;
                        if (jmlh>= 50000) {
                            disc= (int) (jmlh*0.5);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                    case 3 : 
                        System.out.println("Anda memilih wafer gery : Rp.25000");
                        System.out.print("Beli berapa barang: ");
                        jmlh_brg = Integer.parseInt(br.readLine());
                        jmlh = jmlh_brg * tango;
                        if (jmlh>= 50000) {
                            disc= (int) (jmlh*0.5);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                    case 4 : 
                        System.out.println("Anda memilih wafer gery : Rp.25000");
                        System.out.print("Beli berapa barang: ");
                        jmlh_brg = Integer.parseInt(br.readLine());
                        if (jmlh>= 50000) {
                            disc= (int) (jmlh*0.5);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                    case 5 : 
                        System.out.println("Anda memilih wafer gery : Rp.25000");
                        System.out.print("Beli berapa barang: ");
                        jmlh_brg = Integer.parseInt(br.readLine());
                        jmlh = jmlh_brg * nabati;
                        if (jmlh>= 50000) {
                            disc= (int) (jmlh*0.5);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                    default : 
                        System.out.print("error");
                }
                break;
            case 2: 
                System.out.println("1.Tv LED");
                System.out.println("2.Tv LCD");
                System.out.println("3.Kipas Angin");
                System.out.println("4.Kulkas");
                System.out.println("5.Dispenser");
                System.out.print("Pilih no 1-5: ");
                pilih1= Integer.parseInt(br.readLine());
                switch (pilih1){
                    case 1 : 
                        System.out.println("Anda memilih TV LED : Rp.2000000");
                        System.out.print("Beli berapa barang: ");
                        int jmlh_brg = Integer.parseInt(br.readLine());
                        jmlh = jmlh_brg * Led;
                        if (jmlh>= 300000) {
                            disc= (int) (jmlh*0.1);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                    case 2 : 
                        System.out.println("Anda memilih TV LCD : Rp.3000000");
                        System.out.print("Beli berapa barang: ");
                        jmlh_brg = Integer.parseInt(br.readLine());
                        jmlh = jmlh_brg * lcd;
                        if (jmlh>= 300000) {
                            disc= (int) (jmlh*0.1);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                    case 3 : 
                        System.out.println("Anda memilih kipas : Rp.250000");
                        System.out.print("Beli berapa barang: ");
                        jmlh_brg = Integer.parseInt(br.readLine());
                        jmlh = jmlh_brg * kipas;
                        if (jmlh>= 300000) {
                            disc= (int) (jmlh*0.1);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                    case 4 : 
                        System.out.println("Anda memilih kulkas : Rp.2500000");
                        System.out.print("Beli berapa barang: ");
                        jmlh_brg = Integer.parseInt(br.readLine());
                        jmlh = jmlh_brg* kulkas;
                        if (jmlh>= 300000) {
                            disc= (int) (jmlh*0.1);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                    case 5 : 
                        System.out.println("Anda memilih dispenser : Rp.300000");
                        System.out.print("Beli berapa barang: ");
                        jmlh_brg = Integer.parseInt(br.readLine());
                        jmlh = jmlh_brg * dispenser;
                        if (jmlh>= 300000) {
                            disc= (int) (jmlh*0.1);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                    default : 
                        System.out.print("error");
                }
                break;
            case 3: 
                System.out.println("1.HP");
                System.out.println("2.Laptop");
                System.out.println("3.Komputer");
                System.out.println("4.Kamera");
                System.out.print("Pilih no 1-4: ");
                pilih1= Integer.parseInt(br.readLine());
                                switch (pilih1){
                    case 1 : 
                        System.out.println("Anda memilih HP : Rp.2000000");
                        System.out.print("Beli berapa barang: ");
                        int jmlh_brg = Integer.parseInt(br.readLine());
                        jmlh = jmlh_brg * Led;
                        if (jmlh>= 500000) {
                            disc= (int) (jmlh*0.15);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                    case 2 : 
                        System.out.println("Anda memilih lAPTOP : Rp.3000000");
                        System.out.print("Beli berapa barang: ");
                        jmlh_brg = Integer.parseInt(br.readLine());
                        jmlh = jmlh_brg * lcd;
                        if (jmlh>= 500000) {
                            disc= (int) (jmlh*0.15);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                    case 3 : 
                        System.out.println("Anda memilih kKOMPUTER : Rp.250000");
                        System.out.print("Beli berapa barang: ");
                        jmlh_brg = Integer.parseInt(br.readLine());
                        jmlh = jmlh_brg * kipas;
                        if (jmlh>= 500000) {
                            disc= (int) (jmlh*0.15);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                    case 4 : 
                        System.out.println("Anda memilih KAMERA : Rp.5000000");
                        System.out.print("Beli berapa barang: ");
                        jmlh_brg = Integer.parseInt(br.readLine());
                        jmlh = jmlh_brg* kulkas;
                        if (jmlh>= 500000) {
                            disc= (int) (jmlh*0.15);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                    default : 
                        System.out.print("error");
                }
                break;
            case 4: 
                System.out.print("Anda Membeli pulsa sebesar : Rp.");
                jmlh_pulsa = Integer.parseInt(br.readLine());
                if(jmlh_pulsa >= 100000){
                    disc = (int) (jmlh_pulsa*0.05);
                    disc1 = jmlh_pulsa-disc;
                }
                else{
                    disc= (belanjaan*0);
                }
                break;
            default: 
                System.out.println("Error");
                break;
        }
        
        System.out.println("============================================");
        System.out.println("                    HASIL");
        System.out.println("============================================");
        System.out.println("Nama Kasir       : " + nm_ksr);
        System.out.println("Nama Pembeli     : " + nm_pmbl);
        System.out.println("Potongan Harga   : " + disc1);
        System.out.println("Harga Asli       : " + jmlh);
        System.out.println("Setelah DISKON   : " + disc1);
        
        
    }
    
}
