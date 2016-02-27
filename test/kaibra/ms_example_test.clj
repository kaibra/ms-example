(ns kaibra.ms-example-test
  (:require [clojure.test :refer :all]
            [test.kaibra.utils :as u]
            [kaibra.stateful.server :as server]))

(deftest a-test
  (testing "should start and stop the system"
    (u/with-extended-started-system
      [#'server/server]
      :runtime-config {:server-port "9090"}
      (is (= "no exceptions" "no exceptions")))))
