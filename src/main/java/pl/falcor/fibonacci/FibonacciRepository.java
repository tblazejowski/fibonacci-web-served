package pl.falcor.fibonacci;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FibonacciRepository extends CrudRepository<Fibonacci, Integer> {

    List<Fibonacci> findByInputValue(int inputValue);
}