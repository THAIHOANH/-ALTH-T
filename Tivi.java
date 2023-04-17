/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ql;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
public class Tivi {
    String mativi;
    String kieumanhinh;
    String hangsanxuat;
    double kichthuoctivi;
    double dongia;
    int soluong;

    public Tivi() {}

    public Tivi(String mativi, String kieumanhinh, double kichthuoctivi,String hangsanxuat,double dongia, int soluong) {
        this.mativi = mativi;
        
        this.kieumanhinh = kieumanhinh;
        this.kichthuoctivi = kichthuoctivi;
        this.dongia = dongia;
        this.hangsanxuat = hangsanxuat;
        this.soluong = soluong;
    }

    public String getMativi() {
       return mativi;
    }

    public void setMativi(String mativi) {
        this.mativi = mativi;
    }

    public String gethangsanxuat() {
        return hangsanxuat;
    }
    public void sethangsanxuat(String hangsanxuat){
        this.hangsanxuat=hangsanxuat;
    }

    public String getkieumanhinh() {
        return kieumanhinh;
    }

    public void setkieumahinh(String kieumanhinh) {
        this.kieumanhinh = kieumanhinh;
    }

    public double getkichthuoctivi() {
        return kichthuoctivi;
    }

    public void setkichthuoctivi(double kichthuoctivi) {
        this.kichthuoctivi = kichthuoctivi;
    }

    public double getdongia() {
        return dongia;
    }

    public void setdongia(double dongia) {
        this.dongia = dongia;
    }

    public int getsoluong() {
        return soluong;
    }

    public void setsoluong(int soluong) {
        this.soluong = soluong;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã Tivi:");
        mativi = scanner.nextLine();
        System.out.println("Nhập kiểu màn hình:");
        kieumanhinh = scanner.nextLine();
        System.out.println("Nhập kích thước Tivi:");
        kichthuoctivi = scanner.nextDouble();
        System.out.println("Nhập hãng sản xuất:");
        hangsanxuat = scanner.nextLine();
        System.out.println("Nhập đơn giá:");
        dongia = scanner.nextDouble();
        System.out.println("Nhập số lượng:");
        soluong = scanner.nextInt();
    }
       public void xuat(){
        System.out.println("{Mã Tivi : "+getMativi()+", Kiểu màn hình: "+getkieumanhinh()+",Kích thước tivi : "+getkichthuoctivi()+", Hãng sản xuất : "+gethangsanxuat()+" ,Đơn giá: "+getdongia()+", Số lượng: "+getsoluong()+"}");
       }
}
class TVOLED extends Tivi{

public TVOLED() {
}
public TVOLED(String mativi, String kieumanhinh,double kichthuoctivi,String hangsanxuat,double dongia, int soluong ) {
super(mativi,kieumanhinh,kichthuoctivi,hangsanxuat,dongia,soluong);
}

@Override
public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã Tivi:");
        mativi = scanner.nextLine();
        System.out.println("Nhập kiểu màn hình:");
        kieumanhinh = scanner.nextLine();
        System.out.println("Nhập kích thước Tivi:");
        kichthuoctivi = scanner.nextDouble();
        System.out.println("Nhập hãng sản xuất:");
        hangsanxuat = scanner.nextLine();
        System.out.println("Nhập đơn giá:");
        dongia = scanner.nextDouble();
        System.out.println("Nhập số lượng:");
        soluong = scanner.nextInt();
    }
@Override
       public void xuat(){
                   System.out.println("{Mã Tivi : "+getMativi()+", Kiểu màn hình: "+getkieumanhinh()+",Kích thước tivi : "+getkichthuoctivi()+", Hãng sản xuất : "+gethangsanxuat()+" ,Đơn giá: "+getdongia()+", Số lượng: "+getsoluong()+"}");

       }
}
class TV4k extends Tivi{

public TV4k() {
}
public TV4k(String mativi, String kieumanhinh,double kichthuoctivi,String hangsanxuat,double dongia, int soluong ) {
super(mativi,kieumanhinh,kichthuoctivi,hangsanxuat,dongia,soluong);
}

@Override
public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã Tivi:");
        mativi = scanner.nextLine();
        System.out.println("Nhập kiểu màn hình:");
        kieumanhinh = scanner.nextLine();
        System.out.println("Nhập kích thước Tivi:");
        kichthuoctivi = scanner.nextDouble();
        System.out.println("Nhập hãng sản xuất:");
        hangsanxuat = scanner.nextLine();
        System.out.println("Nhập đơn giá:");
        dongia = scanner.nextDouble();
        System.out.println("Nhập số lượng:");
        soluong = scanner.nextInt();
    }
@Override
       public void xuat(){
                          System.out.println("{Mã Tivi : "+getMativi()+", Kiểu màn hình: "+getkieumanhinh()+",Kích thước tivi : "+getkichthuoctivi()+", Hãng sản xuất : "+gethangsanxuat()+" ,Đơn giá: "+getdongia()+", Số lượng: "+getsoluong()+"}");

       }
}
class Menuchinh {

    List<Tivi> tvList = new ArrayList<>();
    boolean menu12 = false;
    boolean menu34 = false;
    Scanner sc = new Scanner(System.in);

    public void displayMenu12() {
        System.out.println("------CHƯƠNG TRÌNH QUẢN LÝ KHO TIVI------");
        System.out.println("Mời bạn chọn : ");
        System.out.println("=== Menu 1 ===");
        System.out.println("1. Tivi OLED");
        System.out.println("2. Tivi 4K");
        System.out.println("0. thoát");
        
    }

    public void displayMenu34() {
        System.out.println("------CHƯƠNG TRÌNH QUẢN LÝ KHO TIVI------");
        System.out.println("=== Menu 2 ===");
        System.out.println("1. thêm vào danh sách ");
        System.out.println("2. hiện thị danh sách ");
        System.out.println("3. Xóa khỏi danh sách ");
        System.out.println("4. Sửa thông tin trong danh sách ");
        System.out.println("5. Sắp xếp theo đơn giá ");
        System.out.println("6.Quay lai Menu 1");
        System.out.println("Mời bạn chọn: ");

    }

    public void selectMenu() {
    int choice; 
    do {
        
        if (!menu12) {
            displayMenu12();
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                    menu12 = true;
                        break;
                    case 2:
                        menu12 =true;
                        break;
                    case 0:
                       System.out.println("đang thoát ...!");
                    return;
                default:
                    
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
                    break;
                  
                }
        } else if (!menu34) {
            boolean menu34 = false;
           
        do{
            displayMenu34();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
    System.out.print("Nhập số lượng cần thêm: ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        System.out.println("lần nhập thứ " + (i + 1) + ": ");
        Scanner input = new Scanner(System.in); // tạo đối tượng Scanner mới
        // Thêm Tivi
        System.out.println("Nhập mã Tivi:");
        String maTivi = input.nextLine();

        System.out.println("Nhập kiểu màn hình:");
        String kieumanhinh = input.next();
        
        System.out.println("Nhập kích thước Tivi:");
        double kichthuoctivi = input.nextDouble();
        
        System.out.println(" Nhập hãng sản xuất: ");
        String hangsanxuat = input.next();
        
        System.out.println("Nhập đơn giá:");
        double donGia = input.nextDouble();

        System.out.println("Nhập số lượng:");
        int soLuong = input.nextInt();

       Tivi tivi = new Tivi(maTivi ,kieumanhinh, kichthuoctivi,hangsanxuat, donGia, soLuong);
        tvList.add(tivi);
       
        System.out.println("Thêm Tivi Thành Công!");
    }
           
    menu34 = true;
    break;
                
 
case 2:
    // Hiển thị danh sách tivi
    if (tvList.isEmpty()) {
        System.out.println("Danh sách trống.");
    } else {
        System.out.println("Danh sách Tivi:");
        for (Tivi tivi : tvList) {
            tivi.xuat();
        }
         menu34 = true;
    }
    break;
case 3:
   if (tvList.isEmpty()) {
        System.out.println("Danh sách trống.");
    } else {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã Tivi cần xóa:");
        String maTiviXoa = sc.nextLine();
        boolean timThay = false;
        for (Iterator<Tivi> iterator = tvList.iterator(); iterator.hasNext();) {
            Tivi tivi = iterator.next();
            if (tivi.getMativi().equals(maTiviXoa)) {
                iterator.remove();
                System.out.println("Xóa Tivi thành công.");
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy Tivi cần xóa.");
        }
    }
    menu34 = true;
    break;
case 4:
   if (tvList.isEmpty()) {
    System.out.println("Danh sách trống.");
} else {
       Scanner sc = new Scanner(System.in);
    System.out.println("Nhập mã Tivi cần sửa:");
    String maTiviSua = sc.nextLine();
    boolean timThay = true;
    for (Iterator<Tivi> iterator = tvList.iterator(); iterator.hasNext();) {
        Tivi tivi = iterator.next();
        if (tivi.getMativi().equalsIgnoreCase(maTiviSua)) {
            System.out.println("Nhập thông tin Tivi mới:");
            
            System.out.println("Nhap ma tivi: ");
            String mativi = sc.nextLine();
              
            System.out.println("Nhập hãng sản xuất: ");
            String hangsanxuat = sc.nextLine();
            
            System.out.println("Nhập kiểu màn hình:");
            String kieumanhinh = sc.nextLine();

            System.out.println("Nhập kích thước Tivi:");
            Double kichthuoctivi = sc.nextDouble();
            
            System.out.println("Nhập đơn giá:");
            Double dongia = sc.nextDouble();
            
            System.out.println("Nhập số lượng:");
                    
            int soluong = sc.nextInt();
                   
            

            // Cập nhật thông tin Tivi   
            tivi.setMativi(mativi);
            tivi.sethangsanxuat(hangsanxuat);                
            tivi.setkieumahinh(kieumanhinh);
            tivi.setkichthuoctivi(kichthuoctivi);
            tivi.setdongia(dongia);
            tivi.setsoluong(soluong);
            
            System.out.println("Cập nhật thông tin Tivi thành công.");
            timThay = true;
            break;
        }
    }
    if (!timThay) {
        System.out.println("Không tìm thấy Tivi cần sửa.");
    }
}
menu34 = true;
break;
case 5:
    if (tvList.isEmpty()) {
    System.out.println("Danh sách trống.");
} else {
    // Sắp xếp danh sách Tivi theo đơn giá
    Collections.sort(tvList, new Comparator<Tivi>() {
        @Override
        public int compare(Tivi t1, Tivi t2) {
            return Double.compare(t1.getdongia(), t2.getdongia());
        }
    });

    // Hiển thị danh sách Tivi đã sắp xếp
    System.out.println("Danh sách Tivi đã sắp xếp theo đơn giá :");
    for (Tivi tivi : tvList) {
        System.out.println("Ma tivi: " + tivi.getMativi() + ", Kieu man hinh: " + tivi.getkieumanhinh() + ", Kich thuoc man hinh: " + tivi.getkichthuoctivi() +", Hãng sản xuất: "+tivi.gethangsanxuat()+", Don gia: " + tivi.getdongia() + ", So luong: " + tivi.getsoluong());
    }
}
menu34 = true;
break;

 case 6:
                    menu12 = false;
                    menu34 = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
                    break;
                
            }
        }while (!menu34);
        } 
    } while (true);
    
}
   }
    
   class main {
    public static void main(String[] args) {
          Menuchinh mn = new Menuchinh();
               mn.selectMenu();
    }
    
    
}
