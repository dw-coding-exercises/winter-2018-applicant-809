(ns my_exercise.models.search
  (:require [clj-http.client :as client]
            [clojure.data.json :as json]))

(defn parse-JSON
  [response-body]
  (json/read-str response-body :key-fn keyword))

(defn get-elections
  [city state]
  (:body
    (client/get "https://api.turbovote.org/elections/upcoming?district-divisions=ocd-division/country:us/state:va,ocd-division/country:us/state:va/place:chilhowie"
                {:headers {"Accept" "application/json"}})))

(defn find-by-address
  "process submitted city and state"
  [city state]
    (parse-JSON
      (get-elections city state)))
