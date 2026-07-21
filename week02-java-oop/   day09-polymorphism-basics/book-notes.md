# book-notes.md

```md
# Day 9 Book Notes - Head First Java Chapter 7

## 阅读内容

Book: Head First Java, 2nd Edition  
Chapter: Chapter 7 - Better Living in Objectville  
Reading time: about 90 minutes

重点内容：

- IS-A / HAS-A
- inheritance value
- polymorphism
- supertype reference
- reference type
- object type
- runtime method dispatch
- override rules
- method overloading

---

## 1. Reference Type

Reference type 是变量声明时的类型。

例子：

```java
Animal a = new Dog("Max", 3, "Husky");

这里 a 的 reference type 是 Animal。

Reference type 决定：这个变量在编译时能调用哪些方法。

所以 a 可以调用 Animal 里有的方法：

a.getName();
a.move();
a.makeSound();

但是不能直接调用 Dog 独有的方法：

a.fetch();

因为 Animal 里没有 fetch()。

2. Object Type

Object type 是真正创建出来的对象类型。

Animal a = new Dog("Max", 3, "Husky");

这里 object type 是 Dog。

Object type 决定：override 方法在运行时真正执行哪个版本。

所以：

a.makeSound();

会调用 Dog 版本的 makeSound()。

结果是：

Woof
3. Polymorphism

Polymorphism 是多态。

多态让一个 superclass reference 可以指向不同 subclass object。

例如：

Animal dog = new Dog("Max", 3, "Husky");
Animal cat = new Cat("Luna", 2);
Animal bird = new Bird("Sky", 1, true);

它们的 reference type 都是 Animal。

但是 object type 分别是 Dog、Cat、Bird。

这样我可以把它们放进同一个 ArrayList：

ArrayList<Animal> animals = new ArrayList<Animal>();
4. Runtime Method Dispatch

Runtime method dispatch 的意思是：Java 在运行时根据真正的 object type 选择 override 方法。

例如：

Animal a = new Dog("Max", 3, "Husky");
a.makeSound();

编译时，Java 检查 Animal 是否有 makeSound()。

运行时，Java 发现真正对象是 Dog，所以执行 Dog 的 makeSound()。

这就是为什么输出是 Woof。

5. Override Rules

Override 要求子类方法和父类方法签名匹配。

方法名、参数列表要一样。

返回类型也要兼容。

访问权限不能比父类更严格。

例如父类是：

public String makeSound()

子类不能写成：

private String makeSound()

因为 private 比 public 更严格。

6. Overload

Overload 是方法名相同，但是参数列表不同。

例如：

public String makeSound()
public String makeSound(String mood)

这不是 override。

Overload 主要在 compile time 决定调用哪一个方法。

Override 是 runtime behavior。

Exercise 记录
Exercise 1: Polymorphic assignment

我练习了 6 个 assignment：

Animal a1 = new Dog("Max", 3, "Husky");   // 可以
Animal a2 = new Cat("Luna", 2);           // 可以
Animal a3 = new Bird("Sky", 1, true);     // 可以
Dog d1 = new Animal("Animal", 1);         // 不可以
Dog d2 = new Dog("Rex", 4, "Lab");        // 可以
Cat c1 = new Dog("Max", 3, "Husky");      // 不可以
Exercise 2: Method call
Animal a = new Dog("Max", 3, "Husky");
a.makeSound(); // 可以，运行时输出 Woof
a.fetch();     // 不可以，因为 reference type 是 Animal
2 个我还不确定的问题
如果我真的需要调用 Dog 的 fetch()，是不是应该 downcast，还是说明我的设计有问题？
如果以后 Animal 的 makeSound() 不应该有默认声音，是不是就应该考虑 abstract class？
