/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lelangukl;

import java.util.ArrayList;

/**
 *
 * @author BINTANX KUN
 */
public class Petugas implements User {
      private ArrayList <String> namaPetugas = new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> telepon = new ArrayList<>();
    
    public Petugas(){
        
        //Petugas Lelang
         this.namaPetugas.add("Agus Hermawan");
         this.alamat.add("Surabaya");
         this.telepon.add("08812345678");
         
             
    }

    @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
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
        return this.namaPetugas.get(Id);
    }

    @Override
    public String getAlamat(int Id) {
        return this.alamat.get(Id);
    }
       
    @Override
    public String getTelep(int Id) {
        return this.telepon.get(Id);  
    }
    
    public int getMasyaralat(){
        return this.namaPetugas.size();
    }
    
}
