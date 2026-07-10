# Day 5 - How Objects Behave

## 学习目标

Day 5 的目标是学习对象的 state 和 behavior。

今天我练习了：

- state
- behavior
- method argument
- return type
- pass-by-value
- encapsulation
- getter and setter

---

## 程序内容

### 1. Dog / DogTestDrive

`Dog.java` 用来练习 state affects behavior。

Dog 有自己的 state，例如 `name` 和 `size`。  
Dog 的 `bark()` 方法会根据 `size` 输出不同的声音。

如果同一只 Dog 的 size 改变了，它的 bark 行为也会改变。

---

### 2. BankAccount / BankAccountTestDrive

`BankAccount.java` 用来练习 encapsulation。

`balance` 是 private，不能直接从外面修改。  
存款和取款必须通过 method 控制。

程序会拒绝：

- 负数存款
- 负数取款
- 超过余额的取款

---

### 3. Student / StudentTestDrive

`Student.java` 用来练习 method argument 和 return type。

Student 有 `name` 和 `score`。  
score 必须通过 setter 修改。  
程序可以判断学生是否及格，也可以返回 A/B/C/D/F 等级。

---

### 4. PassByValueDemo

`PassByValueDemo.java` 用来解释 Java 的 pass-by-value。

它展示：

- primitive variable 传进去后，原来的 int 不会变
- reference variable 传进去后，对象的内容可能会变

---

## 今天学到的内容

- State 是对象自己的数据。
- Behavior 是对象能做什么。
- Method argument 是传给方法的值。
- Return type 是方法返回的结果类型。
- Java 是 pass-by-value。
- Encapsulation 可以保护对象的数据。
- Field 不应该随便 public 暴露。
