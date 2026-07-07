# Day 3 Bug Log

## Bug 1: 把太多代码写进 main()

### 问题

一开始我想把大部分代码都写在 `main()` 方法里面。

### 为什么这是问题

如果所有逻辑都放在 `main()` 里面，代码会很乱。
程序变长以后，也会很难测试和修改。

### 修正方法

我把代码分成 class 文件和 TestDrive 文件。

例如：

* `Dog.java` 负责定义 Dog class。
* `DogTestDrive.java` 负责测试 Dog class。

---

## Bug 2: 分不清 class 和 object

### 问题

我一开始容易把 class 和 object 混在一起。

### 为什么这是问题

Class 只是蓝图，不是真正的对象。
Object 才是根据 class 创建出来的具体东西。

### 修正方法

我用这个方法记：

```text
Dog = class
myDog = object
```

---

## Bug 3: 没有创建对象就想调用方法

### 问题

我有时候想直接调用对象的方法，但是忘了先创建对象。

### 错误例子

```java
bark();
```

### 修正方法

应该先创建 Dog 对象，然后再调用方法。

```java
Dog myDog = new Dog();
myDog.bark();
```

---

## Bug 4: public class 名字和文件名不一致

### 问题

Java 要求 public class 的名字必须和文件名一样。

### 例子

如果文件名是：

```text
DogTestDrive.java
```

那么 public class 应该写成：

```java
public class DogTestDrive
```

### 修正方法

我检查了每个 Java 文件，确保 public class 名字和文件名一致。

---

## Bug 5: SimpleGuessingGame 只测试了正确答案

### 问题

一开始我只测试了输入 7 的情况。
但是猜数字游戏还应该测试太小和太大的情况。

### 修正方法

我测试了三个输入：

* 输入 3，应该输出 `too low`
* 输入 9，应该输出 `too high`
* 输入 7，应该输出 `correct`

---

## 下次需要注意

* 不要把所有逻辑都写进 `main()`。
* 每个 class 尽量单独放一个文件。
* TestDrive 文件用来测试对象。
* public class 名字要和文件名一样。
* 写完程序后要测试正常情况、边界情况和错误情况。

