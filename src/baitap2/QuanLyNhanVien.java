/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;
import baitap1.NhanVien;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ltpnt
 */
public class QuanLyNhanVien implements IQuanLy{
    List<NhanVien> dsNhanVien = new ArrayList<>();

    @Override
    public void them(NhanVien nv) {
        dsNhanVien.add(nv);
    }

    @Override
    public void inDS() {
        for(NhanVien nhanVien: dsNhanVien) {
            System.out.println(nhanVien.getThongTin());
        }
    }
}
