package com.babymall.domain.productcenter;

import lombok.Data;

@Data
public class Category {
    private Long catId;
    private String name;
    private Long parentCid;
    private Integer catLevel;
    private Integer showFlag;
    private Integer sort;
    private String icon;
    private String productUnit;
}
