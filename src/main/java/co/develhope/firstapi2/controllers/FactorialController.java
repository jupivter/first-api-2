package co.develhope.firstapi2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    @GetMapping("/{n}")
    public Integer getFactorial(@PathVariable (name = "n") Integer n){
        Integer result = n;
        while (n>1){
            result *= (--n);
        }
        return result;
    }
}