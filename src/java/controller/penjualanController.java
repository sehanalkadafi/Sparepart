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
import model.penjualanModel;

@WebServlet(name = "penjualanController", urlPatterns = {"/penjualanController"})
public class penjualanController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String proses = request.getParameter("proses");
        String action = request.getParameter("action");
        if (proses.equals("menuutama")) {
            response.sendRedirect("masterdata.jsp");
        } else if (proses.equals("input-penjualan")) {
            response.sendRedirect("tambah_penjualan.jsp");
            return;
        } else if (proses.equals("hapus-penjualan")) {
           penjualanModel hm = new penjualanModel();
            hm.setKd_brg(request.getParameter("id"));
            hm.hapus();
             response.sendRedirect("penjualan_barang.jsp");
        }else {
            response.sendRedirect("penjualan_barang.jsp");
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
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        if (data != null) {
            if (data.equals("penjualan")) {
                penjualanModel um = new penjualanModel();

                um.setTgl_faktur(request.getParameter("tgl_faktur"));
                um.setNo_faktur(request.getParameter("no_faktur"));
                um.setNama_ksm(request.getParameter("nama_ksm"));
                um.setKd_brg(request.getParameter("kd_brg"));
                um.setNama_brg(request.getParameter("nama_brg"));
                um.setStok(request.getParameter("stok"));
                um.setJumlah(request.getParameter("jumlah"));
                um.setHarga_satuan(request.getParameter("harga_satuan"));
                um.setHarga_total(request.getParameter("harga_total"));
                if (proses.equals("menupenjualan")) {
                    response.sendRedirect("penjualan_barang.jsp");
                } else if (proses.equals("input-penjualan")) {
                    um.simpan();
                } else if (proses.equals("hapus-penjualan")) {
                    um.hapus();
                }
                    response.sendRedirect("penjualan_barang.jsp");
                }
            }
        }
    }

        
        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
    // </editor-fold>


