import java.io.*;
import java.util.*;
public class DSNHANVIEN   {
    ArrayList<NHANVIEN> lstNV = new ArrayList<NHANVIEN>();
    public int n;
    public void nhapDS(){
        Scanner sc= new Scanner(System.in);
        System.out.print("So nhan vien can nhap la : "); n = sc.nextInt();
        for(int i =0;i<n;i++){
            NHANVIEN h = new NHANVIEN();
            System.out.println("Nhan vien thu " + i +" :");
            h.nhap();
            lstNV.add(h);
        }
    }
    public void xuatDS(){
        System.out.println("Danh sach nhan vien vua nhap la:  ");
        System.out.println("MaNV"+"\t SDT"+"\tDChi"+"\t NSinh"+"\t HSL"+"\t NCong"+"\t Tien luong");
        for(NHANVIEN i: lstNV){
            i.xuat();
        }
    }
    public void timkiemNV(){
        int ma ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma Nhan vien muon tim : " ); ma = sc.nextInt();
        System.out.println("MaNV"+"\t SDT"+"\tDChi"+"\t NSinh"+"\t HSL"+"\t NCong"+"\t Tien luong");
        for(NHANVIEN i: lstNV){
            if((ma- i.getMaNhanVien())==0)
                i.xuat();
        }
    }
    public void xoaNV(){
        Scanner sc = new Scanner(System.in);
        int ma ;
        System.out.println("Nhap ma so nhan vien ban muon xoa : "); ma = sc.nextInt();
        for(NHANVIEN i:lstNV){
            if((i.getMaNhanVien()- ma)==0){ 
                lstNV.remove(i);
                break;}
        }
        System.out.println("Danh sach sau khi xoa la: ");
        for(NHANVIEN i:lstNV)
            i.xuat();
    }
    public void themNV(){
        System.out.println("Nhap thong tin nhan vien can them : ");
        NHANVIEN h = new NHANVIEN();
        h.nhap();
        lstNV.add(h);
        System.out.println("Danh sach sau khi them la:");
        for(NHANVIEN i:lstNV)
            i.xuat();
    }
    public void sapxepNV(){
        Collections.sort(lstNV,Sapxep.TienLuong);
        System.out.println("Danh sach NV sau khi sap xep la:");
        for(NHANVIEN i:lstNV)
            i.xuat();
    }
    public static class Sapxep {
            public static final Comparator<NHANVIEN> TienLuong= (t,t1) -> 
                Double.compare(t.tienLuongNV(), t1.tienLuongNV());
            
        }
        
    }
