/*
 * Để quản lý các hộ dân trong một khu phố, người ta quản lý các thông tin như sau:
    -	Với mỗi hộ dân, có các thuộc tính:
            + Số thành viên trong hộ ( số người)
            + Số nhà của hộ dân đó ( Số nhà được gắn cho mỗi hộ dân)
            + Thông tin về mỗi cá nhân trong hộ gia đình.
    -	Với mỗi cá nhân, người ta quản lý các thông tin như: họ và tên, tuổi, năm sinh, nghề nghiệp.
1. Hãy xây dựng các lớp: NhanSu để quản lý thông tin về mỗi cá nhân; lớp HoDan để quản lý thông tin về các hộ gia đình. Viết các phương thức để nhập, hiển thị thông tin cho mỗi cá nhân.
2. Cài đặt chương trình thực hiện các công việc sau:
+ Nhập vào một dãy gồm n hộ dân (n - nhập từ bàn phím).
+ Hiển thị ra màn hình thông tin về các hộ trong khu phố.
 	Yêu cầu : Xử lí ngoại lệ .
-Phân tích: 1 Khu phố có nhiều hộ dân, mỗi hộ dân có mỗi thành viên trong hộ dân, mỗi thành viên đó có các thuộc tính: họ và tên, tuổi, năm sinh, nghề nghiệp.
    . Ta có 1 mảng hộ dân, 1 mảng thành viên trong nhà.

 */
package Cop7_QuanLyHoDan;

import java.util.Scanner;

public class NhanSu {
    private String hoTen;
    private int tuoi;
    private int namSinh;
    private String ngheNghiep;
    public NhanSu() {
    }

    public NhanSu(String hoTen, int tuoi, int namSinh, String ngheNghiep) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
        this.ngheNghiep = ngheNghiep;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }
    public void NhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên thành viên: ");
        hoTen=sc.nextLine();
        System.out.println("Nhập tuổi thành viên: ");
        tuoi=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập năm sinh thành viên: ");
        namSinh=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập nghề nghiệp thành viên: ");
        ngheNghiep=sc.nextLine();
    }
    public void HienThiTT(){
        System.out.printf("\n %-20s %-10d %-10d %-20s",hoTen,tuoi,namSinh,ngheNghiep);
    }    
}
