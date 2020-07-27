package com.company.smt.controller;

import com.company.smt.model.ShipmentMerge;
import com.company.smt.model.ShipmentSplit;
import com.company.smt.service.ShipmentMergeService;
import com.company.smt.service.ShipmentSplitService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: ShipmentSplitController
 * @author: chenchunrong
 * @time: 2020/7/27 11:56 AM
 */
@RestController
public class ShipmentMergeController {
    //log记录
    private Logger logger = Logger.getLogger(ShipmentMergeController.class);

    @Autowired
    private ShipmentMergeService shipmentMergeService;
    /**
     * 合并
     * @return 约定状态码
     */
    @RequestMapping(value = "/merge", method = RequestMethod.PUT)
    public String splitNum(@RequestBody List<Long> splitIds, @RequestBody ShipmentMerge shipmentMerge) {
        try{
            shipmentMergeService.insertShipmentMerge(splitIds,shipmentMerge);
        } catch(Exception e){
            logger.error(e);
            return "400";
        }

        return "200";
    }
}
