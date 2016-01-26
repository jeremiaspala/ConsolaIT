-- phpMyAdmin SQL Dump
-- version 3.3.7deb7
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 11, 2016 at 04:48 PM
-- Server version: 5.1.73
-- PHP Version: 5.3.3-7+squeeze19

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `medical`
--

-- --------------------------------------------------------

--
-- Table structure for table `internos`
--

CREATE TABLE IF NOT EXISTS `internos` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(255) CHARACTER SET latin1 COLLATE latin1_spanish_ci DEFAULT NULL,
  `Telefono` varchar(255) CHARACTER SET latin1 COLLATE latin1_spanish_ci DEFAULT NULL,
  `Directo` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `Area` varchar(255) CHARACTER SET latin1 COLLATE latin1_spanish_ci DEFAULT NULL,
  `Radio` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=388 ;



-- --------------------------------------------------------

--
-- Table structure for table `inventariopc`
--

CREATE TABLE IF NOT EXISTS `inventariopc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ip` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nombrentbios` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `usuario` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sector` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `numeroinventario` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `mother` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `micro` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `memoria` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `unidadmemoria` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `seriemonitor` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `observaciones` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=330 ;



-- --------------------------------------------------------

--
-- Table structure for table `reparaciones`
--

CREATE TABLE IF NOT EXISTS `reparaciones` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idequipo` int(11) NOT NULL,
  `accion` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `descripcion` text COLLATE utf8_unicode_ci NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=4 ;
