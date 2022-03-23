package com.fastcamp.javaoop;

import com.fastcamp.javaoop.config.Config;
import com.fastcamp.javaoop.service.SortService;
import com.fastcamp.javaoop.sort.JavaSort;
import com.fastcamp.javaoop.sort.Sort;
import jdk.nashorn.internal.runtime.linker.JavaAdapterFactory;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void main(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Sort sort = (Sort) context.getBean("javaSort");
        String[] arr = {"1", "4", "2", "3"};
        List<String> list = Arrays.asList(arr);
        //when
        SortService sortService = new SortService(sort);
        //then

        assertEquals(Arrays.asList("1", "2", "3", "4"), sortService.doSort(list));
    }
}