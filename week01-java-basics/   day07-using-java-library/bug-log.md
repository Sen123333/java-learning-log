# Day 7 Fix Bug Log

## Bug 1: ArrayListDotCom 未初始化时可能崩溃

### 问题

如果没有先调用 `setLocationCells()`，就调用：

```java
dot.checkYourself("2");

旧版本可能会出现 NullPointerException。

原因

locationCells 一开始是 null。

修复

我把它初始化成空 ArrayList：

private ArrayList<Integer> locationCells = new ArrayList<Integer>();
结果

现在没有设置位置时，猜测会返回 miss，不会崩溃。

Bug 2: setLocationCells(null) 没有明确处理
问题

旧版本中，如果传入 null：

dot.setLocationCells(null);

程序会因为 new ArrayList<Integer>(locations) 崩溃。

原因

没有检查 locations 是否为 null。

修复

我加了明确判断：

if (locations == null) {
    throw new IllegalArgumentException("locations cannot be null");
}
结果

现在错误更清楚，也有自动测试检查。

Bug 3: kill 后再次猜同一个位置
问题

Dot Com 被 kill 后，如果再次猜同一个数字，旧版本没有专门测试。

修复

我增加了 after-kill 测试：

assertEquals("guess after kill test", "miss", dot.checkYourself("4"));
结果

因为位置已经被删除，所以再次猜 4 返回 miss。

Bug 4: Day 6 GameHelper 处理 EOF 会崩溃
问题

旧版 GameHelper 直接调用：

inputLine.length()

如果 readLine() 返回 null，就会出现 NullPointerException。

修复

先检查 null：

if (inputLine == null) {
    return "quit";
}

并支持 q 和 quit 退出游戏。
