package Cop4_QuanLySanPham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLySanPham {

    public static void main(String[] args) {
        ArrayList<SanPham> danhsachsp = new ArrayList<SanPham>();
        int n = 0;// số lượng sản phẩm
        int luachon = 0;
        int[] Array;// lưu trữ số lượng sản phẩm tạm thời
        Scanner sc = new Scanner(System.in);
        menu();
        do {
            try {
                System.out.println("Nhập lựa chọn của bạn: ");
                luachon = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Bạn vui lòng nhập vào một số nguyên");
            }
            switch (luachon) {
                case 1: {
                    /*
                    Số lượng sản phẩm có âm không, hỏi lại người dùng
                    Lỗi ngoại lệ:
                        + Có những lỗi bắt được bằng try catch
                        + Nhưng có những lỗi thì phải ném ra mới bắt đc.
                        
                     */
                    while (true) {
                        try {
                            System.out.println("Nhập vào số lượng sản phẩm");
                            n = Integer.parseInt(sc.nextLine());
                            if (n < 0) {
                                throw new NegativeArraySizeException();
                            }
                            break;
                        } catch (NegativeArraySizeException e) {
                            System.out.println("Bạn đã nhập số âm, vui lòng nhập số nguyên");
                        } catch (Exception e) {
                            System.out.println("Bạn vui lòng nhập vào một số nguyên");
                        }
                    }

                    Array = new int[n];// mảng chứa số n nhập vào, rồi mới lấy length nó chứ
                    for (int i = 0; i < Array.length; i++) {
                        SanPham sp = new SanPham();
                        System.out.println("--------------Nhập sản phẩm:  " + (i + 1));
                        sp.NhapTT();
                        danhsachsp.add(sp);
                    }
                    System.out.println();
                    menu();
                    break;
                }
                case 2: {
                    Collections.sort(danhsachsp, (SanPham sp1, SanPham sp2) -> {
                        if (sp1.getGia() < sp2.getGia()) {
                            return 1;
                        } else if (sp1.getGia() == sp2.getGia()) {
                            return 0;
                        } else {
                            return -1;
                        }

                    });
                    System.out.println("---------Danh sách sau khi sắp xếp giảm dần theo giá---------");
                    System.out.printf("%-20s %-10s", "Tên Sản Phẩm", "Giá"); // đây chỉ là tiêu đề
                    for (int i = 0; i < danhsachsp.size(); i++) {
                        danhsachsp.get(i).HienThiTT();
                    }
                    System.out.println();
                    menu();
                    break;
                }
                case 3: {
                    String tenSP;
                    int dem = 0;
                    System.out.println("Tên sản phẩm cần xóa: ");
                    tenSP = sc.nextLine();
                    for (int i = 0; i < danhsachsp.size(); i++) {
                        if (tenSP.equalsIgnoreCase(danhsachsp.get(i).getTenSP())) {
                            danhsachsp.remove(danhsachsp.get(i));
                            dem++;
                            break;
                        }
                    }
                    if (dem == 0) {
                        System.out.println("Không có sản phẩm bạn cần xóa");
                    }
                    System.out.println("---------Danh sách sau khi xóa----------");
                    System.out.printf("%-20s %-10s", "Tên Sản Phẩm", "Giá"); // đây chỉ là tiêu đề
                    for (int i = 0; i < danhsachsp.size(); i++) {
                        danhsachsp.get(i).HienThiTT();
                    }
                    System.out.println();
                    menu();
                    break;
                }
                case 4: {
                    double gttb = 0;
                    int dem = 0;
                    for (int i = 0; i < danhsachsp.size(); i++) {
                        gttb = gttb + danhsachsp.get(i).getGia();//
                        dem++;
                    }
                    gttb = gttb / dem;
                    System.out.println("Giá trị trung bình các sản phẩm là: " + gttb);
                    System.out.println();
                    menu();
                    break;
                }
                case 5: {
                    String tenSP;
                    int dem = 0;
                    System.out.println("Nhập vào tên cần tìm kiếm: ");
                    tenSP = sc.nextLine();
                    System.out.println("---------Danh sách sản phẩm theo tìm kiếm----------");
                    System.out.printf("%-20s %-10s", "Tên Sản Phẩm", "Giá"); // đây chỉ là tiêu đề
                    for (int i = 0; i < danhsachsp.size(); i++) {
                        if (tenSP.equalsIgnoreCase(danhsachsp.get(i).getTenSP())) {
                            danhsachsp.get(i).HienThiTT();
                            dem++;
                        }
                    }
                    if (dem == 0) {
                        System.out.println("Không có sản phẩm theo tìm kiếm của bạn");
                    }
                    System.out.println();
                    menu();
                    break;
                }
                case 6: {
                    String tenSP;
                    System.out.println("Nhập vào tên sản phẩm cần sửa: ");
                    tenSP = sc.nextLine();
                    for (int i = 0; i < danhsachsp.size(); i++) {
                        if (tenSP.equalsIgnoreCase(danhsachsp.get(i).getTenSP())) {
                            danhsachsp.get(i).NhapTT();
                        }
                    }
                    System.out.println("---------Danh sách sau khi sửa----------");
                    System.out.printf("%-20s %-10s", "Tên Sản Phẩm", "Giá"); // đây chỉ là tiêu đề
                    for (int i = 0; i < danhsachsp.size(); i++) {
                        danhsachsp.get(i).HienThiTT();
                    }
                    System.out.println();
                    menu();
                    break;
                }
            }
        } while (luachon != 7);

    }

    public static void menu() {
        System.out.println("1. Nhập danh sách sản phẩm");
        System.out.println("2. Hiển thị danh sách sản phẩm giảm dần theo giá");
        System.out.println("3. Tìm và xóa sản phẩm theo tên");
        System.out.println("4. Xuất giá trị trung bình các sản phẩm");
        System.out.println("5. Tìm và hiển thị sản phẩm theo tên( và giá)");
        System.out.println("6. Sửa thông tin sản phẩm theo tên");
        System.out.println("7. Thoát chương trình");

    }

}
