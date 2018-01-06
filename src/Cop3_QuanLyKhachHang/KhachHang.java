/*
1. Nhập vào n khách hàn
2. Hiển thị thông tin khách hàng        
3. Hiển thị khách hàng có tổng lương lớn hơn X(X; nhập từ bàn phím)        
*/
package Cop3_QuanLyKhachHang;
import java.util.Scanner;
public class KhachHang {
    private String maKH;
    private String hoTen;
    private int namSinh;
    private int tongLuong;
    public KhachHang() {
    }
    public KhachHang(String maKH){
        this.maKH=maKH;
    }
    public KhachHang(String maKH, String hoTen, int namSinh, int tongLuong) {
        //this.maKH = maKH;
        this.setMaKH(maKH);
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.tongLuong = tongLuong;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setTongLuong(int tongLuong) {
        this.tongLuong = tongLuong;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public int getTongLuong() {
        return tongLuong;
    }
    public void NhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã khách hàng");
        maKH = sc.nextLine();
        System.out.println("Nhập tên khách hàng");
        hoTen= sc.nextLine();
        System.out.println("Nhập năm sinh");
        namSinh =Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tổng lương");
        tongLuong =Integer.parseInt(sc.nextLine());                
    }
    public void HienThiTT(){
        System.out.printf("\n%-10s %-25s %-10d %-20d",maKH,hoTen,namSinh,tongLuong);
    }
    
}
