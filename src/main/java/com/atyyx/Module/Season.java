package com.atyyx.Module;

/**
 * 枚举类的使用
 * @author yyx
 * @version 1.0
 * @date 2022/8/11 12:16
 */
public enum Season
{
    Spring("春天","春暖花开"),
    Summer("夏天","天气炎热"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","天气寒冷");

    private final String SeasonName;
    private final String SeasonDesc;


    Season(String seasonName, String seasonDesc) {
        SeasonName = seasonName;
        SeasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return SeasonName;
    }

    public String getSeasonDesc() {
        return SeasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "SeasonName='" + SeasonName + '\'' +
                '}';
    }
}
