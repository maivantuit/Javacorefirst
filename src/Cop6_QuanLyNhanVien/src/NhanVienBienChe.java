package Cop6_QuanLyNhanVien.src;

public class NhanVienBienChe extends NhanVien {
    public double luong;
    //-------------------------------------------------
    public NhanVienBienChe(){
        
    }

    public NhanVienBienChe(double luong, int maNV, String hoTen, int namSinh, String loaiNV, int mucLuong, double hesoLuong, int luongcaBan) {
        super(maNV, hoTen, namSinh, loaiNV, mucLuong, hesoLuong, luongcaBan);
        this.luong = luong;
    }
    //-----------------------------------------------------

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    //------------------------------------------------------
    @Override
    public void Nhap(){
        super.Nhap();
        this.luong=(int)super.getHesoLuong()*super.getLuongcaBan();
    }
    @Override
    public void HienThi(){
        super.HienThi();
        System.out.println("Lương của nhân viên biên chế: "+this.luong);
    }
    
    
    
}
