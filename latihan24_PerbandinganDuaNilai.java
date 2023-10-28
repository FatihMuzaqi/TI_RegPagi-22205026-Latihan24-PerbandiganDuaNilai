package tipedata;
import java.util.Scanner;
public class latihan24_PerbandinganDuaNilai {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String ulangi;
        do {
            System.out.println("======== PROGRAM PERBANDINGAN DUA BUAH NILAI =========");
            System.out.print("Masukan Nilai Pertama : ");
            int nilai = input.nextInt();
            System.out.print("Masukan Nilai Ke Dua : ");
            int nilai2 = input.nextInt();
            if(nilai > nilai2 ){
                System.out.println("=====================================");
                System.out.println("Hasil : " + nilai + " Lebih Dari " + nilai2);
            }else if(nilai < nilai2 ){
                System.out.println("=====================================");
                System.out.println("Hasil : " + nilai + " Kurang Dari " + nilai2);
            }else {
                System.out.println("=====================================");
                System.out.println("Hasil : " + nilai + " Sama Dengan " + nilai2);
                System.out.println("=====================================");
                }
            System.out.print("Ulang y/n : ");
            ulangi = input.next();
            
        }while(ulangi.equals("y"));
            System.out.println("Program Selesai");
        }
    }
    
