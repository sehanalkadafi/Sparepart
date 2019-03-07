<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="newcss.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Penjualan Sparepart</title>
    </head>
    <body>
                     
    <center><h1>Tambah Penjualan</h1></center>
        <h2><a href="index.jsp">B E R A N D A</a></h2>
    <form action="penjualanController?data=penjualan&proses=input-penjualan" method="post">
        <table style="margin:20px auto;">

            <tr>
                <th>No Faktur</th>
                <td><input type="text" name="no_faktur"></td>
            </tr>
            <tr>
                <th>Tgl Faktur</th>
                <td><input type="text" name="tgl_faktur"></td>
            </tr>
            <tr>
                <th>Nama Konsumen</th>
                <td><input type="text" name="nama_ksm"></td>
            </tr>
            <tr>
                <th>Kode Barang</th>
                <td><input type="text" name="kd_brg"></td>
            </tr>
            <tr>
                <th>Nama Barang</th>
                <td><input type="text" name="nama_brg"></td>
            </tr>
            <tr>
                <th>Stok</th>
                <td><input type="text" name="stok"></td>
            </tr>
            <tr>
                <th>Jumlah</th>
                <td><input type="text" name="jumlah"></td>
            </tr>
            <tr>
                <th>Harga Satuan</th>
                <td><input type="text" name="harga_satuan"></td>
            </tr>
            <tr>
                <th>Harga Total</th>
                <td><input type="text" name="harga_total"></td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" value="Simpan"></td>
            </tr>

<!--<center> <a class="tambah" href="barangController?proses=input-barang">Tambah</a></center>-->
        </table>
    </form> 

</body>
</html>
</body>
</html>
