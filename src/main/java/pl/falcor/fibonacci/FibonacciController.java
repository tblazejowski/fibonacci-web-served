package pl.falcor.fibonacci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class FibonacciController {

    @Autowired
    private FibonacciRepository repository;

    @GetMapping("/fibonacci")
    public String fibonacciForm(Model model) {
        model.addAttribute("input", new Fibonacci());
        return "fibonacci";
    }

    @PostMapping("/fibonacci")
    public String fibonacciSubmit(@ModelAttribute(name = "input") Fibonacci input) {
        List<Fibonacci> previousCalcs = repository.findByInputValue(input.getInputValue());
        if (previousCalcs.isEmpty()) {
            input.countFibonacci();
            repository.save(input);
        } else {
            input.setResult(previousCalcs.get(0).getResult());
        }
        return "result";
    }
}
