/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50643
 Source Host           : localhost:3305
 Source Schema         : db_feo_zhaopin_resume_parse

 Target Server Type    : MySQL
 Target Server Version : 50643
 File Encoding         : 65001

 Date: 09/05/2020 15:39:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bi_resume
-- ----------------------------
DROP TABLE IF EXISTS `bi_resume`;
CREATE TABLE `bi_resume` (
  `id` varchar(32) CHARACTER SET utf8 NOT NULL,
  `job_seeker_name` varchar(60) CHARACTER SET utf8 DEFAULT NULL COMMENT '姓名',
  `degree` varchar(30) CHARACTER SET utf8 DEFAULT NULL COMMENT '教育背景ids 参考constant表',
  `current_state` varchar(100) CHARACTER SET utf8 DEFAULT NULL COMMENT '求职状态  ',
  `in_way` varchar(11) CHARACTER SET utf8 DEFAULT NULL COMMENT '简历来源方式：190001：主动投递，190002：搜索后存入，190003：从简历管理上传后存入，190004：从人才库上传后存入',
  `phone` varchar(32) CHARACTER SET utf8 DEFAULT NULL COMMENT '手机号码',
  `plat_id` varchar(11) CHARACTER SET utf8 DEFAULT '10007' COMMENT '简历来源 10001：智联，10002:58同城，10003：猎聘，10004：Boss直聘，10005:前程无忧，10006：拉钩',
  `state` int(10) DEFAULT NULL COMMENT '状态',
  `age` int(20) DEFAULT NULL COMMENT '年龄',
  `email` varchar(60) CHARACTER SET utf8 DEFAULT NULL COMMENT '电子邮箱',
  `sex` varchar(20) CHARACTER SET utf8 DEFAULT NULL COMMENT '性别，70001表示男，70002表示女',
  `birthday` varchar(20) CHARACTER SET utf8 DEFAULT NULL COMMENT '生日',
  `work_length_max` int(3) DEFAULT '0' COMMENT '工作年限最高',
  `work_length_min` int(3) DEFAULT '0' COMMENT '工作年限最低',
  `work_length` varchar(20) CHARACTER SET utf8 DEFAULT NULL COMMENT '工作年限，有的简历可能存的是1-3年，有的可能直接存的3年',
  `is_marry` varchar(10) CHARACTER SET utf8 DEFAULT NULL COMMENT '已婚，未婚',
  `job_title` varchar(300) CHARACTER SET utf8 DEFAULT NULL COMMENT '应聘职位  Java工程师',
  `reside_address` varchar(100) CHARACTER SET utf8 DEFAULT NULL COMMENT '住址',
  `expect_salary_max` int(20) DEFAULT NULL COMMENT '期望最高薪资',
  `expect_salary_min` int(20) DEFAULT NULL COMMENT '期望最低薪资',
  `expect_place` varchar(200) CHARACTER SET utf8 DEFAULT NULL COMMENT '期望工作地点',
  `expect_job` varchar(20) CHARACTER SET utf8 DEFAULT NULL COMMENT '期望从事职业',
  `expect_industry` varchar(30) CHARACTER SET utf8 DEFAULT NULL COMMENT '期待行业 互联网/电子商务、计算机软件、其他',
  `photo_path` varchar(200) CHARACTER SET utf8 DEFAULT NULL COMMENT '头像路径',
  `expect_job_property` varchar(20) CHARACTER SET utf8 DEFAULT NULL COMMENT '20001全职，20002兼职，20003实习',
  `political_status` varchar(50) CHARACTER SET utf8 DEFAULT NULL COMMENT '团员，党员等',
  `university` varchar(60) CHARACTER SET utf8 DEFAULT NULL COMMENT '毕业院校',
  `major` varchar(60) CHARACTER SET utf8 DEFAULT NULL COMMENT '专业',
  `nation` varchar(16) CHARACTER SET utf8 DEFAULT NULL COMMENT '民族',
  `bitrh_place` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '籍贯',
  `certificate_type` varchar(32) CHARACTER SET utf8 DEFAULT NULL COMMENT '证件类型',
  `certificate_num` varchar(32) CHARACTER SET utf8 DEFAULT NULL COMMENT '证件号码',
  `wechat_num` varchar(32) CHARACTER SET utf8 DEFAULT NULL COMMENT '微信号',
  `health` varchar(32) CHARACTER SET utf8 DEFAULT NULL COMMENT '健康状况',
  `hobbies` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '兴趣爱好',
  `housing_status` varchar(32) CHARACTER SET utf8 DEFAULT NULL COMMENT '居住状况',
  `house_area` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '居住所在区',
  `house_address` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '目前住址',
  `trace_id` varchar(32) DEFAULT NULL COMMENT '插件获取的html文件',
  `deleted` int(11) DEFAULT '0',
  `create_dt` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_dt` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  `version` varchar(255) DEFAULT '0',
  `sort_no` int(11) DEFAULT NULL COMMENT '排序',
  `domicile_place` varchar(255) DEFAULT NULL COMMENT '户口所在地',
  `self_evaluation` varchar(1000) DEFAULT NULL COMMENT '自我评价',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `seekerid` (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='简历表\r\n';

-- ----------------------------
-- Records of bi_resume
-- ----------------------------
BEGIN;
INSERT INTO `bi_resume` VALUES ('03c557dd5e9411eaba550242ac150002', '刘四（测试）', '50005', '离职办理中', '190001', '13030032920', '10003', 1003, 22, '18233829@163.com', '70002', '896976000000', 0, 0, NULL, '未婚', NULL, NULL, 99999, 0, '广州', NULL, NULL, NULL, NULL, '中共预备党员', '', '', '', '湖北', '身份证', '421086199806052535', '1255', '良好', '', '自有', '北京市-北京市-东城区', 'fgg', NULL, 0, '2020-03-05 11:47:19', '2020-04-04 11:49:00', '0', NULL, NULL, NULL);
INSERT INTO `bi_resume` VALUES ('03db6658f97111e9b0c20242ac150002', '张三', '50005', '在职', '190006', '13000112233', '10001', 1003, 38, '11@163.com', '70001', '348681600000', 0, 0, '', '已婚', NULL, NULL, 99999, 0, '', NULL, NULL, NULL, NULL, '中共预备党员', '', '', '汉族', '湖北武汉', '身份证', '530121198101198894', '1226', '良好', '', '租房', '北京市-北京市-东城区', '大沽南路', NULL, 0, '2019-10-28 18:52:20', '2020-01-10 10:24:18', '2147483647', NULL, NULL, NULL);
INSERT INTO `bi_resume` VALUES ('1b50bbf55e1e11eaba550242ac150002', '测试简历(勿扰)', '50002', '非在职', '190001', '13517235038', '10001', 1003, 37, 'tanchang@163.com', '70001', '414172800000', 0, 0, NULL, '未婚', NULL, NULL, 99999, 0, '北京', NULL, NULL, NULL, NULL, '中共预备党员', '', '', '', '湖北', '身份证', '420124198302167916', 'link', '良好', '', '自有', '北京市-北京市-东城区', '武汉', NULL, 0, '2020-03-04 21:43:18', '2020-04-03 21:59:00', '0', NULL, NULL, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
