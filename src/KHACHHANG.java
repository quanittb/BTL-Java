
import java.io.Serializable;
import java.util.Scanner;


public class KHACHHANG  extends PERSON implements Serializable {
    private String hoTen, diaChi ,soDienThoai;
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho ten:"); hoTen = sc.nextLine();
        System.out.print("Dia chi: "); diaChi = sc.nextLine();
        System.out.print("SDT: "); soDienThoai = sc.nextLine();
    }
    @Override
    public void xuat(){
        System.out.println(hoTen+"\t"+ diaChi+"\t"+soDienThoai);
    }

    @Override
    public String getHoTen() {
        return hoTen;
    }

    @Override
    public String getDiaChi() {
        return diaChi;
    }

    @Override
    public String getSoDienThoai() {
        return soDienThoai;
    }

    @Override
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    
}