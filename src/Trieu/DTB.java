/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trieu;

/**
 *
 * @author CỌP
 */
public class DTB {
    public static double dtbc(double[]dtb,int[] stc) {
        double td = 0;
        int ttc = 0;
        for (int i = 0; i < stc.length; i++) {
            td += dtb[i] * stc[i];
            ttc += stc[i];
        }
        return td / ttc;
    }
}
