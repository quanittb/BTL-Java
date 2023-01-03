
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Danhsach {
    ArrayList<PERSON> lst = new ArrayList<>();
    public static int n;
    public void nhap(){
        int chon  ;
        Scanner sc= new Scanner(System.in);
        do{
        System.out.println("1.Nhập Nhân viên");
        System.out.println("2.Nhập Khách hàng");
            System.out.print("Nhập lựa chọn:");
            while(!sc.hasNextInt()){
                System.out.print("Nhập lại:");
                sc.next();
            }
            chon = sc.nextInt();
        }while(chon!=1&&chon!=2);
    if(chon==1){
        System.out.print("Số nhân viên cần nhập: "); n = sc.nextInt();
        for(int i =0;i<n;i++){
            NHANVIEN h = new NHANVIEN();
            System.out.println("Nhân viên thứ " + i +" :");
            h.nhap();
            lst.add(h);
        }
      }
    else{
       System.out.print("Số khách hàng cần nhập: "); n = sc.nextInt();
        for(int i =0;i<n;i++){
            KHACHHANG h = new KHACHHANG();
            System.out.println("Khách hàng thứ " + i +" :");
            h.nhap();
            lst.add(h);
        } 
    }
    }
    File f = new File("F://Danhsach.dat");
    public void luufile(){
        try{
            FileOutputStream fo = new FileOutputStream(f);
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            for(PERSON i:lst){
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
        PERSON h= new PERSON();
           try{
        FileInputStream fi = new FileInputStream(f);
        ObjectInputStream oi = new ObjectInputStream(fi);
        System.out.println("Thông tin đọc được là :" );
        for(int i=0;i<lst.size();i++){
        h = (PERSON) oi.readObject();
        h.xuat();
        }
        oi.close();
        fi.close();
    }catch(Exception e){
        e.printStackTrace();
    }
    }
    
}
