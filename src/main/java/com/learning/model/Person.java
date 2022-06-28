package com.learning.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Person")
@Data
@Builder
public class Person implements Serializable {
    private Integer id;
    private String name;
}
