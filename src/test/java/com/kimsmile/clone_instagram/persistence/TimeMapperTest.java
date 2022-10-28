package com.kimsmile.clone_instagram.persistence;

import com.kimsmile.clone_instagram.mapper.TimeMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class TimeMapperTest {

    @Autowired
    private TimeMapper timeMapper;

    @Test
    public void testGetTime() {
        log.info("timeMapper class name :: " + timeMapper.getClass().getName());
        log.info("timeMapper time ::" + timeMapper.getTime());
    }
}
