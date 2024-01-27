public abstract class Abstraction {
    Implementor implementor;
    public void operation(){
        implementor.operationImplementation();
    }
}
