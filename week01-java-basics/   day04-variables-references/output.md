# Day 4 Output

## PrimitivePractice.java

```
age = 18
int stores whole numbers.

price = 9.99
double stores decimal numbers.

isStudent = true
boolean stores true or false.

grade = A
char stores one character.
```

---

## ReferenceDemo.java

```
Before changing b.name:
a.name = Max
b.name = Max

After changing b.name:
a.name = Luna
b.name = Luna
```

解释：

`a` 和 `b` 指向同一个 Dog object。  
所以修改 `b.name` 的时候，heap 里的同一个 object 被修改了。  
因此 `a.name` 也会变成 Luna。

---

## DogArrayDemo.java

```
Max says: Woof!
Luna says: Ruff!
Buddy says: Bark!
```

---

## StudentScoreAnalyzer.java

```
Scores: 95 70 55 80 40
Highest score: 95
Lowest score: 40
Average score: 68.0
Passing students: 3
```

---

## BookArrayDemo.java

```
Java Basics has 100 pages. It is not a long book.
Head First Java has 350 pages. It is a long book.
Big History Book has 600 pages. It is a long book.
```
