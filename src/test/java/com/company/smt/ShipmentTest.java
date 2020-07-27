package com.company.smt;

import com.company.smt.service.ShipmentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShipmentTest {

    @Autowired
    private ShipmentService shipmentService;

    /**
     * 测试FindById
     */
    @Test
    public void testFindById() {
        Assert.assertEquals("iphone",shipmentService.findById(1L).getShipmentName());
    }

}
