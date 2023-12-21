package org.hzz.bean.vo.query;

import org.hzz.utils.StringUtils;

public class SearchFilter {
    public enum Operator {
        EQ, LIKE, GT, LT, GTE, LTE,IN,ISNULL,ISNOTNULL
    }

    public String fieldName;
    public Object value;
    public Operator operator;
    public  static SearchFilter build(String fieldName, Operator operator, Object value){
        return  new SearchFilter(fieldName,operator,value);
    }
    public  static SearchFilter build(String fieldName, Operator operator){
        return  new SearchFilter(fieldName,operator);
    }
    public SearchFilter(String fieldName, Operator operator) {
        this.fieldName = fieldName;
        this.operator = operator;
    }

    public SearchFilter(String fieldName, Operator operator, Object value) {
        if(!StringUtils.isNullOrEmpty(value)) {
            this.fieldName = fieldName;
            this.value = value;
            this.operator = operator;
        }
    }
}
