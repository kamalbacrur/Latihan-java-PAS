package latihan;
import java.util.Scanner;
public class DinamisUniv {

    public static void main(String[] args) {
        int hasil,rata1,rata2,rata3,rata4,rata5;
        String nama,sekolah,input;
        
        Scanner keyboard =new Scanner(System.in);
        
        System.out.print("Masukan nama anda: ");
        nama = keyboard.nextLine();
        System.out.print("Masukan Sekolah anda: ");
        sekolah = keyboard.nextLine();
        System.out.println("Masukan nilai per semester:");
        System.out.print("Semester 1 : ");
        rata1 = keyboard.nextInt();
        System.out.print("Semester 2: ");
        rata2 = keyboard.nextInt();
        System.out.print("Semester 3: ");
        rata3 = keyboard.nextInt();
        System.out.print("Semester 4: ");
        rata4 = keyboard.nextInt();
        System.out.print("Semester 5: ");
        rata5 = keyboard.nextInt();
        hasil = (rata1+rata2+rata3+rata4+rata5)/5;
        System.out.println("Nilai rata-rata 1-5: " + hasil);
        System.out.println("Ketentuan masuk universitas:");
        System.out.println("INI ADALAH KETENTUAN MASUK UNIVERSITAS");
        System.out.println("nilai rata-rata 1-5:90 = Universitas Indonesia");
        System.out.println("nilai rata-rata 1-5:89 = Universitas Gajah Mada");
        System.out.println("nilai rata-rata 1-5:90 = Institut Teknologi Bandung");
        System.out.println("Ketika Universitas sesuai ketentuan nilai rata rata anda: ");
        input = keyboard.nextLine();
        System.out.println("=============================================");
        System.out.println("                   |HASIL |");
        System.out.println("=============================================");
        System.out.println("Nama anda: " + nama);
        System.out.println("Sekolah anda:" + sekolah);
        System.out.println("Nilai rata-rata: " + hasil);
        System.out.println("Masuk Universitas " + input);
        
    }
    
}
