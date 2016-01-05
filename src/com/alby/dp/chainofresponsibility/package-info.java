/**
 * Created by xianwei on 2015/12/25.
 * 职责链模式    Chain Of Responsibility
 * 定义：
 *      是多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合
 *      关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象
 *      处理它为止
 *
 * Handler：
 *      定义职责的接口，通常在这里定义处理请求的方法，可以在这里实现后继链
 * ConcreteHandler：
 *      实现职责的类，在这个类里面，实现对在它职责范围内请求的处理，如果不处理，
 *      就继续转发请求给后继者
 * Client：
 *      职责链的客户端，向链上的具体处理这对象提交请求，让职责链负责处理。
 *
 *
 * 申请聚餐费用：
 *          不使用模式的解决方案：com.alby.dp.chainofresponsibility.example2
 *          使用模式的解决方案：com.alby.dp.chainofresponsibility.example3
 *
 * 功能链：
 *
 */
package com.alby.dp.chainofresponsibility;