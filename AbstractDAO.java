/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;



/**
 *
 * @author EXCALIBUR
 */
public abstract class AbstractDAO {
  
    public void kaydet (Object o)throws IOException{
        String file = String.valueOf(o.getClass());
        file = file + ".txt";
        File f = new File(file);
        if(!f.exists()){
            f.createNewFile();
        }
        FileWriter fw = new FileWriter(f,true);
        try(BufferedWriter bw = new BufferedWriter(fw)){
            bw.write(o.toString());
            bw.newLine();
            bw.close();
        }
    }
    
     public String[] listele(String file) throws IOException{
        File b = new File(file);
        if(!b.exists()){
            b.createNewFile();
        }
        FileReader fir = new FileReader(b);
        BufferedReader bfr = new BufferedReader(fir);
        String str,line="";
        while((str=bfr.readLine()) != null){
            line = line + str;
        }
        String[] liste = line.split("#");
        return liste;
    }
    
    public String[] sil(String file,String str) throws IOException{
        ArrayList list = new ArrayList();
        File a= new File(file);
        if(!a.exists()){
            a.createNewFile();
        }
        FileReader fr = new FileReader(a);
        BufferedReader br = new BufferedReader(fr);
        
        FileWriter fwrt= new FileWriter(a,true);
        BufferedWriter bwrt = new BufferedWriter(fwrt);
        str = str+"#";
        String line = "",templine="";
        while((line=br.readLine())!=null){
            if(!line.equals(str)){
                templine = templine+line;
                list.add(line);
            }
        }
        PrintWriter wrt = new PrintWriter(a);
        wrt.print("");
        wrt.close();
        
        for(int i=0 ;i<list.size();i++){
            bwrt.write((String)list.get(i));
            bwrt.newLine();
        }
        bwrt.close();
        String[] liste = templine.split("#");
        return liste;
    }
    
   
       /* public Boolean  delete(Object o,String silinecek){
        String fileName=String.valueOf(o.getClass());
        ArrayList list1=new ArrayList();
        String[][] data=new String[calculateData(o)][];
        mainDAO.GetData(fileName,list1);
        convertData(o,data);
        boolean a=false;
        int silinecekindex =0;
        for (int i=0;i<data.length;i++){
            if(data[i][0].equals(silinecek)){
                 silinecekindex=i;
                 a=true;
                 break;
            }
        }
        list1.remove(silinecekindex);
        mainDAO.SaveArraylist(fileName,list1);
        return a;
        }*/
    
}
