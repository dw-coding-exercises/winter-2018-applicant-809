(ns my_exercise.controllers.searches
  (:require [compojure.core :refer [defroutes POST]]
            [clojure.string :as str]
            [ring.util.response :as ring]
            [my_exercise.models.search :as model]))

(defn index
  [])

(defroutes routes
  (POST "/search" [] (index)))
