5 个重要概念
1. 编译 Compile

Java 程序运行之前需要先编译。
编译器会检查 Java 代码有没有错误，然后把 .java 文件转换成 bytecode。
这样可以在程序运行之前先发现一些语法错误。

2. 字节码 Bytecode

Bytecode 是 Java 代码编译后生成的内容。
它不是普通的 Java 代码，也不是只属于某一种电脑的机器码。
只要电脑里有 JVM，bytecode 就可以被运行。

3. JVM

JVM 的全称是 Java Virtual Machine，也就是 Java 虚拟机。
JVM 的作用是读取并运行 bytecode。
它很重要，因为它让 Java 程序可以在不同的电脑和系统上运行。

4. Class

在 Java 里，代码必须放在 class 里面。
Class 可以理解成一个装 Java 代码的容器。
每一个 Java 程序至少需要一个 class。

5. main() 方法

main() 方法是 Java 程序的开始位置。
当程序运行时，Java 会先找到 main() 方法，然后从这里开始执行代码。
如果没有 main() 方法，程序就不知道从哪里开始运行。

Java 运行流程图
.java source code
to
javac compiler
to
.class bytecode
to
JVM
to
program runs

Sharpen your pencil 代码解释
int size = 27;

创建一个整数变量 size，值是 27。

String name = “Fido”;

创建一个字符串变量 name，内容是 "Fido"。
注意：Java 里要用英文双引号 " "，不要用中文/弯引号 “ ”。

Dog myDog = new Dog(name, size);

创建一个新的 Dog 对象。
把 name 和 size 传给 Dog 的构造方法。
myDog 是这个 Dog 对象的名字/引用。

x = size - 5;

让 x 等于 size - 5。
因为 size 是 27，所以 x = 22。
不过这里前面应该先声明 x：

int x = size - 5;
if (x < 15) myDog.bark(8);

如果 x < 15，就让 myDog 叫 8 次。
但是这里 x 是 22，所以条件是 false，不会执行 bark(8)。

while (x > 3) {

只要 x > 3，就一直重复执行大括号 { } 里面的代码。

    myDog.play();

让 myDog 执行 play() 方法，也就是让狗玩。

}

结束 while 循环。
注意：这个循环里面没有改变 x，所以如果 x 一直是 22，就会变成无限循环。通常要写：

x = x - 1;
int[] numList = {2,4,6,8};

创建一个整数数组 numList。
里面有 4 个数字：2, 4, 6, 8。

System.out.print(“Hello”);

在屏幕上输出 Hello。
注意也要用英文双引号：

System.out.print("Hello");
System.out.print(“Dog: ” + name);

输出 Dog: Fido。
+ name 的意思是把变量 name 的内容接到文字后面。

String num = “8”;

创建一个字符串变量 num，内容是 "8"。
这里的 "8" 是文字，不是整数。

int z = Integer.parseInt(num);

把字符串 "8" 转成整数 8，然后存进变量 z。
所以 z 是 int 类型，值是 8。

try {

开始一个 try 区块。
意思是：这里面的代码可能会出错，所以先尝试运行。

    readTheFile(“myFile.txt”);

尝试读取 myFile.txt 这个文件。
注意双引号也要改成英文：

readTheFile("myFile.txt");
}

结束 try 区块。

catch(FileNotFoundException ex) {

如果文件找不到，就会进入这个 catch 区块。
FileNotFoundException 的意思是“文件找不到错误”。

    System.out.print(“File not found.”);

输出：

File not found.

意思是告诉用户：文件没有找到。
