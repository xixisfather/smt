package com.company.smt.mapper;

import com.company.smt.model.ShipmentSplit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @description: ShipmentSplitMapper
 * @author: chenchunrong
 */
@Mapper
public interface ShipmentSplitMapper {
    //插入
    public int insertShipmentSplit(ShipmentSplit shipmentSplit);

    //插入
    public int insertShipmentSplitList(List<ShipmentSplit> shipmentSplitList);

    public int updateShipmentSplit(ShipmentSplit shipmentSplit);
}
