(ns kaibra.stateful.example1
  (:require
    [mount.core :refer [defstate]]
    [compojure.core :as c]))

(def example1-handler
  (c/GET "/example1" []
    {:status 200
     :body   "<html><body><h1>A static response</h1></body></html>"}))
