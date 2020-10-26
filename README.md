[![Generic badge](https://img.shields.io/badge/Version-v1.0--RC-blue.svg)](https://shields.io/)

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
        System.out.println(Switch.newSwitch(s, 
        new Case<>("Hi !", () -> "This is a print !"),
        new Case<>("Not Hi !", () -> "This is another one")
        ).orElse("This is the default one !"));
    }
}
```

## Install

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
