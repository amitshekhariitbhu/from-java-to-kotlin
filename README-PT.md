![](http://upload-images.jianshu.io/upload_images/1110736-25da08f052608195.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

# De Java para Kotlin
[![Mindorks](https://img.shields.io/badge/mindorks-opensource-blue.svg)](https://mindorks.com/open-source-projects)
[![Comunidade Mindorks](https://img.shields.io/badge/join-community-blue.svg)](https://mindorks.com/join-community)

## Imprimir na consola
 - Java

```java
System.out.print("Amit Shekhar");
System.out.println("Amit Shekhar");
```

-  Kotlin

```kotlin
print("Amit Shekhar")
println("Amit Shekhar")
```

---

## Constantes e Variáveis
- Java

```java
String name = "Amit Shekhar";
final String name = "Amit Shekhar";
```

- Kotlin

```kotlin
var name = "Amit Shekhar"
val name = "Amit Shekhar"
```

---
## Atribuição do valor null
- Java

```java
String otherName;
otherName = null;
```

- Kotlin

```kotlin
var otherName : String?
otherName = null
```

---
## Verificar se está null
-  Java

```java
if (text != null) {
    int length = text.length();
}
```

-  Kotlin

```kotlin
text?.let {
    val length = text.length
}
// or simply
val length = text?.length
```

---
## Concatenação de strings

-  Java

```java
String firstName = "Amit";
String lastName = "Shekhar";
String message = "My name is: " + firstName + " " + lastName;
```

-  Kotlin

```kotlin
val firstName = "Amit"
val lastName = "Shekhar"
val message = "My name is: $firstName $lastName"
```

---
## Nova linha
- Java

```java
String text = "First Line\n" +
              "Second Line\n" +
              "Third Line";
```

- Kotlin

```kotlin
val text = """
        |First Line
        |Second Line
        |Third Line
        """.trimMargin()
```

---

## Operação Ternária
- Java

```java
String text = x > 5 ? "x > 5" : "x <= 5";
```

- Kotlin

```kotlin
val text = if (x > 5)
              "x > 5"
           else "x <= 5"
```

---
## Operadores lógicos
- java

```java
final int andResult  = a & b;
final int orResult   = a | b;
final int xorResult  = a ^ b;
final int rightShift = a >> 2;
final int leftShift  = a << 2;
final int unsignedRightShift = a >>> 2;
```

- Kotlin

```kotlin
val andResult  = a and b
val orResult   = a or b
val xorResult  = a xor b
val rightShift = a shr 2
val leftShift  = a shl 2
val unsignedRightShift = a ushr 2
```

---
## Verificar o tipo e fazer casting (declarativo)
- Java

```java
if (object instanceof Car) {
}
Car car = (Car) object;
```

- Kotlin

```kotlin
if (object is Car) {
}
var car = object as Car
```

---
## Verificar o tipo e fazer casting (implícito)
- Java

```java
if (object instanceof Car) {
   Car car = (Car) object;
}
```

- Kotlin

```kotlin
if (object is Car) {
   var car = object // smart casting
}
```

---
## múltiplas condições
- Java

```java
if (score >= 0 && score <= 300) { }
```

- Kotlin

```kotlin
if (score in 0..300) { }
```

---
## múltiplas condições (switch-case)
- Java

```java
int score = // alguma pontuação;
String grade;
switch (score) {
    case 10:
    case 9:
        grade = "Excellent";
        break;
    case 8:
    case 7:
    case 6:
        grade = "Good";
        break;
    case 5:
    case 4:
        grade = "OK";
        break;
    case 3:
    case 2:
    case 1:
        grade = "Fail";
        break;
    default:
        grade = "Fail";
}
```

- Kotlin

```kotlin
var score = // alguma pontuação
var grade = when (score) {
    9, 10 -> "Excellent"
    in 6..8 -> "Good"
    4, 5 -> "OK"
    in 1..3 -> "Fail"
    else -> "Fail"
}
```

---
## Ciclo for
- Java

```java
for (int i = 1; i <= 10 ; i++) { }

for (int i = 1; i < 10 ; i++) { }

for (int i = 10; i >= 0 ; i--) { }

for (int i = 1; i <= 10 ; i+=2) { }

for (int i = 10; i >= 0 ; i-=2) { }

for (String item : collection) { }

for (Map.Entry<String, String> entry: map.entrySet()) { }
```

- Kotlin

```kotlin
for (i in 1..10) { }

for (i in 1 until 10) { }

for (i in 10 downTo 0) { }

for (i in 1..10 step 2) { }

for (i in 10 downTo 0 step 2) { }

for (item in collection) { }

for ((key, value) in map) { }
```

---
## Operações em Collections
- Java

```java
final List<Integer> listOfNumber = Arrays.asList(1, 2, 3, 4);

final Map<Integer, String> keyValue = new HashMap<Integer, String>();
map.put(1, "Amit");
map.put(2, "Ali");
map.put(3, "Mindorks");

// Java 9
final List<Integer> listOfNumber = List.of(1, 2, 3, 4);

final Map<Integer, String> keyValue = Map.of(1, "Amit",
                                             2, "Ali",
                                             3, "Mindorks");
```

- Kotlin

```kotlin
val listOfNumber = listOf(1, 2, 3, 4)
val keyValue = mapOf(1 to "Amit",
                     2 to "Ali",
                     3 to "Mindorks")
```

---
## For each
- Java

```java
// Java 7 ou inferior
for (Car car : cars) {
  System.out.println(car.speed);
}

// Java 8+
cars.forEach(car -> System.out.println(car.speed));

// Java 7 ou inferior
for (Car car : cars) {
  if (car.speed > 100) {
    System.out.println(car.speed);
  }
}

// Java 8+
cars.stream().filter(car -> car.speed > 100).forEach(car -> System.out.println(car.speed));
```

- Kotlin

```kotlin
cars.forEach {
    println(it.speed)
}

cars.filter { it.speed > 100 }
      .forEach { println(it.speed)}
```

---
##  Definindo Métodos
- Java

```java
void doSomething() {
   // lógica aqui
}

void doSomething(int... numbers) {
   // lógica aqui
}
```

- Kotlin

```kotlin
fun doSomething() {
   // lógica aqui
}

fun doSomething(vararg numbers: Int) {
   // lógica aqui
}
```

---
## Definindo Métodos com retorno
- Java

```java
int getScore() {
   // lógica aqui
   return score;
}
```

- Kotlin

```kotlin
fun getScore(): Int {
   // lógica aqui
   return score
}

// como uma função de apenas uma expressão

fun getScore(): Int = score
```

---

## Retornando resultado de uma operação
- Java

```java
int getScore(int value) {
   // lógica aqui
    return 2 * value;
}
```

- Kotlin

```kotlin
fun getScore(value: Int): Int {
   // lógica aqui
   return 2 * value
}

// como uma função de apenas uma expressão

fun getScore(value: Int): Int = 2 * value
```

---
## Constructores
- Java

```java
public class Utils {

    private Utils() { 
      // Esta classe não é instanciada de forma pública
    }
    
    public static int getScore(int value) {
        return 2 * value;
    }
    
}
```

- Kotlin

```kotlin
class Utils private constructor() {

    companion object {
    
        fun getScore(value: Int): Int {
            return 2 * value
        }
        
    }
}

// de outra forma

object Utils {

    fun getScore(value: Int): Int {
        return 2 * value
    }

}
```

---
## Getters e Setters
- Java

```java
public class Developer {

    private String name;
    private int age;

    public Developer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Developer developer = (Developer) o;

        if (age != developer.age) return false;
        return name != null ? name.equals(developer.name) : developer.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
```

-  Kotlin

```kotlin
data class Developer(val name: String, val age: Int)

```

- Java

```java
public class Utils {

    private Utils() { 
      // Esta classe não é instanciada de forma pública 
    }
    
    public static int triple(int value) {
        return 3 * value;
    }
    
}

int result = Utils.triple(3);

```

-  Kotlin

```kotlin
fun Int.triple(): Int {
  return this * 3
}

var result = 3.triple()
```

- Java

```java
public enum Direction {
        NORTH(1),
        SOUTH(2),
        WEST(3),
        EAST(4);

        int direction;

        Direction(int direction) {
            this.direction = direction;
        }

        public int getDirection() {
            return direction;
        }
    }
```
- Kotlin

```kotlin
enum class Direction constructor(direction: Int) {
    NORTH(1),
    SOUTH(2),
    WEST(3),
    EAST(4);

    var direction: Int = 0
        private set

    init {
        this.direction = direction
    }
}
```

---

### Coisas importantes a saber em Kotlin
* [Learn Kotlin - lateinit vs lazy](https://blog.mindorks.com/learn-kotlin-lateinit-vs-lazy)
* [Learn Kotlin - apply vs with](https://blog.mindorks.com/learn-kotlin-apply-vs-with)
* [Learn Kotlin - Data Class](https://blog.mindorks.com/learn-kotlin-data-class)
* [Learn Kotlin - Destructuring Declarations](https://blog.mindorks.com/learn-kotlin-destructuring-declarations)
* [Learn Kotlin - Extension Functions](https://blog.mindorks.com/learn-kotlin-extension-functions)
* [Learn Kotlin - Sealed Classes](https://blog.mindorks.com/learn-kotlin-sealed-classes)

### Achou útil este projecto?  :heart:
* Mostre o seu apoio clicando no botão :star: no canto superior direito desta página  :v:

[Veja os maravilhosos projectos open source do Mindorks aqui](https://mindorks.com/open-source-projects)


### Licença
```
   Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```

### Contribuindo para o De Java Para Kotlin
Basta fazer um pull request. Você está dentro!
