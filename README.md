[![Generic badge](https://img.shields.io/badge/Version-v1.0--RC1-blue.svg)](https://shields.io/)

# J14Switches

### Use the Java 14's switches, but in Java 8

With J14Switches, you'll be able to use a simili Java 14 for your switches.

## Examples :

#### Java 14

```java
public class Main {
    public static void main(String[] args) {
        String s = "Hi !";
        System.out.println(switch (s) {
            case "Hi !" -> "This is a praint !";
            case "Not Hi !" -> "This is another one";
            default -> "This is the default one !";
        });
    }
}
```

#### With Java 8 and J14Switches

```java
import org.reddev.j14switches.Case;
import org.reddev.j14switches.Switch;

public class Main {
    public static void main(String[] args) {
        String s = "Hi !";
        System.out.println(Switch.apply(s,
                Case.key("Hi !", () -> "This is a print !"),
                Case.key("Not Hi !", () -> "This is another one")
        ).orElse("This is the default one !"));
    }
}
```

## Install

#### Maven

```xml

<repositories>
    ...
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
<dependencies>
...
<dependency>
    <groupId>com.github.RedsTom</groupId>
    <artifactId>J14Switches</artifactId>
    <version>{VERSION}</version>
</dependency>
</dependencies>
```

#### Gradle

```groovy
repositories {
    ...
    maven { url 'https://jitpack.io' }
}
dependencies {
    ...
    implementation 'com.github.RedsTom:J14Switches:{VERSION}'
}
```

## Usages with predicate

You can also use predicates as conditions in your Cases

```java
import org.reddev.j14switches.Case;
import org.reddev.j14switches.Switch;

public class Main {
    public static void main(String[] args) {
        String s = "Hi !";
        System.out.println(Switch.apply(s,
                new Case<>((u) -> u.contains("Hi"), () -> "This is a print !"),
                new Case<>((u) -> u.equalsIgnoreCase("Not !"), () -> "This is another one")
        ).orElse("This is the default one !"));
    }
}
```

## Scala Usages

```scala
import org.reddev.j14switches.{ Case, Switch };

object Main extends Application {
    var s = "Hi !"
    print(Switch(s, 
        Case.key("Hi !", () => "This is a print !"),
        Case.key("Not Hi !", () => "This is another one")
    ).orElse("Default"))
    
}
```

