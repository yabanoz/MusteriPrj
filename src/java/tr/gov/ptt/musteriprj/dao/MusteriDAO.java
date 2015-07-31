
package tr.gov.ptt.musteriprj.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import tr.gov.ptt.musteriprj.dto.Musteri;
import tr.gov.ptt.musteriprj.util.VTBaglanti;

public class MusteriDAO {
    
    public static List musteriListesiGetir() throws ClassNotFoundException, SQLException{
        
        Musteri musteri;
        ArrayList<Musteri> musteriListesi = new ArrayList<Musteri>();
        Connection conn = VTBaglanti.baglantiGetir();
        
        PreparedStatement ps = 
conn.prepareStatement("select no,ad,soyad from MUSTERI order by no");
        
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            musteri = new Musteri();
            musteri.setNo(rs.getInt("no"));
            musteri.setAd(rs.getString("ad"));
            musteri.setSoyad(rs.getString("soyad"));
            musteriListesi.add(musteri);
        }
        
        rs.close();
        ps.close();
        VTBaglanti.baglantiKapat(conn);
        
        return musteriListesi;
        
    }
}
