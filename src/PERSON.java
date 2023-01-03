
import java.io.Serializable;
import java.util.Scanner;


public class PERSON extends ExamClass implements Serializable{
    protected String hoTen , gioiTinh , diaChi, soDienThoai  ;
    protected int namSinh  ;
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho ten : "); hoTen = sc.nextLine() ;
        System.out.print("Gioi tinh: "); gioiTinh = sc.nextLine() ;
        System.out.print("Dia chi : "); diaChi = sc.nextLine() ;
        System.out.print("Nam sinh: "); namSinh = sc.nextInt();
        System.out.print("So dien thoai: "); soDienThoai = sc.nextLine();
    }
    @Override
    public void xuat(){
        System.out.println(hoTen +"\t" + gioiTinh + "\t" +diaChi +"\t" + namSinh + "\t" +soDienThoai);
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    void non() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
