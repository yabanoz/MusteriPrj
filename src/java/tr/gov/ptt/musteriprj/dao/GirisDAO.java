
package tr.gov.ptt.musteriprj.dao;

import java.sql.*;
import tr.gov.ptt.musteriprj.dto.Giris;
import tr.gov.ptt.musteriprj.util.VTBaglanti;

public class GirisDAO {
    
    public static boolean giriseYetkilimi(Giris p_giris) throws ClassNotFoundException, SQLException{
         
        String vtSifre =null;
        
        Connection conn = VTBaglanti.baglantiGetir();
        
        PreparedStatement ps = conn.prepareStatement("select sifre from giris where kullanici=?");
        ps.setString(1,p_giris.getKullanici());
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            vtSifre = rs.getString("sifre");
        }
        rs.close();
        ps.close();
        VTBaglanti.baglantiKapat(conn);
        
        if(p_giris.getSifre().equals(vtSifre)){
            return true;
        }else{
            return false;
        }                  
    }
}
