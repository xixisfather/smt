package com.company.smt.service;

import com.company.smt.mapper.ShipmentSplitMapper;
import com.company.smt.model.ShipmentSplit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description: ShipmentSplitService
 * @author: chenchunrong
 * @time: 2020/7/27 11:07 AM
 */
@Service
public class ShipmentSplitService {

    @Autowired
    private ShipmentSplitMapper shipmentSplitMapper;

    /**
     *
     * @param shipmentSplit
     * @return 插入行数
     */
    @Transactional
    public int insertShipmentSplit(ShipmentSplit shipmentSplit) {
        //TODO
        //插入之前一些业务上的验证逻辑
        return shipmentSplitMapper.insertShipmentSplit(shipmentSplit);
    }

    /**
     *
     * @param shipmentSplitList
     * @return 插入行数
     */
    @Transactional
    public int insertShipmentSplitList(List<ShipmentSplit> shipmentSplitList){
        //TODO
        //插入之前一些业务上的验证逻辑
        return shipmentSplitMapper.insertShipmentSplitList(shipmentSplitList);
    }

    /**
     * 合并后更新信息
     * @param id
     * @param mergeId
     * @return 更新行数
     */
    public int mergeShipmentSplit(Long id,Long mergeId) {
        ShipmentSplit shipmentSplit = new ShipmentSplit();
        shipmentSplit.setId(id);
        shipmentSplit.setShipmentMergeId(mergeId);
        return shipmentSplitMapper.updateShipmentSplit(shipmentSplit);
    }

}