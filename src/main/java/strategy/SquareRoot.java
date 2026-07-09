package strategy;

import org.springframework.stereotype.Component;

// Pierwiastek
@Component
public class SquareRoot implements Operations {

    @Override
    public double execute(double num1, double num2)
    {
        return Math.sqrt(num1);
    }

    @Override
    public String getName() {return getName(); }
}
