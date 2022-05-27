import java.util.ArrayList;


public class Main {
	 public static void main(String[] args) {
		   	ArrayList<MH> mh = new ArrayList<MH>();
			MH a = new MH("Toan", 2);
			MH b = new MH("Ly", 2);
			MH c = new MH("Anh", 3);
			mh.add(a);
			mh.add(b);
			mh.add(c);
			
			ArrayList<GV> dsGV = new ArrayList<GV>();
			ArrayList<GV> dsGV1 = new ArrayList<GV>();
			GV gv1 =  new GVTG("001","Nguyen Van An",3,1950,"Tien si",mh,"Phu Yen");
			GV gv2 =  new GVTG("002","Nguyen Van Binh",3,1985,"Tien si",mh,"HCM");
			GV gv3 =  new GVTG("003","Nguyen Van Tan",3,1972,"Tien si",mh,"Ha Noi");
			GV gv4 =  new GVCH("004","Nguyen Thi Thanh",3,1992,"Tien si",mh,2.3,2010);
			GV gv5 =  new GVCH("005","Nguyen Ngoc Anh",3,1960,"Tien si",mh,2.9,2007);
			GV gv6 =  new GVCH("006","Nguyen Thuy Van",3,1960,"Tien si",mh,2.3,2015);
			
			GV gv7 =  new GVTG("007","Nguyen An Nhien",3,1995,"Tien si",mh,"Phu Yen");
			GV gv8 =  new GVTG("008","Nguyen Hai Binh",3,1992,"Tien si",mh,"Ninh Binh");
			GV gv9 =  new GVTG("009","Nguyen Van Khoi",3,1991,"Tien si",mh,"Quang Nam");
			GV gv10 =  new GVCH("0010","Nguyen Thi Van",3,1996,"Tien si",mh,2.3,2012);
			GV gv11 =  new GVCH("0011","Nguyen Ngoc Le",3,1999,"Tien si",mh,2.3,2015);
			GV gv12 =  new GVCH("0012","Nguyen Thuy Anh",3,1990,"Tien si",mh,2.3,2017);
			
			dsGV.add(gv1);
			dsGV.add(gv2);
			dsGV.add(gv3);
			dsGV.add(gv4);
			dsGV.add(gv5);
			dsGV.add(gv6);
			
			dsGV1.add(gv7);
			dsGV1.add(gv8);
			dsGV1.add(gv9);
			dsGV1.add(gv10);
			dsGV1.add(gv11);
			dsGV1.add(gv12);



			BM cntt = new BM("CNTT", dsGV);
			BM ktvt = new BM("KTVT", dsGV1);		
			ArrayList<BM> dsBM = new ArrayList<BM>();
			dsBM.add(cntt);
			dsBM.add(ktvt);
			
			  
		
			
			//4.Kiem tra giang vien la co huu va tren 50 tuoi(bo mon CNTT)
			System.out.println("Giang vien co huu tren 50 tuoi: ");
			for(int i = 0; i < dsGV.size(); i++) {
				if(dsGV.get(i).CH_50()) {
					dsGV.get(i).display();
				}
			}
			
			//5.Kiem tra 2 giang vien co cung loai va so nam cong tac
			if(gv1.GiangVienCungLoai(gv2)) {
				System.out.println("\nHai giang vien cung loai va so nam cong tac");
				gv1.display();
				gv2.display();
			}
			else {
				System.out.println("\nHai giang vien khong cung loai hoac so nam cong tac\n");
			}
			
			//6.Tong so giang vien co nam sinh truoc 1990 cua bo mon CNTT
			System.out.println("\nTong so giang vien nam sinh < 1990: " + cntt.GVCH_1990());
			
			//7.Giang vien co huu co tuoi lon nhat
			System.out.println("\nGiang vien co huu lon tuoi nhat: ");
			cntt.maxTuoiGVCH();
			
			//8.Tim giang vien cong tac o bo mon theo ten
			
			cntt.TimTheoTen("A");
			
			//9.Lay ra danh sach giang vien co nam sinh cho truoc
			cntt.TimTheoNS(1950);
			
			//10.Sap xep tang dan theo hoten||giam dan theo nam sinh
			System.out.println("\nSap xep theo ten");
			cntt.sortByName();
			cntt.display();
			System.out.println("\nSap xep theo nam sinh");
			cntt.sortByYear();
			cntt.display();
			//11.Thong ke so luon giang vien theo nam sinh
			cntt.thongKeNamSinh();
			
			//12.GUI
			GUI t = new GUI(dsBM, dsGV, mh);
			t.createGUI();
	    }
}
