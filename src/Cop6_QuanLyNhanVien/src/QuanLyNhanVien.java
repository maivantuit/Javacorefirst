package Cop6_QuanLyNhanVien.src;
import java.util.Scanner;
public class QuanLyNhanVien {
    private String tieude;
    private String[] mChon;
    private int cm;
    public QuanLyNhanVien(){}
    public QuanLyNhanVien(String tieude,String []mChon){
        this.tieude=tieude;
        this.mChon=mChon;
    }
//------------------------------------------------
    public  void display()throws Exception{
       System.out.println(tieude);
       for(int i=0;i<mChon.length;i++)
           System.out.println((i+1)+"."+mChon[i]);
       System.out.println("-----------------------------------------------------");   
    }
//-----------------------------------------------    
    public int getselected() throws Exception{
        display();
        Scanner sc=new Scanner(System.in);
        System.out.print("\nMời chọn: ");
        return cm=sc.nextInt();
    }
  
    public void execute(int cm) throws Exception{
        switch(cm){
            case 1: NhanVienBienChe ts=new NhanVienBienChe();
                    ts.Nhap();
                    ts.HienThi();
                    break;
            case 2: NhanVienHopDong dkmt=new NhanVienHopDong();
                    dkmt.Nhap();
                    dkmt.HienThi();
                    break;
           
            case 5: System.exit(0);
                    break;
        }
    }
    public void run () throws Exception{
        while (true){
            int mc=getselected();
            execute(cm);
        }
    }
    
    //---------------------------------------------------    
    public static void main(String[] a) throws Exception{
        
        String tieude = ("Chương trình quản lý lương");
        String[] mChon = {"Nhân viên biên chế","Nhân viên hợp đồng","Kết thúc"};
        System.out.println("-----------------------------------------------------");
        QuanLyNhanVien menu=new QuanLyNhanVien(tieude,mChon);
        menu.run();
}
}