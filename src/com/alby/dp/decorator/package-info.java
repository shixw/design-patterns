/**
 * Created by xianwei on 2015/12/24.
 *  装饰模式：Decorator  [dai ke rui ter]
 *      定义：
 *          动态给一个对象添加一些额外的职责。就增加功能来说，装饰模式比生成子类更为灵活
 *
 *      结构和说明：
 *          Component：
 *                  组件对象的接口，可以给这些对象动态的添加职责。
 *          ConcreteComponent：
 *                  具体的组件对象，实现组件对象接口，通常就是被装饰器装饰的原始对象，
 *              也就是可以给这个对象添加职责。
 *          Decorator：
 *                  所有装饰器的抽象父类，需要定义一个与组件接口一致的接口，并持有一个
 *              Component对象，其实就是持有一个被装饰对象，
 *                  注意个被装饰的对象不一定是最原始的那个对象了，也可能是被其他装饰器
 *          ConcreteDecorator：
 *                  实际的装饰器对象，实现具体要向被装饰对象添加的功能。
 *
 * 案例：
 *      复杂的奖金计算：
 *              不用模式的解决方案：com.alby.dp.decorator.example2
 *              使用模式的解决方案：com.alby.dp.decorator.example3
 *  Java中装饰模式的应用：
 *      Java中典型的装饰模式应用  I/O流
 *
 *       自定义I/O流处理
 *          com.alby.dp.decorator.example4
 *  AOP：
 *       com.alby.dp.decorator.example5
 *
 *
 *
 *
 *
 */
package com.alby.dp.decorator;