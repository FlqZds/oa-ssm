package org.sample.common.result;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
不管正常还是异常  统一返回R
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrInfo<T> {

    private String code;
    private String message;
    private T data;

    public ErrInfo(ResponseEnum responseEnum, T data){
        this.code = responseEnum.getCode();
        this.message = responseEnum.getMessage();
        this.data = data;
    }
}
