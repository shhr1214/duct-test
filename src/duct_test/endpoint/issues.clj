(ns duct-test.endpoint.issues
  (:require [compojure.core :refer :all]
            [duct-test.view.issues.index :as index]
            [hiccup.core :as hc]))

(defn issues-endpoint [config]
  (context "/issues" []
    (GET "/" []
      (index/show-all-issues))))
