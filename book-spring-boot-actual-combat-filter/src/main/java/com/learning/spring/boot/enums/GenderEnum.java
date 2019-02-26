package com.learning.spring.boot.enums;

/**
 * @Package: com.learning.spring.boot.enums
 * @ClassName: GenderEnum
 * @Author: beibei.huang
 * @Description: 性别枚举
 * @Date: 2019/2/14 9:53
 */
public enum GenderEnum {

    MALE(0, "男"),
    FEMALE(1,"女");

    private Integer value;
    private String description;

     GenderEnum(Integer value, String description) {
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

    public static GenderEnum valueOf(Integer value){
        for (GenderEnum genderEnum : values()) {
            if (genderEnum.value.equals(value)) {
                return genderEnum;
            }
        }
        throw new IllegalArgumentException("No such enum object for the value : " + value);
    }

    public static boolean containsValue(Integer value){
        for (GenderEnum genderEnum : values()) {
            if (genderEnum.value.equals(value)) {
                return true;
            }
        }
        return false;
    }

}
