package com.cl.circle;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ConstructServiceB {

    private ConstructServiceA constructServiceA;

    public ConstructServiceB(ConstructServiceA constructServiceA) {
        this.constructServiceA = constructServiceA;
    }
}
