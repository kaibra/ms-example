(defproject kaibra/ms-example "0.0.1"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/tools.logging "0.3.1"]
                 [org.clojure/clojure "1.8.0"]

                 [kaibra/mount-ms "0.0.2"]
                 [kaibra/ms-httpkit "0.0.2"]

                 [mount "0.1.9"]

                 [javax.servlet/servlet-api "2.5"]
                 [org.slf4j/slf4j-api "1.7.16"]
                 [ch.qos.logback/logback-core "1.1.5"]
                 [ch.qos.logback/logback-classic "1.1.5"]]
  :main ^:skip-aot kaibra.ms-example
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
