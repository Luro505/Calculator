package respository;

// Klasa w której znajdą się dane podczas ich przesyłania
public class CalculationDTO {
    double num1;
    double num2;
    String operation;
    double result;

    public CalculationDTO(double num1, double num2, String operation, double result)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
        this.result = result;
    }


    //region Getters for properties

    //Get methods are easy and safer way to access values of propeties if needed
    public double getNum1() { return this.num1; }

    public double getNum2() { return this.num2; }

    public String getOperation() { return this.operation; }

    public double getResult() { return this.result; }
    //endregion

    //region Setters

    public void setNum1(double input)
    {
        this.num1 = input;
    }

    public void setNum2(double input)
    {
        this.num2 = input;
    }

    public void setOperation(String input)
    {
        this.operation = input;
    }

    public void setResult(double input)
    {
        this.result = input;
    }
    //endregion
}
