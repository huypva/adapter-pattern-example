The hello-world project

<div align="center">
    <img src="./assets/images/hello_world.png"/>
</div>

## Prerequisites
Make sure following software is installed on your PC
- [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17) or later

## Project structure
```
.
├── adapter-pattern
│   ├── pom.xml
│   ...
├── pom.xml
|
└── README.md
```

## Start project
```shell
$ ./mvnw clean package
$ java -jar ./adapter-pattern/target/adapter-pattern-0.0.1-SNAPSHOT.jar
20:59:11.128 [main] INFO io.github.huypva.adapterpattern.Service -- Data:Jack
```

## Contribute
The code is open sourced. I encourage fellow developers to contribute and help improve it!Ref
- Fork it
- Create your feature branch (git checkout -b new-feature)
- Ensure all tests are passing
- Commit your changes (git commit -am 'Add some feature')
- Push to the branch (git push origin my-new-feature)
- Create new Pull Request

## Reference
- https://refactoring.guru/design-patterns/adapter
- https://en.wikipedia.org/wiki/Adapter_pattern