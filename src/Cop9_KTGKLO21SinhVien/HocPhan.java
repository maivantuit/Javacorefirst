package Cop9_KTGKLO21SinhVien;

import java.util.Scanner;

public class HocPhan extends Diem {

    private String maHP;
    private String tenHP;
    private int STC;
    HocPhan[] danhsachhp = null;
    int soHP;

    public HocPhan() {
    }

    public HocPhan(String maHP, String tenHP, int STC, int soHP, double diemCC, double diemGK, double diemCK) {
        super(diemCC, diemGK, diemCK);
        this.maHP = maHP;
        this.tenHP = tenHP;
        this.STC = STC;
        this.soHP = soHP;
    }

    public void setMaHP(String maHP) {
        this.maHP = maHP;
    }

    public void setTenHP(String tenHP) {
        this.tenHP = tenHP;
    }

    public void setSTC(int STC) {
        this.STC = STC;
    }

    public String getMaHP() {
        return maHP;
    }

    public String getTenHP() {
        return tenHP;
    }

    public int getSTC() {
        return STC;
    }

    public int TongTinChi() {
        int ttc = 0;

        return ttc;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã học phần: ");
        maHP = sc.nextLine();
        System.out.println("Nhập tên học phần: ");
        tenHP = sc.nextLine();
        System.out.println("Nhập số tín chỉ học phần: ");
        STC = Integer.parseInt(sc.nextLine());
        super.Nhap();

    }

    public void Xuat() {
        System.out.printf("%-10s %-20s %-5s %-5s %-5s %-5s %-5s %-5s","Mã HP","Tên HP","STC","ĐCC","ĐGK","ĐCK","ĐTB","D4\n");
        System.out.printf("%-10s %-20s %-5d", maHP, tenHP, STC);
        super.Xuat();
        System.out.println("\n");

    }
}
