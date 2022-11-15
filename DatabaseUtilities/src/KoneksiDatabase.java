/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class KoneksiDatabase {
   private static Connection koneksi;
   public static Connection getKoneksi (){
       if (koneksi == null) {
           try{
               Driver driver = new Driver();
               DriverManager.registerDriver(driver);
               String url="jdbc:mysql://localhost:3306/db_barang";
               String user="root";
               String pass="";
               koneksi = DriverManager.getConnection(url, user, pass);
               System.out.println("Koneksi ke database berhasil");   
           }
           catch (SQLException ex){
               System.out.println("Koneksi gagal");
               System.out.println("Pesan : "+ex.getMessage());
           }
       }
       return koneksi;
   }
}
