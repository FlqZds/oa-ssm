package org.sample.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ErrInfo extends RuntimeException {
    private String code;
    private String errMessage;

}
