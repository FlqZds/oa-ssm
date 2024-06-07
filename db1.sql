/*
SQLyog Community v12.09 (64 bit)
MySQL - 8.0.36 : Database - db1
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db1` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `db1`;

/*Table structure for table `tb_good` */

DROP TABLE IF EXISTS `tb_good`;

CREATE TABLE `tb_good` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(25) NOT NULL,
  `price` decimal(10,0) NOT NULL,
  `des` varchar(100) DEFAULT NULL,
  `type_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `tb_good` */

insert  into `tb_good`(`id`,`name`,`price`,`des`,`type_id`) values (1,'雨伞','20','一把伞',0),(2,'水杯','17','一个简单的水杯',1);

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `tb_user` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `userPassword` varchar(50) NOT NULL,
  `account` varchar(50) NOT NULL,
  PRIMARY KEY (`tb_user`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `tb_user` */

insert  into `tb_user`(`tb_user`,`username`,`userPassword`,`account`) values (1,'张春晖','123456','一只小甜甜'),(2,'丁元英','135246','遥远的道友'),(3,'罗生严','333','医者'),(4,'埃隆·松赞·浩山塔门','888999','长生天'),(38,'','4889118778488944444498899889','');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
