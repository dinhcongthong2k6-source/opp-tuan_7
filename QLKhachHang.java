package thong;

import java.util.ArrayList;
import java.util.List;

public class QLKhachHang {
	List<KhachHang> dskh;
	public QLKhachHang() {
		dskh=new ArrayList<KhachHang>();
	}
	public void themKH(KhachHang kh) {
		for (KhachHang khachHang : dskh) {
			if(kh.getMaKH().equalsIgnoreCase(khachHang.getMaKH())) {
				System.out.println("Trung ma!");
				return;
			}
		}
		dskh.add(kh);
	}
	public void xoaKH(String ma) {
		for (KhachHang khachHang : dskh) {
			if(ma.equalsIgnoreCase(khachHang.getMaKH())) {
				dskh.remove(khachHang);
				System.out.println("Xoa thanh cong!");
				return;
			}
		}
		System.out.println("Khong tim thay ma!");
	}
	public void xuatKH() {
		for (KhachHang khachHang : dskh) {
			System.out.println(khachHang);
		}
	}
	public void suaKH(KhachHang kh) throws Exception {
		for (KhachHang khachHang : dskh) {
			if(kh.getMaKH().equalsIgnoreCase(khachHang.getMaKH())) {
				khachHang.setMaKH(kh.getMaKH());
				khachHang.setTenKH(kh.getTenKH());
				khachHang.setNgayLHD(kh.getNgayLHD());
				khachHang.setSoKW(kh.getSoKW());
				khachHang.setDoGia(kh.getDoGia());
				System.out.println("Sua thanh cong");
				return;
			}
		}
		System.out.println("Khong thay ma!");
	}
	public void tongSoLuongKHTungLoai() {
		int nuocngoai=0,vn=0;
		for (KhachHang khachHang : dskh) {
			if(khachHang instanceof KhachHangNuocNgoai) {
				
			}
		}
	}
}
