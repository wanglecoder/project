package com.example.demo.responsibilityChainProject;

import java.util.List;

/**
 * @author wangle
 * @date 2019/1/8/11:50
 **/
public interface Handler {
    List<Response> handleMethod(String type, String key);
}
