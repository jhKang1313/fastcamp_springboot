package com.fastcamp.javaoop.service;

import com.fastcamp.javaoop.sort.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortService<T extends Comparable<T>> {
    Sort<T> sort;
    public SortService(@Qualifier("javaSort") Sort<T> sort){
        this.sort = sort;
    }
    public List<T> doSort(List<T> list){
        return sort.sort(list);
    }
}
