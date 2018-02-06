package 设计模式.代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {//动态代理
    //对真实对象的引用-被代理的实例对象
    private Object obj;

    public DynamicProxy(Object obj){
        this.obj=obj;
    }
    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        Object result;
        //可以加上调用方法之前的操作
        result= method.invoke(this.obj,args);
        //可以加上调用方法之后的操作
        return result;
    }
}
