package com.wen;

import com.wen.config.CodeGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisplusApplicationTests {

	@Test
	public void contextLoads() {
		CodeGenerator gse = new CodeGenerator();
		//要给那些表生成
		gse.generateByTables(false,"tab_users");
	}
}
