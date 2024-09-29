/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FADHILA
 */
public class Main {

    public static void main(String[] args) {

        Jambu_gelas jg = new Jambu_gelas();

        jg.setnama_buah("Jambu_gelas");
        jg.setWarna("kuning");
        jg.setbentuk("bunder");
        jg.setrasa("manis");
        jg.setukuran("kecil");

        System.out.println("\n\t\t\tJambu_gelas");
        System.out.println("Nama              : " + jg.getnama_buah());
        System.out.println("Warna             : " + jg.getWarna());
        System.out.println("Iklim             : " + jg.getbentuk());
        System.out.println("Tanah             : " + jg.getrasa());
        System.out.println("Hewan Penyerbuk   : " + jg.getukuran());
}
}
