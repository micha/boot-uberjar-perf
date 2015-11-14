# boot-uberjar-perf

```
$ time lein uberjar
```
```
Warning: specified :main without including it in :aot. 
Implicit AOT of :main will be removed in Leiningen 3.0.0. 
If you only need AOT for your uberjar, consider adding :aot :all into your
:uberjar profile instead.
Compiling foo.bar
Created /home/micha/git/micha/boot-uberjar-perf/target/bar-0.1.0-SNAPSHOT.jar
Created /home/micha/git/micha/boot-uberjar-perf/target/bar-0.1.0-SNAPSHOT-standalone.jar

real    0m6.654s
user    0m7.224s
sys     0m1.596s
```
```
$ time boot build
```
```
Adding uberjar entries...
Compiling 1/1 foo.bar...
Writing project.jar...
Sifting output files...
Writing target dir(s)...

real    0m6.068s
user    0m9.204s
sys     0m0.808s
```
