# Day 6 Bug Log

## Bug 1: 重复猜测被算成新的 hit

### 问题

第一版里，如果用户重复猜同一个正确位置，hit count 会继续增加。

例子：

```text
location = {2, 3, 4}
guess 2 -> hit
guess 2 -> hit again

这是错误的。

第二次猜 2 不应该算新的 hit。

原因

我只检查 guess 是否等于某个 location。

但是我没有检查这个 location 是否已经被猜中过。

修正方法

我增加了一个 boolean array：

private boolean[] hitCells;

如果某个位置已经被 hit，就标记为 true。

如果用户再猜同一个位置，返回 repeat。

下次如何避免

如果程序要记录进度，不能只记录位置，还要记录这个位置是否已经被使用过。

Bug 2: 随机起点可能越界
问题

如果随机起点太大，Dot Com 的位置可能超出 0-6。

例子：

start = 5
locations = 5, 6, 7

但是游戏范围应该只有 0-6。

原因

随机范围没有算清楚。

修正方法

起点必须是 0 到 4。

int randomStart = (int) (Math.random() * 5);

这样最大情况是：

start = 4
locations = 4, 5, 6

不会越界。

下次如何避免

写随机数时，要专门测试边界。

所以我写了 RandomRangeDemo.java。

Bug 3: 方法里重新赋值 reference 容易误解
问题

我一开始以为方法里写：

d = new Dog();

可能会让外面的 dog 也指向新的 Dog object。

原因

我没有完全理解 Java 是 pass-by-value。

Java 传进去的是 reference 的 copy。

修正方法

我写了 PassByValueReassignmentDemo.java。

结果说明：

修改 object 的 state，外面能看到变化
重新给参数赋值，不会替换外面的 reference
下次如何避免

学习 reference 时，要分清两件事：

修改 object 本身
改变局部变量指向哪个 object
