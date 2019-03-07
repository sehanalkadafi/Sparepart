<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.barangModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="newcss.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Barang</title>
    </head>
    
    <body>
        
    <center><h1>Edit Barang</h1></center>
        <h2><a href="index.jsp">B E R A N D A</a></h2>
    <form action="barangController?data=barang&proses=edit-barang" method="post">
        <table style="margin:20px auto;">
            <%
                String id = request.getParameter("id");
                barangModel km = new barangModel();
                km.setKd_brg(id);
                List<barangModel> data = new ArrayList<barangModel>();
                data = km.cariKDBRG();
                if (data.size() > 0) {

            %>
            <tr>
                <th>Kode Barang</th>
                <td><input type="text" name="kd_brg" value="<%=data.get(0).getKd_brg()%>"></td>
            </tr>
            <tr>
                <th>Nama Barang</th>
                <td><input type="text" name="nama_brg" value="<%=data.get(0).getNama_brg()%>"></td>
                <td><input type="hidden" name="id" value="<%=data.get(0).getKd_brg()%>"></td>
            </tr>
            <tr>
                <th>Stok</th>
                <td><input type="text" name="stok" value="<%=data.get(0).getStok()%>"></td>
                <td><input type="hidden" name="id" value="<%=data.get(0).getKd_brg()%>"></td>
            </tr>
            <tr>
                <th>Harga Jual</th>
                <td><input type="text" name="harga_jual" value="<%=data.get(0).getHarga_jual()%>"></td>
                <td><input type="hidden" name="id" value="<%=data.get(0).getKd_brg()%>"></td>
            </tr>
            <tr>
                <th>Harga Beli</th>
                <td><input type="text" name="harga_beli" value="<%=data.get(0).getHarga_beli()%>"></td>
                <td><input type="hidden" name="id" value="<%=data.get(0).getKd_brg()%>"></td>
            </tr>
            <tr>
                <th>Satuan</th>
                <td><input type="text" name="satuan" value="<%=data.get(0).getSatuan()%>"></td>
                <td><input type="hidden" name="id" value="<%=data.get(0).getKd_brg()%>"></td>
            </tr>
            <tr>
                <th>Kategori</th>
                <td><input type="text" name="kategori" value="<%=data.get(0).getKategori()%>"></td>
                <td><input type="hidden" name="id" value="<%=data.get(0).getKd_brg()%>"></td>
            </tr>
            <tr>
                <td></td>
                <th><input type="submit" value="Edit"></th>
            </tr>
            <%}%>
        </table>

    </form> 

</body>
</html>
