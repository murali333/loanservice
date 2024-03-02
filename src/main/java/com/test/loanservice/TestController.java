package com.test.loanservice;

import com.msd.Loan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        Loan loan = new Loan();
        return "success";
    }
}
