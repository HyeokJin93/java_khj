-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: futsal
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member` (
  `me_id` varchar(12) NOT NULL,
  `me_pw` varchar(255) NOT NULL,
  `me_phone` varchar(13) NOT NULL,
  `me_name` varchar(30) NOT NULL,
  `me_gender` varchar(6) NOT NULL,
  `me_birth` date NOT NULL,
  `me_address` varchar(100) DEFAULT NULL,
  `me_detailAddress` varchar(100) DEFAULT NULL,
  `me_email` varchar(50) NOT NULL,
  `me_authority` varchar(10) DEFAULT '회원',
  PRIMARY KEY (`me_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES ('asdasd','$2a$10$K9ZB74xpCVM3kX.w5N.wZ.A8wISBGRJHH0tJn24WKMZMAgm7EIFSa','010-4022-2023','asd','여성','2021-04-16',' ',NULL,'hyeokji93@naver.com','시스템 관리자'),('qweqwe','$2a$10$KA8/PcwoxQflClui0uEjPuq1SQBfMyB2uAljgEB0/1yUlwRs8Kj66','010-2322-2222','qwe','남성','2022-03-08',' ',NULL,'f@naver.com','회원'),('zxczxc','$2a$10$.IjSvGhbTXi4zLxO84VOu.m8IO3p4tXGiuxC2Px7Fn3mrK2msQJ5m','010-2322-2222','zxc','남성','2022-03-08',' ',NULL,'f@naver.com','회원'),('zzzzzz','$2a$10$IA2V5RwhQvjA9E9JJF/m8u1bLqSs07RzjrTtO77GAOlYkYXZYBwXK','010-2322-2222','zzz','남성','2022-03-01',' ',NULL,'f@naver.com','회원');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-11  0:23:55
