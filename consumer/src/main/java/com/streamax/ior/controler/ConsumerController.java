package com.streamax.ior.controler;

import com.streamax.ior.feign.api.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ouYH
 * @date 2022年03月29日 14:15
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private TestApi testApi;

    @GetMapping("test/{data}")
    public String test1(@PathVariable("data") String data) {
        return testApi.test1(data);
    }

    @PostMapping("test/{data}")
    public String test2(@PathVariable("data") String data) {
        return testApi.test2(data);
    }
}
