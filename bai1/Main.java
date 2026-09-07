/**
 * 
 */
package bai1;

/**
 * 
 */
public class Main {
	public static void main(String[] args) {
        // Khai báo và cấp phát bộ nhớ cho mảng số nguyên gồm 5 phần tử
        int[] numbers = new int[5];

        // Gán giá trị cho các phần tử trong mảng
        numbers[0] = 10;
        numbers[1] = 25;
        numbers[2] = 7;
        numbers[3] = 40;
        numbers[4] = 12;

        System.out.println("=== KET QUA XU LY MANG JAVA ===");

        int sum = 0;
        // Duyệt mảng sử dụng thuộc tính .length
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Phan tu tai vi tri " + i + " la: " + numbers[i]);
            sum += numbers[i];
        }

        // Ép kiểu nguyên sang thực để tính trung bình cộng chính xác
        double average = (double) sum / numbers.length;

        System.out.println("Tong cac phan tu = " + sum);
        System.out.println("Gia tri trung binh = " + average);
    }

}



