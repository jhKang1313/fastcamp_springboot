package com.fastcamp.javaoop.sort;

<<<<<<< Updated upstream
=======
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

>>>>>>> Stashed changes
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class JavaSort<T extends Comparable<T>> implements Sort{
    @Override
    public List sort(List list) {
        Collections.sort(list);
        return list;
    }
}
