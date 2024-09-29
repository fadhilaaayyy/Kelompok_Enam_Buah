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

        Kelengkeng fr = new Kelengkeng();

        fr.setnama_buah("Kelengkeng");
        fr.setWarna("kuning");
        fr.setbentuk("bunder");
        fr.setrasa("manis");
        fr.setukuran("kecil");

        System.out.println("\n\t\t\tKelengkeng");
        System.out.println("Nama              : " + fr.getnama_buah());
        System.out.println("Warna             : " + fr.getWarna());
        System.out.println("Iklim             : " + fr.getbentuk());
        System.out.println("Tanah             : " + fr.getrasa());
        System.out.println("Hewan Penyerbuk   : " + fr.getukuran());
}
}
