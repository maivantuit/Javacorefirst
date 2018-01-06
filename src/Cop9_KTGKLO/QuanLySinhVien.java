/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop9_KTGKLO;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CỌP
 */
public class QuanLySinhVien {

    public static void main(String[] args) {
        int luachon = 0;
        int n=0;
        int Arraysv[];
        int Arrayhp[];
        int Arraydhp[];
        ArrayList<SinhVien> danhsachsv = new ArrayList<SinhVien>();
        ArrayList<HocPhan> danhsachhp = new ArrayList<HocPhan>();
        ArrayList<DiemHocPhan> danhsachdhp = new ArrayList<DiemHocPhan>();
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
                    n = Integer.parseInt(sc.nextLine());
                    Arraysv = new int[n];
                    for (int i = 0; i < Arraysv.length; i++) {
                        System.out.println("--------Nhập thông tin sinh viên thứ: " +(i+1));
                        SinhVien sv = new SinhVien();
                        sv.Nhap();
                        danhsachsv.add(sv);
                    }                    
                    System.out.println("------Danh sách sinh viên vừa nhập-------");
                    for (int i = 0; i < danhsachsv.size(); i++) {
                        danhsachsv.get(i).Xuat();
                    }
                    System.out.println();
                    break;
                }
                case 2: {          
                    System.out.println("Nhập số lượng môn học: ");
                    n= Integer.parseInt(sc.nextLine());
                    Arrayhp=new int[n];
                    for(int i=0;i<Arrayhp.length;i++){
                        System.out.println("--------Nhập thông tin môn thứ:  "+(i+1));
                        HocPhan hp = new HocPhan();
                        hp.Nhap();
                        danhsachhp.add(hp);  
                        System.out.println("--------Nhập điểm môn thứ: "+(i+1));
                        DiemHocPhan dhp = new DiemHocPhan();
                        dhp.Nhap();
                        danhsachdhp.add(dhp);                        
                    }                                       
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.println("---------Thông Tin Sinh Viên Vừa Cập Nhập---------");
                    break;
                }
                case 4: {

                    break;
                }
            }

        } while (luachon != 4);

    }
}
