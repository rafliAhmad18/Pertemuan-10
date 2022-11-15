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
import java.sql.Statement;

public class ProgramInsert {
    
    
    public static void main(String[] args) {
        Connection koneksi = KoneksiDatabase.getKoneksi();
        Statement statement = null;
        try{
            statement =koneksi.createStatement ();
            System.out.println("Statement berhasil dibuat");
            String url= "INSERT INFO barang(kode_barang,nama_barang,jumlah,harga)Vlues('B006','Buku',50,3000)";
            statement.executeUpdate(url);
        } catch (SQLException ex){
            System.out.println("Statement gagal dibuat");
            System.out.println("Pesan : "+ex.getMessage());
        } finally{
            if (statement != null){
                try {
                    statement.close();
                    System.out.println("Statement berhasil ditutup");
                } catch (SQLException ex){
                    System.out.println("Statement gagal ditutup");
                    System.out.println("Pesan : "+ex.getMessage());
                }
            }
        }
    }
}
    
    

