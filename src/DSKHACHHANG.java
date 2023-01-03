
import java.io.*;
import java.util.*;

public class DSKHACHHANG {
    ArrayList<KHACHHANG> lstKH = new ArrayList<KHACHHANG>();
     public int n;
    public void nhapDS(){
        Scanner sc= new Scanner(System.in);
        System.out.print("So khach hang can nhap la : "); n = sc.nextInt();
        for(int i =0;i<n;i++){
            KHACHHANG h = new KHACHHANG();
            System.out.println("Khach hang thu " + i +" :");
            h.nhap();
            lstKH.add(h);
        }
    }
    public void xuatDS(){
        System.out.println("Danh sach khach hang vua nhap la:  ");
        System.out.println("Ho ten"+"\t DChi"+"\t SDT");
        for(KHACHHANG i: lstKH){
            i.xuat();
        }
    }
    public void timkiemKH(){
        String ten ;
        int d =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten khach hang muon tim : " ); ten = sc.nextLine();
        System.out.println("Ho ten"+"\t DChi"+"\t SDT");
        for(KHACHHANG i: lstKH){
            if(ten.equalsIgnoreCase(i.getHoTen()))
            {
                i.xuat();
                d=1;
            }
            if(d==0) System.out.println("Không tìm được !");
        }
    }
    public void xoaKH(){
        Scanner sc = new Scanner(System.in);
         String ten ;
        System.out.print("Nhap ten khach hang muon xoa : " ); ten = sc.nextLine();
        for(KHACHHANG i: lstKH)
            if(ten.equalsIgnoreCase(i.getHoTen())){
                lstKH.remove(i);
                break;}
        System.out.println("Danh sach sau khi xoa la: ");
        for(KHACHHANG i:lstKH)
            i.xuat();
    }
    public void themKH(){
        System.out.println("Nhap thong tin khach hang can them : ");
        KHACHHANG h = new KHACHHANG();
        h.nhap();
        lstKH.add(h);
        System.out.println("Danh sach sau khi them la:");
        for(KHACHHANG i:lstKH)
            i.xuat();
    }
}
