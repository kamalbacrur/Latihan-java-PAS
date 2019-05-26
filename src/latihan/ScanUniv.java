package latihan;
import java.util.Scanner;
public class ScanUniv {
    public static void main(String[] args) {
        int rata1, rata2,rata3,rata4,rata5;
        String nama, sekolah;
        double hasil;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("    |Program Penentuan masuk Universitas|");
        System.out.println("=============================================");
        System.out.print("Masukan nama anda: ");
        nama = keyboard.nextLine();
        System.out.print("Asal Sekolah Anda: ");
        sekolah= keyboard.nextLine();
        System.out.println("Masukan nilai rata-rata per-semester: ");
        System.out.print("Semester 1 = ");
        rata1 = keyboard.nextInt();
        System.out.print("Semester 2 = ");
        rata2 = keyboard.nextInt();
        System.out.print("Semester 3 = ");
        rata3 = keyboard.nextInt();
        System.out.print("Semester 4 = ");
        rata4 = keyboard.nextInt();
        System.out.print("Semester 5 = ");
        rata5 = keyboard.nextInt();
        hasil = (rata1+rata2+rata3+rata4+rata5)/5;
        System.out.println("=============================================");
        System.out.println("                   |HASIL |");
        System.out.println("=============================================");
        System.out.println("NAMA                         : " + nama);
        System.out.println("ASAL SEKOLAH                 : " + sekolah);
        System.out.println("nilai rata-rata semester 1-5 : " + hasil);
        if((hasil>=90.0) && (hasil<=92.0)){
            System.out.println("Anda mendapat                : Universitas Indonesia ");
        } else if((hasil>=89.0)&&(hasil<=89.9)){
            System.out.println("Anda mendapat                : Universitas Gajah Mada");
        } else if ((hasil>=88.0)&&(hasil<=88.9)){
            System.out.println("Anda mendapat                : Institut Teknologi Bandung");
        } else{
            System.out.println("Maaf anda Tidak mendapat universitas favorit anda");
        }
        
        
    }     
    
}
