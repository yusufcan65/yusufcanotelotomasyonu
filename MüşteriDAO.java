/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import contract.müşteri;

/**
 *
 * @author EXCALIBUR
 */
public class MüşteriDAO {
    String file = "müşteri.txt";
    File f = new File(file);
    FileReader fr = new FileReader(f);
    BufferedReader br = new BufferedReader(fr);
    FileWriter fw = new FileWriter(f);
    
    müşteri m = new müşteri();
    kayıtDAO k2= new kayıtDAO();
    public MüşteriDAO()throws IOException{
        k2.kayıt(m.toString(), "müşteri.txt");
    }
   
   public boolean dogrula(String ad,String soyad,String sifre,String kullanıcıadı)throws IOException{
       boolean a,b,c,d;
       int s1=0,s2=0,s3=0,s4=0;
       
       if(ad!=null && soyad!=null && sifre!=null && kullanıcıadı!=null){
           String s;
           while((s=br.readLine())!=null){
               a=s.contains(ad);
               if(a==true){
                   s1++;
               }
               
               b=s.contains(soyad);
               if(b==true){
                   s2++;
               }
               c=s.contains(sifre);
               if(c==true){
                   s3++;
               }
               d=s.contains(kullanıcıadı);
               if(d==true){
                   s4++;
               }
           }
       }
       else{
           return false;
       }
       if(s1==1 && s2==1 && s3==1 && s4==1){
           return true;
       }
       return false;
       
   }
  
}
