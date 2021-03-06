(defproject clojure-101 "0.1.0-SNAPSHOT"
  :description "Sample project for learning Clojure."
  :url "https://github.com/jasongilman/clojure-101"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [jasongilman/clojure-turtle "0.3.0" :exclude [org.clojure]]]

  ;; Uncomment for warnings on reflection or boxed math.
  ; :global-vars {*warn-on-reflection* true
  ;               *unchecked-math* :warn-on-boxed}

  :profiles {:dev {:source-paths ["src" "dev" "test"]
                   :dependencies [[proto-repl "0.1.2"]
                                  [org.clojure/tools.namespace  "0.2.11"]]}})
