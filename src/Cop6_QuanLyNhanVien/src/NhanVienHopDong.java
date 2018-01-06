package Cop6_QuanLyNhanVien.src;


public class NhanVienHopDong extends NhanVien{
    public double luong;
    //--------------------------------------------------------
    public NhanVienHopDong(){
        
    }
    public NhanVienHopDong(double luong, int maNV, String hoTen, int namSinh, String loaiNV, int mucLuong, double hesoLuong, int luongcaBan) {
        super(maNV, hoTen, namSinh, loaiNV, mucLuong, hesoLuong, luongcaBan);
        this.luong = luong;
    }
    public double getLuong() {
        return luong;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }
    //----------------------------------------------------------
    public void Nhap(){
        super.Nhap();
        this.luong=super.getMucLuong()+super.getMucLuong()*(10/100);
    }
    @Override
    public void HienThi(){
        super.HienThi();
        System.out.println("Lương của nhân viên hợp đồng: "+this.luong);
    }
    
}
