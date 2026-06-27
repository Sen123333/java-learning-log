# java-learning-log
# Day 1 - Java 基础

## 今天学了什么

今天我学习了 Java 程序的基本结构。Java 代码必须写在 `class` 里面。`main` 方法是程序开始运行的地方。我还学习了 Java 程序从 `.java` 文件到运行的过程：先写源代码，然后用 `javac` 编译成 `.class` 文件，最后由 JVM 运行。

今天我练习了 `System.out.println()`、变量、`while` 循环、`if / else` 判断，也学习了 Python 和 Java 的一些区别。

## 程序文件

1. `MyFirstApp.java`  
   这个程序用来测试 Java 是否可以正常编译和运行。

2. `Loopy.java`  
   这个程序使用 `while` 循环打印 1 到 10，并计算 1 到 10 的总和。

3. `IfElsePractice.java`  
   这个程序使用 `if / else` 判断分数等级，输出 A、B、C、D 或 F。它也会判断一个数字是奇数还是偶数。

4. `PythonVsJavaNotes.java`  
   这个程序打印 5 条 Python 和 Java 的区别。

我修复过的错误

缺少分号
class 名字和文件名不一致
少写了一个大括号
大小写写错
没有先编译就直接运行
Python 和 Java 的区别
Python 用缩进表示代码块，Java 用 { } 表示代码块。
Python 变量不需要提前写类型，Java 变量需要写类型，比如 int 或 String。
Python 一般不用分号，Java 语句通常要用分号结尾。
Java 代码必须写在 class 里面。
Java 需要先编译再运行，Python 通常可以直接运行。

今日总结

今天我学习了 Java 的基础结构和运行流程。Java 程序先写在 .java 文件里，然后用 javac 编译成 .class 文件，最后由 JVM 运行。我也练习了输出语句、变量、while 循环和 if / else 判断。今天最不习惯的是 Java 需要写分号、大括号和变量类型。明天我需要继续练习 Java 的基础语法，特别是 class、main method 和 if / else。

Bug Log - Day 1 Java 基础

1. 缺少分号	error: ';' expected	我忘记在 Java 语句结尾加分号。	我看编译器提示的行数，然后在那一行最后加上 ;。
2. class 名字和文件名不一致	class MyFirstApp is public, should be declared in a file named MyFirstApp.java	Java 里 public class 的名字必须和文件名一样。	我把文件名和 public class 名字改成完全一样。
3. 少写一个大括号	error: reached end of file while parsing	我写了 {，但是没有写对应的 }。	我检查每一个 { 和 }，然后在最后补上缺少的大括号。
4. 大小写写错	cannot find symbol	Java 区分大小写，比如 System 不能写成 system。	我把单词的大小写改成正确格式。
5. 没有先编译就运行	Could not find or load main class	我没有成功生成 .class 文件，或者运行时 class 名字写错了。	我先用 javac FileName.java 编译，再用 java ClassName 运行。
