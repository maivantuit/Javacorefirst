
package Cop8_QuanLyTienDien;

import java.util.Scanner;

public class BienLai extends KhachHang{
    private int soMoi;
    private int soCu;
    private int soTienTra;

    public BienLai() {
    }
    public BienLai(String hoTen, int soNha, int soCongTo,int soMoi,int soCu,int soTienTra ){
        super(hoTen,soNha,soCongTo);
        this.soMoi=soMoi;
        this.soCu=soCu;
        this.soTienTra=soTienTra;
    }
    @Override
    public void NhapTT(){
        Scanner sc = new Scanner(System.in);
        super.NhapTT();
        System.out.println("Nhập chỉ số cũ: ");
        soCu=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập chỉ số mới: ");
        soMoi=Integer.parseInt(sc.nextLine());        
    }
    @Override
    public void XuatTT(){
        super.XuatTT();
        System.out.printf("%-20d %-20d %-20.1f",soCu,soMoi,TinhTienDien());
    }
    public double TinhTienDien(){
        return soTienTra=(soMoi-soCu)*3000;
    }
//    public static void main(String[] args) {
//        BienLai b = new BienLai();
//        b.NhapTT();
//        System.out.printf("\n%-20s %-20s %-20s %-20s %-20s %-20s","Họ Tên","Số Nhà","Mã Công Tơ","Chỉ Số Cũ","Chỉ Số Mới","Số Tiền Trả");
//        b.XuatTT();
//    }
    
}
