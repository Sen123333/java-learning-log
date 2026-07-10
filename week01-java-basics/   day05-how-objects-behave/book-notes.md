# Day 5 Book Notes - Head First Java Chapter 4

## 阅读内容

Head First Java Chapter 4: How Objects Behave

今天重点阅读：

- object state
- object behavior
- methods
- method arguments
- return types
- pass-by-value
- getters and setters
- encapsulation

---

## 1. State

State 是对象自己的数据。

例如 Dog object 有自己的 `name` 和 `size`。

不同的 Dog object 可以有不同的 state。

例如：

```java
Dog d1 = new Dog();
d1.setName("Max");
d1.setSize(10);

Dog d2 = new Dog();
d2.setName("Buddy");
d2.setSize(60);
2. Behavior

Behavior 是对象能做什么。

例如 Dog 可以 bark()。
BankAccount 可以 deposit() 和 withdraw()。
Student 可以 isPassing() 和 getLetterGrade()。

对象的 behavior 经常会受到 state 影响。

例如 Dog 的 size 不同，bark 的声音也不同。

3. Method Argument

Method argument 是调用方法时传进去的值。

例如：

account.deposit(100);
dog.setSize(60);
student.setScore(95);

这里的 100、60、95 都是 argument。

方法可以用这些 argument 来改变对象的 state，或者计算结果。

4. Return Type

Return type 是方法返回的数据类型。

例如：

public boolean withdraw(double amount)

这个方法返回 boolean。

如果取款成功，返回 true。
如果取款失败，返回 false。

再比如：

public String getLetterGrade()

这个方法返回 String，例如 "A"、"B"、"F"。

5. Pass-by-value

Java 是 pass-by-value。

意思是：调用方法时，Java 传进去的是变量值的 copy。

如果是 primitive，例如 int，方法里改的是 copy，所以原来的 int 不会变。

如果是 reference，Java 传进去的也是 reference 的 copy。
但是这个 copy 仍然指向同一个 object。

所以方法里面可以通过这个 reference copy 修改同一个 object 的内容。

6. Encapsulation

Encapsulation 的意思是把 field 保护起来，不让外部代码随便改。

通常做法是：

private double balance;

然后用 method 控制：

public boolean deposit(double amount)
public boolean withdraw(double amount)

这样可以避免不合理的数据，比如负数存款、负数余额、无效分数。

为什么不同 Dog object 调用同一个 bark()，结果可能不同？

因为 bark() 方法会使用 Dog object 自己的 state。

如果一只狗 size 是 10，可能输出小狗叫声。
如果另一只狗 size 是 60，可能输出大狗叫声。

方法名字一样，但是对象的 state 不同，所以 behavior 也不同。

为什么 setter 不能无脑接受任何值？

因为有些值是不合理的。

例如：

Dog size 不能是 -5
Student score 不能是 -1 或 101
BankAccount deposit 不能是负数

所以 setter 里面应该检查数据。
如果数据不合理，就不要修改 object 的 state。

Java pass-by-value 和 Python 的相似与不同

Java 和 Python 都可能出现两个变量指向同一个 object 的情况。

相似点：

如果两个变量指向同一个 object，通过其中一个变量修改 object，另一个变量也能看到变化。

不同点：

Java 必须先声明类型，例如 int、Dog、Student。
Java 更强调 method、return type 和 class structure。

2 个我还不确定的问题
什么时候应该用 setter，什么时候应该只用普通 method，例如 deposit() 或 withdraw()？
如果一个方法修改了 object 的 state，它应该返回 boolean，还是直接修改就可以？
