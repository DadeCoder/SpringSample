package com.dade.spring;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

/**
 * Created by Dade on 2017/5/11.
 */
public class Initializer extends AbstractHttpSessionApplicationInitializer {

    public Initializer() {
        super(Config.class);
    }
}
