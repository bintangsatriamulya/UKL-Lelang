package com.mycompany.lelangukl;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BINTANX KUN
 */
public class Masyarakat implements User{
    private ArrayList <String> namaMasyarakat = new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> telepon = new ArrayList<>();
    
    public Masyarakat(){
        
        //Pelelang Pertama
         this.namaMasyarakat.add("Richo Wibowo");
         this.alamat.add("Jakarta Selatan");
         this.telepon.add("088812987645");
         
         //Pelelang Kedua
         this.namaMasyarakat.add("Steven");
         this.alamat.add("Jakarta Pusat");
         this.telepon.add("08889512345");
                   
    }

    @Override
    public void setNama(String nama) {
        this.namaMasyarakat.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelep(String telepon) {
       this.telepon.add(telepon);
    }

    @Override
    public String getNama(int Id) {
        return this.namaMasyarakat.get(Id);
    }

    @Override
    public String getAlamat(int Id) {
        return this.alamat.get(Id);
    }
       
    @Override
    public String getTelep(int Id) {
        return this.telepon.get(Id);  
    }
    
    public int getMasyarakat(){
        return this.namaMasyarakat.size();
    }
          
}
