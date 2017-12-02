-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        10.2.11-MariaDB - mariadb.org binary distribution
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- sinlimcon 데이터베이스 구조 내보내기
CREATE DATABASE IF NOT EXISTS `sinlimcon` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `sinlimcon`;

-- 테이블 sinlimcon.buyhisory 구조 내보내기
CREATE TABLE IF NOT EXISTS `buyhisory` (
  `buyid` varchar(16) NOT NULL,
  `user_userid` varchar(16) NOT NULL,
  `design_designid` varchar(16) NOT NULL,
  PRIMARY KEY (`buyid`),
  KEY `fk_buyhisory_user_idx` (`user_userid`),
  KEY `fk_buyhisory_design1_idx` (`design_designid`),
  CONSTRAINT `fk_buyhisory_design1` FOREIGN KEY (`design_designid`) REFERENCES `design` (`designid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_buyhisory_user` FOREIGN KEY (`user_userid`) REFERENCES `user` (`userid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 내보낼 데이터가 선택되어 있지 않습니다.
-- 테이블 sinlimcon.design 구조 내보내기
CREATE TABLE IF NOT EXISTS `design` (
  `designid` varchar(16) NOT NULL,
  `user_userid` varchar(16) NOT NULL,
  `first_upload_time` datetime DEFAULT NULL,
  `last_update_time` datetime DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `summary` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`designid`),
  UNIQUE KEY `designid_UNIQUE` (`designid`),
  KEY `fk_design_user1_idx` (`user_userid`),
  CONSTRAINT `fk_design_user1` FOREIGN KEY (`user_userid`) REFERENCES `user` (`userid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 내보낼 데이터가 선택되어 있지 않습니다.
-- 테이블 sinlimcon.picture 구조 내보내기
CREATE TABLE IF NOT EXISTS `picture` (
  `pictureid` varchar(16) NOT NULL,
  `filesrc` varchar(45) DEFAULT NULL,
  `design_designid` varchar(16) NOT NULL,
  PRIMARY KEY (`pictureid`),
  KEY `fk_picture_design1_idx` (`design_designid`),
  CONSTRAINT `fk_picture_design1` FOREIGN KEY (`design_designid`) REFERENCES `design` (`designid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 내보낼 데이터가 선택되어 있지 않습니다.
-- 테이블 sinlimcon.user 구조 내보내기
CREATE TABLE IF NOT EXISTS `user` (
  `userid` varchar(16) NOT NULL,
  `username` varchar(16) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(32) NOT NULL,
  `create_time` timestamp NULL DEFAULT current_timestamp(),
  `bitdh_date` date DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 내보낼 데이터가 선택되어 있지 않습니다.
-- 테이블 sinlimcon.zzim 구조 내보내기
CREATE TABLE IF NOT EXISTS `zzim` (
  `zzimid` varchar(16) NOT NULL,
  `user_userid` varchar(16) NOT NULL,
  `design_designid` varchar(16) NOT NULL,
  PRIMARY KEY (`zzimid`),
  KEY `fk_zzim_user1_idx` (`user_userid`),
  KEY `fk_zzim_design1_idx` (`design_designid`),
  CONSTRAINT `fk_zzim_design1` FOREIGN KEY (`design_designid`) REFERENCES `design` (`designid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_zzim_user1` FOREIGN KEY (`user_userid`) REFERENCES `user` (`userid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 내보낼 데이터가 선택되어 있지 않습니다.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
