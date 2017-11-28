/*
Navicat MySQL Data Transfer

Source Server         : LOCALHOST
Source Server Version : 50624
Source Host           : 127.0.0.1:3306
Source Database       : spring_hibernate4_test

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-08-22 23:20:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for chat
-- ----------------------------
DROP TABLE IF EXISTS `chat`;
CREATE TABLE `chat` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chat
-- ----------------------------

-- ----------------------------
-- Table structure for doc
-- ----------------------------
DROP TABLE IF EXISTS `doc`;
CREATE TABLE `doc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of doc
-- ----------------------------
INSERT INTO `doc` VALUES ('5', 'title_user_doc_1');
INSERT INTO `doc` VALUES ('6', 'title_user_doc_2');
INSERT INTO `doc` VALUES ('7', 'title_user_doc_3');
INSERT INTO `doc` VALUES ('8', 'title_user_doc_4');

-- ----------------------------
-- Table structure for msg
-- ----------------------------
DROP TABLE IF EXISTS `msg`;
CREATE TABLE `msg` (
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of msg
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('14', 'name_user_doc_1');
INSERT INTO `user` VALUES ('15', 'name_user_doc_2');
INSERT INTO `user` VALUES ('16', 'name_user_doc_3');
INSERT INTO `user` VALUES ('17', 'name_user_doc_4');

-- ----------------------------
-- Table structure for user_doc
-- ----------------------------
DROP TABLE IF EXISTS `user_doc`;
CREATE TABLE `user_doc` (
  `user_id` int(11) NOT NULL,
  `doc_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`doc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_doc
-- ----------------------------
INSERT INTO `user_doc` VALUES ('14', '5');
INSERT INTO `user_doc` VALUES ('15', '6');
INSERT INTO `user_doc` VALUES ('16', '7');
INSERT INTO `user_doc` VALUES ('17', '8');
