# Day 7 Bug Log

## Bug 1: remove(index) 和 remove(object) 混淆

### 问题

在 `ArrayList<Integer>` 里，如果写：

```java
locations.remove(2);

Java 可能理解成删除 index 2 的元素，而不是删除数字 2。

原因

ArrayList 有两个 remove 方法：

remove(int index)
remove(Object object)

Integer 容易和 int index 混淆。

修正

使用：

locations.remove(Integer.valueOf(guess));

这样 Java 会删除数字对象，而不是 index。

下次注意

在 ArrayList<Integer> 里删除某个数字时，用 Integer.valueOf() 更安全。

Bug 2: setLocationCells() 没有 defensive copy
问题

如果直接写：

locationCells = locations;

外部代码之后还能修改这个 list。

这样会破坏 Dot Com 的内部 state。

修正

使用 defensive copy：

locationCells = new ArrayList<Integer>(locations);

这样外部 list 再修改，也不会影响 Dot Com 内部位置。

Bug 3: 带空格数字被判断成 invalid
问题

用户输入：

" 2 "

一开始可能被 parse 失败。

原因

没有先使用 trim() 去掉前后空格。

修正
String cleanGuess = stringGuess.trim();
int guess = Integer.parseInt(cleanGuess);
Bug 4: reset locations 后旧状态没有清空
问题

如果重新调用 setLocationCells()，旧的 hit 状态可能还留着。

修正

ArrayList 版本里，每次 setLocationCells() 都创建新的 list。

locationCells = new ArrayList<Integer>(locations);

这样旧状态会被清掉。
