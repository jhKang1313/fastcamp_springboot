package com.fastcamp.javaoop;

import com.fastcamp.javaoop.service.SortService;
import com.fastcamp.javaoop.sort.BubbleSort;
import com.fastcamp.javaoop.sort.JavaSort;
import com.fastcamp.javaoop.sort.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(args);
        SortService sortService = new SortService();

        System.out.println(sortService.doSort(list));
    }
}
