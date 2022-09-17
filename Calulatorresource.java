package Calulatorresource;
public calss Calculator{
    public static void amin(string[] args){
        CalculatorResource service= new CalculatorResourceService();
        calcualtor resource = service.get CalculatorResourcePort();
        System.ot.println(resource.add(3.4,4.5));
        System.ot.println(resource.sub(5.6,2.5));
        System.ot.println(resource.mul(8.1,3.1));
        System.ot.println(resource.div(5.4,6.5));

    }

}