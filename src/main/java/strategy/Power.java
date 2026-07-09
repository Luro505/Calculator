package strategy;

import org.springframework.stereotype.Component;

// Potęgowanie
@Component
public class Power implements Operations {

    @Override
    public double execute(double num1, double num2)
    {
        return Math.pow(num1, 2);
    }

    @Override
    public String getName() {return getName(); }
}
