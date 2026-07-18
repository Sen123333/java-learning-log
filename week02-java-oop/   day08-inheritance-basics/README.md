# Day 8 - Inheritance Basics

## 学习目标

Day 8 的目标是学习 Java 继承的基础。

今天我主要学习：

- inheritance
- IS-A relationship
- extends
- superclass
- subclass
- method overriding
- private fields
- superclass constructor

今天不学习 abstract class、interface 和复杂 polymorphism。  
重点是先把 inheritance 和 override 理解清楚。

---

## 程序内容

### 1. Animal.java

`Animal` 是 superclass。

它保存所有动物共同的 state：

- name
- age

它也有共同的 behavior：

- getName()
- getAge()
- move()
- makeSound()

---

### 2. Dog.java

`Dog` extends `Animal`。

Dog 是 Animal 的一种，所以 Dog IS-A Animal。

Dog override 了 `makeSound()` 方法。

Dog 也有自己独有的 field：

- breed

Dog 也有自己独有的方法：

- fetch()

---

### 3. Cat.java

`Cat` extends `Animal`。

Cat override 了 `makeSound()` 方法。

Cat 也有自己的方法：

- scratch()

---

### 4. Bird.java

`Bird` extends `Animal`。

Bird override 了 `makeSound()` 和 `move()`。

Bird 有自己的 field：

- canFly

Bird 有自己的方法：

- fly()

---

### 5. AnimalTestDrive.java

这个文件用来自动测试 Animal hierarchy。

测试内容包括：

- superclass constructor 是否正确初始化
- getter 是否继承成功
- move() 是否继承成功
- makeSound() 是否 override
- subclass 独有方法是否正常
- 测试 summary 是否显示 passed / failed

---

## 如何运行

进入 `src/` 文件夹：

```bash
javac *.java
java AnimalTestDrive
今日重点理解

继承不是为了少写代码。

继承首先要满足 IS-A 关系。

例如：

Dog IS-A Animal，所以 Dog extends Animal 合理。
Cat IS-A Animal，所以 Cat extends Animal 合理。
Bird IS-A Animal，所以 Bird extends Animal 合理。
Dog IS-A Tail 不合理，所以 Dog 不应该 extends Tail。

如果两个类只是有相同代码，但没有真正的 IS-A 关系，就不应该随便使用 inheritance。
