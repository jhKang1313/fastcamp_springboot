package com.fastcamp.javaoop.sort;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component
public class JavaSort<T extends Comparable<T>> implements Sort{
    @Override
    public List sort(List list) {
        Collections.sort(list);
        return list;
    }
}
