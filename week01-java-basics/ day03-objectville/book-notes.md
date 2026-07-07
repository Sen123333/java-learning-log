# Day 3 Book Notes - Head First Java Chapter 2

## 阅读内容

Head First Java Chapter 2: A Trip to Objectville

这一章主要讲 Java 里的 class 和 object。
它让我理解 Java 不是只写一行一行的代码，而是要用对象来组织程序。

---

## 5 个重要概念

### 1. Class

Class 可以理解成蓝图。
它规定一个对象应该有什么属性，也规定这个对象可以做什么。

例如：

`Dog` 是一个 class。
它可以有 `name`、`size`、`breed`，也可以有 `bark()` 方法。

---

### 2. Object

Object 是从 class 创建出来的具体东西。
Class 只是设计图，object 才是真正被创建出来使用的东西。

例如：

`Dog` 是 class。
`myDog` 是一个 Dog object。

---

### 3. Instance Variable

Instance variable 用来保存对象的状态。
不同对象可以有不同的 instance variable 值。

例如：

一只狗的名字可以是 Fido，大小是 27。
另一只狗的名字可以是 Max，大小是 60。

它们都是 Dog 对象，但状态不同。

---

### 4. Method

Method 表示对象可以做什么。
方法里面写的是这个对象的行为。

例如：

Dog 对象可以有 `bark()` 方法。
Student 对象可以有 `printInfo()` 和 `isPassing()` 方法。
Book 对象可以有 `isLongBook()` 方法。

---

### 5. TestDrive

TestDrive 文件是用来测试 class 的。
它通常会创建对象，然后调用对象的方法，看看程序能不能正常运行。

例如：

`DogTestDrive.java` 用来测试 `Dog.java`。
`StudentTestDrive.java` 用来测试 `Student.java`。
`BookTestDrive.java` 用来测试 `Book.java`。

---

## 3 个我还不太懂的问题

1. 什么时候应该把代码写在 class 里面，什么时候应该写在 TestDrive 里面？
2. 为什么 Java 文件里可以有多个 class，但只能有一个 public class？
3. 怎么判断一个东西应该写成 instance variable，还是写成 method？

---

## 和 Python 的对比

Python 写小程序时，可以直接写代码，不一定需要 class。
但是 Java 更严格，大部分代码都要放在 class 里面。

Python 比较自由。
Java 比较有结构。

虽然 Java 一开始写起来更麻烦，但如果程序变大，用 class 和 object 会让代码更清楚。

---

## 我的理解

Day 3 让我明白，Java 不是把所有代码都写进 `main()` 就可以了。
更好的写法是把不同东西分成不同 class。
然后用 TestDrive 文件创建对象并测试方法。
这样代码更清楚，也更容易检查错误。

ObjectReflection - 为什么 main() 里不应该塞太多代码？

原因解释
在 Java 中，main 方法是程序的入口点，但它不应该成为代码的主要存放地。原因如下：

职责单一原则（Single Responsibility）
main 只负责启动程序，不应该承担业务逻辑。
代码可读性和维护性差
如果 main 方法里代码太多，会变得又长又乱，难以阅读和调试。
不利于复用和测试
写在 main 里的代码很难被其他类复用，也难以编写单元测试。
不符合面向对象思想
应该把逻辑封装到类和方法中，通过创建对象来调用。
