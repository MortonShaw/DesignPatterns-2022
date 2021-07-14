package org.example.cor.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MortonShaw
 * @date 2021/7/12 10:16
 */
class Main {

    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("大家好 :) <script> morton 经常加班，996");

        FilterChain fc = new FilterChain();
        fc.add(new HTMLFilter()).add(new SensitiveFilter());
        FilterChain fc2 = new FilterChain();
        fc2.add(new FaceFilter()).add(new URLFilter());

        fc.add(fc2);

        fc.doFilter(msg);

        System.out.println(msg.getMsg());
    }

}

class Msg {

    String name;
    String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}

interface Filter {

    boolean doFilter(Msg msg);

}

class HTMLFilter implements Filter {

    @Override
    public boolean doFilter(Msg msg) {
        msg.setMsg(msg.getMsg().replace('<', '['));
        msg.setMsg(msg.getMsg().replace('>', ']'));
        return true;
    }

}

class SensitiveFilter implements Filter {

    @Override
    public boolean doFilter(Msg msg) {
        msg.setMsg(msg.getMsg().replace("996", "955"));
        return false;
    }

}

class FaceFilter implements Filter {

    @Override
    public boolean doFilter(Msg msg) {
        msg.setMsg(msg.getMsg().replace(":)", "^V^"));
        return true;
    }

}

class URLFilter implements Filter {

    @Override
    public boolean doFilter(Msg msg) {
        msg.setMsg(msg.getMsg().replace("morton", "morton.com"));
        return true;
    }

}

class FilterChain implements Filter {

    private List<Filter> filterList = new ArrayList<>();

    FilterChain add(Filter filter) {
        filterList.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Msg msg) {
        for (Filter filter : filterList) {
            if (!filter.doFilter(msg)) {
                return false;
            }
        }
        return true;
    }

}
