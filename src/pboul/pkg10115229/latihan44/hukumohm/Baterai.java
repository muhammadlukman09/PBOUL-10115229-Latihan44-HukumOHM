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
public class Baterai {
    private float kuatArus;
    private float hambatan;
    
    public Baterai(){
    }
    
    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    /**
     * @return the kuatArus
     */
    public float getKuatArus() {
        return kuatArus;
    }

    /**
     * @return the hambatan
     */
    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan(){
     float Tegangan;
     Tegangan = kuatArus * hambatan;
     return Tegangan;
     
    }
    
    }
    
    


