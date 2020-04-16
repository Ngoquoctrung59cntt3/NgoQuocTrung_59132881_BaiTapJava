/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;


import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ltpnt
 */
public class QuanLyChuyenXe {
    List<ChuyenXe> dsChuyenXe = new ArrayList<>();
    void themChuyenXe(ChuyenXe chuyenXe) {
        
        dsChuyenXe.add(chuyenXe);
    }
    
    void xuatDS() {       
        for(ChuyenXe chuyenXe: dsChuyenXe) {
            chuyenXe.xuat();
        }
    }
    
    double tinhDoanhThuNoiThanh() {
        double s = 0;
        for(ChuyenXe chuyenXe: dsChuyenXe) {
            if(chuyenXe instanceof XeNoiThanh) {
                s = s + chuyenXe.getDoanhThu();
            }
        }
        return s;
    }
    
    double tinhDoanhThuNgoaiThanh() {
        double tong = 0;
        for(ChuyenXe chuyenXe: dsChuyenXe) {
            if(chuyenXe instanceof XeNgoaiThanh) {
                tong = tong + chuyenXe.getDoanhThu();
            }
        }
        return tong;
    }
}