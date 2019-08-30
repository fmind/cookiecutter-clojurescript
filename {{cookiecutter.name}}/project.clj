(defproject {{cookiecutter.name}} "0.1.0-SNAPSHOT"
  :description "TODO: write a description"

  :url "{{cookiecutter.repository}}"
  :scm {:name "GIT" :url "{{cookiecutter.repository}}"}
  :license {:name "{{cookiecutter.license}}" :url "https://opensource.org/licenses/{{cookiecutter.license}}"}

  :hooks [leiningen.cljsbuild]

  :plugins [[lein-npm "0.6.2"]
            [lein-cljfmt "0.6.4"]
            [lein-githooks "0.1.0"]
            [lein-cljsbuild "1.1.7"]]

  :profiles {:dev {:githooks
                   {:pre-commit
                    ["lein cljsbuild test"
                     "lein cljfmt fix"
                     "lein check"]}}}

  :cljsbuild {:builds [{:id "main"
                        :source-paths ["src"]
                        :compiler {:main {{cookiecutter.name}}.core
                                  :target :nodejs
                                  :output-to "target/{{cookiecutter.name}}.js"}}
                      {:id "test"
                        :source-paths ["src" "test"]
                        :compiler {:main {{cookiecutter.name}}.core-test
                                  :target :nodejs
                                  :output-to "target/tests.js"}}]
              :test-commands {"all" ["node" "target/tests.js"]}}

  :dependencies [[org.clojure/clojure "{{cookiecutter.clojure}}"]
                 [org.clojure/clojurescript "{{cookiecutter.clojurescript}}"]])
