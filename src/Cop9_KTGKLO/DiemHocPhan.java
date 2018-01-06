/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop9_KTGKLO;

import java.util.Scanner;

/**
 *
 * @author CỌP
 */
public class DiemHocPhan extends HocPhan{
    private double diemCC;
    private double diemGK;
    private double diemCK;
    public DiemHocPhan() {
    }

    public DiemHocPhan(double diemCC, double diemGK, double diemCK, String maHP, String tenHP, int STC, int maSV, String hoTen, String ngaySinh, String matKhau) {
        super(maHP, tenHP, STC, maSV, hoTen, ngaySinh, matKhau);
        this.diemCC = diemCC;
        this.diemGK = diemGK;
        this.diemCK = diemCK;
    }
        

    public void setDiemCC(double diemCC) {
        this.diemCC = diemCC;
    }

    public void setDiemGK(double diemGK) {
        this.diemGK = diemGK;
    }

    public void setDiemCK(double diemCK) {
        this.diemCK = diemCK;
    }

    public double getDiemCC() {
        return diemCC;
    }

    public double getDiemGK() {
        return diemGK;
    }

    public double getDiemCK() {
        return diemCK;
    }
    public double TinhDiem(){                
        double dtb;
        return dtb=getDiemCC()*0.2+getDiemGK()*0.3+getDiemCK()*0.5;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm chuyên cần: ");
        diemCC=Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm giữa kỳ: ");
        diemGK=Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm cuối kỳ: ");
        diemCK=Double.parseDouble(sc.nextLine());               
        
    }
    public void Xuat(){
        System.out.printf("%-5.2f %-5.2f %-5.2f %-5.2f",diemCC,diemGK,diemCK,TinhDiem());
    }   
}
