package decorator;

/**
 * 实现一个具体的装饰类
 *
 * @author wjl
 * @create 2021-11-16-9:51
 */
public class ConcretePersonDecorator extends PersonDecorator {
    public ConcretePersonDecorator(Person person) {
        super(person);
    }

    @Override
    public void wear() {
        headWear();
        super.wear();
        shoes();
    }

    private void headWear() {
        System.out.println("头部装饰");
    }

    private void shoes() {
        System.out.println("穿上鞋子");
    }
}
