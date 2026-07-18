## inheritance-tree.md

```md
# Day 8 Inheritance Tree

## Animal Hierarchy

```text
Animal
├── Dog
├── Cat
└── Bird
Superclass
Animal

共同 state：

name
age

共同 behavior：

getName()
getAge()
move()
makeSound()
Subclasses
Dog

Dog IS-A Animal.

Dog 继承 Animal 的 name、age、getName()、getAge() 和 move()。

Dog override makeSound()。

Dog 有自己独有的 state：

breed

Dog 有自己独有的 behavior：

fetch()
Cat

Cat IS-A Animal.

Cat 继承 Animal 的共同方法。

Cat override makeSound()。

Cat 有自己独有的 behavior：

scratch()
Bird

Bird IS-A Animal.

Bird override makeSound()。

Bird override move()，因为鸟的移动方式可以和普通动物不同。

Bird 有自己独有的 state：

canFly

Bird 有自己独有的 behavior：

fly()
