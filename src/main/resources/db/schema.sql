--暂时没有冗余的设计，需要的冗余的话可以根据实际业务情况，数据量来进行设计

DROP TABLE IF EXISTS shipment;

--货物表
CREATE TABLE shipment
(
  id BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  shipment_name VARCHAR(30) NULL DEFAULT NULL COMMENT '货物名',
  shipment_num INT(11) NULL DEFAULT 0 COMMENT '货物总数量',
  PRIMARY KEY (id)
);


DROP TABLE IF EXISTS shipment_split;

--货物分拆表
CREATE TABLE shipment_split
(
    id BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    shipment_id INT(11) NULL DEFAULT 0 COMMENT '货物id',
    shipment_split_num INT(11) NULL DEFAULT 0 COMMENT '货物分拆数量',
    shipment_merge_id INT(11) NULL DEFAULT 0 COMMENT '货物合并id',
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS shipment_merge;

--货物合并表
CREATE TABLE shipment_merge
(
    id BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    shipment_id INT(11) NULL DEFAULT 0 COMMENT '货物id',
    shipment_merge_num INT(11) NULL DEFAULT 0 COMMENT '货物合并数量',
    PRIMARY KEY (id)
);