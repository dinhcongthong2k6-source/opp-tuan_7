package thong;

import java.time.LocalDate;

public class KhachHangNuocNgoai extends KhachHang{
	private String quocTich;

	public KhachHangNuocNgoai(String maKH, String tenKH, LocalDate ngayLHD, double soKW, double doGia, String quocTich)
			throws Exception {
		super(maKH, tenKH, ngayLHD, soKW, doGia);
		setQuocTich(quocTich);
	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) throws Exception {
		if(!(quocTich.isEmpty())) {
			this.quocTich = quocTich;
		}
		else {
			throw new Exception("Quoc tich khong dc rong");
		}
	}
	
	public double getThanhTien() {
		return soKW*doGia;
	}

	@Override
	public String toString() {
		return super.toString() +", Quoc Tich :" + quocTich + ", Thanh tien = "+getThanhTien();
	}
	
}
