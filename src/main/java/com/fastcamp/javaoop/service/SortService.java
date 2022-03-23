package com.fastcamp.javaoop.service;

import com.fastcamp.javaoop.sort.JavaSort;
import com.fastcamp.javaoop.sort.Sort;

import java.util.List;

public class SortService {
    public <T extends  Comparable<T>> List<T> doSort(List<T> list){
        Sort<T> sort = new JavaSort<>();
        return sort.sort(list);
    }
}
