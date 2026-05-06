/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percobaanmethod2;
import java.util.Scanner;
/**
 *
 * @author MH STORE
 */
public class PercobaanMethod2 {
    public double luas_lingkaran(int diameter) {
        int jari2 = diameter / 2;
        return Math.PI * Math.pow(jari2, 2);
    }
    public double volume_tabung(int diameter, int tinggi) {
        int jari2 = diameter / 2;
        return Math.PI * Math.pow(jari2, 2) * tinggi;
    }
    public double volume_kerucut(int diameter, int tinggi) {
        int jari2 = diameter / 2;
        return (1.0 / 3) * Math.PI * Math.pow(jari2, 2) * tinggi;
    }
    public double volume_bola(int diameter) {
        int jari2 = diameter / 2;
        return (4.0 / 3) * Math.PI * Math.pow(jari2, 3);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        PercobaanMethod2 mt = new PercobaanMethod2();
        
        System.out.print("Masukkan diameter: ");
        int diameter = input.nextInt();

        System.out.print("Masukkan tinggi (untuk tabung & kerucut): ");
        int tinggi = input.nextInt();

        System.out.println("\n=== HASIL ===");
        System.out.printf("Luas Lingkaran = %.2f%n ",mt.luas_lingkaran(diameter));
        System.out.printf("Volume Tabung  = %.2f%n ",mt.volume_tabung(diameter, tinggi));
        System.out.printf("Volume Kerucut = %.2f%n ",mt.volume_kerucut(diameter, tinggi));
        System.out.printf("Volume Bola    = %.2f%n ",mt.volume_bola(diameter));

        System.exit(0);
    }
} 