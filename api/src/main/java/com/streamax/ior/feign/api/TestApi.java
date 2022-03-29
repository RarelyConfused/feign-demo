package com.streamax.ior.feign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient(name = "feignTest", url = "localhost:8081/feign")
public interface TestApi {
    @GetMapping("test/{data}")
    String test1(@PathVariable("data") String data);

    @PostMapping("test/{data}")
    String test2(@PathVariable("data") String data);
}