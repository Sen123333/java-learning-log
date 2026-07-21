# override-vs-overload.md

```md
# Override vs Overload

| No. | Override | Overload |
|---|---|---|
| 1 | 子类重写父类方法 | 同名方法但参数不同 |
| 2 | 方法签名必须相同 | 参数列表必须不同 |
| 3 | 发生在 inheritance 关系中 | 可以在同一个 class，也可以在 subclass |
| 4 | 运行时根据 object type 决定 | 主要在编译时根据参数决定 |
| 5 | 可以用 @Override 检查 | 不能用 @Override 当成重写 |
| 6 | 常用于多态 | 常用于提供多个使用方式 |

---

## Override example

```java
public class Animal {
    public String makeSound() {
        return "Some animal sound";
    }
}

public class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Woof";
    }
}

这里 Dog 重写了 Animal 的 makeSound()。

Overload example
public String makeSound() {
    return "Woof";
}

public String makeSound(String mood) {
    return "Woof because dog is " + mood;
}

这里两个方法名字一样，但是参数不同，所以是 overload。

My understanding

Override 是替换父类行为。

Overload 是提供同名方法的不同参数版本。

Override 和 polymorphism 关系更大。

Overload 更像是让同一个方法名有多种输入方式。

