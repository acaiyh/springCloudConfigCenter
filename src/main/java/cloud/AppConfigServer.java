package cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: AppConfigServer
 * @Auther: Administrator
 * @Date: 2019/7/31 0031 17:22
 * @Description:
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class AppConfigServer {

    /**
     * 服务启动，访问 http://localhost:8100/config-dev.properties 就可以拿到配置信息了
     * 刷新接口，刷新配置文件信息 http://127.0.0.1:8100/actuator/refresh
     * 阿波罗 配置中心
     * @author caiyunchun
     * @date 209/8/5 0005
     */
    public static void main(String[] args) {
        SpringApplication.run(AppConfigServer.class,args);
    }

}
