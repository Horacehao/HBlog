import com.google.common.collect.Lists;
import com.hblog.service.archives.ArchivesVO;
import com.hblog.service.article.SimpleArticleInfo;
import com.hblog.service.slug.SlugInfoService;
import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class GenerateSlugInfo extends TestCase{
    private ClassPathXmlApplicationContext applicationContext;

    protected void setUp(){
        applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
        System.out.println(applicationContext);
    }

    /*public void testInsertSlug(){
        SlugInfoService slugInfoService = (SlugInfoService) applicationContext.getBean("slugInfoService");
        System.out.println(slugInfoService);

        slugInfoService.insert();
    }*/

}
