# boot-uberjar-perf

```
$ time lein uberjar
```
```
Compiling foo.bar
Created target/bar-0.1.0-SNAPSHOT.jar
Created target/bar-0.1.0-SNAPSHOT-standalone.jar

real    0m6.654s
user    0m7.224s
sys     0m1.596s
```
```
$ time boot uberjar
```
```
Adding uberjar entries...
Compiling 1/1 foo.bar...
Writing pom.xml and pom.properties...
Writing bar-0.1.0.jar...
Sifting output files...
Writing target dir(s)...

real    0m6.329s
user    0m9.584s
sys     0m0.808s
```
