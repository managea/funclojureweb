(defproject funclojure "0.1.0"
  :description "Fun web app with clojure"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring/ring-core "1.3.1"]
                 [ring/ring-jetty-adapter "1.3.1"]
                 [stencil "0.3.5"]]
  :plugins       [[lein-ring "0.8.11"]]
  :ring         {:handler funclojure.core/app})
