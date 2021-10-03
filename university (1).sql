-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 03, 2021 at 03:06 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `university`
--

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `order_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `qty` int(11) NOT NULL,
  `trx_id` varchar(255) NOT NULL,
  `p_status` varchar(20) NOT NULL,
  `order_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`order_id`, `customer_id`, `product_id`, `qty`, `trx_id`, `p_status`, `order_date`) VALUES
(116, 15, 28, 2, 'trx9249', 'Completed', '2021-09-29'),
(117, 15, 10, 3, 'trx9249', 'Completed', '2021-09-29'),
(118, 15, 4, 1, 'trx9249', 'Completed', '2021-09-29'),
(119, 41, 28, 2, 'trx10351', 'Completed', '2021-09-30'),
(120, 45, 10, 3, 'trx10355', 'Completed', '2021-10-01'),
(121, 56, 4, 1, 'trx10358', 'Completed', '2021-10-02');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `product_id` int(100) NOT NULL,
  `product_title` varchar(255) NOT NULL,
  `product_price` int(100) NOT NULL,
  `product_qty` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`product_id`, `product_title`, `product_price`, `product_qty`) VALUES
(2, 'Iphone 12 Pro Max', 187000, 10),
(4, 'Samsung Galaxy S21 Ultra', 155000, 5),
(5, 'OnePlus 8T', 86000, 10),
(25, 'Razer A3 Headset', 25600, 10),
(26, 'i Phone11', 13000, 2),
(36, '360 Camera 1080P ', 13000, 2),
(37, 'Home Security Smart Video Camera', 2699, 6),
(40, 'WaterProof Washing Machine', 45999, 5),
(41, 'Rice Cooker ', 5699, 4),
(46, 'Microwave Oven', 25600, 10),
(47, 'Microwave Oven', 25600, 10),
(48, 'JBL Headset', 3199, 4),
(49, 'Electric CoffeMix', 13999, 4),
(50, 'Razer Drone', 48999, 3),
(51, 'Electric Rice Cooker', 13999, 3),
(62, ' Wireless Charger, 4 in 1 Fast Charging', 8599, 4),
(63, 'Charger, 4 in 1 Fast Charging', 4899, 5),
(64, 'Solar Panel Solar Pump Kit /9V 6W 10W Solar panel', 787000, 4),
(65, 'Solar Pump Kit /9V 6W 10W Solar panel', 883999, 5),
(66, 'CCTV Camera', 25499, 5),
(67, '360 Camera 1080P cctv', 13999, 10),
(68, 'UPERFECT 4K Portable Monitor Touchscreen', 25600, 3),
(69, 'Redmi Note9', 53999, 3),
(70, 'Samsung J5 Prime', 25600, 4),
(71, 'Dell Headphone', 13000, 5),
(72, 'Dell Mouse', 950, 40),
(73, 'Huawei Smartphone ', 25600, 10),
(74, 'Dell Docking Station', 13000, 10),
(75, 'POCO Mobile', 87000, 10),
(76, 'Redmi Note10S', 75999, 4),
(77, 'Xiaomi Mi Band', 25600, 5),
(78, 'Samsung Galaxy Note 9', 87000, 10),
(79, 'Samsung Galaxy A20', 113999, 10),
(80, 'Ceiling Fans', 187000, 10),
(81, 'USB Flash Drive 64GB', 3000, 40),
(82, 'Bluetooth Headset', 13000, 5),
(83, 'Fast Charger', 5600, 40),
(84, 'Humidity Sensor', 13000, 5),
(85, 'Samsung Galaxy buds', 13000, 5),
(86, 'Micro SD Memory Card', 3000, 10);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`order_id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`product_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `order_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=122;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `product_id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=87;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
