/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        } catch(IOException e){
            e.printStackTrace();
        }
        
        return inputImage;
    }

}
