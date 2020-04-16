/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author Trung_PC
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinhVienPoly svpoly = new SinhVienIT(7, 8, 6,"Ngô Quốc Trung");
        SinhVienIT svit = new SinhVienIT(9, 10, 7, "Nguyễn Viết Hưng");
        SinhVienBiz svbiz = new SinhVienBiz(8, 8.3, "Nguyễn Ngọc Thanh");
        svpoly.xuat();
        svit.xuat();
        svbiz.xuat();
    }
    
}