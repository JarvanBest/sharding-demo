package com.jarvan.sharding.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jarvan.sharding.entity.CartDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 描述：
 * Created by zjw on 2022/3/7 15:12
 */
@Mapper
public interface CartMapper extends BaseMapper<CartDO> {

    default List<CartDO> findByUserId(long userId) {
        return selectList(new QueryWrapper<CartDO>().lambda().eq(CartDO::getUserId, userId));
    }
}
