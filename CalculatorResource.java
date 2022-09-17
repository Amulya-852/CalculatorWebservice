public CalculatorResource;
import java.jws.*;
import CalculatorService.CalculatorService;
@webservice
public class CalculatorResource{
    CalculatorService service= new CalculatorService();
    @webMethod
    public double add(double a, double b){
        return service.add(a,b);
        }
          public double sub(double a, double b){
        return service.sub(a,b);
        }
          public double mul(double a, double b){
        return service.mul(a,b);
        }
  public double div(double a, double b){
        return service.div(a,b);
        }

}