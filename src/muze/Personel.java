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
public class Personel {

    private String isim;
    private String soyisim;
    private String TCnum;
    private String maas; 
    
    public Personel(String isim,String soyisim,String TCnum,String maas) {
        this.isim=isim;
        this.soyisim=soyisim;
        this.TCnum=TCnum;
        this.maas=maas;
        
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getTCnum() {
        return TCnum;
    }

    public void setTCnum(String TCnum) {
        this.TCnum = TCnum;
    }

    public String getMaas() {
        return maas;
    }

    public void setMaas(String maas) {
        this.maas = maas;
    }
    
    
    
}
