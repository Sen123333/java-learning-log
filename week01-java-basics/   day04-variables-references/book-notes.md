# Day 4 Book Notes - Head First Java Chapter 3

## 阅读内容

Head First Java Chapter 3: Know Your Variables

重点内容：

- primitive type
- reference variable
- object declaration
- heap
- array

---

## 1. Primitive Variable

Primitive variable 会直接保存真正的值。

例如：

```java
int age = 18;
double price = 9.99;
boolean passed = true;
char grade = 'A';

这些变量里面保存的就是值本身。

例如：

int x = 10;
int y = x;
y = 20;

这里 y 改成 20，不会影响 x。
因为 x 和 y 都是 primitive variable，它们各自保存自己的值。

2. Reference Variable

Reference variable 不直接保存 object 本身。

它保存的是一个 reference，也就是指向 object 的位置。

例如：

Dog a = new Dog();

这里 a 不是 Dog object 本身。
a 是一个 reference variable，它指向 heap 里的 Dog object。

3. Object Declaration

Object declaration 是声明一个对象变量，并创建对象。

例如：

Dog myDog = new Dog();

这行代码可以分成两部分理解：

Dog myDog 创建一个 Dog 类型的 reference variable。
new Dog() 在 heap 里创建一个新的 Dog object。
4. Heap

Heap 是 Java 存放 object 的内存区域。

当我写：

Dog myDog = new Dog();

Dog object 会被创建在 heap 里。

变量 myDog 保存的是指向这个 object 的 reference。

5. Array

Array 可以保存多个相同类型的数据。

例如：

int[] scores = {95, 70, 55};

这个 array 保存的是 int 数值。

如果是 object array：

Dog[] dogs = new Dog[3];

这个 array 保存的是 Dog reference。
它一开始只是有 3 个空位置，还没有真正的 Dog object。

所以还要写：

dogs[0] = new Dog();
dogs[1] = new Dog();
dogs[2] = new Dog();
Reference 图

代码：

Dog a = new Dog();
a.name = "Max";

Dog b = a;
b.name = "Luna";

内存理解：

a --------\
           ----> Dog object on heap
b --------/       name = "Luna"

a 和 b 指向同一个 Dog object。

所以修改 b.name 的时候，真正被修改的是 heap 里的同一个 object。
因此 a.name 也会显示 Luna。

我自己的理解

Primitive variable 保存的是值本身。

Reference variable 保存的是 object 的位置。

如果两个 reference variables 指向同一个 object，它们不是两个不同的 object。
它们只是两个名字指向同一个东西。

所以当我通过 b 修改 Dog object 的 name，a 看到的结果也会改变。
