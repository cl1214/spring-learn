package com.cl.circle;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Data
@Component
public class ConstructServiceA {

    private ConstructServiceB constructServiceB;

    @Lazy
    public ConstructServiceA(ConstructServiceB constructServiceB) {
        this.constructServiceB = constructServiceB;
    }
}
