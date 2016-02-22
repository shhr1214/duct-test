(ns duct-test.endpoint.issues
  (:require [compojure.core :refer :all]))

(defn issues-endpoint [config]
  (context "/issues" []
    (GET "/" []
      "Issues!!")
    (GET "/hara_s" []
      "HARA'S ISSUES")))
