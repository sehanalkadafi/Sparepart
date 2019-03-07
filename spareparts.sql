-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 07, 2019 at 09:24 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `spareparts`
--

-- --------------------------------------------------------

--
-- Table structure for table `master`
--

CREATE TABLE IF NOT EXISTS `master` (
  `kd_brg` varchar(50) NOT NULL,
  `nama_brg` varchar(100) NOT NULL,
  `stok` int(100) NOT NULL,
  `harga_jual` double NOT NULL,
  `harga_beli` double NOT NULL,
  `satuan` varchar(20) NOT NULL,
  `kategori` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master`
--

INSERT INTO `master` (`kd_brg`, `nama_brg`, `stok`, `harga_jual`, `harga_beli`, `satuan`, `kategori`) VALUES
('a253', 'Lampu', 12, 30000, 25000, 'pcs', 'accesorries');

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE IF NOT EXISTS `penjualan` (
  `tgl_faktur` date NOT NULL,
  `no_faktur` varchar(50) NOT NULL,
  `nama_ksm` varchar(100) NOT NULL,
  `kd_brg` varchar(50) NOT NULL,
  `nama_brg` varchar(100) NOT NULL,
  `stok` int(100) NOT NULL,
  `jumlah` double NOT NULL,
  `harga_satuan` double NOT NULL,
  `harga_total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`tgl_faktur`, `no_faktur`, `nama_ksm`, `kd_brg`, `nama_brg`, `stok`, `jumlah`, `harga_satuan`, `harga_total`) VALUES
('2019-03-05', '1231', 'dadi', '213', 'Ban', 5, 2, 20000, 40000),
('2018-01-06', '24456', 'dayat', '010', 'Sil', 50, 2, 10000, 20000);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
