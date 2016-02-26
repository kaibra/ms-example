(ns kaibra.stateful.server
  (:require
    [kaibra.ms-httpkit :as httpk]
    [mount.core :refer [defstate]]))

(defstate server
          :start (httpk/start-server)
          :stop (httpk/stop-server server))
