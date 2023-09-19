package resourceinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
public class MyResources {

    @Bean(name = "nameFile")
    public File nameFile(){
        File namedFile = new File("nameFile.txt");
        return namedFile;
    }
}
