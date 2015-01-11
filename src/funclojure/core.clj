(ns funclojure.core
  (:require [ring.util.response :refer [resource-response response]]
            [stencil.core :refer [render-file]]
            [ring.adapter.jetty :as jetty])
  (:use [ring.middleware.params]))

(defn handler [request]
  {:status  200
     :headers {}
     :body    (render-file "public/index.html" {:returnUrl ((-> request :params) "returnUrl" )})})

(def app
  (wrap-params handler))

(defn start []
  (jetty/run-jetty app {:port 3000}))

(comment
  (start))