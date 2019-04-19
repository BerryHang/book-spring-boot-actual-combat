package com.learning.spring.boot.enums;

/**
 * @Package: com.learning.spring.boot.enums
 * @ClassName: FlagEnum
 * @Author: beibei.huang
 * @Description: 数据库数据 是否呗删除
 * @Date: 2019/3/21 13:53
 */
public enum FlagEnum {

    NO(0, "否"),
    YES(1,"是");

    private Integer value;
    private String description;

    FlagEnum(Integer value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public Integer getValue() {
        return this.value;
    }

    public static String value0fDescription(Integer value){
        return valueOf(value).description;
    }

    public static FlagEnum valueOf(Integer value){
        for (FlagEnum flagEnum : values()) {
            if (flagEnum.value.equals(value)) {
                return flagEnum;
            }
        }
        throw new IllegalArgumentException("No such enum object for the value : " + value);
    }

    public static boolean containsValue(Integer value){
        for (FlagEnum flagEnum : values()) {
            if (flagEnum.value.equals(value)) {
                return true;
            }
        }
        return false;
    }

}
