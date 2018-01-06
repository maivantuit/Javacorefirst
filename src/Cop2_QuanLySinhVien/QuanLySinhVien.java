package Cop2_QuanLySinhVien;

import java.util.Scanner;

public class QuanLySinhVien {

    public static void main(String[] args) {
        SinhVien danhsach[] = null;
        int n;// so sinh vien
        int luachon;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("|-----------------------------------------------------------");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm sinh viên có điểm trung bình cao nhất");
            System.out.println("4. Sắp xếp sinh viên theo điểm tăng dần theo điểm trung bình");
            System.out.println("5. Tìm kiếm sinh viên theo mã sinh viên.");
            System.out.println("6. Xóa sinh viên theo mã sinh viên");
            System.out.println("7. Kết thúc");
            System.out.println("------------------------------------------------------------");
            System.out.println("Mời bạn nhập lựa chọn:  ");
            luachon = Integer.parseInt(sc.nextLine());
            switch (luachon) {
                case 1: {
                    System.out.println("Nhập số lượng sinh viên");
                    n = Integer.parseInt(sc.nextLine());
                    danhsach = new SinhVien[n];// lưu n sinh viên, minh da ban khoan
                    for (int i = 0; i < danhsach.length; i++) {
                        System.out.println("***Sinh viên thứ: " + (i + 1));
                        danhsach[i] = new SinhVien();//muốn xây nhà thì phải có đất, mỗi lần lặp sẽ tạo 1 sinh viên
                        danhsach[i].NhapTT();
                    }

                    break;
                }
                case 2: {
                    System.out.println("\t\t--------Danh Sách Sinh Viên--------");
                    System.out.printf("\n%-20s %-15s %-10s %-10s", "Họ Tên", "Mã Sinh Viên", "Năm Sinh", "Điểm Trung Bình");
                    for (int i = 0; i < danhsach.length; i++) {
                        danhsach[i].HienThiTT();
                    }
                    System.out.println();// tạo thêm 1 dòng nữa. mục đích cho Mời nhập xuống dòng.                    
                    break;
                }
                case 3: {
                    System.out.println("----------SINH VIÊN CÓ ĐIỂM TB CAO NHẤT-----------");
                    System.out.printf("%-20s %-15s %-10s %-10s", "HỌ TÊN", "MÃ SV", "NĂM SINH", "ĐIỂM TB MAX");//đây là đặc tả của printf, đây chính giá trị    
                    double diemMax = danhsach[0].DiemTB();
                    for (int i = 0; i < danhsach.length; i++) {
                        if (diemMax < danhsach[i].DiemTB()) {
                            diemMax = danhsach[i].DiemTB();                            
                        }                        
                    }                                        
                    //System.out.printf("\n%-20s %-15s %-10d %-10f",danhsach[0].getHoTen(),danhsach[0].getMaSV(),danhsach[0].getNamSinh(),diemMax);
                    System.out.println();
                    break;
                }
                case 4: {
                    System.out.println("-----------SINH VIÊN CÓ ĐIỂM TRUNG BÌNH TĂNG DẦN-----------");
                    System.out.printf("%-20s %-15s %-10s %-10s", "HỌ TÊN", "MÃ SV", "NĂM SINH", "ĐIỂM TB MAX");//đây là đặc tả của printf, đây chính giá trị    
                    for(int i=0; i<danhsach.length-2;i++){
                        for(int j=i+1; j<danhsach.length-1;j++){
                            if(danhsach[i].DiemTB()>danhsach[j].DiemTB()){
                                SinhVien temp = danhsach[i];
                                danhsach[i]=danhsach[j];
                                danhsach[j]=temp;
                            }                            
                        }                        
                    }
                    for (int i = 0; i < danhsach.length; i++) {
                        danhsach[i].HienThiTT();
                    }
                    System.out.println();// tạo thêm 1 dòng nữa. mục đích cho Mời nhập xuống dòng.                    
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    break;
                }
                case 7: {
                    break;
                }

            }
        } while (luachon != 7);
    }

}
