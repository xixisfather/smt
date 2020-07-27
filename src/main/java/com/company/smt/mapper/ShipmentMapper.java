package com.company.smt.mapper;

import com.company.smt.model.Shipment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description: ShipmentMapper
 * @author: chenchunrong
 */
@Mapper
public interface ShipmentMapper {
    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Shipment findById(Long id);
}
