package com.acme.secondlib;

import com.acme.core.api.MyFirstServiceContract;
import com.acme.core.api.MySecondServiceContract;
import org.springframework.stereotype.Service;

public class MySecondService implements MySecondServiceContract {
    private final MyFirstServiceContract myFirstServiceContract;

    public MySecondService(MyFirstServiceContract myFirstServiceContract) {
        this.myFirstServiceContract = myFirstServiceContract;
    }

    @Override
    public String returnSomeResult() {
        return "Hi from %s [i depends on %s]".formatted(this.getClass().getSimpleName(), myFirstServiceContract.returnSomeResult());

    }
}
