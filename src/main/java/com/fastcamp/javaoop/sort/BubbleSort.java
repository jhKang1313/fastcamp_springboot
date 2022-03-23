package com.fastcamp.javaoop.sort;

import java.util.List;

public class BubbleSort<T extends  Comparable<T>> implements Sort{
    @Override
    public List<T> sort(List list) {
        List<T> tmpList = list;
        for(int i = tmpList.size() - 1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if(tmpList.get(j).compareTo(tmpList.get(j + 1)) > 0){
                    T temp = tmpList.get(j);
                    tmpList.set(j, tmpList.get(j + 1));
                    tmpList.set(j + 1, temp);
                }
            }
        }
        return tmpList;
    }
}
