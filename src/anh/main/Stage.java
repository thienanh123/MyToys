/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anh.main;

import anh.util.MyToys;



/**
 *
 * @author HP
 */
public class Stage {
    
    public static void main(String[] args) {
        System.out.println("PI: " + MyToys.PI);
        
        // MyToys.PI = 4.0; // đây là khi chưa có final trong class bên kia
        // nếu ko có final -> hằng số PI có thể thay đổi bởi người dùng
        System.out.println("PI again: " + MyToys.PI);
        //int n = MyToys.getAnInteger();
        //System.out.println("Đây là số bạn nhập: " + n);
        int choice;
        choice = MyToys.getAnInteger("Mời nhập lựa chọn của bạn(1...7): ");
        System.out.println("Lựa chọn của bạn là (your choice): " + choice);
        
        
    
    }
    
}
