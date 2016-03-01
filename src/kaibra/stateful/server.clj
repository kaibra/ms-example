(ns kaibra.stateful.server
  (:require
    [kaibra.ms-httpkit :as httpk]
    [kaibra.stateful.counter :as counter]
    [mount.core :refer [defstate]]
    [compojure.core :as c]))

(defn static-response-route [path]
  (c/GET path []
         {:status 200
          :body   "<html><body><h1>A static response</h1></body></html>"}))

(defstate server
          :start (httpk/start-server
                   (static-response-route "/example1")
                   (counter/counter-route "/example2"))
          :stop (httpk/stop-server server))
