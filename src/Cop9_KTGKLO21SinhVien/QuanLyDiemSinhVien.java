package Cop9_KTGKLO21SinhVien;

import java.util.Scanner;

public class QuanLyDiemSinhVien {

    private String tieude;
    private String[] mChon;
    private int cm;

    public QuanLyDiemSinhVien() {
    }

    public QuanLyDiemSinhVien(String tieude, String[] mChon) {
        this.tieude = tieude;
        this.mChon = mChon;
    }
//------------------------------------------------

    public void display() throws Exception {
        System.out.println(tieude);
        for (int i = 0; i < mChon.length; i++) {
            System.out.println((i + 1) + "." + mChon[i]);
        }

    }
//-----------------------------------------------    

    public int getselected() throws Exception {
        display();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMời chọn: ");
        return cm = sc.nextInt();
    }

    public void execute(int cm) throws Exception {
        switch (cm) {
            case 1:
                SinhVien sv = new SinhVien();
                sv.Nhap();                
                HocPhan hp = new HocPhan();
                hp.Nhap();
                sv.Xuat();
                hp.Xuat();
                break;
            case 3:
             
                break;

            case 2:
                System.exit(0);
                break;
        }
    }

    public void run() throws Exception {
        while (true) {
            int mc = getselected();
            execute(cm);
        }
    }

    //---------------------------------------------------    
    public static void main(String[] a) throws Exception {

        String tieude = ("\n------------------QUẢN LÝ ĐIỂM SINH VIÊN-----------------");
        String[] mChon = {"Nhập và hiển thông tin sinh viên", "Kết thúc"};
        QuanLyDiemSinhVien menu = new QuanLyDiemSinhVien(tieude, mChon);
        menu.run();
    }
}
