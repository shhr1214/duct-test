(ns duct-test.view.issues.index
  (:require [duct-test.view.layout :as layout]))

(defn show-all-issues []
  (layout/common [:h2 "チケット一覧"]))
