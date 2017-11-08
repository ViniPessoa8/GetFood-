/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Vinicius
 */
public class FotoUtil {

    public FotoUtil() {

    }

    public FileInputStream byteToInputStream(byte[] bytes, String path) {

        FileInputStream inputImage = null;
        FileOutputStream outStream = null;

        try {
            outStream = new FileOutputStream(path);
            outStream.write(bytes);
            inputImage = new FileInputStream(outStream.getFD());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return inputImage;
    }

    public FileInputStream fileToInputStream(File file) {
        FileInputStream inputImage = null;
        try {
            inputImage = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return inputImage;
    }

    public byte[] inputStreamToByte(InputStream input) {
        byte[] b = null;
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] rb = new byte[1024];
            int ch = 0;
            while ((ch = input.read(rb)) != -1) {
                out.write(rb, 0, ch);
            }
            b = out.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return b;
    }
    
    public ImageIcon fileToImageIcon(File file){
        ImageIcon img = new ImageIcon(inputStreamToByte(fileToInputStream(file)));
        return img;
    }
    
    

}
