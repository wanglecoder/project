package com.example.demo.responsibilityChainProject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author wangle
 * @date 2019/1/8/13:41
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RealChain {
    private List<Handler> handlers;
    private int index;

    List<Response> executeMethod(String type, String key) {
        List<Response> response = null;
        if (handlers.size() > 0) {
            Handler handler = handlers.get(index);
            response = handler.handleMethod(type, key);
        }
        return response;
    }
}
