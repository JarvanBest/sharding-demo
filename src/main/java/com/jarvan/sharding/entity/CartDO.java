package com.jarvan.sharding.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("cart")
public class CartDO implements Serializable {

	/**
	 * 购物车项主键
	 */
	@TableId
	private Long id;
	/**
	 * 用户ID
	 */
	private Long userId;
	/**
	 * 业务线类型 1自取、2包邮、3外卖、4海鲜专送
	 */
	private Integer businessType;
	/**
	 * 地点ID(营业部或门店ID)
	 */
	private Long siteId;
	/**
	 * 运营组id
	 */
	private Long groupId;
	/**
	 * 商家商品SkuId、非SpuId
	 */
	private Long itemSkuId;
	/**
	 * 商家编码
	 */
	private Long merchantId;
	/**
	 * 商品数量
	 */
	private Integer quantity;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 是否选中 1未选中 2选中
	 */
	private Integer isSelected;
	/**
	 * 扩展字段
	 */
	private String extra;
}
