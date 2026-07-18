# Day 8 Test Cases

| No. | Test | Expected | Actual | Pass |
|---|---|---|---|---|
| 1 | Dog constructor name | Max | Max | PASS |
| 2 | Dog constructor age | 3 | 3 | PASS |
| 3 | Cat constructor name | Luna | Luna | PASS |
| 4 | Bird constructor name | Sky | Sky | PASS |
| 5 | Dog inherited move() | Max moves | Max moves | PASS |
| 6 | Cat inherited move() | Luna moves | Luna moves | PASS |
| 7 | Dog override makeSound() | Woof | Woof | PASS |
| 8 | Cat override makeSound() | Meow | Meow | PASS |
| 9 | Bird override makeSound() | Tweet | Tweet | PASS |
| 10 | Bird override move() | Sky flies through the air | Sky flies through the air | PASS |
| 11 | Dog unique method fetch() | Max fetches the ball | Max fetches the ball | PASS |
| 12 | Cat unique method scratch() | Luna scratches the sofa | Luna scratches the sofa | PASS |
| 13 | Bird unique method fly() | Sky is flying | Sky is flying | PASS |
| 14 | Dog breed getter | Husky | Husky | PASS |
| 15 | Summary | 15 passed, 0 failed | 15 passed, 0 failed | PASS |

## 错误实验

### 1. 错误的 @Override

如果子类写：

```java
@Override
public String makeSound(String sound) {
    return sound;
}

这不是 override，因为参数不同。

Java 会报错，因为 @Override 要求真的重写父类方法。

2. 直接访问父类 private field

如果 Dog 里直接写：

return name;

会编译失败。

原因是 name 在 Animal 里是 private，子类不能直接访问。

应该使用：

getName()
