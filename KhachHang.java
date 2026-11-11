package thong;

import java.time.LocalDate;

public abstract class KhachHang {
	protected String maKH;
	protected String tenKH;
	protected LocalDate ngayLHD;
	protected double soKW, doGia;
	public abstract double getThanhTien();
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) throws Exception {
		if(!(maKH.isEmpty())) {
			this.maKH = maKH;
		}
		else {
			throw new Exception("Ma khach hang khong dc rong!");
		}
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) throws Exception {
		if(!(tenKH.isEmpty())) {
			this.tenKH = tenKH;
		}
		else {
			throw new Exception("Ten khach hang khong dc rong!");
		}
	}
	public LocalDate getNgayLHD() {
		return ngayLHD;
	}
	public void setNgayLHD(LocalDate ngayLHD) throws Exception {
		if(!(ngayLHD.isAfter(LocalDate.now()))) {
			this.ngayLHD = ngayLHD;
		}
		else {
			throw new Exception("Ngay lap hoa don phai truoc hoac la ngay hien tai!");
		}
	}
	public double getSoKW() {
		return soKW;
	}
	public void setSoKW(double soKW) throws Exception {
		if(soKW>=0) {
			this.soKW = soKW;
		}
		else {
			throw new Exception("so KW phai lon hon hoac = 0");
		}
	}
	public double getDoGia() {
		return doGia;
	}
	public void setDoGia(double doGia) throws Exception {
		if(soKW>=0) {
			this.doGia=doGia;
		}
		else {
			throw new Exception("so KW phai lon hon hoac = 0");
		}
	}
	public KhachHang(String maKH, String tenKH, LocalDate ngayLHD, double soKW, double doGia) throws Exception {
		super();
		setMaKH(maKH);
		setTenKH(tenKH);
		setNgayLHD(ngayLHD);
		setSoKW(soKW);
		setDoGia(doGia);
	}
	@Override
	public String toString() {
		return "Ma KH=" + maKH + ", Ten KH :" + tenKH + ", Ngay Lap Hoa Don :" + ngayLHD + ", soKW : " + soKW + "KW, Don Gia = "
				+ doGia + "dong";
	}
	
	
	
}
