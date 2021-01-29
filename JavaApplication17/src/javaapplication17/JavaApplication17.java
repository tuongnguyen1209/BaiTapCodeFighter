/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.println("===menu===");
            System.out.println("1.bai 1");
            System.out.println("2.Bai 2");
            System.out.println("0.Thoat");
            System.out.println("Ban chon");
            int lChon=scan.nextInt();
            switch(lChon){
                case 1->{bai1();}
                case 2->{bai2(scan);}
                case 0->{break;}
                default->{System.out.println("Nhap lai");}
            }
        }
    }
    static void bai1(){
        String s="lonbalxballpoon";
        String w="ballon";
        
        System.out.println("Chuoi s: "+s);
        System.out.println("Chuoi w: "+w);
        
        String[] arr1=s.split("");
        String[] arr=w.split("");
        int count=Integer.MAX_VALUE;
        int i=0;
        for (String a : arr) {
            for (String b : arr1) {
                if (a.equals(b)) {
                    i++;
                }
            }
            count=(i<=count)?i:count;
            i=0;
        }
        System.out.println("So luong tu rieng biet duoc tao thanh la: "+count);
    }
    
    static void bai2(Scanner scan){
        System.out.println("Nhap vao dien tich");
        
        int s=scan.nextInt();
        ArrayList<Canh> list=new ArrayList<>();
        list.add(new Canh(s,1));
        
        for (int i = 2; i <=Math.sqrt(s); i++) {
            double c;
            if (s%i==0) {
                c=s/i;
                Canh canh;
                if (c>i) 
                   canh= new Canh(c, i);
                else
                    canh=new Canh(i, c);
                boolean check=true;
                for (Canh ch : list) {
                    if (ch.equals(canh)) {
                        check=false;
                        break;
                    }
                }
                
                if (check) {
                    list.add(canh);
                }
            }
        }
        
        list.sort((v1,v2)->{
            return v1.soSanh()-v2.soSanh();
        });
        
        
        
        System.out.println("Cap gia tri thoa dieu kien la: "+list.get(0));
    }
}
