(ns my_exercise.models.search
  (:require [clj-http.client :as client]
            [clojure.data.json :as json]))

(defn get-elections
  [address]
  (println address))


(defn find-by-address
  "process submitted address"
  [address]
    (get-elections address))
