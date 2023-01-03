import java.io.Serializable;
import java.util.Scanner;
public class NHANVIEN  extends PERSON implements IExamInterface , Serializable{
    private int maNhanVien , ngayCong ;
    private float heSoLuong ;
    private int namSinh ;
    private String diaChi,soDienthoai ;  
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma nhan vien : "); maNhanVien = sc.nextInt();
        System.out.print("So dien thoai : "); soDienthoai = sc.next();
        System.out.print("Dia chi: "); diaChi = sc.next();
        System.out.print("Nam sinh : "); namSinh = sc.nextInt();
        System.out.print("He so luong : "); heSoLuong = sc.nextFloat();
        System.out.print("Ngay cong: "); ngayCong = sc.nextInt();
    }
    @Override
    public void xuat(){
        System.out.println(maNhanVien +"\t" + soDienthoai +"\t" + diaChi +"\t" + namSinh +"\t" + heSoLuong+"\t" +ngayCong +"\t"+ tienLuongNV());
    }
    public double tienLuongNV(){
        return (double) 160000*heSoLuong*ngayCong ;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public int getNgayCong() {
        return ngayCong;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }
    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setNgayCong(int ngayCong) {
        this.ngayCong = ngayCong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
}
