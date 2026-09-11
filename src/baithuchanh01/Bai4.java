package baithuchanh01;
import java.util.Scanner;
public class Bai4 {
   private int [] a;
   private int n; 

   public void nhap(Scanner sc){
    System.out.print("Nhap so luong phan tu n:");
    n = sc.nextInt();
    a = new int [n];

    for (int i = 0;i < n;i++){
        System.out.println("a[" + i + "] =" );
        a[i] = sc.nextInt();
    }
   }

   public  void sapXepDoiCho(){
    for (int i = 0;i < n - 1;i++){
        for (int j = i + 1;j < n;j++){
            if (a[i] > a[j]){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
   }

   public void xuat(){
    System.out.print("Mang sau khi sap xep tang dan:");
    for (int i = 0;i < n;i++){
        System.out.print(a[i] + " ");
    }
    System.out.println();
   }

   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    Bai4 sx = new Bai4();
    sx.nhap(sc);
    sx.sapXepDoiCho();
    sx.xuat();

    sc.close();
   }
}
