## bug-log.md

```md
# Day 8 Bug Log

## Bug 1: 把 override 写成 overload

### 问题

一开始我可能会写：

```java
@Override
public String makeSound(String sound) {
    return sound;
}
为什么错

父类的 makeSound() 没有参数。

这个方法多了一个 String 参数，所以它不是 override，而是 overload。

如果加了 @Override，Java 会报错。

修正

保持方法签名完全一样：

@Override
public String makeSound() {
    return "Woof";
}
下次注意

Override 的方法名、参数和返回类型都要和父类匹配。

Bug 2: 子类直接访问父类 private field
问题

我尝试在 Dog.java 里直接访问 Animal 的 private field：

return name;
为什么错

name 在 Animal 里是 private。

private field 只能在 Animal class 内部直接访问。

修正

使用 getter：

return getName();
下次注意

不要为了方便把 field 改成 public。

应该继续保持 private，然后用 constructor 或 getter 控制访问。

Bug 3: 为了少写代码而乱用继承
问题

一开始我容易觉得“两个 class 有重复代码，就应该 extends”。

为什么错

继承不是为了少写代码。

继承应该先通过 IS-A test。

例如 Dog IS-A Animal 成立。

但 Car IS-A Engine 不成立。

修正

先判断是否是 IS-A。

如果是 HAS-A，应该考虑 composition。

Bug 4: 忘记调用 superclass constructor
问题

Subclass 需要初始化父类中的 name 和 age。

如果没有正确调用 superclass constructor，state 可能不完整。

修正

在子类 constructor 第一行调用：

super(name, age);
下次注意

Subclass constructor 里，如果父类没有 no-argument constructor，就必须明确调用 super(...)。
