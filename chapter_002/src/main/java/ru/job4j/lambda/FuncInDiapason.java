package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FuncInDiapason implements Function {

    /**
     * Applies this function to the given argument.
     *
     * @param o the function argument
     * @return the function result
     */
    @Override
    public Object apply(Object o) {
        return o;
    }

    List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> result = new ArrayList();
        for (int i = start; i < end; i++) {
            result.add(func.apply((double) i));
        }
        return result;
    }
}