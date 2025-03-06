# HashSet Cheat Sheet (Java)

## What is a `HashSet`?
A `HashSet` is a collection in Java that implements the `Set` interface and stores **unique elements** in an unordered manner. It is backed by a `HashMap` and provides **fast operations** for adding, removing, and checking elements.

### ⚡ Key Features
-  **No Duplicates** – Only unique elements are allowed.
-  **Fast Operations** – `add()`, `remove()`, and `contains()` run in **O(1)** average time.
-  **Unordered Storage** – Elements are stored without any guaranteed order.
- ️ **Allows One `null` Value**.

---

## 🔨 Creating a `HashSet`
```java
HashSet<Integer> numbers = new HashSet<>();
```
---

## 🎯 Common Operations
### Adding Elements
```java
numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(10); // Ignored (Duplicate)
```

### Checking if an Element Exists
```java
numbers.contains(20); // true
numbers.contains(50); // false
```

### Removing an Element
```java
numbers.remove(20);
numbers.contains(20); // false
```

### Iterating Through a `HashSet`
```java
for (int num : numbers) {
    System.out.println(num);
}
```

### Getting the Size
```java
System.out.println(numbers.size());
```

### Clearing All Elements
```java
numbers.clear();
numbers.isEmpty(); // true
```

---

## Time Complexity
| Operation      | Time Complexity |
|---------------|----------------|
| `add()`       | **O(1)** (on average) |
| `remove()`    | **O(1)** (on average) |
| `contains()`  | **O(1)** (on average) |
| `size()`      | **O(1)** |

---

## Example Program
```java
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate ignored

        // Checking if an element exists
        System.out.println(fruits.contains("Banana")); // true

        // Removing an element
        fruits.remove("Banana");
        System.out.println(fruits.contains("Banana")); // false

        // Iterating over the HashSet
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Getting the size
        System.out.println("Size: " + fruits.size());

        // Clearing the HashSet
        fruits.clear();
        System.out.println("Is empty? " + fruits.isEmpty());
    }
}
```

---

### When to Use `HashSet`?
- When you need **unique elements**.
- When **order does not matter**.
- When you need **fast insertions, deletions, and lookups**.

---
