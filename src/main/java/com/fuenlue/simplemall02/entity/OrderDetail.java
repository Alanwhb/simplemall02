package com.fuenlue.simplemall02.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 福恩略
 * @since 2021-02-21
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class OrderDetail implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 主键
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 关联订单主键
     */
      private Integer orderId;

      /**
     * 关联商品id
     */
      private Integer commodityId;

      /**
     * 数量
     */
      private Integer quantity;

      /**
     * 金额
     */
      private Float cost;


}
