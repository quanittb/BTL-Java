
import java.util.Scanner;


public class Kiemtra {
    public static void main(String[] args) {
        Danhsach a = new Danhsach();
        Scanner sc= new Scanner(System.in);
        int chon ;
         do{
            System.out.println("---------------------MENU--------------------");
            System.out.println("1.Nhập Danh sách.");
            System.out.println("2.Lưu danh sách vừa nhập vào file.");
            System.out.println("3.Đọc File.");
             System.out.println("--------------------------------------------");
             System.out.print("Nhập lựa chọn :");
            chon = sc.nextInt();
            switch(chon){
                case 1:
                    a.nhap();break;
                case 2:    
                    a.luufile();break;
                case 3:
                    a.docfile(); break;
                case 0:
                    System.exit(0); break;
                default :
                    System.out.println("Nhập sai:"); break;
    }
         }while(chon!=0);
    }
}
