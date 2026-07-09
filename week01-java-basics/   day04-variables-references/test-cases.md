
## test-cases.md

```md
# Day 4 Test Cases

| 编号 | 程序 | 测试输入 / 情况 | Expected Output | Actual Output | Pass |
|---|---|---|---|---|---|
| 1 | PrimitivePractice | int age = 18 | 输出 age = 18，并说明 int 保存整数 | 输出 age = 18，并说明 int 保存整数 | Yes |
| 2 | PrimitivePractice | double price = 9.99 | 输出 price = 9.99，并说明 double 保存小数 | 输出 price = 9.99，并说明 double 保存小数 | Yes |
| 3 | PrimitivePractice | boolean isStudent = true | 输出 true，并说明 boolean 保存 true/false | 输出 true，并说明 boolean 保存 true/false | Yes |
| 4 | PrimitivePractice | char grade = 'A' | 输出 A，并说明 char 保存一个字符 | 输出 A，并说明 char 保存一个字符 | Yes |
| 5 | ReferenceDemo | b = a，然后 b.name = Luna | a.name 和 b.name 都输出 Luna | a.name 和 b.name 都输出 Luna | Yes |
| 6 | DogArrayDemo | 3 个 Dog object | 3 只狗都可以 bark | 3 只狗都可以 bark | Yes |
| 7 | StudentScoreAnalyzer | scores = 95, 70, 55, 80, 40 | 最高分是 95 | 最高分是 95 | Yes |
| 8 | StudentScoreAnalyzer | scores = 95, 70, 55, 80, 40 | 最低分是 40 | 最低分是 40 | Yes |
| 9 | StudentScoreAnalyzer | scores = 95, 70, 55, 80, 40 | 平均分是 68.0 | 平均分是 68.0 | Yes |
| 10 | StudentScoreAnalyzer | scores = 95, 70, 55, 80, 40 | 及格人数是 3 | 及格人数是 3 | Yes |
| 11 | BookArrayDemo | 100 pages | not a long book | not a long book | Yes |
| 12 | BookArrayDemo | 350 pages | long book | long book | Yes |
| 13 | BookArrayDemo | 600 pages | long book | long book | Yes |

## 测试总结

Day 4 的重点测试是 `ReferenceDemo.java`。

这个程序证明了：

如果 `a` 和 `b` 指向同一个 Dog object，修改 `b.name` 会影响 `a.name`。
