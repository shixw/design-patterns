/**
 * Created by xianwei on 2015/12/15.
 * 备忘录模式   Memento  [məˈmentəʊ] [me man tou]
 *
 *  定义：
 *      在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
 *   这样以后就可将该对象恢复到原先保存的状态
 *
 *  Memento:
 *          备忘录。主要用来存储原发器对象的内部状态，但是具体需要存储哪些数据是由原发器对象来
 *        决定的。另外备忘录应该只能由原发器对象来访问它内部的数据，原发器外部的对象不应该能访问
 *        到备忘录对象的内部
 *  Originator：
 *          原发器。使用备忘录来保存某个时刻原发器自身的状态，也可以使用备忘录来恢复内部状态
 *  Caretaker：
 *          备忘录管理者，或者称为备忘录负责人。主要负责保存备忘录对象，但是不能对备忘录对象的
 *       内容进行操作或检查
 *
 *
 * 开发仿真系统
 *          不用模式的解决方案：com.alby.dp.memento.example2
 *          使用模式的解决方案：com.alby.dp.memento.example3
 *
 *
 * 离线存储
 *      存储到文件或数据库中
 *
 * 撤销操作示例
 *      com.alby.dp.memento.example4
 *
 *
 *
 *
 *
 *
 *
 */
package com.alby.dp.memento;