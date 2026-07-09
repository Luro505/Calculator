package service;

// importy od Springa
import org.springframework.stereotype.Service;

// importy z podstawy
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// importy customowych klas
import respository.CalculationDTO;
import strategy.Operations;


@Service // Tutaj będzie sie wykonywałą logika
public class CalculatorService {

    // Choć nie jestem pewny czy to dobre rowiązanie to jednak
    // oddzielenie działań od logiki ich wykonywania zwiększa dla mnie czytelność projektu,
    // a także ułatwia edytowanie poszczególnych części


    //przypisanie operacji do odpowiedniego działania
    private final Map<String, Operations> operationsMap = new HashMap<>();

    //Zapełnienie oparationsMap
    public CalculatorService(List<Operations> operationsList)
    {
        for (Operations strategy : operationsList) {
            operationsMap.put(strategy.getName().toLowerCase(), strategy);
        }
    }

    // Wybranie odpowiedniego działania oraz wykonanie obliczeń
    public CalculationDTO calculate(double num1, double num2, String operation)
    {
        Operations requestedOperation = operationsMap.get(operation.toLowerCase());

        if(operation == null)
        {
            throw new IllegalArgumentException("Unknown operation");
        }

        double result = requestedOperation.execute(num1, num2);

        return new CalculationDTO(num1, num2, operation, result);
        // Można wprowadzić np. zapisywanie ostatnich działań aby były widoczne przy kolejnych operacjach itp.
    }
}
