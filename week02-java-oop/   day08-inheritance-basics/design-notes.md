## design-notes.md

```md
# Day 8 Design Notes

## 1. Animal 中哪些 state / behavior 应该放在 superclass？为什么？

Animal 中应该放所有动物共同拥有的 state 和 behavior。

共同 state：

- name
- age

共同 behavior：

- getName()
- getAge()
- move()
- makeSound()

因为 Dog、Cat、Bird 都是 Animal，它们都应该有名字和年龄，也都可以移动和发出声音。

---

## 2. Dog 独有的行为为什么不应放进 Animal？

Dog 的 `fetch()` 不应该放进 Animal。

因为不是所有动物都会 fetch。

如果把 `fetch()` 放进 Animal，Cat 和 Bird 也会继承这个方法，这不合理。

Superclass 应该只放共同内容。

Subclass 才放自己独有的内容。

---

## 3. Cat IS-A Animal 与 Animal IS-A Cat 哪一个成立？为什么？

Cat IS-A Animal 成立。

因为猫是动物的一种。

Animal IS-A Cat 不成立。

因为不是所有动物都是猫。

这说明 inheritance 有方向，不能反过来乱用。

---

## 4. 为什么 private field 仍属于对象的一部分，但子类不能直接访问？

private field 仍然存在于对象里面。

例如 Dog object 继承 Animal 后，Dog object 里面仍然有 Animal 的 name 和 age。

但是因为它们是 private，Dog class 不能直接访问。

这样做是为了保护对象的数据。

如果子类需要读取这些值，应该通过 getter。

---

## 5. 如果两个类只是“有相同代码”，是否就一定应该建立继承？

不一定。

继承需要满足 IS-A 关系。

如果只是有相同代码，但不是同一种类型，可能应该把共同代码放到 helper class，或者使用 composition。

不能为了少写几行代码就乱用 inheritance。

---

## 6. Inheritance 与 Composition 的差别是什么？

Inheritance 是 IS-A 关系。

例如：

- Dog IS-A Animal
- Cat IS-A Animal

Composition 是 HAS-A 关系。

例如：

- Car HAS-A Engine
- Student HAS-A Backpack

如果一个东西是另一个东西的一种，用 inheritance。

如果一个东西只是拥有另一个东西，用 composition。
