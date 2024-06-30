DROP TABLE IF EXISTS `tb_good`;

CREATE TABLE `tb_good` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(25) NOT NULL,
  `price` decimal(10,0) NOT NULL,
  `des` varchar(100) DEFAULT NULL,
  `type_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3;



insert  into `tb_good`(`id`,`name`,`price`,`des`,`type_id`) values (1,'雨伞','20','一把伞',0),(2,'水杯','17','一个简单的水杯',1);



DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `tb_user` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `userPassword` varchar(50) NOT NULL,
  `account` varchar(50) NOT NULL,
  PRIMARY KEY (`tb_user`)
) ENGINE=InnoDB AUTO_INCREMENT=39;


insert  into `tb_user`(`tb_user`,`username`,`userPassword`,`account`) values (1,'张春晖','123456','一只小甜甜'),(2,'丁元英','135246','遥远的道友'),(3,'罗生严','333','医者'),(4,'埃隆·松赞·浩山塔门','888999','长生天'),(38,'','4889118778488944444498899889','');

