package com.web;



import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    public WebInitializer() {
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{config.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class[]{config.class};
    }

    @Override
    protected String[] getServletMappings() {

        return new String[]{"/"};
    }

}
