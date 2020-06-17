package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {
    @GetMapping("/calculator")


    public String getCalculator() {
        return "calcultor_form";
    }

    @GetMapping("/add")
    public String getAddResult(@RequestParam double firstOperator, @RequestParam double secondOperator, Model model) {
        double result = firstOperator + secondOperator;
        model.addAttribute("result", result);
        return "result";
    }
    @GetMapping("/sub")
    public String getSubResult(@RequestParam double firstOperator, @RequestParam double secondOperator, Model model) {
        double result = firstOperator - secondOperator;
        model.addAttribute("result", result);
        return "result";
    }
    @GetMapping("/mul")
    public String getMulResult(@RequestParam double firstOperator, @RequestParam double secondOperator, Model model) {
        double result = firstOperator * secondOperator;
        model.addAttribute("result", result);
        return "result";
    }
    @GetMapping("/div")
    public String getDivResult(@RequestParam double firstOperator, @RequestParam double secondOperator, Model model) {
        double result = firstOperator / secondOperator;
        model.addAttribute("result", result);
        return "result";
    }



}
