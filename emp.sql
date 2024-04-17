-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 17, 2024 at 11:04 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `emp`
--

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `catagoryid` int(11) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `category_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`catagoryid`, `description`, `category_name`) VALUES
(2, 'hi', NULL),
(4, 'djahkjdhas', NULL),
(52, 'djahkjdhas', NULL),
(53, 'djahkjdhas', NULL),
(54, 'djahkjdhas', NULL),
(102, 'djahkjdhas', NULL),
(152, 'djahkjdhas', NULL),
(153, 'djahkjdhas', NULL),
(154, 'djahkjdhas', 'd;laksd'),
(155, 'djahkjdhas', 'd;laksd'),
(156, 'kota', 'd;laksd'),
(202, NULL, NULL),
(203, NULL, NULL),
(204, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `category_seq`
--

CREATE TABLE `category_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `category_seq`
--

INSERT INTO `category_seq` (`next_val`) VALUES
(301);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customerid` int(11) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `contact_info` varchar(255) DEFAULT NULL,
  `customer_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customerid`, `address`, `contact_info`, `customer_name`) VALUES
(3, 'ramallah', NULL, NULL),
(52, NULL, NULL, NULL),
(53, NULL, NULL, NULL),
(54, NULL, NULL, NULL),
(55, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `customer_seq`
--

CREATE TABLE `customer_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer_seq`
--

INSERT INTO `customer_seq` (`next_val`) VALUES
(151);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `employeeid` int(11) NOT NULL,
  `contact_information` varchar(255) DEFAULT NULL,
  `employee_name` varchar(255) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  `war_houseid_war_house_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`employeeid`, `contact_information`, `employee_name`, `position`, `salary`, `war_houseid_war_house_id`) VALUES
(3, NULL, NULL, 'man', NULL, NULL),
(4, NULL, NULL, 'man', NULL, NULL),
(5, NULL, NULL, NULL, NULL, NULL),
(6, NULL, NULL, 'manager', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `employee_seq`
--

CREATE TABLE `employee_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee_seq`
--

INSERT INTO `employee_seq` (`next_val`) VALUES
(101);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `orderid` int(11) NOT NULL,
  `delivery_date` date DEFAULT NULL,
  `order_date` date DEFAULT NULL,
  `total_amount` int(11) DEFAULT NULL,
  `customerid_customerid` int(11) DEFAULT NULL,
  `employeeid_employeeid` int(11) DEFAULT NULL,
  `productid_productid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`orderid`, `delivery_date`, `order_date`, `total_amount`, `customerid_customerid`, `employeeid_employeeid`, `productid_productid`) VALUES
(2, NULL, NULL, NULL, NULL, NULL, NULL),
(3, NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `orders_seq`
--

CREATE TABLE `orders_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orders_seq`
--

INSERT INTO `orders_seq` (`next_val`) VALUES
(101);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `productid` int(11) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  `quantity_available` int(11) DEFAULT NULL,
  `categoryid_catagoryid` int(11) DEFAULT NULL,
  `supplierid_supplierid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`productid`, `description`, `price`, `product_name`, `quantity_available`, `categoryid_catagoryid`, `supplierid_supplierid`) VALUES
(1, 'sed', 100, 'prod', 15, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `product_seq`
--

CREATE TABLE `product_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `product_seq`
--

INSERT INTO `product_seq` (`next_val`) VALUES
(101);

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `supplierid` int(11) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `contact_information` varchar(255) DEFAULT NULL,
  `supplier_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`supplierid`, `address`, `contact_information`, `supplier_name`) VALUES
(2, 'Birzeit', 'org2@hmail.com', 'ahmad'),
(3, 'surda', 'org@email.com', 'khalid');

-- --------------------------------------------------------

--
-- Table structure for table `supplier_seq`
--

CREATE TABLE `supplier_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `supplier_seq`
--

INSERT INTO `supplier_seq` (`next_val`) VALUES
(101);

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `transactionid` int(11) NOT NULL,
  `quantity` int(11) DEFAULT NULL,
  `total_price` int(11) DEFAULT NULL,
  `transaction_date` date DEFAULT NULL,
  `transaction_type` varchar(255) DEFAULT NULL,
  `employeeid_employeeid` int(11) DEFAULT NULL,
  `productid_productid` int(11) DEFAULT NULL,
  `warhouseid_war_house_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`transactionid`, `quantity`, `total_price`, `transaction_date`, `transaction_type`, `employeeid_employeeid`, `productid_productid`, `warhouseid_war_house_id`) VALUES
(2, NULL, NULL, NULL, 'success', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `transaction_seq`
--

CREATE TABLE `transaction_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaction_seq`
--

INSERT INTO `transaction_seq` (`next_val`) VALUES
(101);

-- --------------------------------------------------------

--
-- Table structure for table `war_house`
--

CREATE TABLE `war_house` (
  `war_house_id` int(11) NOT NULL,
  `capacity` int(11) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `war_house`
--

INSERT INTO `war_house` (`war_house_id`, `capacity`, `location`) VALUES
(853, 5, 'Kota'),
(854, NULL, 'kota'),
(902, 1, 'kota'),
(952, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `war_house_seq`
--

CREATE TABLE `war_house_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `war_house_seq`
--

INSERT INTO `war_house_seq` (`next_val`) VALUES
(1051);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`catagoryid`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customerid`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`employeeid`),
  ADD KEY `FK959rgcdp8au4tbqqyqa4ip5mt` (`war_houseid_war_house_id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`orderid`),
  ADD UNIQUE KEY `UK_hh1wlvuhbh804u6tat2vaef86` (`customerid_customerid`),
  ADD UNIQUE KEY `UK_6mh1oifi5afy047guhvgo60y2` (`employeeid_employeeid`),
  ADD KEY `FK6gdxaxwupldiv5pr9yqg9ikhg` (`productid_productid`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`productid`),
  ADD KEY `FKmvya5afp6prbwawbkx1b0ryva` (`categoryid_catagoryid`),
  ADD KEY `FKasa5a7uvr6sp8f5mrulyt2gsa` (`supplierid_supplierid`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`supplierid`);

--
-- Indexes for table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`transactionid`),
  ADD KEY `FKttv6xhixlb39s4hjngo871xu` (`employeeid_employeeid`),
  ADD KEY `FK4usnt9ay4fneqml3tj39s3ul9` (`productid_productid`),
  ADD KEY `FK68s8ww2qgepthnj212rj74qji` (`warhouseid_war_house_id`);

--
-- Indexes for table `war_house`
--
ALTER TABLE `war_house`
  ADD PRIMARY KEY (`war_house_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `employee`
--
ALTER TABLE `employee`
  ADD CONSTRAINT `FK959rgcdp8au4tbqqyqa4ip5mt` FOREIGN KEY (`war_houseid_war_house_id`) REFERENCES `war_house` (`war_house_id`);

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `FK6gdxaxwupldiv5pr9yqg9ikhg` FOREIGN KEY (`productid_productid`) REFERENCES `product` (`productid`),
  ADD CONSTRAINT `FK9oay5l93jlgdy718j5979m62u` FOREIGN KEY (`employeeid_employeeid`) REFERENCES `employee` (`employeeid`),
  ADD CONSTRAINT `FKi9eks6f2vyqqfc1gaokh6xlnb` FOREIGN KEY (`customerid_customerid`) REFERENCES `customer` (`customerid`);

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `FKasa5a7uvr6sp8f5mrulyt2gsa` FOREIGN KEY (`supplierid_supplierid`) REFERENCES `supplier` (`supplierid`),
  ADD CONSTRAINT `FKmvya5afp6prbwawbkx1b0ryva` FOREIGN KEY (`categoryid_catagoryid`) REFERENCES `category` (`catagoryid`);

--
-- Constraints for table `transaction`
--
ALTER TABLE `transaction`
  ADD CONSTRAINT `FK4usnt9ay4fneqml3tj39s3ul9` FOREIGN KEY (`productid_productid`) REFERENCES `product` (`productid`),
  ADD CONSTRAINT `FK68s8ww2qgepthnj212rj74qji` FOREIGN KEY (`warhouseid_war_house_id`) REFERENCES `war_house` (`war_house_id`),
  ADD CONSTRAINT `FKttv6xhixlb39s4hjngo871xu` FOREIGN KEY (`employeeid_employeeid`) REFERENCES `employee` (`employeeid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
