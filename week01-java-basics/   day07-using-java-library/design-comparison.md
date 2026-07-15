## design-comparison.md

```md
# Day 7 Design Comparison

## 1. int[] + boolean[] 版本如何识别 repeat？

Day 6 的版本使用：

```java
int[] locationCells;
boolean[] hitCells;

locationCells 保存位置。

hitCells 记录每个位置是否已经被 hit。

如果用户猜中一个位置，但是 hitCells[i] 已经是 true，就说明这是 repeated guess。

这个设计可以识别 repeat，但是需要两个数组配合，逻辑比较复杂。

2. ArrayList 删除命中位置后，重复猜同一数字会得到什么？

ArrayList 版本中，猜中后会把该数字从 list 里删除。

例如：

locationCells = [2, 3, 4]
guess 2 -> hit
locationCells = [3, 4]
guess 2 -> miss

所以 ArrayList 版本里，重复猜同一数字通常会得到 miss。

如果想显示 repeat，需要另外保存 guessedNumbers。

3. 如果需要明确返回 repeat，你会在哪里记录已猜位置？

我会在 game driver 或 DotCom class 里增加一个 list：

ArrayList<Integer> guessedNumbers;

每次用户猜一个数字时，先检查这个数字是否已经存在于 guessedNumbers 里。

如果存在，返回 repeat。

如果不存在，再进行 hit / miss / kill 判断。

4. 哪种设计更容易扩展到多个 Dot Com？

ArrayList 版本更容易扩展。

原因是每个 Dot Com 可以自己保存一个 ArrayList。

猜中后直接删除位置。

当某个 Dot Com 的 list 为空，就说明这个 Dot Com 被 kill。

如果有多个 Dot Com，可以把多个 Dot Com 放进另一个 ArrayList 里。

5. 哪一种更符合书中的思路？哪一种更符合自己的需求？

书中的思路更接近 ArrayList 版本。

因为它通过删除命中位置来简化逻辑。

但是如果我想明确显示 repeat，Day 6 的 boolean[] 或额外 guessedNumbers 会更适合。

我的需求是学习 API，所以 Day 7 应该重点使用 ArrayList。
