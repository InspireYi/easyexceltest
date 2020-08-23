package com.yi.test;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;


@Data
@ColumnWidth(20)
public class StorageRackExcelBO {

    @ExcelProperty(index = 0, value = "*库区编码")
    private String areaCode;

    @ExcelProperty(index = 1, value = "*货位类型")
    private String rackConfigName;

    @ExcelProperty(index = 2, value = "*巷道（通道号）")
    private String rackWay;

    @ExcelProperty(index = 3, value = "*排")
    private String rackRow;

    @ExcelProperty(index = 4, value = "*组（架）")
    private String rackGroup;

    @ExcelProperty(index = 5, value = "*位（位置）")
    private String rackPosition;

    @ExcelProperty(index = 6, value = "*层")
    private String rackLayer;

    @ExcelProperty(index = 7, value = "*列")
    private String rackColumn;

    @ExcelProperty(index = 8, value = "货位限定商品分类")
    private String categoryNames;

    @ExcelProperty(index = 9, value = "整散标识")
    private String scatterTypeStr;

    @ExcelProperty(index = 10, value = "货位SABC")
    private String pickingLevelStr;

    @ExcelProperty(index = 11, value = "存储条件")
    private String storageConditionStr;

    @ExcelProperty(index = 12, value = "混种数量")
    private String maxMixClassCountStr;

    @ExcelProperty(index = 13, value = "货位类别")
    private String positionTypeStr;

    @ExcelProperty(index = 14, value = "码放类型")
    private String pileUpTypeStr;

    @ExcelProperty(index = 15, value = "货架类型")
    private String rackTypeStr;

    @ExcelProperty(index = 16, value = "货主")
    private String ownerMasterCode;

    @ExcelProperty(index = 17, value = "管理者")
    private String managerMasterCode;
}