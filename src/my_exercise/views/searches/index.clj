(ns my_exercise.views.searches.index
  (:require [hiccup.core :refer [h]]
            [ring.util.anti-forgery :as anti-forgery]))

(defn display-index
  [search-results]
  "Hello World")
  ; [:div
  ;   [:ul
  ;     (map
  ;       (fn [results] [:li
  ;                     [:p (h (:id results))]])
  ;       search-results)]])
