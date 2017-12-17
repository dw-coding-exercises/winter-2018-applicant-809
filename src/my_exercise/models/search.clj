(ns my_exercise.models.search
  (:require [clj-http.client :as client]
            [clojure.data.json :as json]))

(defn parse-JSON
  [response-body]
  (json/read-str response-body :key-fn keyword))

(defn get-elections
  [city state]
  (:body
    (client/get (str "https://api.turbovote.org/elections/upcoming?district-divisions=ocd-division/country:us/state:" (clojure.string/lower-case state) ",ocd-division/country:us/state:" (clojure.string/lower-case state) "/place:" (clojure.string/lower-case city))
                {:headers {"Accept" "application/json"}})))

(defn find-by-address
  "process submitted city and state"
  [city state]
      (get-elections city state))
