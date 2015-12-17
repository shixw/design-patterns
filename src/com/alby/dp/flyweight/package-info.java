/**
 * Created by xianwei on 2015/12/16.
 * 享元模式 Flyweight  [ˈflaɪweɪt]
 * 定义：
 *      运用共享技术有效地支持大量细粒度对象。
 *
 * 结构说明
 *      Flyweight：
 *              享元接口，通过这个接口flyweight可以接受作用于外部状态。通过这个接口传入外部的状态
 *          在享元对象的方法处理中可能会使用这些外部的数据。
 *      ConcreteFlyweight：
 *              具体的享元实现对象，必须是可共享的，需要封装Flyweight的内部状态
 *      UnsharedConcreteFlyweight：
 *              非共享的享元实现对象，并不是所有的Flyweight实现对象都需要共享。非共享的享元实现
 *           对象通常是对共享享元对象的组合对象
 *      FlyweightFactory：
 *              享元工厂，主要用来创建并管理共享的享元对象，并对外提供访问共享享元的接口
 *      Client：
 *              享元客户端，主要的工作是维持一个Flyweight的引用，计算或存储享元对象的外部状态
 *          当然这里可以访问共享和不共享的Flyweight对象
 *
 * 加入权限控制
 *      不用模式的解决方案
 *              com.alby.dp.flyweight.example2
 *      使用模式的解决方案
 *              com.alby.dp.flyweight.example3
 *
 *
 *
 */
package com.alby.dp.flyweight;