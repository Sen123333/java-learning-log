# Day 5 Output

## DogTestDrive.java

```text
Dog name: Max
Dog size: 10
Max says: yip yip!

Change size to 60.
Dog name: Max
Dog size: 60
Max says: WOOF WOOF!

Try to set size to -5.
Invalid size. Size was not changed.
Dog name: Max
Dog size: 60
Max says: WOOF WOOF!
```

---

## BankAccountTestDrive.java

```text
Starting balance: 0.0

Deposit 100:
Deposit success: true
Balance: 100.0

Withdraw 30:
Withdraw success: true
Balance: 70.0

Withdraw 1000:
Withdraw success: false
Balance: 70.0

Deposit -10:
Deposit success: false
Balance: 70.0
```

---

## StudentTestDrive.java

```text
Student: Tom
Score: 95
Passing: true
Letter grade: A

Student: Amy
Score: 60
Passing: true
Letter grade: D

Student: Bob
Score: 59
Passing: false
Letter grade: F

Try invalid score -1:
Invalid score. Score was not changed.
Score: 59

Try invalid score 101:
Invalid score. Score was not changed.
Score: 59
```

---

## PassByValueDemo.java

```text
Before changePrimitive:
x = 10
Inside changePrimitive:
x = 99
After changePrimitive:
x = 10

Before changeDog:
dog name = Max
Inside changeDog:
dog name = Changed
After changeDog:
dog name = Changed
```

---

## Explanation

The int value did not change because Java passes a copy of the primitive value.

The Dog name changed because Java passed a copy of the reference, but the copy still points to the same Dog object.
