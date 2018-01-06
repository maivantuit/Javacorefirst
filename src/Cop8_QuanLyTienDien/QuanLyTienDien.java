/*
    Quản lý tiền điện của của khách hàng.
1. Khách hàng: Mã KH,Tên KH,Số Nhà, Mã Công Tơ
2. Biên Lai Tính Tiền: Số củ, số mới, số tiền trả.
3. Viết chương trình quản lý biên lai tính tiền điện
    + Nhập vào n danh sach khách hàng sử dụng điện
    + Hiển thị danh sách khách hàng có SỬ DỤNG ĐIỆN
    ----------------------DANH SÁCH KHÁCH HÀNG SỬ DỤNG ĐIỆN
    Họ Tên      Số Nhà      Mã Công Tơ      Chỉ số Cũ       Chỉ sô Mới      Số Tiền Trả
    A           12          666             10              20              60000
    A           12          666             10              20              60000
    A           12          666             10              20              60000
4. Phân tích
    + Ta có Khách Hàng đã có các thuộc tính đó.
    + Biên Lai chứa những thông tin khách hàng, suy ra Bien Lai phải thừa kề lại Khách Hàng, khi nhập danh sách Khách Hàng
*/
package Cop8_QuanLyTienDien;
import java.util.Scanner;

public class QuanLyTienDien {

    public static void main(String[] args) {
        BienLai danhsachkh[] = null;
        int luachon=0;
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Nhập n hộ khách hàng sử dụng điện");
            System.out.println("2. Hiển thị danh sách hộ khách hàng sử dụng điện");
            System.out.println("3. Kết thúc");
            
            System.out.println("Mời bạn nhập lựa chọn: ");
            luachon = Integer.parseInt(sc.nextLine());
            
            switch(luachon){
                case 1:{
                    System.out.println("Nhập vào số lượng hộ khách hàng: ");
                    n=Integer.parseInt(sc.nextLine());
                    danhsachkh= new BienLai[n];
                    for(int i=0;i<danhsachkh.length;i++){
                        System.out.println("--------->Nhập hộ khách hàng: "+(i+1));
                        danhsachkh[i] = new BienLai();  
                        danhsachkh[i].NhapTT();
                    }
                    break;
                }
                case 2:{
                    System.out.println("------------Thông tin danh sách hộ khách hàng------------------");
                    System.out.printf("\n%-20s %-20s %-20s %-20s %-20s %-20s","Họ Tên","Số Nhà","Mã Công Tơ","Chỉ Số Cũ","Chỉ Số Mới","Số Tiền Trả");
                    for(int i=0;i<danhsachkh.length;i++){
                        danhsachkh[i].XuatTT();
                    }
                    System.out.println();
                    break;
                }
                case 3:{
                    break;
                }
                
            }
            
        } while (luachon != 3);
    }
}
