# Karel
WPI CS2102 ISP

## Building

Using Gradle makes building very straightforward.

### Requirements

- JDK 6

### Setup

1. Clone the repository and install Java 6.
2. Add the location of JDK 6 to your gradle.properties (`~/.gradle/gradle.properties`). eg:
```
java6Home=/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home
```


### Running

All build steps are executed using the Gradle wrapper, `gradlew`. Each target that Gradle can build is referred to as a task. The most common Gradle task to use is `run`.  You must supply which Karel to use when running your program.
```bash
./gradlew run -Pkarel=SuicideKarel
```

The gradlew wrapper only exists in the root of the main project, so be sure to run all commands from there.

There are a few tasks other than `run` available. To see them, run the meta-task `tasks`. This will print a list of all available tasks, with a description of each task.
