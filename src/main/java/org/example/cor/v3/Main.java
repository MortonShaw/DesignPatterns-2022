package org.example.cor.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MortonShaw
 * @date 2021/7/12 11:31
 */
class Main {

    public static void main(String[] args) {
        Request request = new Request();
        request.str = "大家好 :) <script> morton 经常加班，996";
        Response response = new Response();
        response.str = "response";
        FilterChain fc = new FilterChain();
        fc.add(new HTMLFilter()).add(new SensitiveFilter());
        fc.doFilter(request, response, fc);

        System.out.println(request.str);
        System.out.println(response.str);
    }

}

class Request {

    String str;

}

class Response {

    String str;

}

interface Filter {

    boolean doFilter(Request request, Response response, FilterChain filterChain);

}

class HTMLFilter implements Filter {

    @Override
    public boolean doFilter(Request request, Response response, FilterChain filterChain) {
        request.str += "_HTMLFilter";
        filterChain.doFilter(request, response, filterChain);
        response.str += "_HTMLFilter";
        return true;
    }

}

class SensitiveFilter implements Filter {

    @Override
    public boolean doFilter(Request request, Response response, FilterChain filterChain) {
        request.str += "_SensitiveFilter";
        filterChain.doFilter(request, response, filterChain);
        response.str += "_SensitiveFilter";
        return true;
    }

}

class FilterChain implements Filter {

    private final List<Filter> filterList = new ArrayList<>();
    int index = 0;

    FilterChain add(Filter filter) {
        filterList.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Request request, Response response, FilterChain filterChain) {
        if (index == filterList.size()) {
            return false;
        }
        Filter filter = filterList.get(index);
        index++;
        return filter.doFilter(request, response, filterChain);
    }

}
