package com.example.demo;

public class Sach {
    private String ID, Ten, LoaiSach, TacGia,Gia;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getLoaiSach() {
        return LoaiSach;
    }

    public void setLoaiSach(String loaiSach) {
        LoaiSach = loaiSach;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String tacGia) {
        TacGia = tacGia;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String gia) {
        Gia = gia;
    }

    public Sach(String ID, String ten, String loaiSach, String tacGia, String gia) {
        this.ID = ID;
        Ten = ten;
        LoaiSach = loaiSach;
        TacGia = tacGia;
        Gia = gia;
    }
}
