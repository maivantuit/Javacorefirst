package LoChien;

import java.util.Scanner;

public class Chuyen10Sang4 {
    static void KiemTra(double n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        n = sc.nextDouble();
        if (n >= 5.5 && n < 7.0) {
            System.out.println("Dải điểm 4: từ 2.0=> 2.5");
        } else if (n >= 7.0 && n < 8.0) {
            System.out.println("Dải điểm 4: từ 2.5 => 3.2");
        } else if (n >= 8.0 && n < 9.0) {
            System.out.println("Dải điểm 4: từ 3.2 => 3.6");
        } else if (n > 9 && n <= 10) {
            System.out.println("Dải điểm 4: từ 3.6 => 4");
        }
        if (n < 5.5 && n > 10) {
            System.out.println("Nhập dữ liệu không hợp lệ, vui lòng nhập lại!");
        }
    }

    public static void main(String[] args) {
        double n = 0;
        
        KiemTra(n);
    }
    /*
    TEST
    Nhập 7
    Nhập n: 
    7
    Dải điểm 4: từ 2.5 => 3.2
     */

}
