/**
 * Created by xianwei on 2016/1/6.
 * 桥接模式 Bridge
 * 定义：
 *      将抽象部分与它的实现部分分离，使他们都可以独立的变化
 *
 *  Abstraction：
 *          抽象部分的接口，通常在这个对象里面，要维护一个实现部分的对象
 *     引用，在抽象对象里面的方法，需要调用实现部分的对象来完成。这个对象里面的方法，通常
 *     都是跟具体的业务相关的方法。
 *  RefinedAbstraction:
 *          扩展抽象部分的接口，通常在这些对象里面，定义跟实际业务相关的方法，这些方法的实现
 *     通常会使用Abstraction中定义的方法，也可能需要调用实现部分的对象来完成。
 *  Implementor：
 *          定义实现部分的接口，这个接口不用和Abstraction里面的方法一直，通常是由Implementor接口
 *      提供基本的操作，而Abstraction里面定义的是基于这些基本操作的业务方法，也就是说Abstraction
 *      定义了基于这些基本操作的较高层次的操作
 *  ConcreteImplementor：
 *          真正实现Implementor接口的对象。
 *
 *
 * 发送提示消息：
 *          不用模式的解决方案：com.alby.dp.bridge.example2
 *          使用模式的解决方案：com.alby.dp.bridge.example4
 *
 *  由抽象部分的对象自己来创建相应的Implementor对象
 *          分两种情况,一种是需要外传入参数，一种不需要的
 *  典型例子：   JDBC
 *
 *
 * 广义桥接
 *
 *
 *
 *
 */
package com.alby.dp.bridge;