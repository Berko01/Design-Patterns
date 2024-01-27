public class Director {

    public void buildProduct(IBuilder builder){

        builder.buildPartA();
        builder.buildPartB();

    }

    public void buildProduct(IBuilder builder,String partA, String partB){
        ConcreteCustomBuilder concreteCustomBuilder =  (ConcreteCustomBuilder) builder;
        
        concreteCustomBuilder.buildPartA(partA);
        concreteCustomBuilder.buildPartB(partB);
    }
    
}