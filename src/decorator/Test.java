package decorator;

/**
 * @author wjl
 * @create 2021-11-16-9:56
 */
public class Test {
    public static void main(String[] args) {
        ConcretePersonDecorator concretePersonDecorator = new ConcretePersonDecorator(new LL());
        concretePersonDecorator.wear();
    }
}
