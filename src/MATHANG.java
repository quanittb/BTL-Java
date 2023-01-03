
import java.io.Serializable;
import java.util.Scanner;

public class MATHANG implements Serializable {
    private String tenMatHang ;
    private int maSoHang , soLuong ;
    private float donGia ;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten mat hang: "); tenMatHang = sc.nextLine();
        System.out.print("Ma so hang: "); maSoHang = sc.nextInt();
        System.out.print("So luong : "); soLuong= sc.nextInt();
        System.out.print("Gia tien : "); donGia = sc.nextFloat();
    }
    public void xuat(){
        System.out.println(tenMatHang+"\t"+ maSoHang+"\t"+soLuong+"\t"+donGia);
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public int getMaSoHang() {
        return maSoHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public float getdonGia() {
        return donGia;
    }

    public void setTenMatHang(String tenMatHang) {
        this.tenMatHang = tenMatHang;
    }

    public void setMaSoHang(int maSoHang) {
        this.maSoHang = maSoHang;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setGiaTien(float giaTien) {
        this.donGia = donGia;
    }
    public float thanhTien(){
        return (float) soLuong*donGia ;
    }
}
