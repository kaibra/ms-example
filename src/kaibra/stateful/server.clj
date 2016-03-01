(ns kaibra.stateful.server
  (:require
    [kaibra.ms-httpkit :as httpk]
    [kaibra.stateful.example1 :as example1]
    [kaibra.stateful.example2 :as example2]
    [mount.core :refer [defstate]]))

(defstate server
          :start (httpk/start-server
                   example1/example1-handler
                   example2/example2-handler)
          :stop (httpk/stop-server server))
