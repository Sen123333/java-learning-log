## test-cases.md

```md
# Day 7 Test Cases

## ArrayListApiPractice

| No. | Test | Expected | Actual | Pass |
|---|---|---|---|---|
| 1 | add first item | size is 1 | size is 1 | PASS |
| 2 | add second item | size is 2 | size is 2 | PASS |
| 3 | get index 0 | Apple | Apple | PASS |
| 4 | set index 1 | Banana becomes Berry | Banana becomes Berry | PASS |
| 5 | contains Apple | true | true | PASS |
| 6 | contains Orange | false | false | PASS |
| 7 | indexOf Apple | 0 | 0 | PASS |
| 8 | remove Apple | Apple removed | Apple removed | PASS |
| 9 | size after remove | 1 | 1 | PASS |
| 10 | remove missing item | false | false | PASS |
| 11 | clear all items | list empty | list empty | PASS |
| 12 | isEmpty | true | true | PASS |

---

## ArrayListDotComTestDrive

| No. | Test | Expected | Actual | Pass |
|---|---|---|---|---|
| 1 | guess 1 with locations 2,3,4 | miss | miss | PASS |
| 2 | guess 2 | hit | hit | PASS |
| 3 | guess 3 | hit | hit | PASS |
| 4 | guess 4 after 2 and 3 | kill | kill | PASS |
| 5 | repeat guess 2 after hit | miss | miss | PASS |
| 6 | input " 2 " | hit | hit | PASS |
| 7 | input empty string | invalid | invalid | PASS |
| 8 | input abc | invalid | invalid | PASS |
| 9 | input -1 | invalid | invalid | PASS |
| 10 | input 9 | invalid | invalid | PASS |
| 11 | external list modified after setLocationCells | internal state not changed | internal state not changed | PASS |
| 12 | reset location cells | old hit state cleared | old hit state cleared | PASS |
| 13 | all tests summary | 0 failed | 0 failed | PASS |

---

## 总结

Day 7 的测试重点是：

- API 方法是否正确使用
- ArrayListDotCom 是否能 hit / miss / kill
- invalid input 是否处理
- defensive copy 是否保护内部 state
- reset locations 是否清空旧状态
