package cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ConfigController
 * @Auther: Administrator
 * @Date: 2019/8/2 0002 09:55
 * @Description:
 */
@RestController
public class ConfigController {

    //@Value("${name}")
    private String name;

    @RequestMapping(value = "getConfig")
    @ResponseBody
    public String getConfig(){
        System.out.println(name);
        return name;
    }

}
