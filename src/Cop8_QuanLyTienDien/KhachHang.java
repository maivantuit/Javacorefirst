
package Cop8_QuanLyTienDien;

import java.util.Scanner;

public class KhachHang {
    private String hoTen;
    private int soNha;
    private int soCongTo;

    public KhachHang() {
    }

    public KhachHang(String hoTen, int soNha, int soCongTo) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.soCongTo = soCongTo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getSoNha() {
        return soNha;
    }

    public int getSoCongTo() {
        return soCongTo;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public void setSoCongTo(int soCongTo) {
        this.soCongTo = soCongTo;
    }
    public void NhapTT(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Nhập họ tên khách hàng: ");
        hoTen=sc.nextLine();
        System.out.println("Nhập số nhà khách hàng: ");
        soNha=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mã số công tơ: ");
        soCongTo=Integer.parseInt(sc.nextLine());
    }
    public void XuatTT(){
        System.out.printf("\n%-20s %-20d %-20d",hoTen,soNha,soCongTo);
    }
}
