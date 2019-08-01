※SpringMVCProject1总结

※SpringMVC测试工程1：

※1.了解SpringMVC是什么（SpringMVC简介）：

### SpringMVC概述：

	Spring MVC属于SpringFrameWork的后续产品，

	Spring 框架提供了构建 Web 应用程序的全功能 MVC 模块。

	使用 Spring 可插入的 MVC 架构，从而在使用Spring进行WEB开发时，
可以选择使用	Spring的SpringMVC框架或集成其他MVC开发框架。

	Spring web mvc和Struts2都属于表现层的框架。

### 2.简单了解SpringMVC处理流程：

	用户发送请求至前端控制器DispatcherServlet

	DispatcherServlet收到请求调用HandlerMapping处理器映射器。

	处理器映射器根据请求url找到具体的处理器，生成处理器对象及处理器拦截器(如果有则	生成)一并返回给DispatcherServlet。

	DispatcherServlet通过HandlerAdapter处理器适配器调用处理器。

	执行处理器(Controller，也叫后端控制器)。

	Controller执行完成返回ModelAndView。

	HandlerAdapter将controller执行结果ModelAndView返回给DispatcherServlet。

	DispatcherServlet将ModelAndView传给ViewReslover视图解析器。

	ViewReslover解析后返回具体View。

	DispatcherServlet对View进行渲染视图（即将模型数据填充至视图中）。

	DispatcherServlet响应用户。


### 3.该工程项目为入门程序，操作步骤总结如下：
	
	1.创建web工程

	2.导入springMVC相关jar包,在spring的基础上添加一个mvc的包

	3.添加配置文件：springmvc.xml

	4.配置前端控制器

	5.创建控制器 

	6.在springMVC核心配置文件当中添加控制器扫描范围

	7.创建first.jsp

	8.index.jsp页面跳转
