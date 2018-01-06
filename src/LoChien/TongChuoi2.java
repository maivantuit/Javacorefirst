
package LoChien;

import java.util.Scanner;

public class TongChuoi2 {
    public static int tongChuoi(int n){
        int S=0;        
        for(int i=1;i<=n;i++){
            System.out.print(" "+i);
            S+=i;
        }        
        return S;
    }   
    public static void main(String[] args) {
        int so=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên: "); 
        so=sc.nextInt();        
        System.out.println("\nTổng chuổi: "+tongChuoi(so));
    }
}
