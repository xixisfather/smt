package com.company.smt.model;

/**
 * @description: ShipmentMerge 货物合并数量表
 * @author: chenchunrong
 */
public class ShipmentMerge {
    //主键id
    private Long id;

    //货物id
    private Long shipmentId;

    //货物合并数量
    private Integer shipmentMergeNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Long shipmentId) {
        this.shipmentId = shipmentId;
    }

    public Integer getShipmentMergeNum() {
        return shipmentMergeNum;
    }

    public void setShipmentMergeNum(Integer shipmentMergeNum) {
        this.shipmentMergeNum = shipmentMergeNum;
    }
}
