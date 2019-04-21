package org.nighrain.sofa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.nighrain.sofa.common.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *    
 * Title         [title]
 * Author:       [..]
 * CreateDate:   [2019-04-21--21:20]  @_@ ~~
 * Version:      [v1.0]
 * Description:  [..]
 * <p></p>
 *  
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SofaBaseApplicationTests {

    @Autowired
    private IdWorker idWorker;
    @Test
    public void contextLoads(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(idWorker.nextId());
        }
    }
}
