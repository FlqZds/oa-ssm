package org.sample.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class info<T> {
    private String code;
    private  String message;
    private  T data;

    private  T userStatus;
}
