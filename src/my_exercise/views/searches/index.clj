(ns my_exercise.views.searches.index
  (:require [hiccup.core :refer [h]]
            [ring.util.anti-forgery :as anti-forgery]))

(defn display-index
  [search-results]
  ([:div search-results]))