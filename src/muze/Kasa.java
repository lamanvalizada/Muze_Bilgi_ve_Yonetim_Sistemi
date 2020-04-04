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
public class Kasa {
    private String kucuk,buyuk,TC,tutar;

    public Kasa(String TC, String kucuk, String buyuk, String tutar) {
        this.kucuk = kucuk;
        this.buyuk = buyuk;
        this.TC = TC;
        this.tutar = tutar;
    }

    
    public String getKucuk() {
        return kucuk;
    }

    public void setKucuk(String kucuk) {
        this.kucuk = kucuk;
    }

    public String getBuyuk() {
        return buyuk;
    }

    public void setBuyuk(String buyuk) {
        this.buyuk = buyuk;
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    public String getTutar() {
        return tutar;
    }

    public void setTutar(String tutar) {
        this.tutar = tutar;
    }

   
}
