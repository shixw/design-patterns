/**
 * Created by xianwei on 2015/12/20.
 * 解释器模式    Interpreter
 * 定义：
 *      给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个
 *   解释器使用该表示来解释语言中的句子。
 * 结构和说明：
 *      AbstractExpression:
 *                  定义解释器的接口，预定解释器的解释操作
 *      TerminalExpression：
 *              终结符解释器，用来实现语法规则中和终结符相关的操作，不再包含其他的解释器，如果
 *         用组合模式来构建抽象语法树的话，就相当于组合模式中的叶子对象，可以有多重终结符解释器
 *      NonterminalExpression：
 *              非终结符解释器，用来实现语法规则中非终结符相关的操作，通常一个解释器对应一个语法
 *          规则，可以包含其他的解释器，如果用组合模式来构建抽象语法树的话，就相当于组合模式中的
 *          组合对象，可以有多重非终结符解释器
 *     Context：
 *              上下文，通常包含各个解释器需要的数据，或是公共的功能
 *     Client：
 *              客户端，指的是使用解释器的客户端，通常在这里去把按照语言的语法做的表达式，转换
 *         成为使用解释器对象描述的抽象语法树，然后调用解释操作。
 * 读取配置文件
 *          不用模式的解决方案：
 *                  com.alby.dp.interpreter.example2
 *          使用模式的解决方案：
 *                  com.alby.dp.interpreter.example3
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package com.alby.dp.interpreter;