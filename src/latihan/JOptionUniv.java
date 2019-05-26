package latihan;
import javax.swing.JOptionPane;
public class JOptionUniv {

    public static void main(String[] args) {
        int rata1,rata2,rata3,rata4,rata5;
        String nama, sekolah;
        double hasil; 
        String Ui = "Masuk Universitas Indonesia";
        String Ugm = "Masuk Universitas Gajah Mada";
        String Itb = "Masuk institut Teknologi Bandung";
        
        nama = JOptionPane.showInputDialog("Nama anda:");
        sekolah = JOptionPane.showInputDialog("Sekolah Asal");
        rata1 = Integer.parseInt(JOptionPane.showInputDialog("Rata Rata semester 1:"));
        rata2 = Integer.parseInt(JOptionPane.showInputDialog("Rata Rata semester 2:"));
        rata3 = Integer.parseInt(JOptionPane.showInputDialog("Rata Rata semester 3:"));
        rata4 = Integer.parseInt(JOptionPane.showInputDialog("Rata Rata semester 4:"));
        rata5 = Integer.parseInt(JOptionPane.showInputDialog("Rata Rata semester 5:"));
        hasil = (rata1+rata2+rata3+rata4+rata5)/5;
        
        if((hasil>=90.0)&&(hasil<=90.9)){
             JOptionPane.showMessageDialog(null, "Nama anda: "+ nama+ "\n" + "Sekolah anda: " + sekolah+ "\n" +"Nilai Rata-Rata semester 1-5: " +hasil+ "\n" + Ui);
        } else if((hasil>=89.0)&&(hasil<=89.9)){
            JOptionPane.showMessageDialog(null,"Nama anda: "+ nama+ "\n" + "Sekolah anda: " + sekolah+ "\n" +"Nilai Rata-Rata semester 1-5: " +hasil+ "\n" +Ugm);
        } else if ((hasil>=88.0)&&(hasil<=88.9)) {
            JOptionPane.showMessageDialog(null, "Nama anda: "+ nama+ "\n" + "Sekolah anda: " + sekolah+ "\n" +"Nilai Rata-Rata semester 1-5: " +hasil+ "\n" +Itb);
        } else {
            JOptionPane.showConfirmDialog(null, "Anda Gagal Masuk Universitas favorit");
        }
        
    }
    
}
