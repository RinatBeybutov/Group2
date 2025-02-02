package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component("test")
//@Scope("SCOPE_REQUEST")
@RequestScope(proxyMode = ScopedProxyMode.INTERFACES)
public final class ScopeBean implements ScopeInterface{

    private String name = "Mursik";

    @Lazy
    private BeanB bean;

    @Override
    public String getName() {
        return name;
    }
}
