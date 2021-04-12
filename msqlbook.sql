-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th4 05, 2021 lúc 06:16 SA
-- Phiên bản máy phục vụ: 10.1.21-MariaDB
-- Phiên bản PHP: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `msqlbook`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loaisach`
--

CREATE TABLE `loaisach` (
  `MaLoaiS` varchar(50) CHARACTER SET utf8 NOT NULL,
  `TenLoaiS` varchar(50) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieumuon`
--

CREATE TABLE `phieumuon` (
  `NgayMuon` date NOT NULL,
  `NgayTra` date NOT NULL,
  `MaPM` varchar(50) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieumuonchitiet`
--

CREATE TABLE `phieumuonchitiet` (
  `MaPCT` varchar(50) CHARACTER SET utf8 NOT NULL,
  `MaPM` varchar(50) CHARACTER SET utf8 NOT NULL,
  `MaS` varchar(50) CHARACTER SET utf8 NOT NULL,
  `SoLuong` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sach`
--

CREATE TABLE `sach` (
  `MaS` varchar(50) CHARACTER SET utf8 NOT NULL,
  `TenSach` varchar(50) CHARACTER SET utf8 NOT NULL,
  `MoTaNgan` varchar(50) CHARACTER SET utf8 NOT NULL,
  `MoTaChiTiet` varchar(50) CHARACTER SET utf8mb4 NOT NULL,
  `MaLoaiS` varchar(50) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `TaiKhoan` varchar(50) CHARACTER SET utf8 NOT NULL,
  `MatKhau` varchar(50) CHARACTER SET utf8 NOT NULL,
  `id` int(21) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`TaiKhoan`, `MatKhau`, `id`) VALUES
('us001', '123456', 1);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `loaisach`
--
ALTER TABLE `loaisach`
  ADD PRIMARY KEY (`MaLoaiS`);

--
-- Chỉ mục cho bảng `phieumuon`
--
ALTER TABLE `phieumuon`
  ADD PRIMARY KEY (`MaPM`),
  ADD UNIQUE KEY `MaPM` (`MaPM`),
  ADD KEY `MaPM_2` (`MaPM`),
  ADD KEY `MaPM_3` (`MaPM`);

--
-- Chỉ mục cho bảng `phieumuonchitiet`
--
ALTER TABLE `phieumuonchitiet`
  ADD PRIMARY KEY (`MaPCT`),
  ADD KEY `MaS` (`MaS`),
  ADD KEY `MaS_2` (`MaS`),
  ADD KEY `MaPM` (`MaPM`);

--
-- Chỉ mục cho bảng `sach`
--
ALTER TABLE `sach`
  ADD PRIMARY KEY (`MaS`),
  ADD KEY `MaLoaiS` (`MaLoaiS`);

--
-- Chỉ mục cho bảng `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`,`TaiKhoan`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `user`
--
ALTER TABLE `user`
  MODIFY `id` int(21) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `phieumuonchitiet`
--
ALTER TABLE `phieumuonchitiet`
  ADD CONSTRAINT `phieumuonchitiet_ibfk_1` FOREIGN KEY (`MaS`) REFERENCES `sach` (`MaS`),
  ADD CONSTRAINT `phieumuonchitiet_ibfk_2` FOREIGN KEY (`MaPM`) REFERENCES `phieumuon` (`MaPM`);

--
-- Các ràng buộc cho bảng `sach`
--
ALTER TABLE `sach`
  ADD CONSTRAINT `sach_ibfk_1` FOREIGN KEY (`MaLoaiS`) REFERENCES `loaisach` (`MaLoaiS`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
