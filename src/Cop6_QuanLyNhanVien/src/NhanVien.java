package Cop6_QuanLyNhanVien.src;

import java.util.Scanner;

public class NhanVien {
    private int maNV;
    private String hoTen;
    private int namSinh;
    private String loaiNV;
    private int mucLuong;
    private double hesoLuong;
    private int luongcoBan;
    //-----------------------------------------------------------------
    public NhanVien(){
        
    }
    public NhanVien(int maNV, String hoTen, int namSinh, String loaiNV, int mucLuong, double hesoLuong, int luongcaBan) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.loaiNV = loaiNV;
        this.mucLuong = mucLuong;
        this.hesoLuong = hesoLuong;
        this.luongcoBan = luongcoBan;
    }

    public int getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getLoaiNV() {
        return loaiNV;
    }

    public int getMucLuong() {
        return mucLuong;
    }

    public double getHesoLuong() {
        return hesoLuong;
    }

    public int getLuongcaBan() {
        return luongcoBan;
    }
    //---------------------------------------------------------------------

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setLoaiNV(String loaiNV) {
        this.loaiNV = loaiNV;
    }

    public void setMucLuong(int mucLuong) {
        this.mucLuong = mucLuong;
    }

    public void setHesoLuong(double hesoLuong) {
        this.hesoLuong = hesoLuong;
    }

    public void setLuongcaBan(int luongcoBan) {
        this.luongcoBan = luongcoBan;
    }
    //----------------------------------------------------------------------
    public void Nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập họ tên nhân viên: ");
        setHoTen( input.nextLine());     
        System.out.println("Nhập mã nhân viên: ");
        maNV= input.nextInt();        
        System.out.println("Nhập năm sinh nhân viên: ");
        this.namSinh= input.nextInt();        
        System.out.println("Nhập mức lương của nhân viên: ");
        this.mucLuong= input.nextInt();
         System.out.println("Nhập hệ số lương của nhân viên:");
        this.hesoLuong= input.nextDouble();        
        System.out.println("Nhập loại nhân viên: ");
        this.loaiNV= input.nextLine();               
        System.out.println("Nhập lương cơ bản nhân viên:");
        this.luongcoBan= input.nextInt();
        
    }
    public void HienThi(){
        System.out.println("Mã Nhân Viên: "+maNV);
        System.out.println("Họ Tên Nhân Viên: "+hoTen);
        System.out.println("Năm Sinh Nhân Viên: "+this.namSinh);
        System.out.println("Loại Nhân Viên: "+this.loaiNV);
        System.out.println("Mức lương của nhân viên: "+this.mucLuong);
        System.out.println("Hệ số lương của nhân viên: "+this.hesoLuong);
        System.out.println("Lương cơ bản: "+this.luongcoBan);
    }
}
