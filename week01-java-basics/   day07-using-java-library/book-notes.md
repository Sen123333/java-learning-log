## book-notes.md

```md
# Day 7 Book Notes - Head First Java Chapter 6

## 阅读内容

Book: Head First Java, 2nd Edition  
Chapter: Chapter 6 - Using the Java Library

重点阅读：

- Simple Dot Com bug analysis
- ArrayList
- Boolean expressions
- Java API
- packages
- API docs

---

## 1. Java Library

Java Library 是 Java 提供的一组已经写好的 class。

这些 class 可以帮助我完成很多常见任务。

例如：

- ArrayList
- String
- Math
- Scanner
- BufferedReader

使用 Java Library 的好处是：我不需要自己从零写所有功能。

---

## 2. Java API

Java API 像一本说明书。

它告诉我某个 class 有哪些 method，每个 method 需要什么 argument，会返回什么结果。

例如我要使用 ArrayList，就可以查它有哪些方法：

- add()
- get()
- remove()
- contains()
- indexOf()
- size()

---

## 3. ArrayList

ArrayList 是 Java 里的动态列表。

普通 array 的长度固定，但是 ArrayList 的长度可以改变。

例如：

```java
ArrayList<String> names = new ArrayList<String>();
names.add("Tom");
names.add("Amy");

ArrayList 适合需要增加、删除元素的情况。

4. add()

add() 用来把元素加入 ArrayList。

例如：

names.add("Tom");

这会把 "Tom" 加到 list 里。

5. remove()

remove() 可以删除 ArrayList 里的元素。

例如：

names.remove("Tom");

在 Dot Com 游戏里，如果用户猜中一个位置，就可以把这个位置从 list 里删除。

6. contains()

contains() 用来检查 ArrayList 里是否包含某个元素。

例如：

names.contains("Amy");

如果包含，返回 true。

如果不包含，返回 false。

7. indexOf()

indexOf() 返回元素的位置。

如果元素不存在，返回 -1。

例如：

int index = names.indexOf("Tom");

这个方法可以帮助我知道某个元素在 list 中的位置。

8. 为什么 ArrayList 适合 Dot Com 游戏？

因为 Dot Com 被猜中后，需要删除已经命中的位置。

如果用普通 array，删除元素不方便，还需要 boolean[] 记录是否已经 hit。

如果用 ArrayList，猜中后可以直接 remove。

当 ArrayList 为空时，就说明所有位置都被猜中了。

Exercise / Sharpen Your Pencil 记录
1. 先分析 bug

书里先分析 Simple Dot Com 的 bug，例如重复猜测可能导致错误结果。

这让我明白：代码能跑不代表没有隐藏 bug。

2. 用 ArrayList 改进设计

ArrayList 可以让“删除已命中的位置”变得更自然。

这样就不需要额外用 boolean[] 记录每个位置是否已经 hit。

3. API 不是背诵

我不需要死记所有方法。

更重要的是知道怎么查 API，并理解方法的 argument 和 return value。

2 个我还不太确定的问题
ArrayList 删除元素时，什么时候应该用 remove(index)，什么时候应该用 remove(object)？
如果游戏里有多个 Dot Com，应该每个 Dot Com 自己保存 ArrayList，还是由 Game class 管理所有位置？
