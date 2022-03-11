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
-- Table structure for table `match`
--

DROP TABLE IF EXISTS `match`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `match` (
  `mc_num` int NOT NULL AUTO_INCREMENT,
  `mc_st_num` int NOT NULL,
  `mc_fd_num` int NOT NULL,
  `mc_type` varchar(10) NOT NULL,
  `mc_time` varchar(20) NOT NULL,
  `mc_te_res_num` int NOT NULL,
  `mc_te_opp_num` int NOT NULL,
  `mc_te_win_num` int NOT NULL,
  PRIMARY KEY (`mc_num`),
  KEY `FK_store_TO_match_1` (`mc_st_num`),
  KEY `FK_field_TO_match_1` (`mc_fd_num`),
  KEY `FK_team_TO_match_1` (`mc_te_res_num`),
  KEY `FK_team_TO_match_2` (`mc_te_opp_num`),
  KEY `FK_team_TO_match_3` (`mc_te_win_num`),
  CONSTRAINT `FK_field_TO_match_1` FOREIGN KEY (`mc_fd_num`) REFERENCES `field` (`fd_num`),
  CONSTRAINT `FK_store_TO_match_1` FOREIGN KEY (`mc_st_num`) REFERENCES `store` (`st_num`),
  CONSTRAINT `FK_team_TO_match_1` FOREIGN KEY (`mc_te_res_num`) REFERENCES `team` (`te_num`),
  CONSTRAINT `FK_team_TO_match_2` FOREIGN KEY (`mc_te_opp_num`) REFERENCES `team` (`te_num`),
  CONSTRAINT `FK_team_TO_match_3` FOREIGN KEY (`mc_te_win_num`) REFERENCES `team` (`te_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `match`
--

LOCK TABLES `match` WRITE;
/*!40000 ALTER TABLE `match` DISABLE KEYS */;
/*!40000 ALTER TABLE `match` ENABLE KEYS */;
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
