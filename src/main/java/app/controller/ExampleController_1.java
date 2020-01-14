package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*Controller类 用于处理前端请求，它需要获取前端请求
* 然后调用mapper类 / model类 / util类 获得处理结果
* 并将处理结果返回给前端
* @Controller 标明这是一个用于返回网页的Controller类
* 即类中方法返回字符串时，实际上返回的是字符串对应的页面
* 可用@ResponseBody指明某个方法只返回字符串而不返回页面*/
@Controller
public class ExampleController_1 {

    /*此条路由代表当不指定访问的页面时，用户会访问到
    * resources/templates/index.html这个页面*/
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    //此方法会返回 "index" 给前端，而不返回index.html
    @ResponseBody
    @RequestMapping(value = "index")
    public String index_1(){
        return "index";
    }
}
