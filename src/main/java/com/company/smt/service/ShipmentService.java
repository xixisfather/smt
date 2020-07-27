package com.company.smt.service;

import com.company.smt.mapper.ShipmentMapper;
import com.company.smt.model.Shipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: ShipmentService
 * @author: chenchunrong
 */
@Service
public class ShipmentService {
    @Autowired
    private ShipmentMapper shipmentMapper;

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Shipment findById(Long id){
        return shipmentMapper.findById(id);
    }
}
