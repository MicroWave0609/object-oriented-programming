import java.util.Scanner;

public class Bai5{
    private int n;
    private int[]a;

    public void nhap(Scanner sc){
        System.out.print("Nhap so luong phan tu n =");
        n = sc.nextInt();
        a = new int[n];

        for (int i = 0;i < n;i++){
            System.out.print("a[" + i + "] =");
            a[i] = sc.nextInt();
        }
    }

    public void timMaxMin(){
        if (n <= 0) return;

        int max = a[0];
        int viTriMax = 0;
        int min = a[0];
        int viTriMin = 0;

        for (int i = 0;i < n;i++){
            if (a[i] > max){
                max = a[i];
                viTriMax = i;
            }
            if (a[i] < min){
                min = a[i];
                viTriMin = i;
            }
        }
        System.out.println("Gia tri Max: " + max + " (tai vi tri a[" + viTriMax + "])");
        System.out.println("Gia tri Min: " + min + " (tai vi tri a[" + viTriMin + "])");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Bai5 maxmin = new Bai5();
        maxmin.nhap(sc);
        maxmin.timMaxMin();

        sc.close();
    }











}

