package thong;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) throws Exception {
		KhachHang kh1=new KhachHangNuocNgoai("KH1", "John", LocalDate.now().minusDays(7),18 , 5000, "USA");
		KhachHang kh2=new KhachHangVietNam("KH2", "Thong", LocalDate.now().minusMonths(1), 150, 2000, DoiTuong.San_Xuat, 100);
		KhachHang kh3=new KhachHangVietNam("KH3", "Phuong", LocalDate.now().minusDays(19), 20, 5000, DoiTuong.Sinh_Hoat, 30);
		KhachHang kh4=new KhachHangNuocNgoai("KH4", "Jack", LocalDate.now().minusDays(4),30 , 5000, "USA");
		KhachHang kh5=new KhachHangVietNam("KH6", "Nam", LocalDate.now().minusMonths(1), 12, 2000, DoiTuong.Sinh_Hoat, 40);
		KhachHang kh6=new KhachHangVietNam("KH5", "Kiet", LocalDate.now().minusDays(29), 30, 5000, DoiTuong.Sinh_Hoat, 30);
		QLKhachHang ql=new QLKhachHang();
		ql.themKH(kh2);
		ql.themKH(kh1);
		ql.themKH(kh3);
		ql.themKH(kh4);
		ql.themKH(kh6);
		ql.themKH(kh5);
		ql.xuatKH();
		ql.xoaKH("KH3");
		ql.xuatKH();
		KhachHang kh7=new KhachHangVietNam("KH8", "Kiet LLL", LocalDate.now().minusDays(2), 60, 3000, DoiTuong.Sinh_Hoat, 30);
		ql.suaKH(kh7);
		ql.xuatKH();
	}
}
