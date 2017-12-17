(ns my_exercise.controllers.searches
  (:require [compojure.core :refer [defroutes POST]]
            [clojure.string :as str]
            [ring.util.response :as ring]
            [my_exercise.models.search :as model]
            [my_exercise.views.searches.index :as search-index]))

(defn index
  [search-results]
  search-results)

(defn create
  [address]
  (println address)
  ; (model/find-by-address address)
  (index address))

(defroutes routes
  (POST "/search" [address] (create address)))
