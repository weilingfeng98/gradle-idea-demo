package com.jfinal.demo;

import com.jfinal.config.*;
import com.jfinal.render.ViewType;

public class DemoConfig extends JFinalConfig {
    public void configConstant(Constants me) {
        me.setDevMode(true);
        me.setViewType(ViewType. JSP);
    }
    public void configRoute(Routes me) {
        me.add("/", DemoController. class);
    }
    public void configPlugin(Plugins me) {

    }
    public void configInterceptor(Interceptors me) {

    }
    public void configHandler(Handlers me) {

    }
}