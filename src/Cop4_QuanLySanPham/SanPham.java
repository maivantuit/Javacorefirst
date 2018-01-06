/*
1. Nhập danh sách sản phẩm từ bàn phím(tên và giá sản phẩm)
2. Sắp xếp giảm dần theo giá và xuất ra màn hình
3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím
4. Xuất giá trung bình của các sản phẩm
*/
package Cop4_QuanLySanPham;

import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private double gia;
    public SanPham() {
    }

    public SanPham(String tenSP, double gia) {
        this.tenSP = tenSP;
        this.gia = gia;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getGia() {
        return gia;
    }
    public void NhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm");
        tenSP =sc.nextLine();
        System.out.println("Nhập giá sản phẩm");
        gia= Double.parseDouble(sc.nextLine());        
    }
    public void HienThiTT(){
        /*
        Tên Sản phẩm    Giá
        Java            12000
        */
        System.out.printf("\n %-20s %-10.3f",tenSP,gia);// của C đặc tả., hổ trợ 20 kí tự cho họ tên(s: String), giá(f: double)
    }
}
