package cc.mrbird.common.config;

import cc.mrbird.common.domain.ValidateCodeProperties;
import cc.mrbird.common.shiro.ShiroProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Package: cc.mrbird.common.config
 * @ClassName: CombatProperties
 * @Author: beibei.huang
 * @Description:
 * @Date: 2019/6/29 10:26
 */
@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "combat")
public class CombatProperties {

    private ShiroProperties shiro = new ShiroProperties();

    private ValidateCodeProperties validateCode = new ValidateCodeProperties();

    private String timeFormat = "yyyy-MM-dd HH:mm:ss";

    private boolean openAopLog = true;

}
