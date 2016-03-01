(ns kaibra.ms-example
  (:require
    [kaibra.system :as mount-ms]
    [clojure.tools.logging :as log]
    [kaibra.stateful.example2 :as example2]
    [kaibra.stateful.server :as server])
  (:gen-class))

(defn -main [& args]
  (log/info "Starting MS-EXAMPLE")
  (mount-ms/start-with-states
    #'example2/example2
    #'server/server))
