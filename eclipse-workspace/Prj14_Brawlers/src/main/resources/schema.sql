-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: its_2024
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `brawlers`
--

DROP TABLE IF EXISTS `brawlers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `brawlers` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `carattere` varchar(255) DEFAULT NULL,
  `rarity` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=165 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `brawlers`
--

LOCK TABLES `brawlers` WRITE;
/*!40000 ALTER TABLE `brawlers` DISABLE KEYS */;
INSERT INTO `brawlers` VALUES (1,'Clancy',NULL,'Mythic'),(2,'Berry',NULL,'Epic'),(3,'Lily',NULL,'Mythic'),(4,'Draco',NULL,'Legendary'),(5,'Angelo',NULL,'Epic'),(6,'Melodie',NULL,'Mythic'),(7,'Larry & Lawrie',NULL,'Epic'),(8,'Kit',NULL,'Legendary'),(9,'Mico',NULL,'Mythic'),(10,'Charlie',NULL,'Mythic'),(11,'Chuck',NULL,'Mythic'),(12,'Pearl',NULL,'Epic'),(13,'Doug',NULL,'Mythic'),(14,'Cordelius',NULL,'Legendary'),(15,'Hank','Tank','Epic'),(16,'Maisie','Marksman','Epic'),(17,'Willow','Controller','Mythic'),(18,'R-T','Damage Dealer','Mythic'),(19,'Mandy','Marksman','Epic'),(20,'Gray','Support','Mythic'),(21,'Chester','Damage Dealer','Legendary'),(22,'Buster','Tank','Mythic'),(23,'Gus','Support','Super Rare'),(24,'Sam','Assassin','Epic'),(25,'Otis','Controller','Mythic'),(26,'Bonnie','Marksman','Epic'),(27,'Janet','Marksman','Mythic'),(28,'Eve','Damage Dealer','Mythic'),(29,'Fang','Assassin','Mythic'),(30,'Lola','Damage Dealer','Epic'),(31,'Meg','Tank','Legendary'),(32,'Ash','Tank','Epic'),(33,'Griff','Controller','Epic'),(34,'Buzz','Assassin','Mythic'),(35,'Grom','Artillery','Epic'),(36,'Squeak','Controller','Mythic'),(37,'Belle','Marksman','Epic'),(38,'Stu','Assassin','Epic'),(39,'Ruffs','Support','Mythic'),(40,'Edgar','Assassin','Epic'),(41,'Byron','Support','Mythic'),(42,'Lou','Controller','Mythic'),(43,'Amber','Controller','Legendary'),(44,'Colette','Damage Dealer','Epic'),(45,'Surge','Damage Dealer','Legendary'),(46,'Sprout','Artillery','Mythic'),(47,'Nani','Marksman','Epic'),(48,'Gale','Controller','Epic'),(49,'Jacky','Tank','Super Rare'),(50,'Max','Support','Mythic'),(51,'Mr. P','Controller','Mythic'),(52,'Emz','Controller','Epic'),(53,'Bea','Marksman','Epic'),(54,'Sandy','Controller','Legendary'),(55,'8-Bit','Damage Dealer','Super Rare'),(56,'Bibi','Tank','Epic'),(57,'Carl','Damage Dealer','Super Rare'),(58,'Rosa','Tank','Rare'),(59,'Leon','Assassin','Legendary'),(60,'Tick','Artillery','Super Rare'),(61,'Gene','Controller','Mythic'),(62,'Frank','Tank','Epic'),(63,'Penny','Artillery','Super Rare'),(64,'Darryl','Tank','Super Rare'),(65,'Tara','Damage Dealer','Mythic'),(66,'Pam','Support','Epic'),(67,'Piper','Marksman','Epic'),(68,'Bo','Controller','Epic'),(69,'Poco','Support','Rare'),(70,'Crow','Assassin','Legendary'),(71,'Mortis','Assassin','Mythic'),(72,'El Primo','Tank','Rare'),(73,'Dynamike','Artillery','Super Rare'),(74,'Nita','Damage Dealer','Rare'),(75,'Jessie','Controller','Super Rare'),(76,'Barley','Artillery','Rare'),(77,'Spike','Damage Dealer','Legendary'),(78,'Rico','Damage Dealer','Super Rare'),(79,'Brock','Marksman','Rare'),(80,'Bull','Tank','Rare'),(81,'Colt','Damage Dealer','Rare'),(82,'Shelly','Damage Dealer','Common');
/*!40000 ALTER TABLE `brawlers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-25 17:25:55
