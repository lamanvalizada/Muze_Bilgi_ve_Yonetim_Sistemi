/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muze;

public class Insan {

    private static String isim;
    private static String soyisim;
    private static String TCnum;
    private static String password;
    private static String tip;  // 1-musteri 2-isci 3-admin
    private static String maas;    

    
    public static String getIsim() {
        return isim;
    }

    public static void setIsim(String isim) {
        Insan.isim = isim;
    }

    public static String getSoyisim() {
        return soyisim;
    }

    public static void setSoyisim(String soyisim) {
        Insan.soyisim = soyisim;
    }

    public static String getTCnum() {
        return TCnum;
    }

    public static void setTCnum(String TCnum) {
        Insan.TCnum = TCnum;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Insan.password = password;
    }

    public static String getMaas() {
        return maas;
    }

    public static void setMaas(String maas) {
        Insan.maas = maas;
    }
    

    public static String getTip() {
        return tip;
    }

    public static void setTip(String tip) {
        Insan.tip = tip;
    }

    
    
}
