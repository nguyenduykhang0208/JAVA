import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BM {
	private String tenBM;
	private List<GV> dsGV;
	
	public BM() {
		dsGV = new ArrayList<GV>();
	}
	
	public BM(String tenBM, List<GV> dsGV) {
		this.tenBM = tenBM;
		this.dsGV = dsGV;
	}
	
	public String getTenBM() {
		return tenBM;
	}
	
	public void setTenBM(String tenBM) {
		this.tenBM = tenBM;
	}
	
	//Them danh sach cac giang vien
	public void addGV(List<GV> dsGV) {
		this.dsGV.addAll(dsGV);
	}
	
	//Them vao mot giang vien
	public void addGV(GV a) {
		this.dsGV.add(a);
	}
	
	//Get ds giang vien
	public List<GV> getDanhSachGiangVien(){
		return dsGV;
	}
	
	//Tong so giang vien co huu cua bo mon co nam sinh truoc 1990
	public int GVCH_1990() {
		int count = 0;
		for(int i = 0; i < dsGV.size(); i++) {
			if(dsGV.get(i).namSinh < 1990 && !dsGV.get(i).laGVTG())
				count++;
		}
		return count;
	}
	
	//Giang vien co huu lon tuoi nhat
	public void maxTuoiGVCH() {
		ArrayList<Integer> a = new ArrayList<>();//Mang luu nam sinh giang vien co huu
		for(int i = 0; i < dsGV.size(); i++) {
			if(!dsGV.get(i).laGVTG()) {
				a.add(dsGV.get(i).getNamSinh());
			}
		}
		a.sort((o1,o2) -> o1 - o2);//Sap xep nam sinh tang dan
		for(int i = 0; i < dsGV.size(); i++) {
			if(!dsGV.get(i).laGVTG() && dsGV.get(i).getNamSinh() == a.get(0)) {
				dsGV.get(i).display();
			}
		}
	}
	
	
	//Tim giang vien cong tac o bo mon
	public void TimTheoTen(String hoTen) {
		List<GV> t = new ArrayList<GV>();
		for(int i = 0; i < dsGV.size(); i++) {
			if((dsGV.get(i).getHoTen()).contains(hoTen)) {
				t.add(dsGV.get(i));
			}
		}
		if(t.size() != 0) {
			System.out.println("\nThong tin giang vien ten " + hoTen + ": ");
			for(int i = 0; i < t.size(); i++) {
				t.get(i).display();
			}
		}
		else {
			System.out.println("Khong tim thay");
		}
	}
	
	//Lay ra danh sach giang vien thinh giang tu nam sinh
	public void TimTheoNS(int namSinh) {
		List<GV> t = new ArrayList<GV>();
		for(int i = 0; i < dsGV.size(); i++) {
			if(dsGV.get(i).laGVTG()) {
				if(dsGV.get(i).namSinh == namSinh) {
					t.add(dsGV.get(i));
				}
			}
		}
		if(t.size() != 0) {
			System.out.println("\nDanh sach giang vien sinh nam " + namSinh);
			for(int i = 0; i < t.size(); i++) {
				t.get(i).display();
			}
		}
		else {
			System.out.println("Khong tim thay");
		}
	}
	
	//sap xep cac giang vien giam dan theo nam sinh
	public void sortByYear() {
		Collections.sort(dsGV, new Comparator<GV>() {
			public int compare(GV a, GV b) {
				return b.getNamSinh() - a.getNamSinh();
			}
			});
		}
	
	//sap xep cac giang vien tang dan theo ho ten
	public void sortByName() {
		Collections.sort(dsGV, new Comparator<GV>() {
			public int compare(GV a, GV b) {
				return a.tachTen().compareTo(b.tachTen());
			}
		});
		}
	
	//thong ke so luong giang vien cua bo mon theo nam sinh
	public void thongKeNamSinh(){
		Map<Integer, Integer> list = new HashMap<>();
		for(GV i : dsGV) {
			if( !list.containsKey(i.getNamSinh()) ) {
				list.put(i.getNamSinh(), 1);
			}
			else list.put(i.getNamSinh(), list.get(i.getNamSinh()) + 1);
		}
		if(list.size() != 0) {
			System.out.println("\nThong ke so luong giang vien theo nam sinh!");
			Set<Integer> set = list.keySet();
			for(Integer key : set) {
				System.out.println(key + ": " + list.get(key));
			}
		}
	}
	
	public void display() {
		System.out.println("Ten BM: " + tenBM);
		for(int i = 0; i < dsGV.size(); i++) {
			dsGV.get(i).display();
		}
	}
}
