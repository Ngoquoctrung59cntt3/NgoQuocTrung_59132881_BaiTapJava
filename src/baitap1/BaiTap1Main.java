/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author Trung_PC
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien("Ngô Quốc Trung", 21, "Tam Quan", 1500000, 200);
        NhanVien nhanVien2 = new NhanVien("Nguyễn Viết Hưng", 21, "Phú Yên", 2500000, 150);
        System.out.println(nhanVien1.getThongTin()+"Tiền Thưởng:"+nhanVien1.tinhThuong());
        System.out.println(nhanVien2.getThongTin()+"Tiền Thưởng:"+nhanVien2.tinhThuong());
    }
    
}