package com.hello.api.req;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.io.Serializable;

public class HelloRequest implements Serializable {

    private String parame;

    public String getParame() {
        return parame;
    }

    public void setParame(String parame) {
        this.parame = parame;
    }
}
