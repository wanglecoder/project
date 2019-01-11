package com.example.demo.decorateWithCan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangle
 * @date 2019/1/9/11:48
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Decorate extends Component {
    private Component component;
    @Override
    public void doSomthing() {
        System.out.println("这是装饰类1");
        component.doSomthing();
    }
}
