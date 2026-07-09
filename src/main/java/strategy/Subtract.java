package strategy;

import org.springframework.stereotype.Component;

// Działanie odejmowania
@Component
public class Subtract implements Operations
{
    @Override
    public double execute(double num1, double num2)
    {
        return num1 - num2; // By wykorzystać Math.subtract musiałbym się posłużyć long lub int
    }

    @Override
    public String getName() {return getName(); }
}