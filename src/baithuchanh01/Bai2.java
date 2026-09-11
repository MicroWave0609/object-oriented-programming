package baithuchanh01;

import java.util.Scanner;

public class Bai2 {
    private double a;
    private double b;

    public void nhap(Scanner sc){
        System.out.print("Nhap he so a:");
        a = sc.nextDouble();
        System.out.print("Nhap he so b:");
        b = sc.nextDouble();

    }

    public void giaiPhuongTrinh(){
        if (a == 0){
            if (b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double nghiem = -b/a;
            System.out.println("Phuong trinh co nghiem duy nhat: "  + nghiem);        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Bai2 pt = new Bai2();

        pt.nhap(sc);
        pt.giaiPhuongTrinh();

        sc.close();
    }
}