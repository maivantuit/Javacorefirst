/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trieu;

import java.util.Scanner;

/**
 *
 * @author CỌP
 */
public class TongChuoi {
    int n;
    int tong = 0;

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số n: ");
        n = sc.nextInt();
    }

    public void TinhTongChuoi() {
        for (int i=0;i<=n;i++ ) {
            tong=tong+i;
        }
        System.out.println("Tổng chuổi là: "+tong);
    }

    public static void main(String[] a) {
        TongChuoi tc = new TongChuoi();
        tc.Nhap();
        tc.TinhTongChuoi();
    }

}
