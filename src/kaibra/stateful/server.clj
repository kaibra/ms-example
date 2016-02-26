(ns kaibra.stateful.server
  (:require
    [kaibra.ms-httpkit :as httpk]
    [compojure.core :as c]
    [mount.core :refer [defstate]]))

(def first-example-route
  (c/GET "/example1" []
    {:status 200
     :body   "<html><body><h1>MOUNT-MS example 1</h1></body></html>"}))

(def second-example-route
  (c/GET "/example2" []
    {:status 200
     :body   "<html><body><h1>MOUNT-MS example 2</h1></body></html>"}))

(defstate server
          :start (httpk/start-server
                   first-example-route
                   second-example-route)
          :stop (httpk/stop-server server))
