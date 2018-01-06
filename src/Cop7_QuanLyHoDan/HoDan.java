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
*/
package Cop7_QuanLyHoDan;
import java.util.Scanner;

public class HoDan extends NhanSu{
    private int soThanhVien;
    private String soNha;
    NhanSu[]danhsach=null;
    public HoDan() {
    }
    public HoDan(int soThanhVien, String soNha, String hoTen, int tuoi, int namSinh, String ngheNghiep) {
        super(hoTen, tuoi, namSinh, ngheNghiep);
        this.soThanhVien = soThanhVien;
        this.soNha = soNha;
    }
    @Override
    public void NhapTT(){
        Scanner sc = new Scanner(System.in);       
        System.out.println("Nhập số thành viên(số hộ dân): ");
        soThanhVien =Integer.parseInt(sc.nextLine());
        danhsach=new NhanSu[soThanhVien];// lưu trữ số lượng thành viên
        System.out.println("Nhập số nhà của hộ dân: ");
        soNha=sc.nextLine();
        for(int i=0;i<danhsach.length;i++){
            System.out.println("----------Thành viên"+(i+1));
            danhsach[i]=new NhanSu();// tạo ra 1 đối tượng là 1 ô nhà mỗi khi nó chạy
            danhsach[i].NhapTT();
        }
    }
    @Override
    public void HienThiTT(){
        System.out.println("---------------Thông Tin Hộ Dân--------------");
        System.out.println("Số thành viên(số hộ dân): "+soThanhVien);
        System.out.println("Số nhà: "+soNha);
        System.out.printf(" %-20s %-10s %-10s %-20s","Họ Tên","Tuổi","Năm Sinh","Nghề Nghiệp");
        for(int i=0;i<danhsach.length;i++){                        
            danhsach[i].HienThiTT();            
        }
    }
   
    
    
}
