-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Feb 18, 2021 at 07:54 PM
-- Server version: 8.0.23-0ubuntu0.20.04.1
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `racer_game`
--

-- --------------------------------------------------------

--
-- Table structure for table `circuits`
--

CREATE TABLE `circuits` (
  `circuit_id` int NOT NULL,
  `circuit_name` varchar(40) NOT NULL,
  `distance` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `circuits`
--

INSERT INTO `circuits` (`circuit_id`, `circuit_name`, `distance`) VALUES
(3, 'Monaco', 4.5),
(4, 'Interlagos', 4.3),
(5, 'Nurburing', 8.3),
(6, 'Interlagos 1974', 2.8);

-- --------------------------------------------------------

--
-- Table structure for table `players`
--

CREATE TABLE `players` (
  `player_id` int NOT NULL,
  `name` varchar(50) NOT NULL,
  `user_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `players`
--

INSERT INTO `players` (`player_id`, `name`, `user_name`) VALUES
(1, 'daniel j', 'prueba1'),
(2, 'eduardo r', 'prueba2'),
(3, 'julian f', 'prueba3'),
(4, 'david r', 'prueba4'),
(5, 'monica R', 'prueba5'),
(6, 'daniel', 'prueba6'),
(7, 'jose', 'jose1'),
(8, 'camilo', 'camilo1');

-- --------------------------------------------------------

--
-- Table structure for table `players_circuits`
--

CREATE TABLE `players_circuits` (
  `players_circuit_id` int NOT NULL,
  `player_id` int NOT NULL,
  `circuit_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `player_podium`
--

CREATE TABLE `player_podium` (
  `player_podium_id` int NOT NULL,
  `players_id` int NOT NULL,
  `podium_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `player_podium`
--

INSERT INTO `player_podium` (`player_podium_id`, `players_id`, `podium_id`) VALUES
(1, 1, 1),
(2, 2, 1),
(3, 3, 1);

-- --------------------------------------------------------

--
-- Table structure for table `podium`
--

CREATE TABLE `podium` (
  `podium_id` int NOT NULL,
  `first_place` varchar(50) NOT NULL,
  `second_place` varchar(50) NOT NULL,
  `third_place` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `podium`
--

INSERT INTO `podium` (`podium_id`, `first_place`, `second_place`, `third_place`) VALUES
(1, 'prueba1', 'prueba2', 'prueba3'),
(2, 'prueba3', 'prueba1', 'prueba6'),
(3, 'prueba1', 'prueba3', 'prueba5'),
(4, 'jose1', 'prueba3', 'prueba5'),
(5, 'prueba2', 'camilo1', 'jose1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `circuits`
--
ALTER TABLE `circuits`
  ADD PRIMARY KEY (`circuit_id`);

--
-- Indexes for table `players`
--
ALTER TABLE `players`
  ADD PRIMARY KEY (`player_id`),
  ADD UNIQUE KEY `unik` (`user_name`);

--
-- Indexes for table `players_circuits`
--
ALTER TABLE `players_circuits`
  ADD PRIMARY KEY (`players_circuit_id`),
  ADD KEY `fk_ciruit_player` (`circuit_id`),
  ADD KEY `fk_player_circuit` (`player_id`);

--
-- Indexes for table `player_podium`
--
ALTER TABLE `player_podium`
  ADD PRIMARY KEY (`player_podium_id`),
  ADD KEY `fk_podium` (`podium_id`),
  ADD KEY `fk_player` (`players_id`);

--
-- Indexes for table `podium`
--
ALTER TABLE `podium`
  ADD PRIMARY KEY (`podium_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `circuits`
--
ALTER TABLE `circuits`
  MODIFY `circuit_id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `players`
--
ALTER TABLE `players`
  MODIFY `player_id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `players_circuits`
--
ALTER TABLE `players_circuits`
  MODIFY `players_circuit_id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `player_podium`
--
ALTER TABLE `player_podium`
  MODIFY `player_podium_id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `podium`
--
ALTER TABLE `podium`
  MODIFY `podium_id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `players_circuits`
--
ALTER TABLE `players_circuits`
  ADD CONSTRAINT `fk_ciruit_player` FOREIGN KEY (`circuit_id`) REFERENCES `circuits` (`circuit_id`),
  ADD CONSTRAINT `fk_player_circuit` FOREIGN KEY (`player_id`) REFERENCES `players` (`player_id`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Constraints for table `player_podium`
--
ALTER TABLE `player_podium`
  ADD CONSTRAINT `fk_player` FOREIGN KEY (`players_id`) REFERENCES `players` (`player_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `fk_podium` FOREIGN KEY (`podium_id`) REFERENCES `podium` (`podium_id`) ON DELETE RESTRICT ON UPDATE RESTRICT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
