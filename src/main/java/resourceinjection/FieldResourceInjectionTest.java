package resourceinjection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        loader = AnnotationConfigContextLoader.class,
        classes = MyResources.class
)
@ComponentScan("dev.archimedes.resourceinjection")
public class FieldResourceInjectionTest {
    @Autowired
    private File defaultFile;

    @Test
    public void givenResourceAnnotation_WhenOnField_ThenDependencyValid(){
        assertNotNull(defaultFile);
        assertEquals("nameFile.txt", defaultFile.getName());
    }
}
