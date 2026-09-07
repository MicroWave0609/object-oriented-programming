package baithuchanh01;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nhập bán kính hình tròn (r): ");
        double r = scanner.nextDouble();

   
        if (r <= 0) {
            System.out.println("Bán kính phải lớn hơn 0!");
        } else {
           
            double chuVi = 2 * Math.PI * r;
            double dienTich = Math.PI * Math.pow(r, 2);

         
            System.out.printf("Chu vi hình tròn = %.2f\n", chuVi);
            System.out.printf("Diện tích hình tròn = %.2f\n", dienTich);
        }

        scanner.close();
    }

}


 