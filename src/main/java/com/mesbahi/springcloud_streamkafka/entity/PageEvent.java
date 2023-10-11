package com.mesbahi.springcloud_streamkafka.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PageEvent {
    private String name;
    private long duration;
    private String user;
    private Date date;
}
