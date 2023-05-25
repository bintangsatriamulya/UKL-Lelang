/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lelangukl;

/**
 *
 * @author BINTANX KUN
 */
public class Laporan {
    
    //Data Masyarakat
    public void laporanMasyarakat(Masyarakat masyarakat){
        int m=masyarakat.getMasyarakat();
        
        System.out.println("=======---Info Client---=======");
         for(int i=0;i < m;i++){
         System.out.println("Yang Terhormat Tuan/Nyonya \t: "+masyarakat.getNama(i) +"\nDengan Alamat : " + masyarakat.getAlamat(i) +"\nNomor Telp. : " + masyarakat.getTelep(i));
             System.out.println( );
        }  
    }
    
    //Data Petugas
    public void laporanMasyarakat(Petugas petugas){
        int i = 0;

        System.out.print("PETUGAS : ");
        System.out.println("\nNama Petugas : "+petugas.getNama(i));
        System.out.println("Alamat Petugas: " + petugas.getAlamat(i));
        System.out.println("No Telp : " + petugas.getTelep(i));
        System.out.println("__________________________________________________");
    }
    
    //Data Barang
     public void laporanMasyarakat(Barang barang){
        int x = barang.getBarang();

        System.out.println("Barang");
        for(int i=0;i < x;i++){

            System.out.println("Id Barang   : " + barang.getId(i) +"\nDengan Nama : " + barang.getNamaBarang(i) +"\nSeharga     : Rp." + barang.getHarga(i) +"\nBerstatus   : "+ barang.getStatus(i));
            System.out.println();

        }
    }
}
