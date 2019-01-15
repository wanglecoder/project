package com.example.demo.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wangle
 * @date 2019/1/15/9:11
 **/
public class Recursion {
    public List<List<Integer>> getTargetList(int[] resource, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(resource);
        List<Integer> combine = new ArrayList<>();
        recursion(resource, 0, target, combine, result);
        return result;
    }

    private void recursion(int[] resource, int startIndex, int remainTarget, List<Integer> combine, List<List<Integer>> result) {
        if (remainTarget == 0) {
            result.add(new ArrayList<>(combine));
            return;
        }
        for (int i = startIndex; i < resource.length; i++) {
            if (remainTarget < resource[i]) {
                break;
            }
            if (i != 0 && resource[i] == resource[i - 1]) {
                continue;
            }
            combine.add(resource[i]);
            recursion(resource, i, remainTarget - resource[i], combine, result);
            combine.remove(combine.size() - 1);
        }
    }
}
