package app.controller;

import app.mapper.ExampleMapper;
import app.model.ExampleModel;
import app.util.JSONHelper;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*此注解同样表明这是一个Controller类，但它声明
* 此类中的所有方法均返回字符串
* 此注解可专门用于与前端交互数据
* 注：不要与@ResponseBody混淆，@ResponseBody仅用于注解方法*/
@RestController
public class ExampleController_2 {
    private ExampleMapper exampleMapper;
    private JSONHelper jsonHelper;

    @Autowired
    public ExampleController_2(ExampleMapper exampleMapper,
                               JSONHelper jsonHelper){
        this.exampleMapper = exampleMapper;
        this.jsonHelper = jsonHelper;
    }

    @RequestMapping(value = "/col_2")
    public String col_2(@RequestBody JSONObject jsonObject){
        String col_1 = jsonObject.getString("col_1");
        ExampleModel exampleModel = exampleMapper.getExampleModel(col_1);
        if (exampleModel == null) return jsonHelper.idGenerate(JSONHelper.ID_GENERATE_FAILED, exampleModel);
        else return jsonHelper.idGenerate(JSONHelper.ID_GENERATE_SUCCESS, exampleModel);
    }

}
