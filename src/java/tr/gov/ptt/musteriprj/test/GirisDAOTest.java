
package tr.gov.ptt.musteriprj.test;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tr.gov.ptt.musteriprj.dao.GirisDAO;
import tr.gov.ptt.musteriprj.dto.Giris;

public class GirisDAOTest {
    public static void testGiriseYetkilimi(){
        
        try {
            Giris giris = new Giris();
            giris.setKullanici("SERHAN");
            giris.setSifre("999999");
            
            boolean sonuc = GirisDAO.giriseYetkilimi(giris);
            if(sonuc){
                System.out.println("Giriş başarılı"); 
            }else{
                System.out.println("Kullanıcı adı ya da şifre yanlış."); 
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GirisDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GirisDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void main(String[] args) {
        testGiriseYetkilimi();
    }
}
