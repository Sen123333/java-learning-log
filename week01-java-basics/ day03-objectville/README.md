# Day 3 - Objectville

## 学习目标

Day 3 的目标是学习 Java 里的 class、object、instance variable 和 method。

今天我练习了不要把所有代码都写在 `main()` 里面。
我把不同功能分成不同的 class，然后用 TestDrive 文件来测试它们。

---

## 程序内容

### 1. Dog / DogTestDrive

`Dog.java` 用来定义 Dog 这个 class。
Dog 有三个属性：`name`、`size`、`breed`。
Dog 也有一个 `bark()` 方法。

`DogTestDrive.java` 用来创建不同的 Dog 对象，并测试 `bark()` 方法。

---

### 2. Student / StudentTestDrive

`Student.java` 用来定义 Student 这个 class。
Student 有三个属性：`name`、`age`、`score`。
Student 有 `printInfo()` 和 `isPassing()` 方法。

`StudentTestDrive.java` 用来创建不同的 Student 对象，并测试学生信息和是否及格。

---

### 3. Book / BookTestDrive

`Book.java` 用来定义 Book 这个 class。
Book 有三个属性：`title`、`author`、`pages`。
Book 有一个 `isLongBook()` 方法，用来判断这本书是不是长书。

`BookTestDrive.java` 用来创建不同的 Book 对象，并测试不同页数的书。

---

### 4. SimpleGuessingGame

`SimpleGuessingGame.java` 是一个简单的猜数字游戏。
程序设定答案是 7。
如果输入的数字太小，输出 `too low`。
如果输入的数字太大，输出 `too high`。
如果输入 7，输出 `correct`。

---

## 今天学到的内容

* Class 像一个蓝图。
* Object 是根据 class 创建出来的具体东西。
* Instance variable 用来保存对象的状态。
* Method 表示对象可以做什么。
* `main()` 是程序入口，但不应该把所有逻辑都塞进 `main()`。
* TestDrive 文件可以用来测试 class 是否正常工作。

