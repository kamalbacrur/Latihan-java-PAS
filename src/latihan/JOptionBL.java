package latihan;
import javax.swing.JOptionPane;
public class JOptionBL {
    public static void main(String[] args) {
        String ringan,elektronik,gadget,nm_ksr, nm_pmbl;
        int bayar, belanjaan = 0,jml_brg = 0,jmlh = 0;
        int gery= 25000, clts= 28000, tango= 30000, nissin= 45000, nabati=31000;
        int Led= 2000000,lcd=3000000,kipas=250000,kulkas=2500000,dispenser=300000;
        int hp=1500000, lptp=4500000,kmptr= 1750000,kmra= 5000000;
        int disc1 = 0,disc = 0;
        int jmlh_pulsa;  
        int menu,menu1;
        int jml_brng,jml_brng1;
        String pilih, pilih1;
        
        nm_ksr = JOptionPane.showInputDialog("Nama kasir");
        nm_pmbl = JOptionPane.showInputDialog("Nama konsumen");
        pilih = JOptionPane.showInputDialog("1.Makanan" + "\n" +"2.Elektronik"+ "\n"+ "3.Gadget" + "\n" + "4.Pulsa"+"\n" +"Silahkan pilih 1-4");     
        menu = Integer.parseInt(pilih);
        switch(menu){
            case 1 :
               pilih1 =  JOptionPane.showInputDialog("1.Wafer Gery"+"\n" + "2.Wafer Chocolatos" + "\n" + "3.Wafer Tango" + "\n" +"4.Wafer Nissin" + "\n" + "5.Wafer Nabati" +"\n"+"Silahkan pilih 1-5");
               menu1 = Integer.parseInt(pilih1);
               switch(menu1){
                   case 1 :
                       jml_brng = Integer.parseInt(JOptionPane.showInputDialog("Anda memilih Wafer Gery : Rp. 25.000"+"\n \n"  + "Mau beli berapa barang??")); 
                       jmlh = jml_brng * gery;
                       if (jmlh>= 50000) {
                            disc= (int) (jmlh*0.5);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                   case 2 : 
                       jml_brng = Integer.parseInt(JOptionPane.showInputDialog("Anda memilih Wafer Chocolatos : Rp. 28.000"+"\n \n"  + "Mau beli berapa barang??")); 
                       jmlh = jml_brng * clts;
                       if (jmlh>= 50000) {
                            disc= (int) (jmlh*0.5);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                    case 3 : 
                       jml_brng = Integer.parseInt(JOptionPane.showInputDialog("Anda memilih Wafer Tango : Rp. 30.000"+"\n \n"  + "Mau beli berapa barang??")); 
                       jmlh = jml_brng * tango;
                       if (jmlh>= 50000) {
                            disc= (int) (jmlh*0.5);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                    case 4 : 
                       jml_brng = Integer.parseInt(JOptionPane.showInputDialog("Anda memilih Wafer Nissin : Rp. 45.000"+"\n \n"  + "Mau beli berapa barang??")); 
                       jmlh = jml_brng * nissin;
                       if (jmlh>= 50000) {
                            disc= (int) (jmlh*0.5);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                    case 5 : 
                       jml_brng = Integer.parseInt(JOptionPane.showInputDialog("Anda memilih Wafer Nabati : Rp. 31.000"+"\n \n"  + "Mau beli berapa barang??")); 
                       jmlh = jml_brng * nabati;
                       if (jmlh>= 50000) {
                            disc= (int) (jmlh*0.5);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                       break;
                    default : 
                    JOptionPane.showMessageDialog(null, "error");
                    }
                    break;
            case 2: 
               pilih1 =  JOptionPane.showInputDialog("1.TV LED"+"\n" + "2.TV LCD" + "\n" + "3.Kipas Angin" + "\n" +"4.Kulkas" + "\n" + "5.Dispenser" +"\n"+"Silahkan pilih 1-5");
               menu1 = Integer.parseInt(pilih1);
               switch(menu1){
                   case 1 :
                       jml_brng = Integer.parseInt(JOptionPane.showInputDialog("Anda memilih TV LED : Rp. 2.000.000"+"\n \n"  + "Mau beli berapa barang??")); 
                       jmlh = jml_brng * Led;
                       if (jmlh>= 300000) {
                            disc= (int) (jmlh*0.1);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                   case 2 : 
                       jml_brng = Integer.parseInt(JOptionPane.showInputDialog("Anda memilih TV LCD: Rp. 3.000.000"+"\n \n"  + "Mau beli berapa barang??")); 
                       jmlh = jml_brng * lcd;
                       if (jmlh>= 300000) {
                            disc= (int) (jmlh*0.1);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                    case 3 : 
                       jml_brng = Integer.parseInt(JOptionPane.showInputDialog("Anda memilih Kipas Angin : Rp. 250.000"+"\n \n"  + "Mau beli berapa barang??")); 
                       jmlh = jml_brng * kipas;
                       if (jmlh>= 300000) {
                            disc= (int) (jmlh*0.1);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                    case 4 : 
                       jml_brng = Integer.parseInt(JOptionPane.showInputDialog("Anda memilih Kulkas : Rp. 2.500.000"+"\n \n"  + "Mau beli berapa barang??")); 
                       jmlh = jml_brng * kulkas;
                       if (jmlh>= 300000) {
                            disc= (int) (jmlh*0.1);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                    break;
                    case 5 : 
                       jml_brng = Integer.parseInt(JOptionPane.showInputDialog("Anda memilih Dispenser : Rp. 300.000"+"\n \n"  + "Mau beli berapa barang??")); 
                       jmlh = jml_brng * dispenser;
                       if (jmlh>= 300000) {
                            disc= (int) (jmlh*0.1);
                            disc1= jmlh-disc;
                        } else {
                            disc= 0;
                        }
                       break;
                    default : 
                    JOptionPane.showMessageDialog(null, "error");
                    }
                    break; 
                case 3: 
                    pilih1 =  JOptionPane.showInputDialog("1.HandPhone"+"\n" + "2.Laptop" + "\n" + "3.Komputer" + "\n" +"4.Kamera" + "\n"+"Silahkan pilih 1-4");
                    menu1 = Integer.parseInt(pilih1);
                    switch(menu1){
                        case 1 :
                            jml_brng = Integer.parseInt(JOptionPane.showInputDialog("Anda memilih HandPhone : Rp. 1.500.000"+"\n \n"  + "Mau beli berapa barang??")); 
                            jmlh = jml_brng * hp;
                            if (jmlh>= 500000) {
                                 disc= (int) (jmlh*0.15);
                                 disc1= jmlh-disc;
                             } else {
                                 disc= 0;
                             }
                         break;
                        case 2 : 
                            jml_brng = Integer.parseInt(JOptionPane.showInputDialog("Anda memilih Laptop : Rp. 4.500.000"+"\n \n"  + "Mau beli berapa barang??")); 
                            jmlh = jml_brng * lptp;
                            if (jmlh>= 500000) {
                                 disc= (int) (jmlh*0.15);
                                 disc1= jmlh-disc;
                             } else {
                                 disc= 0;
                             }
                         break;
                         case 3 : 
                            jml_brng = Integer.parseInt(JOptionPane.showInputDialog("Anda memilih Komputer : Rp. 1.750.000"+"\n \n"  + "Mau beli berapa barang??")); 
                            jmlh = jml_brng * kmptr;
                            if (jmlh>= 500000) {
                                 disc= (int) (jmlh*0.15);
                                 disc1= jmlh-disc;
                             } else {
                                 disc= 0;
                             }
                         break;
                         case 4 : 
                            jml_brng = Integer.parseInt(JOptionPane.showInputDialog("Anda memilih Kamera : Rp. 5.000.000"+"\n \n"  + "Mau beli berapa barang??")); 
                            jmlh = jml_brng * kmra;
                            if (jmlh>= 500000) {
                                 disc= (int) (jmlh*0.15);
                                 disc1= jmlh-disc;
                             } else {
                                 disc= 0;
                             }
                         break;
                         default : 
                         JOptionPane.showMessageDialog(null, "error");
                         }
                         break;
               case 4: 
               pilih1 =  JOptionPane.showInputDialog("Anda Membeli Pulsa Sebesar: Rp.");
               jmlh_pulsa = Integer.parseInt(pilih1);
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
        
        JOptionPane.showMessageDialog(null,"Nama kasir: "+nm_ksr+ "\n" + "Nama Pembeli: "+ nm_pmbl+ "\n" + "Potongan Harga: Rp." + disc + "\n" + "Harga Asli: Rp." + jmlh + "\n" + "Harga Dibayar: Rp."+ disc1);
    }
    
}
