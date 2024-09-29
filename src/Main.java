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

        Buah_naga fr = new Buah_naga();

        fr.setnama_buah("Buah_Naga");
        fr.setWarna("merah");
        fr.setbentuk("bulat lonjong");
        fr.setrasa("manis asam");
        fr.setukuran("sedang");

        System.out.println("\n\t\t\tBuah_Naga");
        System.out.println("Nama              : " + fr.getnama_buah());
        System.out.println("Warna             : " + fr.getWarna());
        System.out.println("Bentuk            : " + fr.getbentuk());
        System.out.println("Rasa              : " + fr.getrasa());
        System.out.println("Ukuran            : " + fr.getukuran());
}
}
