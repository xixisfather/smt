package com.company.smt.service;

import com.company.smt.mapper.ShipmentMergeMapper;
import com.company.smt.model.ShipmentMerge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description: ShipmentMergeService
 * @author: chenchunrong
 */
@Service
public class ShipmentMergeService {

    @Autowired
    private ShipmentMergeMapper shipmentMergeMapper;

    @Autowired
    private ShipmentSplitService shipmentSplitService;
    /**
     * 插入
     * @param shipmentMerge
     * return 插入行数
     */
    @Transactional
    public int insertShipmentMerge(List<Long> splitIds, ShipmentMerge shipmentMerge) {
        //TODO
        //插入前的业务验证
        int insertNum = shipmentMergeMapper.insertShipmentMerge(shipmentMerge);
        Long id = shipmentMerge.getId();
        for(Long splitId : splitIds) {
            shipmentSplitService.mergeShipmentSplit(splitId,id);
        }
        return insertNum;
    }
}
