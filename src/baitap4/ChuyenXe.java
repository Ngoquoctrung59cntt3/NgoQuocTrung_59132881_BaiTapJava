/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author Trung_PC
 */
public class ChuyenXe {
    private String MSChuyen;
    private String HoTenTX;
    private String SoXe;
    double DT;
    public ChuyenXe(){
    }
    public ChuyenXe(String MaSoChuyen, String HoTenTX, String SoXe, double DoanhThu) {
        this.MSChuyen = MaSoChuyen;
        this.HoTenTX = HoTenTX;
        this.SoXe = SoXe;
        this.DT = DoanhThu;
    }

    public double getDoanhThu() {
        return DT;
    }

    public void setDoanhThu(double DoanhThu) {
        this.DT = DoanhThu;
    }
    public void xuat() {
        System.out.println("Mã số chuyến:"+MSChuyen+"\n"+"Họ tên tài xế:"+HoTenTX
                            +"\n"+"Số xe:"+SoXe+"\n"+"Doanh thu:"+DT);
    }
}