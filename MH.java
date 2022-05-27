
public class MH {
	private String tenMH;
	private int soTC;
	
	public MH() {
		
	}
	
	public MH(String tenMH, int soTC) {
		this.tenMH = tenMH;
		this.soTC = soTC;
	}
	
	public void setMH(String tenMH, int soTC) {
		this.tenMH = tenMH;
		this.soTC = soTC;
	}
	
	public String getTenMH() {
		return tenMH;
	}
	
	public int getSoTC() {
		return soTC;
	}
	
	public void setTenMH(String tenMH) {
		this.tenMH = tenMH;
	}
	
	public void setSoTC(int soTC) {
		this.soTC = soTC;
	}
	
	public void display() {
		System.out.println("Ten MH: " + tenMH);
		System.out.println("So Tin Chi: " + soTC);
	}
}
