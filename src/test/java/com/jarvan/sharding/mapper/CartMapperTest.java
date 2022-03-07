package com.jarvan.sharding.mapper;

import com.jarvan.sharding.BaseTest;
import com.jarvan.sharding.entity.CartDO;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * 描述：
 * Created by zjw on 2022/3/7 15:30
 */
public class CartMapperTest extends BaseTest {


    @Autowired
    CartMapper cartMapper;

    @Test
    public void addTest() {
        for (long i = 1; i < 15; i++) {
            CartDO cart = new CartDO(null, i, 1, 1L, 1L,
                    i, 1001L, 1, new Date(), new Date(), 1, null);
            cartMapper.insert(cart);
        }
    }

    @Test
    public void findTest() {
        List<CartDO> byUserId = cartMapper.findByUserId(1);
        Assert.assertTrue(byUserId.size() > 0);
    }
}
