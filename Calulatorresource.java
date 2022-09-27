package Calulatorresource;
public calss Calculator{
    public static void main(string[] args){
        CalculatorResourceService service= new CalculatorResourceService();
        CalculatorResource resource= service.get CalculatorResourcePort();
        System.out.println(resource.add(3.4,4.5));
        System.out.println(resource.sub(5.6,2.5));
        System.out.println(resource.mul(8.1,3.1));
        System.out.println(resource.div(5.4,6.5));

    }

}
