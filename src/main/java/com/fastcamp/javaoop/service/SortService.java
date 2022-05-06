package com.fastcamp.javaoop.service;

import com.fastcamp.javaoop.sort.JavaSort;
import com.fastcamp.javaoop.sort.Sort;
<<<<<<< Updated upstream

import java.util.List;

public class SortService {
    public <T extends  Comparable<T>> List<T> doSort(List<T> list){
        Sort<T> sort = new JavaSort<>();
=======
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
>>>>>>> Stashed changes
        return sort.sort(list);
    }
}
