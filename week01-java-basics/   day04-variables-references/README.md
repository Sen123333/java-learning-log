# Day 4 - Variables and References

## 学习目标

Day 4 的目标是理解 Java 里的 primitive variable 和 reference variable。

今天我练习了：

- primitive type
- reference variable
- object declaration
- heap
- array
- object array

---

## 程序内容

### 1. PrimitivePractice.java

这个程序练习 Java 的基本 primitive 类型：

- int
- double
- boolean
- char

程序会打印每个变量的值，并说明它是什么类型。

---

### 2. ReferenceDemo.java

这个程序用来展示 reference variable 的特点。

程序创建一个 Dog 对象，然后让两个变量 `a` 和 `b` 指向同一个 Dog object。

当我修改 `b.name` 的时候，`a.name` 也会改变。  
原因是 `a` 和 `b` 指向的是同一个对象。

---

### 3. DogArrayDemo.java

这个程序创建一个 Dog 数组。

数组里放 3 个 Dog 对象，然后用 loop 调用每只狗的 `bark()` 方法。

---

### 4. StudentScoreAnalyzer.java

这个程序使用 `int[]` 保存学生成绩。

程序会计算：

- 最高分
- 最低分
- 平均分
- 及格人数

---

### 5. BookArrayDemo.java

这个程序创建一个 Book 数组。

程序会判断哪些书是 long book。

---

## 今天学到的内容

- Primitive variable 直接保存数值。
- Reference variable 保存的是对象的引用。
- Object 会被创建在 heap 里面。
- Array 可以保存多个相同类型的数据。
- Object array 保存的是对象的 reference，不是对象本身。
- 如果两个 reference 指向同一个 object，修改其中一个会影响另一个。
