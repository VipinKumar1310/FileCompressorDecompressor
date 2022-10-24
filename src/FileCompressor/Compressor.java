/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileCompressor;

import java.io.*;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author X_yz
 */
public class Compressor {
    public static void method(File file) throws IOException{
        String fileDir = file.getParent(); 
        System.out.print(fileDir);
        FileInputStream fin = new FileInputStream(file);
        FileOutputStream fout = new FileOutputStream(fileDir + "/newww.gz");
        
        GZIPOutputStream gzip = new GZIPOutputStream(fout);
        
        byte [] buffer = new byte[2048];
        int len;
        while((len = fin.read(buffer)) != -1)  {
        gzip.write(buffer, 0, len);
        }
     
        gzip.close();
        fout.close();
        fin.close();
        
    }
   
}
