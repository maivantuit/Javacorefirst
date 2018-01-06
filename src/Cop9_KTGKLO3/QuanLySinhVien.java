/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop9_KTGKLO3;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CỌP
 */
public class QuanLySinhVien {

    public static void main(String[] args) {
        int luachon = 0;
        int n = 0;
        DiemHocPhan danhsachd[] = null;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-----------QUẢN lÝ SINH VIÊN----------");
            System.out.println("1. Nhập thông tin sinh viên");
            System.out.println("2. Nhập điểm sinh viên");
            System.out.println("3. In ra thông tin sinh viên và điểm");
            System.out.println("4. Kết thúc");
            System.out.println("Mời bạn nhập lựa chọn!");
            luachon = Integer.parseInt(sc.nextLine());
            switch (luachon) {
                case 1: {
                    System.out.println("Nhập số lượng sinh viên: ");
                    n=Integer.parseInt(sc.nextLine());
                    danhsachd= new DiemHocPhan[n];
                    for(int i=0;i<danhsachd.length;i++){
                        System.out.println("Nhập sinh viên: "+(i+1));
                        danhsachd[i]= new DiemHocPhan();
                        danhsachd[i].Nhap();
                    }
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("--------Danh Sach Sinh Vien---------");
                    for(int i=0;i<danhsachd.length;i++){
                        danhsachd[i].Xuat();                        
                    }
                    System.out.println();
                    break;
                }
                case 3: {

                    break;
                }
                case 4: {

                    break;
                }
            }

        } while (luachon != 4);

    }
}
