/*
1. Nhập danh sách sinh viên
2. Hiển thị danh sách sinh viên        
3. Tìm sinh viên có điểm trung bình cao nhất        
4. Sắp xếp sinh viên theo điểm tăng dần theo điểm trung bình
5. Tìm kiếm sinh viên theo mã sinh viên        
6. Xóa sinh viên theo mã sinh viên        
*/
package Cop2_QuanLySinhVien;
import java.util.Scanner;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private int namSinh;
    private double diemhk1,diemhk2;
    public SinhVien() {
    }    
    public SinhVien(String maSV, String hoTen, int namSinh, double diemhk1, double diemhk2) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemhk1 = diemhk1;
        this.diemhk2 = diemhk2;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public double getDiemhk1() {
        return diemhk1;
    }

    public double getDiemhk2() {
        return diemhk2;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public void setDiemhk1(double diemhk1) {
        this.diemhk1 = diemhk1;
    }
    public void setDiemhk2(double diemhk2) {
        this.diemhk2 = diemhk2;
    }
    public void NhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        hoTen=sc.nextLine();
        System.out.println("Nhập mã sinh viên: ");
        maSV =sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        namSinh = sc.nextInt();
        System.out.println("Nhập điểm hk 1:  ");
        diemhk1=sc.nextDouble();
        System.out.println("Nhập điểm hk 2:  ");
        diemhk2=sc.nextDouble();
    }
    public double DiemTB(){
        double dtb=(diemhk1+diemhk2)/2; 
        return dtb;
    }   
    public void HienThiTT(){
        /*
        Ho ten          Masv        nam sinh    điemTB
        Mai Van Tu      1512        1995        8.7
        Do Minh Chien   1513        1996        8.9
        */
        System.out.printf("\n%-20s %-15s %-10d %-10.1f",hoTen,maSV,namSinh,DiemTB());//đây là đặc tả của printf, đây chính giá trị
    }
    
}
