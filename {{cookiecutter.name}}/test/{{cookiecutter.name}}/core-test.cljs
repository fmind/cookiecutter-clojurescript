(ns {{cookiecutter.name}}.core-test
    (:require [{{cookiecutter.name}}.core :as sut]
              [cljs.test :as t :include-macros true]))

(t/deftest can-execute-main
  (t/is (nil? (sut/-main))))

(t/run-tests)
