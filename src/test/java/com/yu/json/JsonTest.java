package com.yu.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yu.pojo.Person;
import org.junit.Test;

import java.io.IOException;


/**
 * Created by dayu on 2018/6/26
 * @author dayu
 */
public class JsonTest {
    private String jsonString =
            "{\"name\":\"wangjinyang\",\"address\":{\"city\":\"beijing\",\"street\":\"dongcheng\",\"postcode\":\"123456\"}}";

    /**
     * json to obj
     * @throws Exception
     */
    @Test
    public void fun1() throws Exception {
        ObjectMapper MAPPER = new ObjectMapper();
        Person person = MAPPER.readValue(jsonString, Person.class);
        System.out.println(person);
    }

    /**
     * obj to json
     * @throws Exception
     */
    @Test
    public void fun2() throws Exception {
        ObjectMapper MAPPER = new ObjectMapper();
        Person person = MAPPER.readValue(jsonString, Person.class);
        String json = MAPPER.writeValueAsString(person);
        System.out.println(json);
    }
}
