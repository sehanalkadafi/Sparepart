package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import koneksi.koneksi;

/**
 *
 * @author Alkadafi
 */
public class penjualanModel {
    

    String tgl_faktur, no_faktur, nama_ksm, kd_brg, nama_brg, stok, jumlah, harga_satuan, harga_total;
    koneksi db = null;

    public penjualanModel() {
        db = new koneksi();
    }

    public String getTgl_faktur() {
        return tgl_faktur;
    }

    public void setTgl_faktur(String tgl_faktur) {
        this.tgl_faktur = tgl_faktur;
    }

    public String getNo_faktur() {
        return no_faktur;
    }

    public void setNo_faktur(String no_faktur) {
        this.no_faktur = no_faktur;
    }

    public String getNama_ksm() {
        return nama_ksm;
    }

    public void setNama_ksm(String nama_ksm) {
        this.nama_ksm = nama_ksm;
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

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getHarga_satuan() {
        return harga_satuan;
    }

    public void setHarga_satuan(String harga_satuan) {
        this.harga_satuan = harga_satuan;
    }

    public String getHarga_total() {
        return harga_total;
    }

    public void setHarga_total(String harga_total) {
        this.harga_total = harga_total;
    }

    public koneksi getDb() {
        return db;
    }

    public void setDb(koneksi db) {
        this.db = db;
    }

    public List tampil() {
        List<penjualanModel> data = new ArrayList<penjualanModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from penjualan ";
            rs = db.ambilData(sql);
            while (rs.next()) {
                penjualanModel um = new penjualanModel();
                um.setTgl_faktur(rs.getString("tgl_faktur"));
                um.setNo_faktur(rs.getString("no_faktur"));
                um.setNama_ksm(rs.getString("nama_ksm"));
                um.setKd_brg(rs.getString("kd_brg"));
                um.setNama_brg(rs.getString("nama_brg"));
                um.setStok(rs.getString("stok"));
                um.setJumlah(rs.getString("jumlah"));
                um.setHarga_satuan(rs.getString("harga_satuan"));
                um.setHarga_total(rs.getString("harga_total"));
                data.add(um);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }

    public void simpan() {
        try {
            String sql = "INSERT INTO penjualan values('" + tgl_faktur + "', '" + no_faktur + "', '" + nama_ksm + "','" + kd_brg + "', '" + nama_brg + "', '" + stok + "','" + jumlah + "','" + harga_satuan + "', '" + harga_total + "')";
            db.simpanData(sql);
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public void hapus() {
        String sql = "DELETE FROM penjualan WHERE kd_brg='" + kd_brg + "'";
        db.simpanData(sql);
        System.out.println("");
    }
    
     public List cariKDBRG() {
        List<penjualanModel> data = new ArrayList<penjualanModel>();
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM master WHERE kd_brg='"+kd_brg+ "'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                penjualanModel m = new penjualanModel();
                m.setNo_faktur(rs.getString("no_faktur"));
                m.setTgl_faktur(rs.getString("tgl_faktur"));
                m.setNama_ksm(rs.getString("nama_ksm"));
                m.setKd_brg(rs.getString("kd_brg"));
                m.setNama_brg(rs.getString("nama_brg"));
                m.setStok(rs.getString("stok"));
                m.setJumlah(rs.getString("jumlah"));
                m.setHarga_satuan(rs.getString("harga_satuan"));
                m.setHarga_total(rs.getString ("harga_total"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari Kode Barang" + ex);
        }
        return data;

    }

}


