
package tr.gov.ptt.musteriprj.bean;

import java.sql.SQLException;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import tr.gov.ptt.musteriprj.dao.MusteriDAO;
import tr.gov.ptt.musteriprj.dto.Musteri;


@ManagedBean
@ViewScoped

public class MusteriBean {
    
   private List<Musteri> musteriListesi;
   
   @PostConstruct
   public void init(){
       try {
           musteriListesi = MusteriDAO.musteriListesiGetir();
       } catch (ClassNotFoundException ex) {
       } catch (SQLException ex) {
       }
   }

    public List<Musteri> getMusteriListesi() {
        return musteriListesi;
    }
    
    
  
}
