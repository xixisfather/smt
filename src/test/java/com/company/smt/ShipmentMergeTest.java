package com.company.smt;

import com.company.smt.model.ShipmentMerge;
import com.company.smt.model.ShipmentSplit;
import com.company.smt.service.ShipmentMergeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: ShipmentMergeTest
 * @author: chenchunrong
 * @time: 2020/7/27 11:46 AM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShipmentMergeTest {
    @Autowired
    private ShipmentMergeService shipmentMergeService;

    @Test
    public void testInsertShipmentMerge() {
        ShipmentMerge shipmentMerge = new ShipmentMerge();
        shipmentMerge.setShipmentId(1L);
        shipmentMerge.setShipmentMergeNum(200);
        List<Long> splits = new ArrayList<>();
        splits.add(1L);
        splits.add(2L);
        shipmentMergeService.insertShipmentMerge(splits,shipmentMerge);
        Assert.assertNotNull(shipmentMerge.getId());
    }
}
