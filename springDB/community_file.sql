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
-- Table structure for table `file`
--

DROP TABLE IF EXISTS `file`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `file` (
  `fi_num` int NOT NULL AUTO_INCREMENT,
  `fi_ori_name` varchar(255) DEFAULT NULL,
  `fi_name` varchar(255) DEFAULT NULL,
  `fi_bd_num` int NOT NULL,
  `fi_del` varchar(2) DEFAULT NULL,
  `fi_del_date` datetime DEFAULT NULL,
  PRIMARY KEY (`fi_num`),
  KEY `FK_board_TO_file_1` (`fi_bd_num`),
  CONSTRAINT `FK_board_TO_file_1` FOREIGN KEY (`fi_bd_num`) REFERENCES `board` (`bd_num`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `file`
--

LOCK TABLES `file` WRITE;
/*!40000 ALTER TABLE `file` DISABLE KEYS */;
INSERT INTO `file` VALUES (1,'day1_2_cat.jfif','/2022/01/14/1ed8b290-ff07-4617-8ea6-ae82dada980a_day1_2_cat.jfif',11,'Y','2022-01-17 16:18:24'),(2,'day1_2_cat.jfif','/2022/01/17/7c33e44a-dad9-4201-aae5-0b18eeecd24a_day1_2_cat.jfif',12,NULL,NULL),(3,'권혁진 출석부.pdf','/2022/01/17/daf975da-d25c-476b-a9ef-c045869cb9d3_권혁진 출석부.pdf',12,'Y','2022-01-17 16:18:12'),(4,'권혁진 출석부.pdf','/2022/01/17/176ef8c9-db37-4322-b833-64ef13dd284e_권혁진 출석부.pdf',13,NULL,NULL),(5,'과제_up_down프로그램.txt','/2022/01/17/81857566-819b-4a0e-afac-195f621f2269_과제_up_down프로그램.txt',13,NULL,NULL),(6,'day1_2_cat.jfif','/2022/01/17/f4269bd7-2d34-455b-a1a9-2917a0b12369_day1_2_cat.jfif',14,NULL,NULL),(7,'day1_2_cat.jfif','/2022/01/17/e67a3d3d-2a50-470e-8b57-6ce3cd10aa7b_day1_2_cat.jfif',15,NULL,NULL),(8,'day1_2_cat.jfif','/2022/01/17/011e9f6b-a196-4b05-abe8-ea61a8631731_day1_2_cat.jfif',16,'Y','2022-01-17 16:28:26'),(9,'day1_2_cat.jfif','/2022/01/17/0c8bbf5e-c03f-4ca7-b83f-5f786060c182_day1_2_cat.jfif',17,NULL,NULL),(10,'images.jpg','/2022/01/17/bd9a8fcb-2ac0-4f03-9ade-76e0743cffc8_images.jpg',17,'Y','2022-01-17 16:33:07'),(11,'day1_2_cat.jfif','/2022/01/17/518c454d-904c-4402-bf3e-a213c404926b_day1_2_cat.jfif',18,'Y','2022-01-17 16:37:48'),(12,'images.jpg','/2022/01/17/c4993dfb-2cb1-4096-9855-c68cd73a5fe8_images.jpg',18,'Y','2022-01-17 16:37:21'),(13,'images.jpg','/2022/01/17/d72bf270-e91e-4fda-bbf4-ddbefac2be53_images.jpg',18,NULL,NULL),(14,'day1_2_cat.jfif','/2022/01/17/a9fe2810-d4e9-4b39-88f0-c990c9fc0d70_day1_2_cat.jfif',19,'Y','2022-01-17 16:39:26'),(15,'images.jpg','/2022/01/17/33febb6b-c24f-4d68-93b8-2940ffef4f3a_images.jpg',19,'Y','2022-01-17 16:39:26'),(16,'day1_2_cat.jfif','/2022/01/17/e26cb467-1a38-49b0-a192-1d507bb5f791_day1_2_cat.jfif',19,'Y','2022-01-17 16:39:36'),(17,'images.jpg','/2022/01/17/9caeaa05-932b-4479-9b21-711d3adb654d_images.jpg',19,'Y','2022-01-17 16:39:33'),(18,'images.jpg','/2022/01/17/a067d3a7-483f-423e-9536-e49365962e81_images.jpg',19,NULL,NULL),(19,'day1_2_cat.jfif','/2022/01/17/0d45c5d8-ea81-443d-8843-6533fa46692c_day1_2_cat.jfif',19,'Y','2022-01-17 16:39:58'),(20,'day1_2_cat.jfif','/2022/01/17/4516b82c-2b93-458c-9a15-17b5414a5f6e_day1_2_cat.jfif',20,NULL,NULL),(21,'images.jpg','/2022/01/17/8b992752-e05b-4cc5-9945-e8a698393aa4_images.jpg',20,NULL,NULL),(22,'day1_2_cat.jfif','/2022/01/17/a6366b1d-6f62-4e8a-ac5a-8f43a81df603_day1_2_cat.jfif',20,NULL,NULL),(23,'day1_2_cat.jfif','/2022/01/17/83016ebf-e7f2-4a7d-83c9-e4800ccd33be_day1_2_cat.jfif',20,NULL,NULL),(24,'images.jpg','/2022/01/17/e12e68fc-b4e8-40fb-b536-f15e58198370_images.jpg',20,NULL,NULL),(25,'day1_2_cat.jfif','/2022/01/17/0d1c4466-8f9c-4923-9b59-fdfc34c3243f_day1_2_cat.jfif',20,NULL,NULL),(26,'day1_2_cat.jfif','/2022/01/17/4f4553f9-9304-4ced-924b-a61ab8dc3313_day1_2_cat.jfif',21,NULL,NULL),(27,'images.jpg','/2022/01/17/0f91f23c-f20c-408f-8886-5fa343e3f5e6_images.jpg',21,NULL,NULL),(28,'day1_2_cat.jfif','/2022/01/17/c2c2ba28-e9c6-4390-bec7-20e4be723331_day1_2_cat.jfif',21,NULL,NULL),(29,'images.jpg','/2022/01/17/78ad9405-d1e2-4031-afb1-6daf59059f22_images.jpg',21,NULL,NULL),(30,'day1_2_cat.jfif','/2022/01/17/2096ca91-eb34-48a2-946f-d6f47ea70eb0_day1_2_cat.jfif',22,NULL,NULL),(31,'images.jpg','/2022/01/17/482e0c9e-b97f-4e08-9b67-f2043efed310_images.jpg',22,NULL,NULL),(32,'day1_2_cat.jfif','/2022/01/17/bc00070c-b5b5-480f-8793-b0043d282832_day1_2_cat.jfif',22,NULL,NULL),(33,'images.jpg','/2022/01/17/686d356b-fa5f-4ed7-bd4c-e0b139df6962_images.jpg',22,NULL,NULL),(34,'day1_2_cat.jfif','/2022/01/17/d3b29608-a5e7-4e9f-b879-39c6c585556c_day1_2_cat.jfif',23,'Y','2022-01-17 17:05:24'),(35,'images.jpg','/2022/01/17/f65c0b23-c7ca-45b6-a610-ae76a8b004b8_images.jpg',23,'Y','2022-01-17 17:05:21'),(36,'day1_2_cat.jfif','/2022/01/17/08ff8832-9c87-45c9-bb5c-2411b50e8dbc_day1_2_cat.jfif',23,'Y','2022-01-17 17:05:32'),(37,'images.jpg','/2022/01/17/4009d03b-367c-4768-be81-3a1c868d03fb_images.jpg',23,NULL,NULL),(38,'images.jpg','/2022/01/18/583a6123-8dc4-4143-a8dc-d91160c1988b_images.jpg',24,'Y','2022-01-18 09:48:53'),(39,'day1_2_cat.jfif','/2022/01/18/999334c8-e608-451b-bf79-9a4fa577b88c_day1_2_cat.jfif',32,'Y','2022-01-18 14:49:11'),(40,'day1_2_cat.jfif','/2022/01/18/08f410f9-2b70-4b5f-8e6c-b28889269e94_day1_2_cat.jfif',32,'Y','2022-01-18 14:33:16'),(41,'images.jpg','/2022/01/18/453074b4-39f4-4faa-866d-a045ebfde34c_images.jpg',32,NULL,NULL),(42,'day1_2_cat.jfif','/2022/01/18/756690ac-c8dd-4937-acdf-7c64a19cb04e_day1_2_cat.jfif',32,NULL,NULL),(43,'day1_2_cat.jfif','/2022/01/18/7ace4415-3d36-4be7-89cc-143026ffd536_day1_2_cat.jfif',37,NULL,NULL),(44,'images.jpg','/2022/01/18/bfa13ec7-9566-441d-a896-285dac644a3f_images.jpg',39,NULL,NULL),(45,'day1_2_cat.jfif','/2022/01/19/013e5fab-1ded-4b8e-9045-ed1d38fdad7f_day1_2_cat.jfif',43,NULL,NULL),(46,'images.jpg','/2022/01/19/43ad2acb-6381-4688-a775-4c53960b832c_images.jpg',44,NULL,NULL),(47,'day1_2_cat.jfif','/2022/01/19/7181bffa-38cb-4c2d-9d3d-6db59a2e6e82_day1_2_cat.jfif',45,NULL,NULL),(48,'images.jpg','/2022/01/19/1a7de3d1-f282-4ace-aba6-5ac18dbf8de8_images.jpg',45,NULL,NULL),(49,'images.jpg','/2022/01/19/5b0b622e-a606-480e-a680-e39b618ab7fc_images.jpg',46,'Y','2022-01-19 17:11:17'),(50,'day1_2_cat.jfif','/2022/01/19/cb7572c8-e003-400b-91fa-eca54419b64a_day1_2_cat.jfif',46,'Y','2022-01-19 16:26:02'),(51,'images.jpg','/2022/01/19/d731474f-0f60-4c62-9182-75806aefb36e_images.jpg',46,'Y','2022-01-19 16:26:02'),(52,'day1_2_cat.jfif','/2022/01/19/295ddf0a-64cf-4235-b685-73d9747c2063_day1_2_cat.jfif',47,'Y','2022-01-19 16:31:13'),(53,'day1_2_cat.jfif','/2022/01/19/0e01a223-f5b8-4d89-92b3-18c4253a9512_day1_2_cat.jfif',47,NULL,NULL),(54,'day1_2_cat.jfif','/2022/01/19/d4f3ba3a-e1c8-485a-b6e0-790f3f81479e_day1_2_cat.jfif',46,NULL,NULL),(55,'images.jpg','/2022/01/19/d29d8ce8-06c9-4fa8-aba7-64259e309afe_images.jpg',46,NULL,NULL),(56,'day1_2_cat.jfif','/2022/01/20/32cf2127-9fbd-40e7-86a3-60a9980a56f4_day1_2_cat.jfif',48,'Y','2022-01-20 09:51:21'),(57,'day1_2_cat.jfif','/2022/01/20/8c3e7863-b42f-4be1-8759-3b23645d9d73_day1_2_cat.jfif',50,NULL,NULL),(58,'images.jpg','/2022/01/21/4ee33152-0799-4b52-8960-2fe22a6a952c_images.jpg',51,'Y','2022-01-21 10:22:17');
/*!40000 ALTER TABLE `file` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-21 17:23:02
