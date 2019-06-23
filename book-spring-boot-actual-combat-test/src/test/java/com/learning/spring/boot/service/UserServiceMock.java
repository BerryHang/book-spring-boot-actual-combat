package com.learning.spring.boot.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * @Package: com.learning.spring.boot.service
 * @ClassName: UserServiceMock
 * @Author: beibei.huang
 * @Description: 用户service  mock测试
 * @Date: 2019/6/20 9:01
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@WebAppConfiguration
public class UserServiceMock {

    private MockMvc mvc;

    @Autowired
    private WebApplicationContext context;

    @Before
    public void setUp() {
        mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void swaggerUiTest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/swagger-ui.html"))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void findUser() throws Exception{
        mvc.perform(MockMvcRequestBuilders.get("/user/1"))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json("{\"userId\":1,\"userName\":\"李磊\",\"password\":\"lilei\",\"age\":16}"));
    }

    @Test
    public void findUserReturn() throws Exception{
        mvc.perform(MockMvcRequestBuilders.get("/user/1")).andDo(print()).andReturn();

    }

}
