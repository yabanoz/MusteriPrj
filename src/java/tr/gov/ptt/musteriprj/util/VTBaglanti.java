
package tr.gov.ptt.musteriprj.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VTBaglanti {
    public static Connection baglantiGetir() throws ClassNotFoundException, SQLException{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.187:1521:xe","kurs6","ptt");
        return conn;
    }
    public static void baglantiKapat(Connection conn) throws SQLException{
        conn.close();
    }
}
