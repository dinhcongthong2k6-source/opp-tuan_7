package thong;

import java.time.LocalDate;

public class KhachHangVietNam extends KhachHang{
	private DoiTuong dt;
	private double dinhMuc;
	public KhachHangVietNam(String maKH, String tenKH, LocalDate ngayLHD, double soKW, double doGia, DoiTuong dt,
			double dinhMuc) throws Exception {
		super(maKH, tenKH, ngayLHD, soKW, doGia);
		this.dt = dt;
		setDinhMuc(dinhMuc);
	}
	public DoiTuong getDt() {
		return dt;
	}
	public void setDt(DoiTuong dt) {
		this.dt = dt;
	}
	public double getDinhMuc() {
		return dinhMuc;
	}
	public void setDinhMuc(double dinhMuc) throws Exception {
		if(dinhMuc>=0) {
			this.dinhMuc = dinhMuc;
		}
		else {
			throw new Exception("Dinh muc phai >= 0");
		}
	}
	@Override
	public double getThanhTien() {
		double thanhTien;
		if(soKW<=dinhMuc) {
			thanhTien=soKW*doGia;
		}
		else {
			thanhTien=soKW*doGia*dinhMuc+(soKW-dinhMuc)*doGia*2.5;
		}
		return thanhTien;
	}
	@Override
	public String toString() {
		return super.toString()+", Doi tuong : " + dt + ", Dinh Muc = " + dinhMuc + ", Thanh tien = "+getThanhTien();
	}
	
}
