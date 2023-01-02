/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.io.IOException;
import contract.personel;


/**
 *
 * @author EXCALIBUR
 */
public class personelDAO extends AbstractDAO{
    
    public void kaydet(personel p)throws IOException{
        super.kaydet(p);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //public void insert(personel entity) {
//        File personelfile = new File("personelfile.txt");
//        if(!personelfile.exists()){
//            try {
//                personelfile.createNewFile();
//            } catch (IOException ex) {
//                Logger.getLogger(personelDAO.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        
//        }
//        FileWriter personelfilewriter = null;
//        try {
//            personelfilewriter = new FileWriter(personelfile,true);
//        } catch (IOException ex) {
//            Logger.getLogger(personelDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        BufferedWriter personelbufferedWriter = new BufferedWriter(personelfilewriter);
//        try {
//            personelbufferedWriter.write(entity.getAd());
//            personelbufferedWriter.write(entity.getSoyad());
//            personelbufferedWriter.write((int)entity.getId());
//            personelbufferedWriter.write(entity.getKullanıcıAdı());
//            personelbufferedWriter.write(entity.getTc());
//            personelbufferedWriter.write(entity.getGörevi());
//            personelbufferedWriter.write((int)entity.getOtelid());
//            personelbufferedWriter.write((int) entity.getYaş());
//            personelbufferedWriter.write((int) entity.getMaaş());
//            
//        } catch (IOException ex) {
//            Logger.getLogger(personelDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
        
   /* }

    @Override
    public List<personel> getall() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
    
}
