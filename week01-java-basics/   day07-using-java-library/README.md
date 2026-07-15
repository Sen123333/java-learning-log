# Day 7 - Using Java Library

## 学习目标

Day 7 的目标是学习 Java API，重点是 ArrayList。

今天我练习了：

- 阅读 Head First Java Chapter 6
- 使用 ArrayList
- 查询 Java API 方法
- 比较 array + boolean[] 和 ArrayList 的设计
- 写自动测试
- 修正 Day 6 的输入和目录问题

---

## 今日程序

### 1. ArrayListApiPractice.java

这个程序用来练习 ArrayList 常用方法：

- add()
- get()
- set()
- remove()
- contains()
- indexOf()
- size()
- isEmpty()

程序会自动检查结果，并打印 PASS 或 FAIL。

---

### 2. ArrayListDotCom.java

这是 ArrayList 版本的 Dot Com。

和 Day 6 的版本不同，这次不再使用 int[] 和 boolean[]。

这次使用：

```java
ArrayList<Integer> locationCells;

当用户猜中一个位置时，程序会把这个位置从 ArrayList 里删除。

如果 ArrayList 变空，说明 Dot Com 被 kill。

3. ArrayListDotComTestDrive.java

这个文件用来测试 ArrayListDotCom。

测试内容包括：

miss
hit
kill
repeated guess
invalid input
input with spaces
defensive copy
reset location
如何运行

在 src/ 文件夹里运行：

javac *.java
java ArrayListApiPractice
java ArrayListDotComTestDrive
今天学到的内容

ArrayList 比固定 array 更灵活。

普通 array 长度固定，删除元素比较麻烦。

ArrayList 可以直接使用 remove() 删除元素，也可以用 contains() 和 indexOf() 检查元素。

但是使用 ArrayList 时，也要注意 defensive copy，避免外部 list 修改内部 state。

# Day 7 今日总结

今天我学习了 Java 的 ArrayList 和 Java API 的基本使用。

我练习了 ArrayList 的常用方法，包括 add()、get()、set()、remove()、contains()、indexOf()、size() 和 isEmpty()。

我把 Day 6 的 Simple Dot Com 改成了 ArrayList 版本，这样命中一个位置后，可以直接把这个位置从列表里删除。

我也学到了 defensive copy 的重要性，因为不能让外部代码随便修改对象内部的 state。

今天最大的收获是：使用 Java API 不是偷懒，而是真正 Java 编程的一部分；会查 API、会测试 API，比死记方法更重要。
