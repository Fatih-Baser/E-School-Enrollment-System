-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 22 May 2020, 11:00:52
-- Sunucu sürümü: 10.4.11-MariaDB
-- PHP Sürümü: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `sistem`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kurs`
--

CREATE TABLE `kurs` (
  `kursid` int(11) NOT NULL,
  `label` varchar(50) COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `kurs`
--

INSERT INTO `kurs` (`kursid`, `label`) VALUES
(1, 'Mudur'),
(50, 'Matematik'),
(51, 'Ingilizce'),
(52, 'Turkce'),
(53, 'Fizik'),
(54, 'Biyoloji'),
(55, 'Edebiyat'),
(56, 'Muzik'),
(57, 'Resim'),
(58, 'Bilgisayar'),
(59, 'Kimya');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `puan`
--

CREATE TABLE `puan` (
  `student_id` int(11) NOT NULL,
  `kurs_id` int(11) NOT NULL,
  `student_puan` float NOT NULL,
  `description` varchar(150) COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `puan`
--

INSERT INTO `puan` (`student_id`, `kurs_id`, `student_puan`, `description`) VALUES
(2, 1, 3, 'iyi'),
(1, 2, 100, '5'),
(5, 1, 100, '4'),
(4, 2, 100, '5'),
(3, 3, 100, '3'),
(23, 1, 100, 'iyi'),
(2, 10, 40, '2'),
(2, 10, 48, '2'),
(1, 13, 33, '2'),
(9, 15, 40, '2'),
(2, 15, 30, '2'),
(10, 16, 100, '5'),
(11, 17, 100, '5'),
(30, 56, 100, '5'),
(30, 55, 100, '5'),
(30, 59, 100, '5');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `student`
--

CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `ad` varchar(50) COLLATE utf8mb4_turkish_ci NOT NULL,
  `soyad` varchar(50) COLLATE utf8mb4_turkish_ci NOT NULL,
  `cinsiyet` varchar(10) COLLATE utf8mb4_turkish_ci NOT NULL,
  `dogum_tarihi` date NOT NULL,
  `telefon` varchar(50) COLLATE utf8mb4_turkish_ci NOT NULL,
  `adres` text COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `student`
--

INSERT INTO `student` (`id`, `ad`, `soyad`, `cinsiyet`, `dogum_tarihi`, `telefon`, `adres`) VALUES
(23, 'Uney', 'Alkis', 'Male', '1997-04-11', '98977879', 'dsokgsfopk'),
(30, 'Fatih', 'Baser', 'Male', '1999-08-21', '572256674', 'Wyscigi');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `ad` varchar(50) COLLATE utf8mb4_turkish_ci NOT NULL,
  `soyad` varchar(50) COLLATE utf8mb4_turkish_ci NOT NULL,
  `brans` varchar(60) COLLATE utf8mb4_turkish_ci NOT NULL,
  `username` varchar(50) COLLATE utf8mb4_turkish_ci NOT NULL,
  `password` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `user`
--

INSERT INTO `user` (`id`, `ad`, `soyad`, `brans`, `username`, `password`) VALUES
(1, 'fatih', '', '', 'Mudur', 123),
(50, 'Fatih', 'Baser', 'Matematik', 'fatih', 123),
(51, 'Omer', 'Tetik', 'Ingilizce', 'Abdullah', 123),
(52, 'Ali', 'Kahraman', 'Turkce', 'ali', 123),
(53, 'zeki', 'Yilmaz', 'Fizik', 'zeki', 123),
(54, 'Ahmet', 'Korkmaz', 'Biyoloji', 'ahmet', 123),
(55, 'Huseyin', 'Keser', 'Edebiyat', 'huseyin', 123),
(56, 'Ahmet', 'Kuscu', 'Muzik', 'ahmet', 123),
(57, 'Mert', 'Korkmaz', 'Resim', 'mert', 123),
(58, 'Hasan', 'Cakir', 'Bilgisayar', 'hasan', 123),
(59, 'fatih', 'baser', 'Kimya', 'fatih', 123);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `kurs`
--
ALTER TABLE `kurs`
  ADD PRIMARY KEY (`kursid`);

--
-- Tablo için indeksler `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `kurs`
--
ALTER TABLE `kurs`
  MODIFY `kursid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=60;

--
-- Tablo için AUTO_INCREMENT değeri `student`
--
ALTER TABLE `student`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- Tablo için AUTO_INCREMENT değeri `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=60;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
