package app.util;

import app.model.ExampleModel;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

/*JSONHelper类用于与前端使用Json数据进行交互
* 做法是：
* 1.定义状态常数，一般为一个失败常数以及一个成功常数
* 2.static{} 中为状态常数赋值
* 3.定义方法，方法中根据不同的常数返回不同的json数据
*
* 调用时，在 @RestController 注解的Controller类中
* 根据结果的正确与否，选择成功或失败常数，调用JSONHelper中对应的方法获得json数据*/
@Service
public class JSONHelper {
    //ID生成状态常数
    public static final int ID_GENERATE_SUCCESS;
    public static final int ID_GENERATE_FAILED;

    static {
        ID_GENERATE_SUCCESS = 1;
        ID_GENERATE_FAILED = 2;
    }

    //ID生成状态的对应返回方法
    public String idGenerate(int mark, ExampleModel exampleModel){
        JSONObject jsonObject = new JSONObject();
        if (mark == ID_GENERATE_SUCCESS){
            jsonObject.put("result", true);
            jsonObject.put("data", exampleModel);
            jsonObject.put("msg", "ID生成成功");
            return jsonObject.toJSONString();
        }
        else if (mark == ID_GENERATE_FAILED){
            jsonObject.put("result", false);
            jsonObject.put("data", exampleModel);
            jsonObject.put("msg", "网络错误，ID生成失败");
            return jsonObject.toJSONString();
        }
        else {
            jsonObject.put("result", false);
            jsonObject.put("data", exampleModel);
            jsonObject.put("msg", "JsonHelper_idGenerate参数错误");
            return jsonObject.toJSONString();
        }
    }
}
