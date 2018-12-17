package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "test")
public class Test implements Serializable {
    @Id
    @KeySql(sql = "select test_seq.nextval from dual", order = ORDER.BEFORE)
    private Integer id;
    private String name;
    private Integer password;

    public Test(String name, Integer password) {
        this.name = name;
        this.password = password;
    }
}
