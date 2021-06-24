package com.example.msscjacksonexample.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BeerTest {

    public BeerDto getDto(){
        return BeerDto.builder().beerName("Heiniken").uuid(UUID.randomUUID())
                .price(new BigDecimal(4.33))
                .createdDate(OffsetDateTime.now())
                .updatedDate(OffsetDateTime.now())
                .build();
    }
}
