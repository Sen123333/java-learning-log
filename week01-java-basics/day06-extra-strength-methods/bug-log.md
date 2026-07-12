## design-notes.md

```md
# Day 6 Design Notes

## 目标

创建一个简单的 Dot Com 游戏。

电脑在 0 到 6 的一维格子里放置一个 Dot Com。

Dot Com 占 3 个连续位置。

用户不断输入数字来猜位置。

程序返回：

- `miss`
- `hit`
- `kill`
- `repeat`
- `invalid`

---

## SimpleDotCom 的 State

`SimpleDotCom` class 需要保存：

- `locationCells`：Dot Com 的 3 个位置
- `hitCells`：每个位置是否已经被命中
- `numOfHits`：已经命中的数量

---

## SimpleDotCom 的 Behavior

### setLocationCells()

这个方法用来保存 Dot Com 的位置。

例如：

```java
dot.setLocationCells(new int[] {2, 3, 4});
checkYourself()

这个方法接收用户输入的 String。

它会把 String 转成 int。

然后检查：

如果输入不在 0-6，返回 invalid
如果位置已经被 hit 过，返回 repeat
如果猜中一个新位置，返回 hit
如果全部位置都被 hit，返回 kill
如果没猜中，返回 miss
Game Driver 流程
创建 SimpleDotCom object。
生成 0 到 4 的随机起点。
位置设置为 start、start + 1、start + 2。
创建 GameHelper。
开始 while 循环。
让用户输入数字。
把输入传给 checkYourself()。
打印结果。
猜测次数加 1。
如果结果是 kill，结束循环。
打印用户一共猜了多少次。
Pseudocode
Create SimpleDotCom object.
Generate random start from 0 to 4.
Create location array with start, start + 1, start + 2.
Set the location into the Dot Com object.
Create a helper to get user input.
Set gameAlive to true.
While gameAlive is true:
    Ask user to enter a number.
    Send the guess to checkYourself().
    Print the result.
    Add 1 to number of guesses.
    If result is kill:
        Set gameAlive to false.
Print final guess count.
测试计划

先测试核心 class，再写完整游戏。

固定位置：

{2, 3, 4}

测试内容：

猜 1，应该返回 miss
猜 2，应该返回 hit
猜 3，应该返回 hit
猜 4，应该返回 kill
连续猜 2，第二次应该返回 repeat
猜 -1，应该返回 invalid
猜 9，应该返回 invalid
输入 abc，应该返回 invalid

还要测试随机起点 20 次，确保每次都在 0 到 4。
