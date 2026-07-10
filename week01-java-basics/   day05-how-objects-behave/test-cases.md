
---

# test-cases.md

```md
# Day 5 Test Cases

## 测试目标

Day 5 的测试需要包含：

- normal case
- boundary case
- invalid case

---

| No. | Program | Test Type | Test Input / Situation | Expected Output | Actual Output | Pass |
|---|---|---|---|---|---|---|
| 1 | DogTestDrive | Normal | size = 10 | small dog bark | small dog bark | Yes |
| 2 | DogTestDrive | Normal | size = 60 | big dog bark | big dog bark | Yes |
| 3 | DogTestDrive | Invalid | size = -5 | size should not change | size did not change | Yes |
| 4 | BankAccountTestDrive | Normal | deposit 100 | balance becomes 100 | balance becomes 100 | Yes |
| 5 | BankAccountTestDrive | Normal | withdraw 30 | returns true, balance becomes 70 | returns true, balance becomes 70 | Yes |
| 6 | BankAccountTestDrive | Invalid | withdraw 1000 | returns false, balance stays 70 | returns false, balance stays 70 | Yes |
| 7 | BankAccountTestDrive | Invalid | deposit -10 | returns false, balance stays 70 | returns false, balance stays 70 | Yes |
| 8 | StudentTestDrive | Normal | score = 95 | passing, grade A | passing, grade A | Yes |
| 9 | StudentTestDrive | Boundary | score = 60 | passing, grade D | passing, grade D | Yes |
| 10 | StudentTestDrive | Boundary | score = 59 | not passing, grade F | not passing, grade F | Yes |
| 11 | StudentTestDrive | Invalid | score = -1 | score not accepted | score not accepted | Yes |
| 12 | StudentTestDrive | Invalid | score = 101 | score not accepted | score not accepted | Yes |
| 13 | PassByValueDemo | Normal | changePrimitive(x) | original int does not change | original int does not change | Yes |
| 14 | PassByValueDemo | Normal | changeDog(dog) | Dog name changes | Dog name changes | Yes |

---

## 测试总结

Day 5 的重点不是只让代码能运行。

重点是测试：

- object state 是否正确改变
- invalid input 是否被拒绝
- method return value 是否合理
- pass-by-value 是否能用代码证明
