package springmvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//控制器
@Controller
//创建控制器，其实就是一个普通的类
public class MyController {
    //匹配请求可以省略action
    @RequestMapping("/first.action")
    public ModelAndView show(){
        //创建ModelAndView,用来存放数据和设置跳转的视图
        ModelAndView modelAndView = new ModelAndView();
        //设置数据到模型中（请求过来后，跳转到另一个界面，往另一个界面中传一些数据）
        modelAndView.addObject("name","luzhibin");
        //设置视图jsp
        modelAndView.setViewName("/result.jsp");//请求转发
        return modelAndView;
    }

    @RequestMapping("/second.action")
    //返回Sting类型的字符串，即返回一个地址
    public String show2(){
        return "redirect:/result.jsp"; //在/result.jsp前加上redirect: ，实现重定向
    }
}
