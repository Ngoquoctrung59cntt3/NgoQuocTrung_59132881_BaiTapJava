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
public class BaiTap4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Khởi tạo
        ChuyenXe cxe1 = new XeNoiThanh("001", 90, "001", "Ngô Quốc Trung", "79-Z1011.10", 3500000);
        ChuyenXe cxe2 = new XeNoiThanh("002", 140, "002", "Nguyễn Viết Hưng", "56-A2102.34", 8200000);
        ChuyenXe cxe3 = new XeNoiThanh("003", 300, "003", "Nguyễn Ngọc Thanh", "72-C2192.56", 13000000);
        ChuyenXe cxe4 = new XeNgoaiThanh("TP.HCM", 3, "004", "Huỳnh Thế Minh", "TH1010", 4000000);
        ChuyenXe cxe5 = new XeNgoaiThanh("Đà Nẵng", 4, "005", "Nguyễn Văn Đồng", "TH33333", 2300000);
        ChuyenXe cxe6 = new XeNgoaiThanh("Hà Nội", 1, "006", "", "Huỳnh Ngọc Thảo", 7550000);
        
        // Thêm vào DS
        QuanLyChuyenXe qlchuyenxe = new QuanLyChuyenXe();
        qlchuyenxe.themChuyenXe(cxe1);
        qlchuyenxe.themChuyenXe(cxe2);
        qlchuyenxe.themChuyenXe(cxe3);
        qlchuyenxe.themChuyenXe(cxe4);
        qlchuyenxe.themChuyenXe(cxe5);
        qlchuyenxe.themChuyenXe(cxe6);
        
        // Xuất DS
        qlchuyenxe.xuatDS();
        
        // Tính Doanh thu
        System.out.println("Tổng doanh thu xe ngoại thành: "+qlchuyenxe.tinhDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu xe nội thành: "+qlchuyenxe.tinhDoanhThuNoiThanh());
        System.out.println("Tổng doanh thu cả 2 loại xe: "+(qlchuyenxe.tinhDoanhThuNoiThanh()+qlchuyenxe.tinhDoanhThuNgoaiThanh()));
    }
    
}
