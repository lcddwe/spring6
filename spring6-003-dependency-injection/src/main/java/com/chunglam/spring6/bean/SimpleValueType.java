package com.chunglam.spring6.bean;

import java.net.URI;
import java.net.URL;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

/**
 * 简单类型注入实践
 * 通过源码分析得知，简单类型包括：
 *     ● 基本数据类型
 *     ● 基本数据类型对应的包装类
 *     ● String或其他的CharSequence子类
 *     ● Number子类
 *     ● Date子类
 *     ● Enum子类
 *     ● URI
 *     ● URL
 *     ● Temporal子类
 *     ● Locale
 *     ● Class
 *     ● 另外还包括以上简单值类型对应的数组类型。
 * @author chunglam
 * @version 1.0
 */
public class SimpleValueType {
    enum Season {
        SPRING, SUMMER, AUTUMN, WINTER
    }
    private byte b;
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;
    private boolean flag;
    private char c;

    private Byte b1;
    private Short s1;
    private Integer i1;
    private Long l1;
    private Float f1;
    private Double d1;
    private Boolean flag1;
    private Character c1;
    private String str;

    private Date date;

    private Season season;

    private URI uri;

    private URL url;

    private LocalDate localDate;

    private Locale locale;

    private Class clazz;

    @Override
    public String toString() {
        return "SimpleValueType{" +
                "b=" + b +
                ", s=" + s +
                ", i=" + i +
                ", l=" + l +
                ", f=" + f +
                ", d=" + d +
                ", flag=" + flag +
                ", c=" + c +
                ", b1=" + b1 +
                ", s1=" + s1 +
                ", i1=" + i1 +
                ", l1=" + l1 +
                ", f1=" + f1 +
                ", d1=" + d1 +
                ", flag1=" + flag1 +
                ", c1=" + c1 +
                ", str='" + str + '\'' +
                ", date=" + date +
                ", season=" + season +
                ", uri=" + uri +
                ", url=" + url +
                ", localDate=" + localDate +
                ", locale=" + locale +
                ", clazz=" + clazz +
                '}';
    }

    public void setB(byte b) {
        this.b = b;
    }

    public void setS(short s) {
        this.s = s;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setL(long l) {
        this.l = l;
    }

    public void setF(float f) {
        this.f = f;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setC(char c) {
        this.c = c;
    }

    public void setB1(Byte b1) {
        this.b1 = b1;
    }

    public void setS1(Short s1) {
        this.s1 = s1;
    }

    public void setI1(Integer i1) {
        this.i1 = i1;
    }

    public void setL1(Long l1) {
        this.l1 = l1;
    }

    public void setF1(Float f1) {
        this.f1 = f1;
    }

    public void setD1(Double d1) {
        this.d1 = d1;
    }

    public void setFlag1(Boolean flag1) {
        this.flag1 = flag1;
    }

    public void setC1(Character c1) {
        this.c1 = c1;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }
}
