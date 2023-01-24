![img.png](img/img.png)

![img_1.png](img/img_1.png)

其中实线是spring帮我们做的,只有虚线部分需要自己做


```xml
 <servlet>
        <servlet-name>springmvc</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <init-param>
            <param-name>contextConfigLocation</param-name>
            <param-value>classpath:springmvc-servlet.xml</param-value>
        </init-param>
        <load-on-startup>1</load-on-startup>
    </servlet>
    
    <servlet-mapping>
        <servlet-name>springmvc</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>
```
其中  <url-pattern>/</url-pattern> 表示拦截所有请求
/可以改成 /hello等 表示拦截hello下的请求

![img_2.png](img/img_2.png)

![img_3.png](img/img_3.png)