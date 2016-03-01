(ns kaibra.stateful.counter
  (:require
    [mount.core :refer [defstate]]
    [compojure.core :as c]
    [clojure.tools.logging :as log]))

(defn start-counter []
  (log/info "--> Starting counter state")
  (atom 0))

(defstate counter
          :start (start-counter))

(defn counter-route [path]
  (c/GET path []
    (swap! counter inc)
    {:status 200
     :body   (format "<html><body><h1>Total requests:%s</h1></body></html>" @counter)}))
