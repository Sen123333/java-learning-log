## bug-log.md

```md
# Day 4 Bug Log

## Bug 1: 分不清 primitive 和 reference

### 问题

一开始我以为所有变量都直接保存真正的值。

### 为什么错

Primitive variable 直接保存值。  
Reference variable 保存的是指向 object 的 reference。

### 修正方法

我用 `ReferenceDemo.java` 测试：

```java
Dog a = new Dog();
Dog b = a;
b.name = "Luna";

最后 a.name 和 b.name 都输出 Luna。

Bug 2: 创建 array 以后忘记创建 object
问题

我创建了 Dog array，但是忘记创建 Dog object。

错误例子
Dog[] dogs = new Dog[3];
dogs[0].name = "Max";
为什么错

dogs 数组已经存在，但是 dogs[0] 里面还没有 Dog object。
所以不能直接使用 dogs[0].name。

修正方法

先创建 Dog object，再使用它。

dogs[0] = new Dog();
dogs[0].name = "Max";
Bug 3: 计算平均分时使用 int division
问题

一开始我用 int 计算平均分，可能会丢掉小数部分。

错误原因

如果两个 int 相除，Java 可能只保留整数部分。

修正方法

我把其中一个数转换成 double。

double average = total / (double) scores.length;
Bug 4: isLongBook() 应该返回 boolean
问题

一开始我可能会把 isLongBook() 写成只打印结果的方法。

为什么不合适

方法名 isLongBook() 看起来像是在判断 true 或 false。
所以它更适合返回 boolean。

修正方法
public boolean isLongBook() {
    return pages >= 300;
}
