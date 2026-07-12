## book-notes.md

```md
# Day 6 Book Notes - Head First Java Chapter 5

## 阅读内容

Book: Head First Java, 2nd Edition  
Chapter: Chapter 5 - Extra-Strength Methods  
Printed pages: 95-118  
Reading time: about 80 minutes

---

## 1. Prepcode / Pseudocode

Pseudocode 是在写真正 Java 代码之前，先用普通语言写出程序思路。

它不是严格的 Java 语法。

它的作用是先帮助我想清楚程序逻辑，再开始写代码。

例子：

```text
创建一个 Dot Com 对象。
给它 3 个位置。
让用户输入一个猜测。
检查这个猜测是 miss、hit 还是 kill。
一直重复，直到 Dot Com 被 kill。

这样做可以避免我一开始就卡在 Java 语法里。

2. Test Code

Test code 是用来测试其他 class 是否正确的代码。

在 Day 6 里，SimpleDotComTestDrive.java 用来测试 SimpleDotCom.java。

我应该先写测试，再写完整游戏。

因为如果核心 class 有 bug，完整游戏也一定会有问题。

3. For Loop

for loop 适合用在知道循环次数的情况。

例如：

for (int i = 0; i < locations.length; i++) {
    // check each location
}

在这个项目里，for loop 可以用来检查用户猜的位置是否在 Dot Com 的位置里。

4. Math.random()

Math.random() 会生成一个 0.0 到小于 1.0 的随机 double 数字。

如果我要生成 0 到 4 的随机起点，可以写：

int randomStart = (int) (Math.random() * 5);

因为 Dot Com 占 3 个连续位置，游戏范围是 0-6。

所以起点最大只能是 4。

如果起点是 4，位置就是：

4, 5, 6

不会越界。

5. Casting

Casting 是把一种类型转换成另一种类型。

例如：

int randomStart = (int) (Math.random() * 5);

Math.random() * 5 原本是 double。

(int) 会把它转换成整数。

6. Integer.parseInt()

Integer.parseInt() 可以把 String 转成 int。

例如：

String guess = "3";
int number = Integer.parseInt(guess);

用户输入通常是 String，所以在检查猜测之前，需要把它变成 int。

Simple Dot Com 的 State

SimpleDotCom 的 state 包括：

locationCells：Dot Com 的位置
hitCells：每个位置是否已经被 hit
numOfHits：已经命中的数量

我加了 hitCells，是为了防止重复猜同一个位置也算新的 hit。

checkYourself() 的 Argument 和 Return Value

方法：

public String checkYourself(String stringGuess)

Argument 是：

stringGuess

它表示用户输入的猜测，是 String 类型。

Return value 是：

miss / hit / kill / repeat / invalid

这个方法返回 String，而不是只打印结果。

这样测试代码就可以自动比较 expected 和 actual。

为什么测试代码应该在完整游戏之前写？

完整游戏依赖核心 class。

如果 SimpleDotCom.java 里面的逻辑错了，完整游戏也会错。

先写 SimpleDotComTestDrive.java，可以先测试核心功能：

miss
hit
kill
repeated guess
invalid guess

核心 class 正确以后，再写完整游戏会更安全。

Exercise / Sharpen Your Pencil 记录
1. 先做简单版本

书里先做 Simple Dot Com，而不是一开始就做完整大游戏。

这样可以先练一个 object 和一行位置，不会太乱。

2. 先写 prepcode

不要一上来就写 Java。

先用普通语言写程序步骤，可以让我更清楚程序该怎么走。

3. 先用固定位置测试

在随机位置之前，应该先用固定位置测试，比如：

{2, 3, 4}

这样结果是可以预测的，更容易 debug。

4. 返回值比只打印更好

如果 checkYourself() 返回 String，测试程序就可以比较结果。

如果只是 System.out.println()，测试起来会更麻烦。

2 个我还不太确定的问题
重复猜测应该返回 repeat，还是返回 miss 但不增加 hit count？
如果以后有多个 Dot Com，是每个 Dot Com 自己记录重复猜测，还是由 Game driver 统一记录所有猜过的位置？
