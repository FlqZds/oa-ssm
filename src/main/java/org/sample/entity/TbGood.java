package org.sample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbGood {
    private Integer id;

    private String name;

    private Long price;

    private String des;

    private Integer typeid;

}