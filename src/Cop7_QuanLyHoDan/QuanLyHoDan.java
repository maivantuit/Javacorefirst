package Cop7_QuanLyHoDan;

import java.util.Scanner;

public class QuanLyHoDan {

    public static void main(String[] args) {
        HoDan[] danhsachhd = null;//*
        int n;// số hộ dân
        int luachon = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Nhập thông tin cho n hộ dân");
            System.out.println("2. Hiển thị thông tin hộ dân trong khu phố");
            System.out.println("3. Kết thúc");
            System.out.println("Mời bạn nhập lựa chọn");
            luachon = Integer.parseInt(sc.nextLine());
            switch (luachon) {
                case 1: {
                    System.out.println("-----------QUẢN LÝ HỘ DÂN-----------");
                    System.out.println("Nhập số hộ dân trong khu phố");
                    n = Integer.parseInt(sc.nextLine());
                    danhsachhd = new HoDan[n];
                    for (int i = 0; i < danhsachhd.length; i++) {
                        System.out.println("---------Hộ dân " + (i + 1));
                        danhsachhd[i] = new HoDan();
                        danhsachhd[i].NhapTT();// this method is of HoDan *
                    }
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("---------Danh Sách Hộ Dân Trong Khu Phố----------");
                    for (int i = 0; i < danhsachhd.length; i++) {
                        System.out.println("\nHộ dân: "+(i+1));
                        danhsachhd[i].HienThiTT();
                    }
                    System.out.println();
                    break;
                }
                case 3: {
                    break;
                }
            }
        } while (luachon != 3);
    }

}
