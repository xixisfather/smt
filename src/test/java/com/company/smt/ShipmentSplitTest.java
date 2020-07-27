package com.company.smt;

import com.company.smt.model.ShipmentSplit;
import com.company.smt.service.ShipmentService;
import com.company.smt.service.ShipmentSplitService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: ShipmentSplitTest
 * @author: chenchunrong
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShipmentSplitTest {

    @Autowired
    private ShipmentSplitService shipmentSplitService;

    /**
     * 测试InsertShipmentSplit
     */
    @Test
    public void testInsertShipmentSplit() {
        ShipmentSplit shipmentSplit = new ShipmentSplit();
        shipmentSplit.setShipmentId(1L);
        shipmentSplit.setShipmentSplitNum(200);
        Assert.assertEquals(1,shipmentSplitService.insertShipmentSplit(shipmentSplit));
    }

    /**
     * 测试InsertShipmentSplitList
     */
    @Test
    public void testInsertShipmentSplitList() {
        ShipmentSplit shipmentSplit1 = new ShipmentSplit();
        shipmentSplit1.setShipmentId(1L);
        shipmentSplit1.setShipmentSplitNum(200);

        ShipmentSplit shipmentSplit2 = new ShipmentSplit();
        shipmentSplit2.setShipmentId(1L);
        shipmentSplit2.setShipmentSplitNum(300);

        List<ShipmentSplit> list = new ArrayList<>();
        list.add(shipmentSplit1);
        list.add(shipmentSplit2);

        Assert.assertEquals(2,shipmentSplitService.insertShipmentSplitList(list));
    }
}
