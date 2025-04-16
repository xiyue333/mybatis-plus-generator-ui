package com.github.davidfantasy.mybatisplus.generatorui.example.dto;
import java.util.Date;
import lombok.Data;
/**
 * com.github.davidfantasy.mybatisplus.generatorui.example.service.test.AppDownloadMapper.getProductItem的查询结果集，该代码由mybatis-plus-generator-ui自动生成
 *
 * @author kaiser
 * @since 2024-10-16
 */
@Data
public class GetProductItemResultDto {

    private Long id;

    private Long productVarietyId;

    private Integer productItemType;

    private String productItemNo;

    private String productItemName;

    private Long productCount;

    private Integer sortNum;

    private String remark;

    private Long productSellFees;

    private Integer productItemStatus;

    private Date createTime;

    private Date modifyTime;

    private Long creatorId;

    private String creatorName;

    private Long handlerId;

    private String handlerName;

    private Integer recordStatus;

}
