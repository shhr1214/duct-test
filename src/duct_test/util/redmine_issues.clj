(ns duct-test.util.redmine-issues
  (:require [clj-http.client :as client]
            [cheshire.core :refer :all]))

(defn get-issues [url]
  "get issues from redmine with http request"
  (get (parse-string (:body (client/get url {:accept :json}))) "issues"))
