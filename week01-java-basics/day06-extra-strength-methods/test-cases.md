## test-cases.md

```md
# Day 6 Test Cases

| No. | Program | Test Type | Input / Situation | Expected | Actual | Pass |
|---|---|---|---|---|---|---|
| 1 | SimpleDotComTestDrive | normal | locations 2,3,4, guess 1 | miss | miss | PASS |
| 2 | SimpleDotComTestDrive | normal | guess 2 | hit | hit | PASS |
| 3 | SimpleDotComTestDrive | normal | guess 3 | hit | hit | PASS |
| 4 | SimpleDotComTestDrive | normal | guess 4 after 2 and 3 | kill | kill | PASS |
| 5 | SimpleDotComTestDrive | repeat | guess 2 twice | second result repeat | repeat | PASS |
| 6 | SimpleDotComTestDrive | invalid | guess -1 | invalid | invalid | PASS |
| 7 | SimpleDotComTestDrive | invalid | guess 9 | invalid | invalid | PASS |
| 8 | SimpleDotComTestDrive | invalid | input abc | invalid | invalid | PASS |
| 9 | RandomRangeDemo | boundary | 20 random starts | all between 0 and 4 | all between 0 and 4 | PASS |
| 10 | PassByValueReassignmentDemo | normal | changeDogName(dog) | caller sees changed name | caller sees changed name | PASS |
| 11 | PassByValueReassignmentDemo | normal | replaceDog(dog) | caller still points to original dog | caller still points to original dog | PASS |
| 12 | SimpleDotComGame | normal game | guesses 0,1,2,3 | game ends with kill | kill | PASS |
| 13 | SimpleDotComGame | repeat | guess same number twice | second result repeat | repeat | PASS |
| 14 | SimpleDotComGame | invalid | guess -1 or 9 | invalid, game continues | invalid, game continues | PASS |

## 测试总结

Day 6 使用了自动测试。

`SimpleDotComTestDrive.java` 会自己打印 PASS 或 FAIL。

这比只把运行结果复制到 Markdown 更好。
