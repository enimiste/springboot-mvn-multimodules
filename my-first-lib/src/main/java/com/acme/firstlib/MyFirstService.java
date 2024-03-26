package com.acme.firstlib;

import com.acme.core.api.MyFirstServiceContract;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService implements MyFirstServiceContract {
    @Override
    public String returnSomeResult() {
        return "Hi from " + this.getClass().getSimpleName();
    }
}
