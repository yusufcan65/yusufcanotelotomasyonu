/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author EXCALIBUR
 */
public class kayıtDAO {
    
    public void kayıt(String str,String file) throws IOException {
        File dosya = new File(file);
        if(!dosya.exists()){
            dosya.createNewFile();
        }
        FileWriter fw = new FileWriter(dosya,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(str);
        bw.newLine();
        bw.close();
    }
}
