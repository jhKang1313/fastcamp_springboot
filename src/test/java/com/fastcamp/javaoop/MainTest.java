package com.fastcamp.javaoop;

import com.fastcamp.javaoop.service.SortService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void main(){
        //given
        String[] arr = {"1", "4", "2", "3"};
        List<String> list = Arrays.asList(arr);
        //when
        SortService sortService = new SortService();
        //then

        assertEquals(Arrays.asList("1", "2", "3", "4"), sortService.doSort(list));
    }
}