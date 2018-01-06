package LoChien;
import java.util.Scanner;
public class End {    
    public static void Nhap(double diem[],int stc[], int n) {
              Scanner nhap = new Scanner(System.in);
              System.out.print("Nhập số môn học: ");
              n = nhap.nextInt();                 
              for (int i = 0; i < n; i++) {
              System.out.print("Nhập điểm môn học thứ "+(i+1)+": " );
                 diem[i] = nhap.nextDouble();
              System.out.print("Nhập số tín chỉ môn học thứ " + (i+1) + ": ");
                 stc[i] = nhap.nextInt();
             }
    }
    public static double DiemTrungBinh(double[] diem, int[] stc) {
             double tongdiem = 0;
             int tongtinchi = 0;
             for (int i = 0; i < diem.length; i++) {
             if (diem[i] >= 4) {
                tongdiem += diem[i] * stc[i];
                tongtinchi += stc[i];
            }
    }                                       
             return (tongdiem / tongtinchi);
    }
   public static void KiemTra(double dtb) {        
        if (dtb >= 8.5 && dtb <= 10) {
            System.out.println("Điển 4: 4");
        } else if (dtb >= 7.0 && dtb <= 8.4) {
            System.out.println("Điển 4: 3");
        } else if (dtb  >=5.5 && dtb < 7.0) {
            System.out.println("Điển 4: 2");
        } else if (dtb > 4.0 && dtb < 5.5) {
            System.out.println("Điển 4: 1");
        }
        if (dtb < 4.0 && dtb > 10) {
            System.out.println(" Dư liệu không hợp lệ!");
        }
    }
    public static void main(String[] arg) {          
        double diem[]  = new double[100];
        int stc[]= new int[100];
        int n=0;
        double dtb;
        Nhap(diem,stc,n);
        DiemTrungBinh(diem,stc);
        System.out.println("Điểm trung bình là: "+DiemTrungBinh(diem,stc));
        KiemTra(DiemTrungBinh(diem,stc));
             
    }
}
/*
Nhập số môn học: 2
Nhập điểm môn học thứ 1: 8
Nhập số tín chỉ môn học thứ 1: 2
Nhập điểm môn học thứ 2: 7
Nhập số tín chỉ môn học thứ 2: 1
Điểm trung bình là: 7.666666666666667
Dải điểm 4: từ 2.5 => 3.2
*/