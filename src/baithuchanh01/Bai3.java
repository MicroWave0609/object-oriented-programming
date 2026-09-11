package baithuchanh01;

import java.util.Scanner;

public class Bai3 {
    private int[] a;
    private int n;

    public void nhap(Scanner sc){
        System.out.print("Nhap so luong phan tu n =");
        n = sc.nextInt();
        a = new int[n] ;
        for (int i = 0;i < n;i++){
            System.out.print("a[" + i + "] =");
            a[i] = sc.nextInt();
        }
    }

    public void demChanLe(){
        int demChan = 0, demLe = 0;
        for (int i = 0;i < n;i++){
            if(a[i] % 2 == 0) demChan++;
            else demLe++;
        }
    System.out.println("So luong so chan:" + demChan);
    System.out.println("So luong so le:" + demLe);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Bai3 m = new Bai3();
        m.nhap(sc);
        m.demChanLe();

        sc.close();
    }
}
