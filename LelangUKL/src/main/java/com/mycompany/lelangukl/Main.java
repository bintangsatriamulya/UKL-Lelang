/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lelangukl;

/**
 *
 * @author BINTANX KUN
 */
public class Main {
    public static void main(String[] args) {
        
        Masyarakat masyarakat = new Masyarakat();
        Petugas petugas = new Petugas();
        Barang barang = new Barang();
        Lelang lelang = new Lelang();
        Info ingpo = new Info();
        
        
      ingpo.awal();
      ingpo.laporanMasyarakat(barang);
      ingpo.laporanMasyarakat(masyarakat);
      ingpo.laporanMasyarakat(petugas);
      lelang.prosesLelang(barang, masyarakat, 0, petugas);
      ingpo.Akhir();
 
        
    }
}
