package CalculatorApplication;
import javax.xml.ws.Endpoint;
import CalculatorResource.CalculatorResource;
public calss CalculatorEndpoint{
    public static void main(string[] args){
        Endpoint.publish("https://localhost:8988/calc",new CalculatorResource());
        System.out.println("Published");
        
    }
}