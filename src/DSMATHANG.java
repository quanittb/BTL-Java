
import java.io.* ;
import java.util.*;


public class DSMATHANG {
    ArrayList<MATHANG> lstMH = new ArrayList<MATHANG>();
    int n;
    public void nhapDS(){  
        Scanner sc= new Scanner(System.in);
        System.out.print("So mat hang can nhap la:");
        n= sc.nextInt();
        for(int i =0;i<n;i++){
            MATHANG h = new MATHANG();
            h.nhap();
            lstMH.add(h);
        }
    }
    public void xuatDS(){
        System.out.println("Danh sach mat hang vua nhap la: ");
        System.out.println("Ten MH"+"\tMa MH"+"\t So luong"+"\t Đon gia");
        for(MATHANG i:lstMH){
            i.xuat();
        }
    }
    public void timkiemMH(){
        Scanner sc= new Scanner(System.in);
        int ma ,d=1;
        System.out.print("Ma hang muon tim la:");
        ma = sc.nextInt();
        for(MATHANG i: lstMH){
            if(ma-i.getMaSoHang()==0){
                System.out.println("Hang can tim la:");
                i.xuat();
                d=0;
            }
           
        }
        if(d==1) System.out.println("Khong co thong tin hang can tim.");
    }
        public void themMH(){
        System.out.println("Nhap thong tin mat hang can them : ");
        MATHANG h = new MATHANG();
        h.nhap();
        lstMH.add(h);
        System.out.println("Danh sach sau khi them la:");
        for(MATHANG i:lstMH)
            i.xuat();
    }
     public void xoaMH(){
        Scanner sc = new Scanner(System.in);
        int ma ;
        System.out.println("Nhap ma so hang ban muon xoa : "); ma = sc.nextInt();
        for(MATHANG i:lstMH){
            if((i.getMaSoHang()- ma)==0){ 
                lstMH.remove(i);
                break;}
        }
        System.out.println("Danh sach sau khi xoa la: ");
        for(MATHANG i:lstMH)
            i.xuat();
    }
}
