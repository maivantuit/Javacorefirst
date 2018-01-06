package Cop5_QuanLySach;

import java.util.Scanner;

public class Sach {

    private String tenSach;
    private String tenTacGia;
    private int namXB;

    public Sach() {
    }

    public Sach(String tenSach, String tenTacGia, int namXB) {
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.namXB = namXB;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public int getNamXB() {
        return namXB;
    }

    public void NhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sách: ");
        tenSach = sc.nextLine();
        System.out.println("Nhập tên tác giả:  ");
        tenTacGia = sc.nextLine();
        while (true) {
            try {
                System.out.println("Nhập năm xuất bản: ");
                namXB = Integer.parseInt(sc.nextLine());
                if(namXB<0){
                    throw new NumberFormatException();
                }
                break;
            }catch(Exception e){
                System.out.println("Bạn vui lòng nhập năm là 1 số nguyên dương");
            }
        }

    }

    public void HienThiTT() {
        System.out.printf("\n\t\t%-20s %-20s %-10d ", tenSach, tenTacGia, namXB);
    }
}
