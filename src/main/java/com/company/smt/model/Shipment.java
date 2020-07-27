package com.company.smt.model;

/**
 * @description: Shipment 货物信息表
 * @author: chenchunrong
 */
public class Shipment {

    //主键id
    private Long id;
    //货物名
    private String shipmentName;
    //货物数量
    private Integer shipmentNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShipmentName() {
        return shipmentName;
    }

    public void setShipmentName(String shipmentName) {
        this.shipmentName = shipmentName;
    }

    public Integer getShipmentNum() {
        return shipmentNum;
    }

    public void setShipmentNum(Integer shipmentNum) {
        this.shipmentNum = shipmentNum;
    }
}
