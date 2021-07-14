package org.example.cor.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MortonShaw
 * @date 2021/7/12 10:58
 */
public class ServletMain {

    public static void main(String[] args) {
        FilterChain fc = new FilterChain();
        fc.add(new RequestFilter1()).add(new RequestFilter2());

        FilterChain fc2 = new FilterChain();
        fc2.add(new ResponseFilter1()).add(new ResponseFilter2());

        fc.add(fc2);

        Request request = new Request();
        Response response = new Response();
        fc.doFilter(request, response);

        System.out.println(request.str);
        System.out.println(response.str);
    }

}

class Request {

    String str = "request";

}

class Response {

    String str = "response";

}

interface Filter {

    boolean doFilter(Request request, Response response);

}

class RequestFilter1 implements Filter {

    @Override
    public boolean doFilter(Request request, Response response) {
        request.str += "_1";
        return true;
    }

}

class RequestFilter2 implements Filter {

    @Override
    public boolean doFilter(Request request, Response response) {
        request.str += "_2";
        return true;
    }

}

class ResponseFilter1 implements Filter {

    @Override
    public boolean doFilter(Request request, Response response) {
        response.str += "_a";
        return true;
    }

}

class ResponseFilter2 implements Filter {

    @Override
    public boolean doFilter(Request request, Response response) {
        response.str += "_b";
        return true;
    }

}

class FilterChain implements Filter {

    List<Filter> filterList = new ArrayList<>();

    FilterChain add(Filter filter) {
        filterList.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Request request, Response response) {
        for (Filter filter : filterList) {
            if (!filter.doFilter(request, response)) {
                return false;
            }
        }
        return true;
    }

}
