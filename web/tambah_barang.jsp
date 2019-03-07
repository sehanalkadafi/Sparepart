<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="newcss.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Penjualan Sparepart</title>
    </head>     
    <body>                         
    <center><h1>Tambah Barang </h1></center>
        <h2><a href="index.jsp">B E R A N D A</a></h2>
    <form action="barangController?data=barang&proses=input-barang" method="post">
        <table style="margin:20px auto;">

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
                <th>Harga Jual</th>
                <td><input type="text" name="harga_jual"></td>
            </tr>
            <tr>
                <th>Harga Beli</th>
                <td><input type="text" name="harga_beli"></td>
            </tr>
            <tr>
                <th>Satuan</th>
                <td><input type="text" name="satuan"></td>
            </tr>
            <tr>
                <th>Kategori</th>
                <td><input type="text" name="kategori"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Tambah"></td>
            </tr>

<!--    <center><a class="tambah" href="barangcontroller?proses=input-barang">Tambah</a></center>-->
        </table>
    </form> 

</body>
</html>
</body>
</html>
