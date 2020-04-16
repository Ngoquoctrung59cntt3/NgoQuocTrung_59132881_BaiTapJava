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
public class XeNgoaiThanh extends ChuyenXe{
    private String NoiDen;
    private int SoNgayDiDuoc;
    public XeNgoaiThanh(){
    }
    public XeNgoaiThanh(String NoiDen, int SoNgayDiDuoc, String MaSoChuyen, String HoTenTX, String SoXe, double DoanhThu) {
        super(MaSoChuyen, HoTenTX, SoXe, DoanhThu);
        this.NoiDen = NoiDen;
        this.SoNgayDiDuoc = SoNgayDiDuoc;
    }
    @Override
    public void xuat() {
        super.xuat(); 
        System.out.println("Nơi đến:"+NoiDen+"\n"+"Số ngày đi được:"+SoNgayDiDuoc+"\n");
    }   
}