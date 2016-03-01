(ns kaibra.stateful.example2
  (:require
    [mount.core :refer [defstate]]
    [compojure.core :as c]
    [clojure.tools.logging :as log]))

(defn start-example2-state []
  (log/info "--> Starting example2 state")
  (atom 0))

(defstate example2
          :start (start-example2-state))

(def example2-handler
  (c/GET "/example2" []
    (swap! example2 inc)
    {:status 200
     :body   (format "<html><body><h1>Total requests:%s</h1></body></html>" @example2)}))
