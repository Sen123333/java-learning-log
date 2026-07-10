# bug-log.md

```md
# Day 5 Bug Log

## Bug 1: 一开始想把 field 写成 public

### 问题

一开始我想直接写：

```java
public double balance;
为什么这是问题

如果 balance 是 public，外部代码可以随便修改余额。

例如：

account.balance = -1000;

这会让对象状态变得不合理。

修正方法

把 balance 改成 private。

private double balance;

然后通过 deposit() 和 withdraw() 控制修改。

Bug 2: setter 没有检查无效值
问题

一开始 setSize() 可能会接受负数。

例如：

dog.setSize(-5);
为什么这是问题

Dog 的 size 不应该是负数。
如果 size 变成负数，bark() 的结果就没有意义。

修正方法

在 setter 里面加 if 判断。

public void setSize(int newSize) {
    if (newSize > 0) {
        size = newSize;
    }
}
Bug 3: withdraw() 一开始没有返回 boolean
问题

一开始取款方法只打印结果，没有告诉调用者是否成功。

为什么这是问题

如果方法没有返回值，测试时不好判断取款是否真的成功。

修正方法

让 withdraw() 返回 boolean。

public boolean withdraw(double amount)

取款成功返回 true。
取款失败返回 false。

Bug 4: pass-by-value 容易误解
问题

我一开始以为 Java 传 object 的时候，是把 object 本身传进方法。

为什么这是问题

Java 实际上传的是 reference 的 copy。

这个 copy 和原来的 reference 指向同一个 object。

修正方法

我写了 PassByValueDemo.java，同时测试 primitive 和 Dog object。

结果是：

int 没有改变
Dog 的 name 改变了

这说明 Java 是 pass-by-value，但是 reference copy 仍然可以影响同一个 object。
