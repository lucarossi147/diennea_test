-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Creato il: Gen 17, 2021 alle 19:17
-- Versione del server: 10.4.10-MariaDB
-- Versione PHP: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `diennea`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `persona`
--

CREATE TABLE `persona` (
  `person_id` int(11) NOT NULL,
  `name` char(255) COLLATE utf8_bin NOT NULL,
  `surname` char(255) COLLATE utf8_bin NOT NULL,
  `age` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dump dei dati per la tabella `persona`
--

INSERT INTO `persona` (`person_id`, `name`, `surname`, `age`) VALUES
(3, 'Test3', 'Test3', 50),
(5, 'Test5', 'Test5', 50),
(6, 'Test6', 'Test6', 50),
(7, 'Test1', 'Test1', 50),
(8, 'Test2', 'Test2', 50),
(9, 'Test3', 'Test3', 50),
(10, 'Test4', 'Test4', 50),
(11, 'Test5', 'Test5', 50),
(12, 'Test6', 'Test6', 50),
(13, 'Test1', 'Test1', 50),
(14, 'Test2', 'Test2', 50),
(15, 'Test3', 'Test3', 50),
(16, 'Test4', 'Test4', 50),
(17, 'Test5', 'Test5', 50),
(18, 'Test6', 'Test6', 50),
(19, 'Test1', 'Test1', 50),
(20, 'Test2', 'Test2', 50),
(21, 'Test3', 'Test3', 50),
(22, 'Test4', 'Test4', 50),
(23, 'Test5', 'Test5', 50),
(24, 'Test6', 'Test6', 50),
(25, 'Test1', 'Test1', 50),
(26, 'Test2', 'Test2', 50),
(27, 'Test3', 'Test3', 50),
(28, 'Test4', 'Test4', 50),
(29, 'Test5', 'Test5', 50),
(30, 'Test6', 'Test6', 50),
(31, 'Test1', 'Test1', 50),
(32, 'Test2', 'Test2', 50),
(33, 'Test3', 'Test3', 50),
(34, 'Test4', 'Test4', 50),
(35, 'Test5', 'Test5', 50),
(36, 'Test6', 'Test6', 50),
(37, 'Test1', 'Test1', 50),
(38, 'Test2', 'Test2', 50),
(39, 'Test3', 'Test3', 50),
(40, 'Test4', 'Test4', 50),
(41, 'Test5', 'Test5', 50),
(42, 'Test6', 'Test6', 50),
(43, 'Test1', 'Test1', 50),
(44, 'Test2', 'Test2', 50),
(45, 'Test3', 'Test3', 50),
(46, 'Test4', 'Test4', 50),
(47, 'Test5', 'Test5', 50),
(48, 'Test6', 'Test6', 50),
(49, 'Test1', 'Test1', 50),
(50, 'Test2', 'Test2', 21),
(51, 'Test3', 'Test3', 22),
(52, 'Test4', 'Test4', 22),
(53, 'Test5', 'Test5', 22),
(54, 'Test6', 'Test6', 21),
(55, 'Test1', 'Test1', 21),
(56, 'Test2', 'Test2', 21),
(57, 'Test3', 'Test3', 22),
(58, 'Test4', 'Test4', 22),
(59, 'Test5', 'Test5', 22),
(60, 'Test6', 'Test6', 21),
(61, 'Test1', 'Test1', 21),
(62, 'Test2', 'Test2', 21),
(63, 'Test3', 'Test3', 22),
(64, 'Test4', 'Test4', 22),
(65, 'Test5', 'Test5', 22),
(66, 'Test6', 'Test6', 21),
(67, 'Test1', 'Test1', 21),
(68, 'Test2', 'Test2', 21),
(69, 'Test3', 'Test3', 22),
(70, 'Test4', 'Test4', 22),
(71, 'Test5', 'Test5', 22),
(72, 'Test6', 'Test6', 21),
(73, 'Test1', 'Test1', 21),
(74, 'Test2', 'Test2', 21),
(75, 'Test3', 'Test3', 22),
(76, 'Test4', 'Test4', 22),
(77, 'Test5', 'Test5', 22),
(78, 'Test6', 'Test6', 21),
(79, 'Test1', 'Test1', 21),
(80, 'Test2', 'Test2', 21),
(81, 'Test3', 'Test3', 22),
(82, 'Test4', 'Test4', 22),
(83, 'Test5', 'Test5', 22),
(84, 'Test6', 'Test6', 21),
(85, 'Test1', 'Test1', 21),
(86, 'Test2', 'Test2', 21),
(87, 'Test3', 'Test3', 22),
(88, 'Test4', 'Test4', 22),
(89, 'Test5', 'Test5', 22),
(90, 'Test6', 'Test6', 21),
(91, 'Test1', 'Test1', 21),
(92, 'Test2', 'Test2', 21),
(93, 'Test3', 'Test3', 22),
(94, 'Test4', 'Test4', 22),
(95, 'Test5', 'Test5', 22),
(96, 'Test6', 'Test6', 21),
(97, 'Test1', 'Test1', 21),
(98, 'Test2', 'Test2', 21),
(99, 'Test3', 'Test3', 22),
(100, 'Test4', 'Test4', 22),
(101, 'Test5', 'Test5', 22),
(102, 'Test6', 'Test6', 21),
(103, 'Test1', 'Test1', 21),
(104, 'Test2', 'Test2', 21),
(105, 'Test3', 'Test3', 22),
(106, 'Test4', 'Test4', 22),
(107, 'Test5', 'Test5', 22),
(108, 'Test6', 'Test6', 21),
(109, 'Test1', 'Test1', 21),
(110, 'Test2', 'Test2', 21),
(111, 'Test3', 'Test3', 22),
(112, 'Test4', 'Test4', 22),
(113, 'Test5', 'Test5', 22),
(114, 'Test6', 'Test6', 21),
(115, 'Test1', 'Test1', 21),
(116, 'Test2', 'Test2', 21),
(117, 'Test3', 'Test3', 22),
(118, 'Test4', 'Test4', 22),
(119, 'Test5', 'Test5', 22),
(120, 'Test6', 'Test6', 21),
(121, 'Test1', 'Test1', 21),
(122, 'Test2', 'Test2', 21),
(123, 'Test3', 'Test3', 22),
(124, 'Test4', 'Test4', 22),
(125, 'Test5', 'Test5', 22),
(126, 'Test6', 'Test6', 21),
(127, 'Test1', 'Test1', 21),
(128, 'Test2', 'Test2', 21),
(129, 'Test3', 'Test3', 22),
(130, 'Test4', 'Test4', 22),
(131, 'Test5', 'Test5', 22),
(132, 'Test6', 'Test6', 21),
(133, 'Test1', 'Test1', 21),
(134, 'Test2', 'Test2', 21),
(135, 'Test3', 'Test3', 22),
(136, 'Test4', 'Test4', 22),
(137, 'Test5', 'Test5', 22),
(138, 'Test6', 'Test6', 21),
(139, 'Test1', 'Test1', 21),
(140, 'Test2', 'Test2', 21),
(141, 'Test3', 'Test3', 22),
(142, 'Test4', 'Test4', 22),
(143, 'Test5', 'Test5', 22),
(144, 'Test6', 'Test6', 21),
(145, 'Test1', 'Test1', 21),
(146, 'Test2', 'Test2', 21),
(147, 'Test3', 'Test3', 22),
(148, 'Test4', 'Test4', 22),
(149, 'Test5', 'Test5', 22),
(150, 'Test6', 'Test6', 21),
(151, 'Test1', 'Test1', 21),
(152, 'Test2', 'Test2', 21),
(153, 'Test3', 'Test3', 22),
(154, 'Test4', 'Test4', 22),
(155, 'Test5', 'Test5', 22),
(156, 'Test6', 'Test6', 21),
(157, 'Test1', 'Test1', 21),
(158, 'Test2', 'Test2', 21),
(159, 'Test3', 'Test3', 22),
(160, 'Test4', 'Test4', 22),
(161, 'Test5', 'Test5', 22),
(162, 'Test6', 'Test6', 21),
(163, 'Test1', 'Test1', 21),
(164, 'Test2', 'Test2', 21),
(165, 'Test3', 'Test3', 22),
(166, 'Test4', 'Test4', 22),
(167, 'Test5', 'Test5', 22),
(168, 'Test6', 'Test6', 21),
(169, 'Test1', 'Test1', 21),
(170, 'Test2', 'Test2', 21),
(171, 'Test3', 'Test3', 22),
(172, 'Test4', 'Test4', 22),
(173, 'Test5', 'Test5', 22),
(174, 'Test6', 'Test6', 21),
(175, 'Test1', 'Test1', 21),
(176, 'Test2', 'Test2', 21),
(177, 'Test3', 'Test3', 22),
(178, 'Test4', 'Test4', 22),
(179, 'Test5', 'Test5', 22),
(180, 'Test6', 'Test6', 21);

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`person_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
