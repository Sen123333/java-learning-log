
## output.md


# Day 6 Output

## SimpleDotComTestDrive.java

PASS: miss test
PASS: first hit test
PASS: second hit test
PASS: kill test
PASS: repeated guess test
PASS: out of range -1 test
PASS: out of range 9 test
PASS: non-number test

RandomRangeDemo.java
Random start: 2 PASS
Random start: 0 PASS
Random start: 4 PASS
Random start: 1 PASS
Random start: 3 PASS
Random start: 0 PASS
Random start: 2 PASS
Random start: 4 PASS
Random start: 1 PASS
Random start: 3 PASS
Random start: 2 PASS
Random start: 0 PASS
Random start: 1 PASS
Random start: 4 PASS
Random start: 3 PASS
Random start: 2 PASS
Random start: 1 PASS
Random start: 0 PASS
Random start: 4 PASS
Random start: 3 PASS
Final result: PASS
PassByValueReassignmentDemo.java

Before changeDogName:
dog name = Original Dog
Inside changeDogName:
dog name = Changed Dog
After changeDogName:
dog name = Changed Dog

Before replaceDog:
dog name = Changed Dog
Inside replaceDog:
dog name = New Dog
After replaceDog:
dog name = Changed Dog

解释：

changeDogName() 修改的是同一个 object 的 state，所以外面可以看到变化。

replaceDog() 只是改变方法里局部 reference 的指向，不会替换外面的 dog reference。

SimpleDotComGame.java - Session 1

Enter a number: 0
miss
Enter a number: 1
hit
Enter a number: 2
hit
Enter a number: 3
kill
You took 4 guesses

SimpleDotComGame.java - Session 2

Enter a number: 2
hit
Enter a number: 2
repeat
Enter a number: -1
invalid
Enter a number: 3
hit
Enter a number: 4
kill
You took 5 guesses
