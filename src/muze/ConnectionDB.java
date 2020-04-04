/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muze;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author khagani
 */

public class ConnectionDB{
    private static final String USERNAME ="root";
    private static final String PASSWORD ="0103";
    private static final String CONN ="jdbc:mysql://localhost/muze_db";
    static Connection con = null;
    static Statement stmt=null;
    static ResultSet rs = null;
    
    
    public  static void qosul() throws SQLException{
        try {
            con =DriverManager.getConnection(CONN,USERNAME,PASSWORD);
            System.out.print("Connected\n");
        }catch (SQLException e){
            System.err.print(e); 
        
        }
    }
    public static boolean  kayitOl() throws SQLException{
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        rs = stmt.executeQuery("SELECT count(*) from `kisi_bilgiler_tb` where TC='"+Insan.getTCnum()+"'");
        rs.next();
        int rowCount=rs.getInt(1);
        rs=null;
        System.out.println(rowCount);
        System.out.println(Insan.getTCnum());

        if (rowCount>0){
            return false;
        } 
        else {
            stmt.executeUpdate("INSERT INTO `kisi_bilgiler_tb`(`Isim`, `Soyisim`, `TC`, `Sifre`, `Maas`, `TIP`) VALUES ('"+Insan.getIsim()+"','"+Insan.getSoyisim()+"','"+Insan.getTCnum()+"','"+Insan.getPassword()+"','0','1')");
            return true;
        } 
        
    
    }
   // '"+Insan.getTCnum()+"' + Sifre='"+Insan.getPassword()+"'"
    public static boolean oturumAc() throws SQLException{
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        rs = stmt.executeQuery("Select TC,Sifre,TIP from `kisi_bilgiler_tb` where TC='"+Insan.getTCnum()+"' and Sifre='"+Insan.getPassword()+"'");
        if(rs.next())
        {
           Insan.setTCnum(rs.getString(1));
           Insan.setPassword(rs.getString(2));
           Insan.setTip(rs.getString(3));
           System.out.println(rs.getString(1));
           System.out.println(rs.getString(2));
           System.out.println(rs.getString(3));
           return true;
        }
        return false;
    }
    public static void biletAl() throws SQLException{
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        rs= stmt.executeQuery("SELECT `Buyuk_Bilet`, `Kucuk_Bilet` FROM `bilet_fiyatlari_tb`");
        if(rs.next())
        {
            Bilet.setBuyuk_bilet(Integer.parseInt(rs.getString(1)));
            Bilet.setKucuk_bilet(Integer.parseInt(rs.getString(2)));
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
        }
    }
    public static void kasaBilgi(Integer kucuk,Integer buyuk,int tutar) throws SQLException
    {
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        stmt.executeUpdate("INSERT INTO `kasa_tb`(`Tc`, `Tutar`, `Kucuk`, `Buyuk`) VALUES ('"+Insan.getTCnum()+"','"+String.valueOf(tutar)+"','"+String.valueOf(kucuk)+"','"+String.valueOf(buyuk)+"')");
    }
    public static void oneriEkle(String oneri) throws SQLException{
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        stmt.executeUpdate("INSERT INTO `oneriler_tb`(`Text`) VALUES ('"+oneri+"')");
        
    }
    public static void fiyatDegistir(int kucuk,int buyuk) throws SQLException{
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        stmt.executeUpdate("UPDATE `bilet_fiyatlari_tb` SET `Buyuk_Bilet`=('"+String.valueOf(buyuk)+"'),`Kucuk_Bilet`=('"+String.valueOf(kucuk)+"') WHERE 1");        
    }
    public static void isciBilgileri() throws SQLException{
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        rs= stmt.executeQuery("SELECT `Isim`,`Soyisim`,`Maas` FROM `kisi_bilgiler_tb` WHERE TC='"+Insan.getTCnum()+"'");
        if(rs.next())
        {
            Insan.setIsim(rs.getString(1));
            Insan.setSoyisim(rs.getString(2));
            Insan.setMaas(rs.getString(3));
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
        }
        
    }
    public static boolean isciSil(String TC) throws SQLException{
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        rs = stmt.executeQuery("SELECT count(*) from `kisi_bilgiler_tb` where TC=('"+TC+"') and TIP=('2')");
        rs.next();
        int rowCount=rs.getInt(1);
        System.out.println(rowCount);
        rs=null;
        if (rowCount<=0){
            return false;
        } 
        else {
            stmt.executeUpdate("DELETE  FROM `kisi_bilgiler_tb` WHERE TC =('"+TC+"')");
            return true;
        }
    }
    public static boolean isciEkle(String isim,String soyisim,String sifre, String maas,String TC) throws SQLException{
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        rs = stmt.executeQuery("SELECT count(*) from `kisi_bilgiler_tb` where TC=('"+TC+"')");
        rs.next();
        int rowCount=rs.getInt(1);
        rs=null;
        if (rowCount>0){
            return false;
        } 
        else {
            stmt.executeUpdate("INSERT `kisi_bilgiler_tb`(`Isim`, `Soyisim`, `TC`, `Sifre`, `Maas`, `TIP`) VALUES ('"+isim+"','"+soyisim+"','"+TC+"','"+sifre+"','"+maas+"','2')");
            return true;
        }
    }
    public static ArrayList<Kasa> kasaTanimla() throws SQLException
    {
        ArrayList<Kasa> kasadakiler=new ArrayList<>();
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT `Tc`, `Kucuk`, `Buyuk`, `Tutar` FROM `kasa_tb` WHERE 1");
        while(rs.next())
        {
            kasadakiler.add(new Kasa(rs.getString("Tc"),rs.getString("Kucuk"),rs.getString("Buyuk"),rs.getString("Tutar")));
        }
        return kasadakiler;
    }

    public static ArrayList<Personel> personellerTanimla() throws SQLException {
        ArrayList<Personel> personeller= new ArrayList<Personel>();
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT `Isim` , `Soyisim` , `TC` , `Maas` FROM `kisi_bilgiler_tb` WHERE `TIP` =2");           
        while(rs.next())
        {
            personeller.add(new Personel(rs.getString("Isim"), rs.getString("Soyisim"), rs.getString("TC"), rs.getString("Maas")));
        }
        return personeller;
    }

    static ArrayList<Oneri> onerilerTanimla() throws SQLException {
        ArrayList<Oneri> oneriler=new ArrayList<Oneri>();
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT `Text` FROM `oneriler_tb` WHERE 1");           
        while(rs.next())
        {
            oneriler.add(new Oneri(rs.getString("Text")));
        }
        return oneriler;
    }
    
}
    
    
   /* public static ArrayList<String> get() throws Exception{
     PreparedStatement st =con.PreparedStatement("Select TC,Sifre, from `kisi_bilgiler_tb` where TC='"+Insan.getTCnum()+"' + Sifre='"+Insan.getPassword()+"'");
        rs=st.executyquery();
    }*/



