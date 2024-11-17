# leecode刷题遇到的语法问题记录

这里主要是记录我写代码遇到的问题。



###### 数组长度 length

```java
        int[] a = new int[10];
        System.out.println(a.length);
```

length

> 数组是Java语言中一个内置的语言级特性，而不是一个单独的类。数组的长度属性是由JVM直接管理的，设计成字段（field）比设计成方法（method）更加直观和高效。
>
> 在Java中，`length`是数组对象的固有属性，而像`String`这样的类使用`length()`方法，是因为它们的长度需要计算或存储在其他地方。Java将两者区分开，便于开发者理解。



###### 数组复制的方法

`System.arraycopy` 是一个高效的方法，适合处理数组复制操作。

```java
        int[] a = {1,2,3,4,5,6};
        int[] b = new int[a.length+1];
        System.arraycopy(a,0,b,1,a.length);
        System.out.println(Arrays.toString(b));
```

[0, 1, 2, 3, 4, 5, 6]



###### Arrays.toString() 将数组转化为LeetCode常用的字符串形式



###### StrinBuilder 和StringBuffer的关系


| 特性 | `StringBuilder` | `StringBuffer` |
| ---- | ---- | ---- |
| **线程安全性** | 非线程安全，不适用于多线程场景。 | 线程安全，适用于多线程场景。 |
| **性能** | 性能较高，因为没有线程同步开销。 | 性能较低，因为涉及线程同步操作。 |
| **引入版本** | Java 5 | Java 1.0 |

**功能一致：** `StringBuilder` 是 `StringBuffer` 的非线程安全版本，主要用来提升单线程操作的性能。

**使用场景区分：** 根据线程环境选择适合的类。

**历史沿革：** `StringBuffer` 是较早版本的设计，为保证线程安全而加锁；后来在 Java 5 中引入了 `StringBuilder`，优化了单线程性能。



###### 0的阶乘

0 的阶乘定义为 1，这是一种数学上的约定，既符合递归定义，又方便了组合数学等领域的计算。



###### idea中 shift + f10 能够快速执行当前程序



###### 强制转换

` (int)(Math.sqrt(x));`



### 具体题目

###### p69 溢出问题

```java
    public int mySqrt(int x) {
        if(x>=46340*46340)
        return 46340;
        for (int i = 0; i <= x; i++) {
            if ((i + 1) * (i + 1) > x)
                return i;
        }
        return 0;
    }
```

这里存在溢出问题，且性能有待优化。
