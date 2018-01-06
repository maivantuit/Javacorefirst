
package LoChien;

import java.util.Scanner;

public class DiemTrungBinh2 {
    double arraydiem[]=new double[100];
    int n;
    int arraystc[]=new int[100];
    int n2;
    public void NhapDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng điểm: ");
        n=sc.nextInt();
        arraydiem = new double[n];
            for(int i=0;i<arraydiem.length;i++){
            System.out.println("Nhập điểm thứ : "+(i+1));            
            arraydiem[i]= sc.nextDouble();
            
        }        
    }
    public void NhapSTC() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng tín chỉ: ");
        n2=sc.nextInt();
        arraystc = new int[n2];
        for(int i=0;i<arraystc.length;i++){
            System.out.println("Nhập tín chỉ thứ : "+(i+1));            
            arraystc[i]= sc.nextInt();            
        }        
    }
    public double TinhDiemTB(){
        double td=0;
        double ttc=0;
        for(int i=0;i<arraydiem.length;i++){
            td+=arraydiem[i]*arraystc[i];
            ttc+=arraystc[i];
        }
        return td/ttc;
    }
    public static void main(String[] args) {
        DiemTrungBinh2 ob = new DiemTrungBinh2();
        ob.NhapDiem();
        ob.NhapSTC();
        ob.TinhDiemTB();
        /*
        Tham khảo, đéo chạy đc, đéo hĩu lý do, thôi mệt
        
        */
    }
}
