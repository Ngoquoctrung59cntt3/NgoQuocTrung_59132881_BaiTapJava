/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;
import baitap1.NhanVien;
/**
 *
 * @author Trung_PC
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        IQuanLy qlnv = new QuanLyNhanVien();
        NhanVien nhanVien1 = new NhanVien("Ngô Quốc Trung", 21, "Tam Quan", 2500000, 120);
        NhanVien nhanVien2 = new NhanVien("Nguyễn Viết Hưng", 21, "Phú Yên", 3000000, 150);
        NhanVien nhanVien3 = new NhanVien("Huỳnh Thế Minh", 21, "An Nhơn", 3500000, 180);
        NhanVien nhanVien4 = new NhanVien("Nguyễn Ngọc Thanh", 21, "Phú Yên", 2500000, 195);
        NhanVien nhanVien5 = new NhanVien("Nguyễn Văn Đồng", 21, "Sông Cầu", 1500000, 190);
        qlnv.them(nhanVien1);
        qlnv.them(nhanVien2);
        qlnv.them(nhanVien3);
        qlnv.them(nhanVien4);
        qlnv.them(nhanVien5);
        qlnv.inDS();
} 
}