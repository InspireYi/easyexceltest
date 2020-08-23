package com.yi.test;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;


@Data
@ColumnWidth(20)
public class UserWorkTypeAndAreaImportBO {

    @ExcelProperty(index = 0, value = "序号")
    private String sequence;

    @ExcelProperty(index = 1, value = "姓名")
    private String userName;

    @ExcelProperty(index = 2, value = "员工工号")
    private String userNo;

    @ExcelProperty(index = 3, value = "任务类型")
    private String workType;

    @ExcelProperty(index = 4, value = "所在仓库")
    private String storage;

    @ExcelProperty(index = 5, value = "所在库房")
    private String storageRoom;

    @ExcelProperty(index = 6, value = "作业区域")
    private String storageArea;

}