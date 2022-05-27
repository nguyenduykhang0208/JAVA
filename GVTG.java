import java.util.List;

public class GVTG extends GV {
	private String noiCT;
	
	public GVTG() {
		
	}
	
	public GVTG(String maGV, String hoTen, int soNamCT, int namSinh,
				String trinhDo, List<MH> dsMH, String noiCT) {
		super(maGV,hoTen,soNamCT,namSinh,trinhDo,dsMH);
		this.noiCT = noiCT;
	}
	
	
	public String getNoiCT() {
		return noiCT;
	}
	
	public void setNoiCT(String noiCT) {
		this.noiCT = noiCT;
	}

	@Override
	public boolean CH_50() {
		return false;
	}

	@Override
	public boolean laGVTG() {
		return true;
	}

	@Override
	public void display() {
		System.out.println(maGV + " " + hoTen + " " + soNamCT + " " + namSinh + " " + trinhDo + " " + noiCT);
	}
	
	
}
