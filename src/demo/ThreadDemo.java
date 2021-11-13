package demo;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import javax.xml.transform.sax.SAXTransformerFactory;

/**
 * @author wjl
 * @create 2021-11-11-14:09
 */
public class ThreadDemo {
    public static void main(String[] args) {
        demo();
        System.out.println(Thread.currentThread().getName());
        System.out.println("");

    }

    public static void demo(){
        new Thread(){
            public void run() {
                System.out.println("线程运行！");
                Thread.currentThread().setName("demo");
                System.out.println(Thread.currentThread().getThreadGroup());
            }
        }.start();

    }

}
