/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anh.util;

import java.util.Scanner;
/**
 *
 * @author HP
 */
// đây là Class, Khuôn, chứa, có đặc điểm/hành động, chứa các món đồ chơi dùng chung
// cho mọi nơi - vì nó ko nhớ cái gì cho riêng tư nó
// LIBRARY/FRAMEWORK - chứa các hàm/biến(data) dùng chung cho nhiều công việc khác nhau
// của các dự án khác nhau
public class MyToys {
    // đặc điểm/hành vi là static, cho người ta sử dụng thì thêm public
    // ko có cái gì của riêng mình
    // Một class bình thường thì vẫn có thể vừa static vừa non-static, tùy nhu cầu, cách thức
    // Math: hầu hết static
    // String: vừa non-static, vừa có static
    // System: hầu hết static
    public static final double PI = 3.1415;
    // final ~ constant bên C, biến ko cho thay đổi value, trừ lần đầu tiên khai báo
    // HẰNG SỐ
    
    // đẩy Scanner ra ngoài xài chung cho các hàm static của chúng ta
    private static Scanner sc = new Scanner(System.in);
    // private cho nhu cầu nội bộ bên trong
    
    
    // Trong quá trình làm app, việc nhập số là lặp lại nhiều lần
    // nhập 2 cạnh của 1 hình chữ nhật, 3 cạnh hình tam giác, nhập sư lựa chọn menu 1..5, điểm trung bình,...
    // mỗi cú nhập, biến nhập, kèm theo: trôi lệnh, cà chớn - try-catch - do-while
    // ta hứng kết quả trả về từ hàm, lấy để dùng, MyToys nhớ con số này làm gì
    // Math.sqrt(4) -> mình dùng, Math ko cần nhớ, ko cần nhớ non-static
    // new mà trả về kết quả cho người ta, ko cần nhớ, dùng nhiều Ram làm gì -> STATIC thượng sách
    public static int getAnInteger() {
        int n; // hứng từ bàn phím gõ gì
        //Scanner sc = new Scanner(System.in);
        
        do {
            try {
                System.out.print("Input an integer: ");
                n = Integer.parseInt(sc.nextLine());
                // có thể xài if ở đây để phòng trường hợp nhập ngoài biên
                return n;
            } catch (Exception e) {
                System.out.println("Do you know how to input an integer?");
                
            }
        } while (true);
    }
  
    //DI: Dependency Injection
    public static int getAnInteger(String inputMsg) {
        int n; // hứng từ bàn phím gõ gì

        do {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                // có thể xài if ở đây để phòng trường hợp nhập ngoài biên
                return n;
            } catch (Exception e) {
                System.out.println("Do you know how to input an intege from 1 -> 7");
                
            }
        } while (true);
    }
    
    
    
}
