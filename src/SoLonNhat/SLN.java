/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoLonNhat;

/**
 *
 * @author CỌP
 */
public class SLN {
    public static void main(String[] args) {
        int a[]={6,5,4,3,100,5,4,6,7,9};
        int max;
        max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("Max: "+max);
        
    }
}
