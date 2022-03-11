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
-- Table structure for table `pay`
--

DROP TABLE IF EXISTS `pay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pay` (
  `pa_num` int NOT NULL AUTO_INCREMENT,
  `pa_st_num` int NOT NULL,
  `pa_mc_num` int NOT NULL,
  `pa_us_num` int NOT NULL,
  `pa_te_pa_num` int NOT NULL,
  `pa_time` int NOT NULL,
  `pa_paytime` datetime NOT NULL,
  `pa_total` int NOT NULL,
  `pa_pay` int NOT NULL,
  `pa_remain` int NOT NULL,
  `pa_paytype` varchar(2) NOT NULL,
  PRIMARY KEY (`pa_num`),
  KEY `FK_store_TO_pay_1` (`pa_st_num`),
  KEY `FK_match_TO_pay_1` (`pa_mc_num`),
  KEY `FK_used_TO_pay_1` (`pa_us_num`),
  KEY `FK_team_TO_pay_1` (`pa_te_pa_num`),
  CONSTRAINT `FK_match_TO_pay_1` FOREIGN KEY (`pa_mc_num`) REFERENCES `match` (`mc_num`),
  CONSTRAINT `FK_store_TO_pay_1` FOREIGN KEY (`pa_st_num`) REFERENCES `store` (`st_num`),
  CONSTRAINT `FK_team_TO_pay_1` FOREIGN KEY (`pa_te_pa_num`) REFERENCES `team` (`te_num`),
  CONSTRAINT `FK_used_TO_pay_1` FOREIGN KEY (`pa_us_num`) REFERENCES `used` (`us_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pay`
--

LOCK TABLES `pay` WRITE;
/*!40000 ALTER TABLE `pay` DISABLE KEYS */;
/*!40000 ALTER TABLE `pay` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-11 13:18:44
