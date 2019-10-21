/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan44.hukumohm;

/**
 *
 * @author Lukman
 */
public class PBOUL10115229Latihan44HukumOHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Baterai baterai1 = new Baterai(30,120);
        System.out.println("===========Hukum OHM===========");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar"
                + "\n akan berbanding lurus dengan beda potensial"
                + "\n pada ujung-ujung kawat penghantar tersebut"
                + "\n asalkan suhu kawat dijaga konstan.");
        System.out.println("\nKuat Arus : "+baterai1.getKuatArus()+" Ampere");
        System.out.println("Hambatan : "+baterai1.getHambatan()+" ohm");
        System.out.println("Hasil Tegangan: "+baterai1.hitungTegangan()+" volt");
        
        
    }
    
}
