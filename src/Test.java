
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        int chon ;
        Scanner sc = new Scanner(System.in);
        DSNHANVIEN a = new DSNHANVIEN();
        DSMATHANG b = new DSMATHANG();
        DSKHACHHANG c = new DSKHACHHANG();
        DSHOADON d = new DSHOADON();
        do{
        System.out.println("---------------------MENU--------------------");
            System.out.println("1.Nhập danh sách nhân viên .");
            System.out.println("2.Hiện danh sách nhân viên vừa nhập.");
            System.out.println("3.Tìm kiếm nhân viên theo mã NV.");        
            System.out.println("4.Xóa một nhân viên.");
            System.out.println("5.Thêm nhân viên mới.");
            System.out.println("6.Sắp xếp NV thep tiền lương nhận được.");
            System.out.println("        -----------------------      ");
            System.out.println("7.Nhập danh sách mặt hàng .");
            System.out.println("8.Hiện danh sách mặt hàng vừa nhập.");
            System.out.println("9.Tìm kiếm mặt hàng theo mã .");
            System.out.println("10.Xóa một mặt hàng.");
            System.out.println("11.Thêm mặt hàng mới.");
            System.out.println("        -----------------------      ");
            System.out.println("12.Nhập danh sách khách hàng .");        
            System.out.println("13.Hiện danh sách khách hàng vừa nhập.");
            System.out.println("14.Tìm kiếm khách hàng theo tên.");
            System.out.println("15.Xóa một khách hàng.");
            System.out.println("16.Thêm khách hàng mới.");
            System.out.println("        -----------------------      ");
            System.out.println("17.Nhập danh sách hóa đơn .");
            System.out.println("18.Hiện danh sách hóa đơn vừa nhập.");
            System.out.println("19.Tìm kiếm hóa đơn theo mã HD.");
            System.out.println("20.Lưu danh sách hóa đơn vào File : DSHD.txt ");
            System.out.println("21.Đọc danh sách hóa đơn từ File : DSHD.txt ");
            System.out.println("22.Xóa một hóa đơn.");
            System.out.println("23.Thêm hóa đơn mới.");
            System.out.println("24.Sắp xếp HD theo tổng tiền thanh toán.");
            System.out.println("25. Tính tổng tiền của tất cả các hóa đơn.");
            System.out.println("        -----------------------      ");
            System.out.println("0. Thoát.");
            System.out.println("****************************************");
            System.out.println("****************************************");
            System.out.println("Lựa chọn của bạn là:");
            chon = sc.nextInt();
            switch(chon){
                case 1:
                    a.nhapDS();break;
                case 2:    
                    a.xuatDS();break;
                case 3:
                    a.timkiemNV(); break;    
                case 4:   
                    a.xoaNV();break;
                case 5:
                    a.themNV();break;
                case 6: 
                    a.sapxepNV(); break;
                case 7:
                    b.nhapDS();break;
                case 8:    
                    b.xuatDS();break;
                case 9:
                   b.timkiemMH();break;               
                case 10:   
                    b.xoaMH();break;
                case 11:
                    b.themMH();break;  
                 case 12:
                    c.nhapDS();break;
                case 13:    
                    c.xuatDS();break;
                case 14:
                   c.timkiemKH();break;
                case 15:   
                    c.xoaKH();break;
                case 16:
                    c.themKH();break;  
                 case 17:
                    d.nhapDS();break;
                case 18:    
                    d.xuatDS();break;
                case 19:
                    d.timkiemHD(); break;
                case 20:
                    d.luuDSHD();break;
                case 21:   
                   d.docfile();break;
                case 22:
                    d.xoaHD();break;
                case 23: 
                    d.themHD(); break;
                case 24:
                    d.sapxepHD();break;
                case 25:
                    d.tongtien(); break;
                case 0: 
                    break;
                default :
                    System.out.println("Lựa chọn không đúng.");
                    break;
            }
    }while(chon!=0);
    }
}
