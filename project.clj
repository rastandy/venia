(defproject venia "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha15" :scope "provided"]
                 [org.clojure/clojurescript "1.9.521" :scope "provided"]]
  :plugins [[lein-doo "0.1.7"]]
  :clean-targets ^{:protect false} ["resources" "target"]
  :aliases {"test" ["do" "test" ["doo" "once" "slimer" "test"]]}
  :cljsbuild {:builds [{:id           "test"
                        :source-paths ["src" "test"]
                        :compiler     {:output-to      "resources/test/js/unit-test.js"
                                       :main           venia.runner
                                       :optimizations  :none
                                       :pretty-print   true
                                       :output-dir     "resources/test/js/gen/out"}}]})