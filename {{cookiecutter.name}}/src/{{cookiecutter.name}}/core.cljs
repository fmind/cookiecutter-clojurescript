(ns {{cookiecutter.name}}.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defn -main
  "I don't do a lot, yet ..."
  [& args]
  (apply println "Hello," args))

(set! *main-cli-fn* -main)
