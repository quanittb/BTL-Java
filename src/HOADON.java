
import java.io.Serializable;
import java.util.Scanner;


public class HOADON implements Serializable {
    private int maHoaDon ;
    private String ngayXuat  ;
    MATHANG a = new MATHANG() ;
    KHACHHANG b= new KHACHHANG();
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma hoa don la: "); maHoaDon =sc.nextInt();
        System.out.print("Ngay xuat: "); ngayXuat = sc.next();
        b.nhap();
        a.nhap();
    }
    public void xuat(){
        System.out.println("Ma hoa don"+"\tNgay xuat");
        System.out.println(maHoaDon+"\t"+ngayXuat);
        System.out.println("Ho ten"+"\t DChi"+"\t SDT");
        b.xuat();
        System.out.println("Ten MH"+"\tMa MH"+"\t So luong"+"\t Đon gia");
        a.xuat();
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }
    public String getNgayXuat() {
        return ngayXuat;
    }
    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }
    public void setNgayXuat(String ngayXuat) {
        this.ngayXuat = ngayXuat;
    }
    public float tongtienHD(){
        return a.thanhTien();
    }
}
