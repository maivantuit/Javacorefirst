package Cop5_QuanLySach;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {

    public static void main(String[] args) {
        ArrayList<Sach> danhsach = new ArrayList<Sach>();
        int n = 0;
        int luachon = 0;
        int[] Array = null;
        Scanner sc = new Scanner(System.in);
        menu();
        do {
            try {
                System.out.println("Mời bạn nhập lựa chọn");
                luachon = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Bạn vui lòng nhập số nguyên từ 1-4");
            }
            switch (luachon) {
                case 1: {
                    System.out.println("Nhập số lượng sách");
                    n = Integer.parseInt(sc.nextLine());
                    Array = new int[n];//mảng lưu trữ n sách
                    for (int i = 0; i < Array.length; i++) {
                        System.out.println("----------------------Nhập sách: " + (i + 1));
                        Sach s = new Sach();// mỗi lần chạy thêm 1 đối tượng vào danh sách
                        s.NhapTT();
                        danhsach.add(s);
                    }
                    menu();
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("\t\t---------Danh Sách Quyển Sách----------");
                    System.out.printf("\t\t%-20s %-20s %-10s", "Tên Sách", "Tên Tác Giả", "Năm Xuất Bản");
                    for (int i = 0; i < danhsach.size(); i++) {
                        danhsach.get(i).HienThiTT();
                    }
                    System.out.println();
                    menu();

                    break;
                }
                case 3: {
                    int nam;
                    int dem = 0;// ý nghĩa là: mình nhập năm vào mà trong danh sách k có năm đó thì sao                    
                    System.out.println("Nhập vào năm xuất bản");
                    nam = Integer.parseInt(sc.nextLine());
                    System.out.println("\t\t---------Danh Sách Quyển Sách Đã Liệt Kê----------");
                    System.out.printf("\t\t%-20s %-20s %-10s", "Tên Sách", "Tên Tác Giả", "Năm Xuất Bản");
                    for (int i = 0; i < danhsach.size(); i++) {
                        if (nam > danhsach.get(i).getNamXB()) {
                            danhsach.get(i).HienThiTT();
                            dem++;
                        }

                    }
                    if (dem == 0) {
                        System.out.println("\nKhông có sản phẩm theo tìm kiếm của bạn"+nam);
                    }

                    System.out.println();
                    menu();
                    break;
                }
                case 4: {
                    break;
                }
            }
        } while (luachon != 4);
    }

    public static void menu() {
        System.out.println("1. Nhập danh sách quyển sách");
        System.out.println("2. Hiển thị danh sách quyển sách");
        System.out.println("3. Liệt kê sách xuất bản trước n(n:Năm nhập vào)");
        System.out.println("4. Kết thúc");
    }
}
