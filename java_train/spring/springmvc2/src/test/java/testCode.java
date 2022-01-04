import cn.ymxdy.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author wf
 * @date 2021/12/30 19:49
 * @description
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class testCode {
    @Test
    public void test_Card() {
        String str = "320724199609222119";
        String pattern = "(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        System.out.println(m.matches());
    }
}
