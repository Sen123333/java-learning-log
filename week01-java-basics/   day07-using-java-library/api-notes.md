## api-notes.md

```md
# Day 7 API Notes - ArrayList

## ArrayList 常用方法

### 1. add()

作用：添加元素。

```java
list.add("A");
2. get()

作用：根据 index 取得元素。

String value = list.get(0);
3. set()

作用：替换某个 index 的元素。

list.set(0, "B");
4. remove()

作用：删除元素。

注意：

list.remove(0);

这是删除 index 0 的元素。

list.remove("A");

这是删除内容为 "A" 的元素。

如果是 ArrayList<Integer>，要删除数字对象，最好写：

list.remove(Integer.valueOf(2));

这样不会和 remove(index) 混淆。

5. contains()

作用：判断 list 是否包含某个元素。

list.contains("A");

返回 true 或 false。

6. indexOf()

作用：查找元素的位置。

list.indexOf("A");

如果找不到，返回 -1。

7. size()

作用：返回 list 里有几个元素。

list.size();
8. isEmpty()

作用：判断 list 是否为空。

list.isEmpty();

如果 list 没有元素，返回 true。

ArrayList vs Array

Array 长度固定。

ArrayList 长度可以改变。

Array 适合大小固定的数据。

ArrayList 适合需要 add、remove 的数据。
