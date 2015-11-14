(require
  '[boot.pod :as pod]
  '[clojure.java.io :as io])

(set-env!
  :resource-paths #{"src"}
  :repositories   '[["central" "https://repo1.maven.org/maven2/"]
                    ["clojars" "http://clojars.org/repo"]
                    ["Animalia nexus" "http://62.89.42.8:8082/nexus/content/groups/public"]]
  :dependencies   '[[org.clojure/clojure "1.6.0"]
                    [compojure "1.2.1"]
                    [liberator "0.12.2"]
                    [ring/ring-jetty-adapter "1.3.1"]
                    [ring/ring-json "0.3.1"]
                    [bouncer "0.3.1"]
                    [org.clojure/java.jdbc "0.3.6"]
                    ;[com.oracle/ojdbc6 "11.2.0.4"]
                    [drift "1.5.2"]
                    [hikari-cp "0.11.1"]
                    [org.slf4j/slf4j-simple "1.7.7"]
                    [jarohen/nomad "0.7.0"]
                    [buddy "0.2.3"]
                    [tailrecursion/warp  "0.1.0"]])

(task-options!
  jar    {:main 'foo.bar}
  target {:dir #{"target"}}
  sift   {:include #{#"\.jar$"}}
  aot    {:namespace #{'foo.bar}}
  pom    {:project 'foo/bar :version "0.1.0-SNAPSHOT"})

(deftask uberjar
  []
  (comp (uber) (aot) (pom) (jar) (sift) (target)))
