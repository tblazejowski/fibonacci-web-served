package pl.falcor.fibonacci;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FibonacciController {

    @GetMapping("/fibonacci")
    public String fibonacciForm(Model model) {
        model.addAttribute("input", new Fibonacci());
        return "fibonacci";
    }

    @PostMapping("/fibonacci")
    public String fibonacciSubmit(@ModelAttribute(name = "input") Fibonacci input) {
        input.countFibonacci();
        return "result";
    }
}
