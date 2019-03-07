<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.barangModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="newcss.css" rel="stylesheet" type="text/css">
        <title>Penjualan Spare Part</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
    </head>
    
    <body>
        
        <center><h1>Penjualan SpareParts<h1></center>
        <h2><a href="index.jsp">B E R A N D A</a></h2>
   
    <table style="margin:50px auto;" border="1">
        <center>
            
        </center>
        <tr>
            <th>Kode Barang</th>
            <th>Nama Barang</th>
            <th>Stok</th>
            <th>Harga Jual</th>
            <th>Harga Beli</th>
            <th>Satuan</th>
            <th>Kategori</th>
            <th>Action</th>
        </tr>
        <div id="bok">
            <div id="header"></div>
            <div id="main"></div>
            <div id="footer"></div>
            
                </div>

        <%
            barangModel km = new barangModel();
            List<barangModel> data = new ArrayList<barangModel>();
            String ket = request.getParameter("ket");
            if (ket == null) {
                data = km.tampil();
            }
            for (int x = 0; x < data.size(); x++) {
        %>
        <tr>

            <td><%=data.get(x).getKd_brg()%></td>
            <td><%=data.get(x).getNama_brg()%></td>
            <td><%=data.get(x).getStok()%></td>
            <td><%=data.get(x).getHarga_jual()%></td>
            <td><%=data.get(x).getHarga_beli()%></td>
            <td><%=data.get(x).getSatuan()%></td>
            <td><%=data.get(x).getKategori()%></td>
            <td>
                <a href="barangController?proses=edit-barang&id=<%=data.get(x).getKd_brg()%>">Edit</a>
                <a href="barangController?proses=hapus-barang&id=<%=data.get(x).getKd_brg()%>">Hapus</a>
                <a href="barangController?proses=input-barang&id"<%=data.get(x).getKd_brg()%>">Tambah</a>
            </td>
        </tr>
        <%}%>

    </table>

</body>
</html>
