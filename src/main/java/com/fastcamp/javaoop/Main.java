package com.fastcamp.javaoop;

import com.fastcamp.javaoop.config.Config;
import com.fastcamp.javaoop.service.SortService;
import com.fastcamp.javaoop.sort.BubbleSort;
import com.fastcamp.javaoop.sort.JavaSort;
import com.fastcamp.javaoop.sort.Sort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        List<String> list = Arrays.asList(args);
        Sort sort = (Sort) context.getBean("javaSort");

        SortService sortService = new SortService(sort);

        System.out.println(sortService.doSort(list));
    }
}
