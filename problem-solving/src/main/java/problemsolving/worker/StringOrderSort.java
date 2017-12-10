package problemsolving.worker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringOrderSort {
    public String sort(String order, String str) {
        List<Character> a = str.chars().boxed().map(x->(char)x.intValue()).collect(Collectors.toList());
        a.sort(Comparator.comparingInt(order::indexOf));
        StringBuilder stringBuilder = new StringBuilder();
        a.forEach(x->stringBuilder.append(x));
        return stringBuilder.toString();
    }
}
