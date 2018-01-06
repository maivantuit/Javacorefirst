
package Cop9_KTGKLO3;
import Cop9_KTGKLO.*;
import java.util.Scanner;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private String ngaySinh;
    private String matKhau;
    
    public SinhVien(){
        
    }
    public SinhVien(int maSV, String hoTen, String ngaySinh, String matKhau){
        this.maSV=maSV;
        this.hoTen=hoTen;
        this.ngaySinh=ngaySinh;
        this.matKhau=matKhau;                
    }
    public void SetMaSV(int maSV){
        this.maSV=maSV;
    }
    public void SetHoTen(String hoTen){
        this.hoTen=hoTen;        
    }
    public void SetNgaySinh(String ngaySinh){
        this.ngaySinh=ngaySinh;
    }
    public void SetMatKhau(String matKhau){
        this.matKhau=matKhau;
    }
    public int GetMaSV(){
        return this.maSV;
    }
    public String GetHoTen(){
        return this.hoTen;
    }
    public String GetNgaySinh(){
        return this.ngaySinh;
    }
    public String GetMatKhau(){
        return this.matKhau;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        maSV=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập họ tên sinh viên: ");
        hoTen=sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        ngaySinh=sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        matKhau=sc.nextLine();
    }
    public void Xuat(){
        System.out.printf("\n%-10d %-20s %-15s %-20s",maSV,hoTen,ngaySinh,matKhau);
    }   
}
