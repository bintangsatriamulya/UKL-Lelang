/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lelangukl;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author BINTANX KUN
 */
public class Lelang implements Stok{
    private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();
    
    
    boolean keluarlelang=true;
    boolean proseskeluarlelang=true;
    
    public void prosesLelang(Barang barang, Masyarakat masyarakat, int Index,Petugas petugas){
        Scanner input = new Scanner (System.in);
        
        do{
            
        System.out.print("Masukkan id Petugas : ");
	int Petugas = input.nextInt();
         if (Petugas > 0 ) {
                System.out.println("System Error \n Data Tidak Valid");
         }  
         else{
	System.out.println("Petugas Bernama : " + petugas.getNama(Petugas));
        System.out.println("");
  
            System.out.println("Apakah Anda Ingin Memulai Lelang ? true/false");
            System.out.print("Pilihan : ");
            boolean mulailelang = input.nextBoolean();
            
                        
                
           if (mulailelang == false) {
                System.out.println("Lelang Belum Dimulain");
            }
            else{
                System.out.println();   
           //proses input barang
        System.out.print("Masukan Id Barang : ");
        Index=input.nextInt();
        this.idBarang.add(Index);
        
            if (Index > idBarang.size()) {
                System.out.println("Nomor Barang Tidak Tersedia Disistem");
            }
            else{
                System.out.println("Id Barang :"+barang.getId(Index)+"\nNama Barang : "+barang.getNamaBarang(Index)+"\nHarga Awal : "+barang.getHarga(Index)+"\nStatus Barang : "+barang.getStatus(Index));  
                
             while (proseskeluarlelang){
                 
                 //proses lelang
                 if (barang.getStatus(Index) == false) {
                     System.out.println("Barang Tersebut Sudah Tidak Tersedia");
                 }
                 else if (Index > 1){
                     System.out.println("Id Barang Tidak Tersedia");
                 }
                 
                 //input data pelanggan
                 System.out.println("=====-----Data Pelanggan-----=====");
                 System.out.println("Masukan Id Anda : ");
                 int penawar = input.nextInt();
                 this.idPenawar.add(penawar);
                 System.out.println("");
                 if (penawar > 1) {
                     System.out.println("Masukan Id yang Valid !!!");
                     
                 }
                
                 else{
                     barang.getHarga(Index);
                     System.out.println("Yang Tehormat Tuan/Nyonya : "+masyarakat.getNama(Index));
                     do{
                     System.out.println("Masukan Harga Penawaran Tuan/Nyonya : ");
                     int hargaTawar=input.nextInt();
                     
                     int max=80000000;
                     if (barang.getHarga(Index) < hargaTawar) {
                         if (max < hargaTawar) {
                             max=hargaTawar;
                             setId(penawar);
                             setHarga(hargaTawar);
                         }else {
                             System.out.println("Mohon Maaf Sudah Ada Penawar Yang Lebih Tinggi");
                         }
                         
                     }else{
                         System.out.println("Mohon Masukan Diatas Harga Awal !!");
                     }
                    System.out.println("--------------------------------------------------\n");

                    System.out.println("Apakah Ada Yang Ingin Menawar Lebih? true/false ");
                    System.out.print("Pilihan : ");
                    keluarlelang = input.nextBoolean();
                     System.out.println("");
                    
                     if (!keluarlelang && (max > barang.getHarga(Index))) {
                         barang.editStatus(Index, false);
                         System.out.println("-----Hasil Lelaang-----");
                         System.out.print("Id Barang : " + barang.getId(Index) +"\nDengan Nama: " + barang.getNamaBarang(Index) +"\nHarga Awal : " + barang.getHarga(Index) +"\nBerstatus: " + barang.getStatus(Index) +"\nDengan Harga : " + max +"\n--------------------------------------------------\n");
                     }
                      }while(keluarlelang == true);
                     if (barang.getStatus(Index) == false) {
                         System.out.println("Barang " + barang.getNamaBarang(Index) + " Sudah terjual");
                         break;
                     }
                 
                 }
              break;
             }
            }
            }
        }
            
            System.out.println("Apakah Anda Ingin Menutup Lelang ? true/false");
            System.out.println("Masukan Pilihan : ");
            keluarlelang=input.nextBoolean();
        }while(keluarlelang);
             
    }
 
     public void setIdBarang(Barang barang, int Index){
        this.idBarang.add(barang.getId(Index));
    }

    @Override
    public void setHarga(int harga) {
        this.hargaTawar.add(harga);
    }
       

    @Override
    public void setId(int Id) {
        this.idPenawar.add(Id);
    }
        

    @Override
    public int getHarga(int Index) {
        return this.hargaTawar.get(Index);
    }
        

    @Override
    public int getId(int Index) {
        return this.idPenawar.get(Index);
    }
 
}
