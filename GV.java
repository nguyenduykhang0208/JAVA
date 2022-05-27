import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class GV {
	protected String maGV, hoTen, trinhDo;
	protected int soNamCT;
	protected int namSinh;
	protected List<MH> dsMH;
	                     
	public GV() {
		dsMH = new ArrayList<MH>();
	}
	
	public GV(String maGV, String hoTen, int soNamCT, int namSinh, String trinhDo, List<MH> dsMH) {
		this.maGV = maGV;
		this.hoTen = hoTen;
		this.soNamCT = soNamCT;
		this.namSinh = namSinh;
		this.trinhDo = trinhDo;
		this.dsMH = dsMH;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public String getMaGV() {
		return maGV;
	}
	
	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}
	
	public int getSoNamCT() {
		return soNamCT;
	}
	
	public void setSoNamCT(int soNamCT) {
		this.soNamCT = soNamCT;
	}
	
	public int getNamSinh() {
		return namSinh;
	}
	
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
	public String getTrinhDo() {
		return trinhDo;
	}
	
	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}
	
	//Tra ve ds mon hoc dang String
	public String[] getdsMH() {
		String arr[] = new String[dsMH.size()];
		dsMH.toArray(arr);
		return arr;
	}
	
	//Hien thi thong tin
	public abstract void display();
	
	//Them mot Mon Hoc vao danh sach cac mon hoc
	public void addMH(MH a) {
		this.dsMH.add(a);
	}
	//Them vao danh sach cac mon hoc
	public void addDsMH(List<MH> dsMH) {
		this.dsMH.addAll(dsMH);
	}
	
	//Kiem tra GVCH tren 50 tuoi
	public abstract boolean CH_50();   
	
	//Kiem tra co la Giang Vien Thinh Giang hay khong
	public abstract boolean laGVTG();
	
	//Kiem tra hai giang vien cung loai va nam cong tac
	public boolean GiangVienCungLoai(GV a) {
		if(this.laGVTG() && a.laGVTG() || !this.laGVTG() && !a.laGVTG()){
			if(this.soNamCT == a.soNamCT)
				return true;
			else return false;
			}
		return false;
		}
	//Tach ten tu ho ten giang vien
	public String tachTen() {
		String ten = hoTen.substring(hoTen.lastIndexOf(" ")+1, hoTen.length());
		return ten;
	}
}