/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package burung;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Burung {

public String name = "Paijo";
public int age = 12  ;
public String mounth = " Bulan";
public String suara = "Berkicau";
public String jenis = "Murai";
public int lama = 5 ;
public String minute = " Menit";

public static void Makanan(){
    Scanner input = new Scanner(System.in);
    System.out.println("=== Makanan ===");
    System.out.println("1. Milet");
    System.out.println("2. Ulat Hongkong");
    System.out.println("3. Pelet");
    System.out.println("Pilih Makanan:");
    String makanan = input.next();
    
    switch(makanan){
    case "1" -> System.out.println("""
                                   Manfaat :
                                   Membuat suara burung bersih
                                   Meningkatkan volume suara burung
                                   Membuat burung jadi gacor
                                   Membuat burung rajin bunyi
                                   Kebutuhan nutrisi terpenuhi
                                   Kebutuhan vitamin tercukupi
                                   Bulu burung tumbuh sehat dan berkilau
                                   Nafas burung semakin panjang
                                   Menaikkan mental burung
                                   Meningkatkan stamina burung""");
    case "2" -> System.out.println("""
                                   Manfaat :
                                   1. Sumber Protein
                                   2. Pendongkrak Stamina
                                   3. Pemanas Tubuh""");
    case "3" -> System.out.println("""
                                   Pelet burung murai batu yang menjadi salah satu pilihan makanan yang paling bagus dan efektif untuk menjadikan peliharaan burung murai batu biar cepat gacor, dimana pelet yang mengandung nutrisi didalamnya yang baik dan bisa memenuhi kebutuhan nutrisi harian burung tersebut.
                                   
                                   Dalam memilih makanan atau pakan pelet untuk peliharaan burung murai batu ini maka pastikan pada saat memilihnya yang tepat dan juga berkualitas, hal ini dikarenakan bisa mempengaruhi juga ke kualitas suara kicauan burung murai batu juga.""");
    default -> {
        }
    }
}

public static void Minuman(){
    Scanner input = new Scanner(System.in);
    System.out.println("=== Minuman ===");
    System.out.println("1. Air H");
    System.out.println("2. Vitamin");
    System.out.println("Pilih Minuman:");
    String minuman = input.next();
    
    switch(minuman){
    case "1" -> System.out.println("Manfaat : "
                + "Membantu sistem pencernaan burung");
    case "2" -> System.out.println("""
                                   Manfaat :
                                   1. Sumber Protein
                                   2. Pendongkrak Stamina
                                   3. Pemanas Tubuh
                                   Memberi burung Anda vitamin dan mineral penting, dapat membantu Anda memastikan bahwa ia menerima nutrisi yang tepat untuk menjaga kesehatannya. Burung yang sehat adalah burung yang berkembang, cantik, dan bahagia.
                                   
                                   Patut diingat bahwa semua komponen ini harus diberikan sesuai dengan kebutuhan burung peliharaan Anda. Pemberian yang secara berlebihan akan mengakibatkan gangguan metabolisme pada burung peliharaan Anda.""");
    default -> {
        }
    }
}
    
    public static void main(String[] args) {
        Burung test = new Burung();
     System.out.println("Nama : " + test.name);
     System.out.println("Umur :"+test.age + test.mounth);
     System.out.println("Jenis Burung : "+test.jenis);
     System.out.println("Jenis Suara : "+test.suara);
     System.out.println("Lama berkicau :"+test.lama + test.minute);
     Makanan();
     Minuman();
    }
 
    
}
