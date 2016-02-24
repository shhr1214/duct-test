(ns duct-test.view.layout
  (:require [hiccup.page :refer [html5 include-css include-js]]))

(defn common [body]
  (html5
    [:head
      [:title "Duct-Test"]
      (include-css "/css/style.css")
      (include-js "")]
    [:body
      [:header.top-bar.bg-green.depth-3 "Duct-Test"]
      [:main body]]))
