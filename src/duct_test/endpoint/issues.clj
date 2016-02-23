(ns duct-test.endpoint.issues
  (:require [compojure.core :refer :all]
            [hiccup.core :as hc]))

(defn issues-endpoint [config]
  (context "/issues" []
    (GET "/" []
      (hc/html [:div [:h1 "Hello there"]]))))
