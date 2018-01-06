package LoChien;

import java.util.Scanner;

public class DTB {
    double diem[];
    int stc[];
    int spt;

    public void bangdiem() {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số môn học: ");
        spt = nhap.nextInt();
        for (int i = 0; i < spt; i++) {
            System.out.print("Nhập điểm môn học thứ " + (i + 1) + ": ");
            diem[i] = nhap.nextDouble();
            System.out.print("Nhập số tín chỉ môn học thứ " + (i + 1) + ": ");
            stc[i] = nhap.nextInt();
        }
    }

    public static double dtb(double[] diem, int[] stc) {
        double tongdiem = 0;
        int tongtinchi = 0;
        for (int i = 0; i < diem.length; i++) {
            if (diem[i] >= 4) {
                tongdiem += diem[i] * stc[i];
                tongtinchi += stc[i];
            }
        }
        double dtb;
        return dtb = (tongdiem / tongtinchi);
    }

    static double KiemTra(double dtb) {

        int dtb2=0;
        if (dtb > 10 && dtb < 0) {
            return -1;
        }
        if (dtb > 8.5) {
            return 4;
        }
        if (dtb > 7.0) {
            return 3;
        }
        if (dtb > 6.0) {
            return 2;
        }
        if (dtb > 4) {
            return 1;
        }
        return dtb2;
    }

    public static void main(String[] arg) {
        DTB c = new DTB();
        double dtb2=0;
        c.bangdiem();
        double tg = DTB.dtb(c.diem, c.stc);
        System.out.println("Diem Trung Binh: " + tg);
        KiemTra(tg);

    }
}
