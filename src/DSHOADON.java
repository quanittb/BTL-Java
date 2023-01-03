
import java.io.*;
import java.util.*;

public class DSHOADON {
    ArrayList<HOADON> lstHD =new ArrayList<HOADON>();
    int n;
    public void nhapDS(){
        Scanner sc = new Scanner(System.in);
        System.out.print("So hoa don can nhap la: ");
         n = sc.nextInt();
        for(int i=0;i<n;i++){
            HOADON h= new HOADON();
            h.nhap();
            lstHD.add(h);
        }
    }
    public void xuatDS(){
        System.out.println("Danh sach hoa don vua nhap la: ");
        for(HOADON i : lstHD){
            System.out.println();
            i.xuat();
        }
    }
    public void timkiemHD(){
        Scanner sc= new Scanner(System.in);
        int ma , d=0;
        System.out.print("Ma Hoa don muon tim la:");
        ma = sc.nextInt();
        for(HOADON i: lstHD){
            if(ma-i.getMaHoaDon()==0){
                System.out.println("Hoa don can tim la:");
                i.xuat();
                d=1;
            }
             if(d==0) System.out.println("Khong co thong tin hang can tim.");
        }
    }
    
    public void luuDSHD(){
    File f = new File("F://DS.txt");    
        try{
            FileOutputStream fo = new FileOutputStream(f);
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            for(HOADON i:lstHD){
                oo.writeObject(i);
            }
            oo.close();
            fo.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Luu thanh cong !");
        }
    }
        public void docfile(){
        File f = new File("F://DS.txt");
        HOADON h= new HOADON();
           try{
        FileInputStream fi = new FileInputStream(f);
        ObjectInputStream oi = new ObjectInputStream(fi);
        System.out.println("Thông tin đọc được là :" );
        for(int i=0;i<n;i++){
        h = (HOADON) oi.readObject();
        h.xuat();
        }
        oi.close();
        fi.close();
    }catch(Exception e){
        e.printStackTrace();
    }
    }
    public void xoaHD(){
        Scanner sc = new Scanner(System.in);
        int ma ;
        System.out.println("Nhap ma hoa don ban muon xoa : "); ma = sc.nextInt();
        for(HOADON i:lstHD){
            if((i.getMaHoaDon()- ma)==0){ 
                lstHD.remove(i);
                break;}
        }
        
        System.out.println("Danh sach sau khi xoa la: ");
        for(HOADON i:lstHD)
            i.xuat();
    }
    public void themHD(){
        System.out.println("Nhap thong tin hoa don can them : ");
        HOADON h = new HOADON();
        h.nhap();
        lstHD.add(h);
        System.out.println("Danh sach sau khi them la:");
        for(HOADON i:lstHD)
            i.xuat();
    }
    public void tongtien(){
        float tien = 0 ;
        for(HOADON i: lstHD){
             tien = tien +i.tongtienHD();
        }
         System.out.println("Tong tien cua cac hoa don da xuat la: "+tien);
    }
    public void sapxepHD(){
        Collections.sort(lstHD,sapxep.TienHD);
        System.out.println("Danh sach hoa don sau khi sap xep la :");
        for(HOADON i:lstHD)
            i.xuat();
    }
    public static class sapxep{
            public static final Comparator<HOADON> TienHD= (t,t1) -> 
                Double.compare(t.tongtienHD(), t1.tongtienHD());
            
        }
}
