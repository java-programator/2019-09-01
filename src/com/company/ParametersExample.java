package com.company;

import com.company.traveloffice.Date;

class Nazar {
    int val;
    void f(int a) {
        this.val = a;
    }
}

public class ParametersExample {

    static void f1(int a) {
        a = a * 4;
    }

    static void f2(String s) {
        s = s + "hahahaha";
    }

    static void f3(Date d) {
        d.year= 3456;
    }

    public static void main(String[] args) {
        int x = 8;
        f1(x);
        System.out.println(x);
        String w = "pawel";
        f2(w);
        System.out.println(w);
        Date d1 = new Date(2019, 3, 5);
        f3(d1);
        System.out.println(d1.getInfo());

        Nazar n = new Nazar();
        Nazar m = new Nazar();

        n.f(x);
        m.f(x);
    }
}
