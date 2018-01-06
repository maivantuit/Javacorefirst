package Cop3_QuanLyKhachHang;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyKhachHang {

    public static void main(String[] args) {
        int[] Array;
        ArrayList<KhachHang> danhsach = new ArrayList<KhachHang>();
        int n;// số lượng khách hàng
        int luachon;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Nhập vào n khách hàng");
            System.out.println("2. Hiển thị thông tin khách hàng");
            System.out.println("3. Hiển thị khách hàng có tổng lương lớn hơn X(X; nhập từ bàn phím)");
            System.out.println("4. Kết thúc");
            System.out.println("Mời bạn nhập vào lựa chọn");
            try {
                luachon = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                luachon = 0;
                System.out.println("Bạn vui lòng nhập số nguyên");
            }
            switch (luachon) {
                case 1: {
                    System.out.println("Nhập vào số lượng khách hàng");
                    n = Integer.parseInt(sc.nextLine());
                    Array = new int[n];// tạo lập số lượng phần tử trong mảng
                    for (int i = 0; i < Array.length; i++) {
                        KhachHang KH = new KhachHang();
                        System.out.println("------------------Nhập khách hàng: " + (i + 1));
                        KH.NhapTT();
                        danhsach.add(KH);
                    }
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("---Thông tin khách hàng có trong danh sách---");
                    System.out.printf("%-10s %-25s %-10s %-20s","Mã KH","Họ Tên KH","Năm Sinh","Tổng Lương");
                    for (int i = 0; i < danhsach.size(); i++) {
                        danhsach.get(i).HienThiTT();                        
                    }
                    System.out.println();
                    break;
                }
                case 3: {
                    int x;// 2 biến khác nhau hoàn toàn
                    System.out.println("Nhập vào tổng lương");
                    x = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < danhsach.size(); i++) {
                        if (x <= danhsach.get(i).getTongLuong()) {// vì bỏ private, lý do sử dụng set và get
                            System.out.println("Khách hàng có tổng lương > " + x + " là: ");
                            danhsach.get(i).HienThiTT();
                        }
                    }
                    System.out.println();
                    break;
                }
                case 4: {
                   
                    break;
                }
            }
        } while (luachon
                != 4);

    }

}
