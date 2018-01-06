
package LoChien;
import Cop2_QuanLySinhVien.SinhVien;

import java.util.Scanner;
public class DiemTrungBinh {
    /*
    Dành cho danh sách đạc
    */
    static public void NhapDiem(double diem[], int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số môn học: ");
        n=sc.nextInt();  
        diem = new double[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhập điểm thứ môn thứ : "+(i+1));
            diem[i]=sc.nextDouble();
            
                 
        }                
    }
    static void NhapSTC(int stc[], int n){ 
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.println("Nhập  tín chỉ thứ: "+(i+1));
            stc = new int[n];
            stc[i]=sc.nextInt();
        }                
    }
    static double DiemTrungBinh(double diem[], int stc[]){
        double td=0,ttc=0;
        double dtb=0;
        for(int i=0;i<diem.length;i++){
            td+=diem[i]*stc[i];
            ttc+=stc[i];
            dtb=td/ttc;            
        }
        System.out.println("Điểm trung bình: "+dtb);
        return dtb;            
    }
    static void KiemTra(double dtb) {        
        if (dtb >= 5.5 && dtb < 7.0) {
            System.out.println("Dải điểm 4: từ 2.0=> 2.5");
        } else if (dtb >= 7.0 && dtb < 8.0) {
            System.out.println("Dải điểm 4: từ 2.5 => 3.2");
        } else if (dtb >= 8.0 && dtb < 9.0) {
            System.out.println("Dải điểm 4: từ 3.2 => 3.6");
        } else if (dtb > 9 && dtb <= 10) {
            System.out.println("Dải điểm 4: từ 3.6 => 4");
        }
        if (dtb < 5.5 && dtb > 10) {
            System.out.println("Nhập dữ liệu không hợp lệ, vui lòng nhập lại!");
        }
    }
    public static void main(String[] args) {
        double diem[]  = new double[100];
        int stc[]= new int[100];
        double dtb=0;
        int n=0,n2=0,n3=0;
        NhapDiem(diem,n);
        NhapSTC(stc,n);
        DiemTrungBinh(diem,stc);
        KiemTra(dtb);
        /*TEST
        tdb = (7*2+6*1)/(3)=6.666666666666667;
        Nhập số lượng điểm: 
        2
        Nhập điểm thứ: 1
        7
        Nhập điểm thứ: 2
        6
        Nhập số lượng tín chỉ: 
        2
        Nhập  tín chỉ thứ: 1
        2
        Nhập  tín chỉ thứ: 2
        1
        Điểm trung bình: 6.666666666666667
        */
    }
}
