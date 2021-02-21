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
public class Seller implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 主键
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 商家名称
     */
      private String name;

      /**
     * 联系电话（登录用）
     */
      private String phone;

      /**
     * 邮箱（登录可用）
     */
      private String email;

      /**
     * 密码
     */
      private String password;

      /**
     * 头像文件名
     */
      private String filename;


}
