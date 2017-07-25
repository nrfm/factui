(ns factui.test-runner
  (:require [factui.impl.session-test]
            [factui.api-test]
            [factui.api-reactive-test]
   #?(:clj [clojure.test :refer [deftest is are run-tests]]
      :cljs [cljs.test :refer-macros [deftest is are run-tests]])))

#?(:cljs (enable-console-print!))

(defn -main
  "Entry point for running tests (until *.cljc tools catch up)"
  []
  #?(:clj
     (clojure.test/run-tests
       'factui.impl.session-test
       'factui.api-reactive-test
       'factui.api-test)
     :cljs
     (cljs.test/run-tests
       'factui.impl.session-test
       'factui.api-reactive-test
       'factui.api-test)))

;; Run tests at the root level, in CLJS
#?(:cljs
   (do (-main)
       (.exit js/phantom)))



