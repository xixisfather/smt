package com.company.smt.model;

/**
 * @description: ShipmentSplit 货物分拆数量表
 * @author: chenchunrong
 */
public class ShipmentSplit {
    //主键id
    private Long id;

    //货物id
    private Long shipmentId;

    //货物分拆数量
    private Integer shipmentSplitNum;

    //货物合并数量
    private Long shipmentMergeId;

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

    public Integer getShipmentSplitNum() {
        return shipmentSplitNum;
    }

    public void setShipmentSplitNum(Integer shipmentSplitNum) {
        this.shipmentSplitNum = shipmentSplitNum;
    }

    public Long getShipmentMergeId() {
        return shipmentMergeId;
    }

    public void setShipmentMergeId(Long shipmentMergeId) {
        this.shipmentMergeId = shipmentMergeId;
    }
}
