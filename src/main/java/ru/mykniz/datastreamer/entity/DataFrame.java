package ru.mykniz.datastreamer.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class DataFrame {
    private String code;
    private BigDecimal price;
}
