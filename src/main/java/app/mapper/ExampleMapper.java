package app.mapper;

import app.model.ExampleModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/*Mapper接口类
* 用于与数据库进行交互
* @Mapper 告诉Spring，当调用此类中的方法时，方法实现在某个.xml文件中
* @Component 使此类可被 Autowired*/

@Mapper
@Component
public interface ExampleMapper {

    ExampleModel getExampleModel(String col_1);

    String getCol2(String col_1);
}
