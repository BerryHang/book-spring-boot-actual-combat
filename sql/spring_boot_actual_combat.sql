/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2018-10-31 17:11:48
*/

CREATE DATABASE spring_boot_actual_combat DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tc_sys_user
-- ----------------------------
DROP TABLE IF EXISTS `tc_sys_user`;
CREATE TABLE `tc_sys_user` (
  `user_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `user_name` varchar(45) COLLATE utf8_bin NOT NULL COMMENT '用户名',
  `password` varchar(45) COLLATE utf8_bin NOT NULL COMMENT '密码',
  `email` varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT '邮箱',
  `address` varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT '地址',
  `qq` varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT 'QQ信息',
  `sex` tinyint(1) unsigned DEFAULT '1' COMMENT '性别',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='用户信息表';

-- ----------------------------
-- Records of tc_sys_user
-- ----------------------------
INSERT INTO `tc_sys_user` VALUES ('1', 'admdin', 'admin', '123@qq.com', '上海普陀', '123', '1');
INSERT INTO `tc_sys_user` VALUES ('2', 'xiaoming', 'xiaoming', '456@qq.com', '上海金山', '456', '1');
INSERT INTO `tc_sys_user` VALUES ('3', 'lilei', 'lilei', '789@qq.con', '北京朝阳', '789', '0');
