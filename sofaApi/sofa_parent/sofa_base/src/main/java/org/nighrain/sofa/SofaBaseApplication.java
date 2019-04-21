package org.nighrain.sofa;

import org.nighrain.sofa.common.utils.IdWorker;
import org.nighrain.sofa.common.utils.StandardSnowflakeImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *    
 * Title         [title]
 * Author:       [..]
 * CreateDate:   [2019-04-21--21:16]  @_@ ~~
 * Version:      [v1.0]
 * Description:  [..]
 * <p></p>
 *  
 */
@SpringBootApplication
public class SofaBaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(SofaBaseApplication.class,args);
    }

    @Bean
    public IdWorker getIdWorker(){
        return StandardSnowflakeImpl.create(0);
    }
}
