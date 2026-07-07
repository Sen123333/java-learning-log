# Day 2 测试用例

## 目的

这个文件用来记录 Day 2 Java 程序的测试用例。
目的不是只让程序能运行，而是检查程序在不同输入情况下是否正确。

---

## 测试表

| 编号 | 程序                   | 测试输入                | 预期输出             | 测试类型 | 结果                     |
| -- | -------------------- | ------------------- | ---------------- | ---- | ---------------------- |
| 1  | OddEvenChecker       | 8                   | 8 is even        | 正常测试 | Pass                   |
| 2  | OddEvenChecker       | 7                   | 7 is odd         | 正常测试 | Pass                   |
| 3  | OddEvenChecker       | 0                   | 0 is even        | 边界测试 | Pass                   |
| 4  | OddEvenChecker       | -5                  | -5 is odd        | 边界测试 | Pass                   |
| 5  | GradeLevel           | 95                  | A                | 正常测试 | Pass                   |
| 6  | GradeLevel           | 80                  | B                | 正常测试 | Pass                   |
| 7  | GradeLevel           | 72                  | C                | 正常测试 | Pass                   |
| 8  | GradeLevel           | 61                  | D                | 边界测试 | Pass                   |
| 9  | GradeLevel           | 50                  | F                | 边界测试 | Pass                   |
| 10 | TemperatureConverter | 0 Celsius           | 32 Fahrenheit    | 边界测试 | Pass                   |
| 11 | TemperatureConverter | 100 Celsius         | 212 Fahrenheit   | 正常测试 | Pass                   |
| 12 | TemperatureConverter | 32 Fahrenheit       | 0 Celsius        | 边界测试 | Pass                   |
| 13 | TemperatureConverter | 212 Fahrenheit      | 100 Celsius      | 正常测试 | Pass                   |
| 14 | MaxOfThree           | 3, 8, 5             | Max number is 8  | 正常测试 | Pass                   |
| 15 | MaxOfThree           | -3, -8, -5          | Max number is -3 | 边界测试 | Pass                   |
| 16 | MaxOfThree           | 5, 5, 5             | Max number is 5  | 边界测试 | Pass                   |
| 17 | MethodPractice       | isEven(10)          | true             | 正常测试 | Pass                   |
| 18 | MethodPractice       | isEven(9)           | false            | 正常测试 | Pass                   |
| 19 | MethodPractice       | maxOfThree(4, 9, 2) | 9                | 正常测试 | Pass                   |
| 20 | MethodPractice       | factorial(5)        | 120              | 正常测试 | Pass                   |
| 21 | MethodPractice       | factorial(0)        | 1                | 边界测试 | Pass                   |
| 22 | MethodPractice       | factorial(-1)       | 不应该接受负数          | 无效测试 | Need fix / 记录到 bug-log |

---

## 测试类型说明

* 正常测试：普通输入，程序应该正常运行。
* 边界测试：比较特殊的输入，比如 0、负数、相同数字。
* 无效测试：程序不应该正常接受的输入，比如 `factorial(-1)`。
* 如果程序还不能处理无效输入，需要把问题写进 `bug-log.md`，之后再修复。

