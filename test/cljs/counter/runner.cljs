(ns counter.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [counter.core-test]))

(doo-tests 'counter.core-test)
