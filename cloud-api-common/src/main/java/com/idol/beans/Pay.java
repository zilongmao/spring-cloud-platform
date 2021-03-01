package com.idol.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * TODO:
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2021/1/12 17:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pay implements Serializable {

    private Long id;

    private String serial;
}
