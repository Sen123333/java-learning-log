README.md
# Day 9 - Polymorphism Basics

## 学习目标

Day 9 的目标是学习 Java 多态基础。

今天重点学习：

- reference type
- object type
- runtime method dispatch
- polymorphism
- override rules
- overload
- supertype reference
- ArrayList with superclass type

今天不学习：

- abstract class
- interface
- downcasting
- instanceof
- GUI

---

## 核心问题

### 1. Reference type 是什么？

Reference type 是变量声明时的类型。

例如：

```java
Animal a = new Dog("Max", 3, "Husky");

这里 a 的 reference type 是 Animal。

2. Object type 是什么？

Object type 是真正创建出来的对象类型。

Animal a = new Dog("Max", 3, "Husky");

这里真正的 object type 是 Dog。

3. 为什么 a.makeSound() 会输出 Woof？

因为 makeSound() 是 override 方法。

Java 运行时会看真正的 object type。

虽然 reference type 是 Animal，但是 object type 是 Dog。

所以：

a.makeSound();

会调用 Dog 版本的 makeSound()，输出 Woof。

4. 为什么 a.fetch() 不能编译？

因为 fetch() 是 Dog 独有方法。

变量 a 的 reference type 是 Animal。

Java 编译时只看 Animal 类型有没有 fetch()。

Animal 里没有 fetch()，所以：

a.fetch();

不能编译。

程序内容
AnimalRoster.java

这个 class 使用：

ArrayList<Animal>

来保存不同的 animal object。

它可以同时保存：

Dog
Cat
Bird

重点是：不需要用很多 if/else 判断动物类型。

AnimalPolymorphismTestDrive.java

这个文件用来自动测试多态。

测试内容包括：

Animal reference 指向 Dog object
Animal reference 指向 Cat object
Animal reference 指向 Bird object
ArrayList 同时保存 Dog、Cat、Bird
loop 中调用 makeSound() 和 move()
null animal
empty roster
invalid index
failed test 会用非 0 exit code
如何运行

在 src/ 文件夹里运行：

javac *.java
java AnimalPolymorphismTestDrive
今日总结

多态可以让程序用统一的 superclass type 管理不同 subclass object。

这让代码更灵活，也减少了针对 Dog、Cat、Bird 写重复 if/else 的情况。

但是多态不能代替设计判断。

在使用继承和多态之前，还是要先判断 class 之间有没有合理的 IS-A 关系。
