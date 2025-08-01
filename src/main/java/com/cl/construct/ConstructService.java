package com.cl.construct;

import com.cl.service.A;
import com.cl.service.C;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 1.只有一个构造方法情况下，直接使用该构造方法
 * 2.存在多个构造方法情况下，优先使用@Autowired(required = true)修饰的构造方法，(required = true)时只能有一个被@Autowired修饰的构造器
 *   没有@Autowired(required = true)修饰的构造方法使用@Autowired(required = false)修饰的构造方法，选择参数较多的构造方法
 *   没有@Autowired修饰的构造方法使用无参构造方法
 *   既没有@Autowired修饰的构造方法也没有无参构造方法会报错。
 * 3.构造器找依赖规则：先按类型找，只找到一个直接使用，找到多个按名称找，按名称找要么成功找到一个，要么找不到报错
 */
@Setter
@Getter
@Component
public class ConstructService {

    private A a;
    private C c;

    public ConstructService() {
        System.out.println("使用无参构造方法");
    }

//    @Autowired
//    public ConstructService(A a) {
//        this.a = a;
//        System.out.println("使用有参构造方法1");
//    }
    @Autowired
    public ConstructService(A a112) {
        this.a = a;
        System.out.println("使用有参构造方法1");
    }

//    @Autowired(required = false)
//    public ConstructService(A a, A a1) {
//        this.a = a;
//        System.out.println("使用有参构造方法2");
//    }

//    @Autowired(required = true)
//    public ConstructService(C c) {
//        System.out.println("使用有参构造方法2");
//    }
//
//    public ConstructService(C c) {
//        System.out.println("使用有参构造方法3");
//    }

//    public ConstructService(A a, C c) {
//        System.out.println("使用有参构造方法4");
//    }
}
