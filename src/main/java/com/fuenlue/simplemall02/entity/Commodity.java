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
public class Commodity implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 主键
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 名称
     */
      private String name;

      /**
     * 描述
     */
      private String description;

      /**
     * 价格
     */
      private Float price;

      /**
     * 库存
     */
      private Integer stock;

      /**
     * 商品一级分类
     */
      private Integer categoryleveloneId;

      /**
     * 二级分类
     */
      private Integer categoryleveltwoId;

      /**
     * 三级分类
     */
      private Integer categorylevelthreeId;

      /**
     * 文件名称
     */
      private String fileName;

      /**
     * 关联商家id
     */
      private Integer sellerId;


}
