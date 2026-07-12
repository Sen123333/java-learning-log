# Day 6 - Extra-Strength Methods

## 学习目标

Day 6 的目标是从“会写方法”进入“会设计、会测试、会完成一个小程序”。

今天我学习的是 Head First Java Chapter 5: Extra-Strength Methods。

重点内容：

- pseudocode
- test code
- for loop
- Math.random()
- casting
- Integer.parseInt()
- simple game design
- 自动 PASS/FAIL 测试

---

## 程序内容

### 1. SimpleDotCom.java

这是 Simple Dot Com 游戏的核心 class。

它负责保存 Dot Com 的位置，并检查用户猜的位置。

`checkYourself()` 方法会返回：

- `miss`
- `hit`
- `kill`
- `repeat`
- `invalid`

---

### 2. SimpleDotComTestDrive.java

这个文件用来测试 `SimpleDotCom.java`。

它不是手动看结果，而是自动判断 PASS 或 FAIL。

测试内容包括：

- miss
- hit
- kill
- repeated guess
- out-of-range guess
- non-number input

---

### 3. SimpleDotComGame.java

这是可以互动运行的游戏。

电脑会在 0-6 的一维格子里随机放置一个 Dot Com。

用户不断输入数字，直到结果是 `kill`。

最后程序会输出用户猜了多少次。

当前限制：非数字输入会被当成 `invalid`。

---

### 4. GameHelper.java

这个 class 负责从命令行读取用户输入。

---

### 5. RandomRangeDemo.java

这个程序运行 20 次随机起点。

它会自动检查每个随机起点是否都在 0-4 之间。

---

### 6. PassByValueReassignmentDemo.java

这个程序继续解释 Java 的 pass-by-value。

它证明：

- 如果方法修改 object 的 state，外面的 object 会看到变化。
- 如果方法里把参数重新指向 `new Dog()`，外面的 reference 不会被替换。

---

## 如何运行

在 `src/` 文件夹里打开 terminal：

```bash
javac *.java
java SimpleDotComTestDrive
java RandomRangeDemo
java PassByValueReassignmentDemo
java SimpleDotComGame
