package com.company.smt.mapper;

import com.company.smt.model.ShipmentMerge;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description: ShipmentMergeMapper
 * @author: chenchunrong
 */
@Mapper
public interface ShipmentMergeMapper {
    //插入
    public int insertShipmentMerge(ShipmentMerge shipmentMerge);
}
