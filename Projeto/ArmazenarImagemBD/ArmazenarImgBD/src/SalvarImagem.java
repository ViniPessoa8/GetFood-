
import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vinicius
 */
public class SalvarImagem {

    Connection con;
    String sql;
    PreparedStatement pstm;
    File arquivo;
    ResultSet rs;
    InputStream input;
    Imagem img;

    public SalvarImagem() {
        this.con = new ConnectionFactory().getConnection();
        img = new Imagem();
    }

    public void enviarImg() {
        FileInputStream inputImage = null;
        arquivo = new File("foto.jpg");
        try {
            inputImage = new FileInputStream(arquivo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        sql = "INSERT INTO imagem(img) VALUES (?)";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setBinaryStream(1, inputImage, arquivo.length());
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Imagem getImagem() {
        sql = "SELECT img FROM imagem WHERE codigo = 1";
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            rs.first();
            input = rs.getBinaryStream("img");
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] rb = new byte[1024];
            int ch = 0;
            while ((ch = input.read(rb)) != -1) {
                out.write(rb, 0, ch);
            }
            // transfer to byte buffer
            byte[] b = out.toByteArray();
            img.setImg(b);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(SalvarImagem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return img;
    }
}
