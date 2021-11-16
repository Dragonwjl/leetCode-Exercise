package decorator;


/**
 * 装饰器的抽象父类
 *
 * @author wjl
 * @create 2021-11-16-9:46
 */
public class PersonDecorator extends Person {
    private Person person;

    //装饰器必须持有一个被装饰的对象
    public PersonDecorator(Person person) {
        this.person = person;
    }

    @Override
    public void wear() {
        person.wear();
    }
}
