
package LoChien;

import java.util.Scanner;
public class TongChuoi {
    public static int tongChuoi(int n){
        int S=0;
        for(int i=1;i<=n;i++){
            S+=i;
        }
        return S;
    }
   static int Nhap(int so){
        Scanner sc = new Scanner(System.in);        
        return sc.nextInt();
    }
    public static void main(String[] args) {
        int nhapso=0;
        System.out.println("Nhập số nguyên: ");    
        System.out.println("Tổng chuổi: "+tongChuoi(Nhap(nhapso)));
    }
}
