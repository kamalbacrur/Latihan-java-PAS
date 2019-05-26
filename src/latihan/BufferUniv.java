package latihan;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferUniv {
    public static void main(String[] args) throws IOException {
        int rata1,rata2,rata3,rata4,rata5;
        String nama,sekolah;
        double hasil;
        InputStreamReader scan = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (scan); 
        
        System.out.println("=============================================");
        System.out.println("    |Program Penentuan masuk Universitas|");
        System.out.println("=============================================");
        System.out.print("Masukan Nama Anda         : ");
        nama = br.readLine();
        System.out.print("Masukan Asal Sekolah Anda : ");
        sekolah = br.readLine();
        System.out.println("Masukan nilai per semester:");
        System.out.print("Semester 1: ");
        rata1 = Integer.parseInt(br.readLine());
        System.out.print("Semester 2: ");
        rata2 = Integer.parseInt(br.readLine());
        System.out.print("Semester 3: ");
        rata3 = Integer.parseInt(br.readLine());
        System.out.print("Semester 4: ");
        rata4 =Integer.parseInt(br.readLine());
        System.out.print("Semester 5: ");
        rata5 = Integer.parseInt(br.readLine());
        hasil = (rata1+rata2+rata3+rata4+rata5)/5;
        System.out.println("=============================================");
        System.out.println("                   |HASIL |");
        System.out.println("=============================================");
        System.out.println("Nama anda                : " + nama);
        System.out.println("Asal Sekolah             : " + sekolah);
        System.out.println("Nilai rata-rata semester : " + hasil);
        if((hasil>=90.0) && (hasil<=90.9)){
            System.out.println("Anda mendapatkan         : Universitas Indonesia");
        }else if((hasil >=89.0) && (hasil<=89.9)){
            System.out.println("Anda mendapatkan         : Universitas Gajah Mada");   
        } else if( (hasil >=88.0) && (hasil<=88.9)){
            System.out.println("Anda Mendapatkan         : Institute Teknologi Bandung");
        } else{ 
            System.out.println("Maaf anda tidak masuk universitas terbaik");
        }
        
        
    }
    
}
