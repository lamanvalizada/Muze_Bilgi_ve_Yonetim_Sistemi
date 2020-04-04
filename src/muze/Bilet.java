/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muze;

/**
 *
 * @author gruhayn
 */
public class Bilet {
    private static int kucuk_bilet;
    private static int buyuk_bilet;
   
    public static int getKucuk_bilet() {
        return kucuk_bilet;
    }

    public static void setKucuk_bilet(int kucuk_bilet) {
        Bilet.kucuk_bilet = kucuk_bilet;
    }

    public static int getBuyuk_bilet() {
        return buyuk_bilet;
    }

    public static void setBuyuk_bilet(int buyuk_bilet) {
        Bilet.buyuk_bilet = buyuk_bilet;
    }

  
   
   
}
