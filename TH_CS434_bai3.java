
package testrv_1;

import java.util.Scanner;

public class TH_CS434_bai3 {

    public static void main(String[] args) {
        // TODO code application logic here
        //tính diện tích
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        System.out.println("mời nhập chiều dài: ");
        a=Double.parseDouble(sc.nextLine());
        System.out.println("mời nhập chiều rộng: ");
        b=Double.parseDouble(sc.nextLine());
        System.out.println("Diện tích cần tìm là: " + a*b);
    }
}
