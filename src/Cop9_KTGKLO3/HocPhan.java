
package Cop9_KTGKLO3;


import java.util.Scanner;

public class HocPhan extends SinhVien{
    private String maHP;
    private String tenHP;
    private int STC;

    public HocPhan() {
    }

    public HocPhan(String maHP, String tenHP, int STC, int maSV, String hoTen, String ngaySinh, String matKhau) {
        super(maSV, hoTen, ngaySinh, matKhau);
        this.maHP = maHP;
        this.tenHP = tenHP;
        this.STC = STC;
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
    
    @Override
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã học phần: ");
        maHP= sc.nextLine();
        System.out.println("Nhập tên học phần: ");
        tenHP=sc.nextLine();
        System.out.println("Nhập số tín chỉ: ");
        STC=Integer.parseInt(sc.nextLine());        
    }
    @Override
    public void Xuat(){
        System.out.printf("%-10s %-30s %-5s",maHP,tenHP,STC);
    }            
}
