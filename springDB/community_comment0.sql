-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: community
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
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comment` (
  `co_num` int NOT NULL AUTO_INCREMENT,
  `co_bd_num` int NOT NULL,
  `co_me_id` varchar(20) NOT NULL,
  `co_reg_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `co_del` varchar(2) NOT NULL DEFAULT 'N',
  `co_ori_num` int NOT NULL,
  `co_contents` longtext NOT NULL,
  PRIMARY KEY (`co_num`),
  KEY `co_bd_num_idx` (`co_bd_num`),
  KEY `co_me_id_idx` (`co_me_id`),
  CONSTRAINT `co_bd_num` FOREIGN KEY (`co_bd_num`) REFERENCES `board` (`bd_num`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `co_me_id` FOREIGN KEY (`co_me_id`) REFERENCES `member` (`me_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
INSERT INTO `comment` VALUES (1,58,'qwe','2022-01-24 11:20:26','N',1,'asd'),(2,58,'qwe','2022-01-24 11:27:21','N',2,'sd'),(3,58,'qwe','2022-01-24 12:37:16','N',3,'댓글'),(4,58,'qwe','2022-01-24 12:41:46','N',4,'readComment테스트'),(5,58,'qwe','2022-01-24 14:25:55','N',5,'댓글추가'),(6,58,'qwe','2022-01-24 14:26:01','N',6,'6 추가'),(7,55,'qwe','2022-01-24 14:26:09','Y',7,'1'),(8,55,'qwe','2022-01-24 14:26:12','N',8,'2'),(9,55,'qwe','2022-01-24 14:26:14','N',9,'3'),(10,55,'qwe','2022-01-24 14:26:15','N',10,'4'),(11,55,'qwe','2022-01-24 14:26:17','N',11,'5'),(12,55,'qwe','2022-01-24 14:26:19','N',12,'6'),(13,58,'qwe','2022-01-24 15:48:51','N',13,'추가'),(14,58,'qwe','2022-01-26 15:08:41','N',14,'댓글테스트'),(15,58,'qwe','2022-01-26 15:36:53','N',15,'3시36분 댓글'),(16,58,'qwe','2022-01-26 17:47:56','N',16,'aaa'),(17,58,'qwe','2022-02-03 09:41:32','N',17,'aa'),(18,58,'qwe','2022-02-03 09:45:47','N',18,'aaa'),(19,47,'qwe','2022-02-03 10:09:41','N',19,'aaaaaaaaa'),(20,58,'qwe','2022-02-03 14:42:34','N',18,'대댓'),(21,58,'qwe','2022-02-03 16:37:10','N',1,'답글\n'),(22,58,'qwe','2022-02-03 16:37:17','N',2,'야야');
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-07 17:35:58
