package app.util;

import com.xiaoju.uemc.tinyid.client.utils.TinyId;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/*此类为ID生成类
* 使用了自己搭建的tinyid服务
* 如需添加业务类型，需要到服务器的tinyid数据库中添加后才可使用*/

/*此注解用于Controller层的Autowired*/
@Service
public class IDGenertor {
    //tinyid业务类型
    private final String USER_BIZ_TYPE="flickr_user";
    private final String FILE_BIZ_TYPE="flickr_file";

    //使用tinyid生成用户ID
    public String generateUID() {
        Long id = TinyId.nextId(USER_BIZ_TYPE);
        if (id.toString().equals("")) return null;
        return id.toString();
    }

    //使用tinyid与日期拼接生成图片ID
    public String generateFileID(){
        /*if (id.toString().equals("")) return null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");*/
        return TinyId.nextId(FILE_BIZ_TYPE)+"";
    }

    //获得当前时间
    public String getCurrentTime(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(new Date());
    }
}
