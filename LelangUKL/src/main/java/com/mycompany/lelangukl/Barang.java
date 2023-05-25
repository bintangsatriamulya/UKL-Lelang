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
public class Barang implements Stok{
    private ArrayList  <Integer> IdMasyarakat = new ArrayList();
    private ArrayList  <String> namaBarang = new ArrayList();
    private ArrayList  <Integer> hargaAwal = new ArrayList();
    private ArrayList  <Boolean> status = new ArrayList();
    
    
    public Barang(){
       addBarang(0,"MOBIL HONDA MOBILIO",80000000);
        System.out.println();
       addBarang(1,"Mobil Mazda CX-5 2.0",110000000);
    }
    public void addBarang(int Id, String namaBarang, int harga){
        setId(Id);
        setHarga(harga);
        setNamaBarang(namaBarang);
        setStatus(true);
 
    }

      public void setId(int id) {
        this.IdMasyarakat.add(id);
      }
      
      public void setNamaBarang(String namaBarang){
          this.namaBarang.add(namaBarang);
      }
      public void setStatus(boolean status){
          this.status.add(status);
      }
      public void editStatus(int Index,boolean status){
          this.status.set(Index, status);
      }
      
    @Override
    public void setHarga(int harga) {
       this.hargaAwal.add(harga);
    }

    @Override
    public int getHarga(int Index) {
       return this.hargaAwal.get(Index);
    }

    @Override
    public int getId(int Index) {
        return this.IdMasyarakat.get(Index);
        
    }
    public String getNamaBarang(int Index){
        return this.namaBarang.get(Index);
    }
    public boolean getStatus(int Index){
        return this.status.get(Index);
    }
    public int getBarang(){
        return this.namaBarang.size();
    }
    
}
