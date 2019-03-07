/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.barangModel;

@WebServlet(name = "barangController", urlPatterns = {"/barangController"})
public class barangController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);

        String proses = request.getParameter("proses");
        String action = request.getParameter("action");
        if (proses.equals("menuutama")) {
            response.sendRedirect("masterdata.jsp");
        } else if (proses.equals("input-barang")) {
            response.sendRedirect("tambah_barang.jsp");
            return;
        } else if (proses.equals("edit-barang")) {
            response.sendRedirect("edit_barang.jsp?id=" + request.getParameter("id"));
            return;
        } else if (proses.equals("hapus-barang")) {
            barangModel hm = new barangModel();
            hm.setKd_brg(request.getParameter("id"));
            hm.hapus();
//            response.sendRedirect("index.jsp");
            response.sendRedirect("masterdata.jsp");
        }else if (proses.equals("data_penjualan")) {
            response.sendRedirect("penjualan_barang.jsp");
            return;
        }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);

        String data = request.getParameter("data");
        String proses = request.getParameter("proses");

        if (data != null) {
            if (data.equals("barang")) {
                barangModel um = new barangModel();
                um.setKd_brg(request.getParameter("kd_brg"));
                um.setNama_brg(request.getParameter("nama_brg"));
                um.setStok(request.getParameter("stok"));
                um.setHarga_jual(request.getParameter("harga_jual"));
                um.setHarga_beli(request.getParameter("harga_beli"));
                um.setSatuan(request.getParameter("satuan"));
                um.setKategori(request.getParameter("kategori"));
                if (proses.equals("menuutama")) {
                    response.sendRedirect("masterdata.jsp");
                } else if (proses.equals("input-barang")) {
                    um.simpan();
                } else if (proses.equals("edit-barang")) {
                    um.update();
                } else if (proses.equals("hapus-barang")) {
                    um.hapus();
                }
//                response.sendRedirect("index.jsp");
                response.sendRedirect("masterdata.jsp");
            }
        }
    }
}
/**
 * Returns a short description of the servlet.
 *
 * @return a String containing servlet description
 */
//@Override
//        public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//}

