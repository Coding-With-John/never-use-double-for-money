# Never Use `double` for Money in Java

Demo code for the [Coding With John](https://www.youtube.com/@CodingWithJohn) video of the same name.

## The problem

```java
double coffee = 0.10;
double candy = 0.20;
System.out.println(coffee + candy);  // 0.30000000000000004
```

Most decimals we use every day, including 0.10, have no exact representation in binary. So `double` stores the closest approximation, and every addition stacks those tiny errors up. It is not a Java bug. It is how doubles work, in every language that uses them.

## Run it

Requires any JDK 8 or newer. No dependencies.

```bash
javac MoneyDemo.java MoneyFix.java
java MoneyDemo
java MoneyFix
```

`MoneyDemo` shows the bug: a coffee plus a candy comes out as 0.30000000000000004, and ten dimes do not add up to exactly one dollar. `MoneyFix` shows the two fixes: count cents as integers, or use `BigDecimal` built from a String (never from a `double`).

## The rule

If it is money, it is not a `double`. Count cents as an integer, or use `BigDecimal`.
