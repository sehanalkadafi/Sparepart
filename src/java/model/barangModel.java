package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import koneksi.koneksi;

public class barangModel {
        String kd_brg, nama_brg, stok, harga_jual, harga_beli, satuan, kategori;
    koneksi db = null;

    public barangModel() {
        db = new koneksi();
    }

    public String getKd_brg() {
        return kd_brg;
    }

    public void setKd_brg(String kd_brg) {
        this.kd_brg = kd_brg;
    }

    public String getNama_brg() {
        return nama_brg;
    }

    public void setNama_brg(String nama_brg) {
        this.nama_brg = nama_brg;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public String getHarga_jual() {
        return harga_jual;
    }

    public void setHarga_jual(String harga_jual) {
        this.harga_jual = harga_jual;
    }

    public String getHarga_beli() {
        return harga_beli;
    }

    public void setHarga_beli(String harga_beli) {
        this.harga_beli = harga_beli;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public koneksi getDb() {
        return db;
    }

    public void setDb(koneksi db) {
        this.db = db;
    }

    public List tampil() {
        List<barangModel> data = new ArrayList<barangModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from master order by nama_brg asc";
            rs = db.ambilData(sql);
            while (rs.next()) {
                barangModel um = new barangModel();
                um.setKd_brg(rs.getString("kd_brg"));
                um.setNama_brg(rs.getString("nama_brg"));
                um.setStok(rs.getString("stok")); 
                um.setHarga_jual(rs.getString("harga_jual"));
                um.setHarga_beli(rs.getString("harga_beli"));
                um.setSatuan(rs.getString("satuan"));
                um.setKategori(rs.getString("kategori"));
                data.add(um);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }


    public void simpan() {
        String sql = "INSERT INTO master values('" + kd_brg + "', '" + nama_brg + "', '" + stok + "', '" + harga_jual + "','" + harga_beli + "','" + satuan + "','" + kategori + "')";
        db.simpanData(sql);
    }


    public void update() {
        String sql = "UPDATE master SET nama_brg='"+nama_brg+"',stok='"+stok+"',harga_jual='"+harga_jual + "',harga_beli='"+harga_beli+"',satuan='"+satuan+"',kategori='"+kategori+"' WHERE kd_brg='"+kd_brg+"'";
        db.simpanData(sql);
    }
     public void hapus(){
        String sql="DELETE FROM master WHERE kd_brg='"+kd_brg+"'";
        db.simpanData(sql);
        System.out.println("");
    }

    public List cariKDBRG() {
        List<barangModel> data = new ArrayList<barangModel>();
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM master WHERE kd_brg='"+kd_brg+ "'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                barangModel m = new barangModel();
                m.setKd_brg(rs.getString("kd_brg"));
                m.setNama_brg(rs.getString("nama_brg"));
                m.setStok(rs.getString("stok"));
                m.setHarga_jual(rs.getString("harga_jual"));
                m.setHarga_beli(rs.getString("harga_beli"));
                m.setSatuan(rs.getString("satuan"));
                m.setKategori(rs.getString("kategori"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari Kode Barang" + ex);
        }
        return data;

    }
   
    
}
    

