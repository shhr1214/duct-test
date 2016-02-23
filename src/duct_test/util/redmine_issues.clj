(ns duct-test.util.redmine-issues
  :require [clj-http.client :as client])

(defn get-issues [url]
  "get issues from redmine with http request"
  (client/head url {:accept :json}))
