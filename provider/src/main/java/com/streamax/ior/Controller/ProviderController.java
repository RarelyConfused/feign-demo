package com.streamax.ior.Controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author ouYH
 * @date 2022年03月29日 14:04
 */
@RestController
@RequestMapping("/feign")
public class ProviderController {
    @GetMapping("test/{data}")
    public String test1(@PathVariable("data") String data) {
        return "test-get";
    }

    @PostMapping("test/{data}")
    public String test2(@PathVariable("data") String data) {
        return "test-post";
    }
}
