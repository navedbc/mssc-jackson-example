package com.example.msscjacksonexample.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
public class BeerDtoTest extends BeerTest{

    @Autowired
    ObjectMapper mapper;

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto=getDto();
        String jsonString=mapper.writeValueAsString(beerDto);
        System.out.println(jsonString);
    }
}
