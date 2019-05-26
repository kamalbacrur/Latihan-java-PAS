package latihan;
import java.util.Scanner;
public class KfbScan {

    public static void main(String[] args) {
        int pilihan,pilihan1,jml_brg,jumlah = 0;
        String kasir,pembeli,kartu;
        int bakar = 15000,goreng = 12000,rica=15000,geprek = 17000;
        int bbk_grg = 15000,bbk_ijo = 17000, bbk_mdr= 14000,bbk_ekr = 23000;
        int diskon = 0;
        int bayar;
        
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nama Kasir      : ");
        kasir = keyboard.nextLine();
        System.out.print("Nama konsumen   : ");
        pembeli = keyboard.nextLine();
        System.out.print("Apakah Punya Kartu member?(Y/N):");
        kartu = keyboard.nextLine();
        System.out.println("===========================================");
        System.out.println("             PILIH MENU MAKANAN ");
        System.out.println("===========================================");
        System.out.println("1. AYAM");
        System.out.println("2. BEBEK");
        System.out.println("3. MINUMAN");
        System.out.print("Pilih menu 1-3 (ketik): ");
        pilihan = keyboard.nextInt();
        
        
            switch(pilihan){
                case 1 :
                    System.out.println("1.Ayam bakar");
                    System.out.println("2.Ayam goreng");
                    System.out.println("3.Ayam rica rica");
                    System.out.println("4.Ayam geprek");
                    System.out.print("Pilih Menu 1-4: ");
                    pilihan1 = keyboard .nextInt();
                    switch (pilihan1) {
                        case 1:
                            System.out.println("Ayam Bakar        : Rp.15.000");
                            System.out.print("Jumlah pesanan      : ");
                            jml_brg = keyboard.nextInt();
                            jumlah = jml_brg*bakar;
                            if (kartu.equalsIgnoreCase("Y")){
                            if (jumlah > 0) {
                             diskon = 5000;
                             } else {
                           diskon = 0;
                             }                  
                            }
                            else{
                            if (jumlah > 200000) {
                              diskon = 25000;
                            } else{
                           diskon = 0;
                             } 
                            }
                        break;    
                        case 2: 
                            System.out.println("Ayam goreng       : Rp.12.000");
                            System.out.print("Jumlah pesanan      : ");
                            jml_brg = keyboard.nextInt();
                            jumlah = jml_brg*bakar;
                            if (kartu.equalsIgnoreCase("Y")){  
                            if (jumlah > 0) {
                             diskon = 5000;
                             } else {
                           diskon = 0;
                             }                  
                            }else{
                            if (jumlah > 200000) {
                              diskon = 25000;
                            } else{
                           diskon = 0;
                             } 
                            }
                        break;
                        case 3: 
                            System.out.println("Ayam rica-rica    : Rp.15.000");
                            System.out.print("Jumlah pesanan      : ");
                            jml_brg = keyboard.nextInt();
                            jumlah = jml_brg*bakar;
                            if (kartu.equalsIgnoreCase("Y")){ 
                            if (jumlah > 0) {
                             diskon = 5000;
                             } else {
                           diskon = 0;
                             }                  
                            }else{
                            if (jumlah > 200000) {
                              diskon = 25000;
                            } else{
                           diskon = 0;
                             } 
                            }
                        break;                       
                        case 4: 
                            System.out.println("Ayam geprek       : Rp.17.000");
                            System.out.print("Jumlah pesanan      : ");
                            jml_brg = keyboard.nextInt();
                            jumlah = jml_brg*bakar;
                            if (kartu.equalsIgnoreCase("Y")){
                            if (jumlah > 0) {
                             diskon = 5000;
                             } else {
                           diskon = 0;
                             }                  
                            }else{
                            if (jumlah > 200000) {
                              diskon = 25000;
                            } else{
                           diskon = 0;
                             } 
                            }
                        break;  
                        default: 
                            System.out.println("Error");
                       }
                      break;
                case 2:
                    System.out.println("1.Bebek Madura");
                    System.out.println("2.Bebek Goreng");
                    System.out.println("3.Bebek sambel Ijo");
                    System.out.println("4.Bebek muda 1/2 ekor");
                    System.out.print("Pilih Menu 1-4: ");
                    pilihan1 = keyboard .nextInt();
                    switch (pilihan1) {
                        case 1:
                            System.out.println("Bebek Madura       : Rp.14.000");
                            System.out.print("Jumlah pesanan       : ");
                            jml_brg = keyboard.nextInt();
                            jumlah = jml_brg*bbk_mdr;
                            if (kartu.equalsIgnoreCase("Y")){
                            if (jumlah > 0) {
                             diskon = 5000;
                             } else {
                           diskon = 0;
                             }                  
                            }
                            else{
                            if (jumlah > 200000) {
                              diskon = 25000;
                            } else{
                           diskon = 0;
                             } 
                            }
                        break;    
                        case 2: 
                            System.out.println("Bebek Goreng       : Rp.15.000");
                            System.out.print("Jumlah pesanan       : ");
                            jml_brg = keyboard.nextInt();
                            jumlah = jml_brg*bbk_grg;
                            if (kartu.equalsIgnoreCase("Y")){  
                            if (jumlah > 0) {
                             diskon = 5000;
                             } else {
                           diskon = 0;
                             }                  
                            }else{
                            if (jumlah > 200000) {
                              diskon = 25000;
                            } else{
                           diskon = 0;
                             } 
                            }
                        break;
                        case 3: 
                            System.out.println("Bebek Sambel Ijo      : Rp.17.000");
                            System.out.print("Jumlah pesanan          : ");
                            jml_brg = keyboard.nextInt();
                            jumlah = jml_brg*bbk_ijo;
                            if (kartu.equalsIgnoreCase("Y")){ 
                            if (jumlah > 0) {
                             diskon = 5000;
                             } else {
                           diskon = 0;
                             }                  
                            }else{
                            if (jumlah > 200000) {
                              diskon = 25000;
                            } else{
                           diskon = 0;
                             } 
                            }
                        break;                       
                        case 4: 
                            System.out.println("Ayam geprek       : Rp.23.000");
                            System.out.print("Jumlah pesanan      : ");
                            jml_brg = keyboard.nextInt();
                            jumlah = jml_brg*bbk_ekr;
                            if (kartu.equalsIgnoreCase("Y")){
                            if (jumlah > 0) {
                             diskon = 5000;
                             } else {
                           diskon = 0;
                             }                  
                            }else{
                            if (jumlah > 200000) {
                              diskon = 25000;
                            } else{
                           diskon = 0;
                             } 
                            }
                        break;  
                        default: 
                            System.out.println("Error");
                       }
                      break;
                    
            }  
        bayar = jumlah - diskon;
        System.out.println("===========================================");
        System.out.println("                    HASIL");
        System.out.println("===========================================");
        System.out.println("Nama Kasir               : "+ kasir);
        System.out.println("Nama Konsumen            : "+ pembeli );
        System.out.println("Anda Mendapat Diskon     : RP."+ diskon );
        System.out.println("Anda Harus bayar         : RP."+ bayar );
        
        }
}
