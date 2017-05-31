package com.xzq.aipcore.webserivce.soap;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;


@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
//        System.out.println("-------ServletRegistrationBean-----------------");
//        System.out.println(applicationContext.getId());
//        System.out.println("-------ServletRegistrationBean-----------------");
        return new ServletRegistrationBean(servlet, "/ws/*");
    }

    @Bean(name = "test")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema countriesSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("UserPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.xzq.com/userws");
        wsdl11Definition.setSchema(countriesSchema);
//        System.out.println("-------DefaultWsdl11Definition-----------------");
//        System.out.println(wsdl11Definition.getSource().getSystemId());
//        System.out.println("-------DefaultWsdl11Definition-----------------");
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema countriesSchema() {

        return new SimpleXsdSchema(new ClassPathResource("test.xsd"));
    }

//    private WebServiceMessage message ;
//
//    public WebServiceMessage getMessage() {
//        return message;
//    }
}

