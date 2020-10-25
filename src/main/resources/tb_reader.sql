/*
Navicat MySQL Data Transfer

Source Server         : qiuyiliang
Source Server Version : 50729
Source Host           : localhost:3306
Source Database       : book_management

Target Server Type    : MYSQL
Target Server Version : 50729
File Encoding         : 65001

Date: 2020-10-24 20:56:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_reader`
-- ----------------------------
DROP TABLE IF EXISTS `tb_reader`;
CREATE TABLE `tb_reader` (
  `name` varchar(30) DEFAULT NULL COMMENT '姓名',
  `username` varchar(10) NOT NULL,
  `password` varchar(30) DEFAULT NULL COMMENT '密码',
  `tel` varchar(20) DEFAULT NULL COMMENT '电话',
  `ifViolate` tinyint(1) DEFAULT '0' COMMENT '没有违规',
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_reader
-- ----------------------------
INSERT INTO `tb_reader` VALUES ('邱依良', '18130412', '097731', '15050595711', '0');
INSERT INTO `tb_reader` VALUES ('邱依良', '18130417', '097731', '15050595765', '0');
INSERT INTO `tb_reader` VALUES ('邱依良', '18130419', '097731', '15050595765', '0');
INSERT INTO `tb_reader` VALUES ('邱依良', '18130420', '097731', '15050595761', '0');
INSERT INTO `tb_reader` VALUES ('郑臭臭', '18130444', '123456', '15050595765', '0');
INSERT INTO `tb_reader` VALUES ('邱依良', '18821833', '097731', '15050595765', '0');
