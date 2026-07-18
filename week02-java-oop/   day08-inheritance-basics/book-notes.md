## book-notes.md

```md
# Day 8 Book Notes - Head First Java Chapter 7

## 阅读内容

Book: Head First Java, 2nd Edition  
Chapter: Chapter 7 - Better Living in Objectville  
Reading time: about 90 minutes

重点内容：

- inheritance
- IS-A
- extends
- superclass
- subclass
- overriding methods
- access levels
- private / default / protected / public

---

## 1. Inheritance

Inheritance 是继承。

在 Java 里，一个 class 可以继承另一个 class。

被继承的 class 叫 superclass。

继承别人的 class 叫 subclass。

例如：

```java
public class Dog extends Animal

这里 Animal 是 superclass，Dog 是 subclass。

Dog 可以继承 Animal 的方法，但 Dog 也可以有自己的方法。

2. IS-A Relationship

IS-A 是判断继承是否合理的重要方法。

如果一句话可以说通：

Dog is an Animal.

那 Dog extends Animal 就比较合理。

但是：

Dog is a Tail.

这句话不合理，所以 Dog 不应该 extends Tail。

继承不是因为两个 class 有一点相同代码就使用，而是因为它们有真正的类型关系。

3. Extends

extends 是 Java 里表示继承的关键词。

例如：

public class Cat extends Animal

意思是 Cat 继承 Animal。

Cat 可以使用 Animal 里面不是 private 的方法。

但是如果 Animal 的 field 是 private，Cat 不能直接访问，只能通过 getter 或其他 method 使用。

4. Overriding

Overriding 是子类重写父类的方法。

例如 Animal 里有：

public String makeSound()

Dog 可以重写：

@Override
public String makeSound() {
    return "Woof";
}

这样 Dog 调用 makeSound() 时，会使用 Dog 自己的版本。

Override 的方法名、参数和返回类型要和父类匹配。

5. Overload

Overload 是方法名相同，但是参数不同。

例如：

public void move()
public void move(int steps)

这不是 override，因为参数不同。

Override 是子类替换父类的同一个方法。

Overload 是同一个 class 里写多个同名但参数不同的方法。

6. Access Levels

Java 有不同的访问权限。

private

只能在本 class 内部访问。

父类的 private field 子类不能直接访问。

default

不写访问修饰符就是 default。

同一个 package 里可以访问。

protected

同一个 package 或子类可以访问。

public

任何地方都可以访问。

但是不能为了方便就把所有 field 改成 public，因为这样会破坏 encapsulation。

7. Private Field

private field 仍然是对象的一部分。

但是子类不能直接访问父类的 private field。

例如：

private String name;

Dog 继承 Animal 后，Dog object 里面仍然有 name。

但是 Dog.java 不能直接写：

name = "Max";

应该用：

getName()

或者通过 constructor 初始化。

8. 为什么继承不是为了少写代码？

继承的主要目的不是偷懒。

继承应该用在真正的 IS-A 关系中。

如果只是想复用代码，但两个 class 不是同一种类型，可能应该使用 composition。

例如：

Dog IS-A Animal，适合 inheritance。
Car HAS-A Engine，适合 composition。
Student HAS-A Backpack，适合 composition。
8 个 IS-A 判断
判断	是否成立	原因
Dog IS-A Animal	成立	Dog 是动物的一种
Cat IS-A Animal	成立	Cat 是动物的一种
Bird IS-A Animal	成立	Bird 是动物的一种
Animal IS-A Dog	不成立	不是所有动物都是狗
Dog IS-A Tail	不成立	尾巴只是狗的一部分
Car IS-A Engine	不成立	汽车有引擎，但汽车不是引擎
Student IS-A Person	成立	学生是人的一种
Book IS-A Page	不成立	书有很多页，但书不是页
2 个我还不确定的问题
什么时候应该用 protected，什么时候应该坚持 private + getter？
如果两个 class 有很多相同方法，但 IS-A 关系不明显，应该怎么判断用 inheritance 还是 composition？
