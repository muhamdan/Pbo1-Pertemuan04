/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops;

/**
 *
 * @author user
 */
public class Do {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 225;
        
        System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
        System.out.println("Isi Gelas Ketika Penuh : " + penuh + "ml");
        
        do {
           isiGelas++;
            System.out.println("Sedang Mengisi Gelas..");
            System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
        }while(isiGelas != penuh);
        
        System.out.println("Finale: Isi Gelas Sekarang :" + isiGelas + "ml");
    }
}
