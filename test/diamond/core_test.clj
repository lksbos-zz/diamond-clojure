(ns diamond.core-test
  ( :use [midje.sweet :refer :all])
  ( :require [diamond.core :refer :all]))

(fact "1 + 2 should be 3"
  (+ 1 2) => 3
)

(fact "should return from A to C"
  (letters-from-A-to \C) => [\A \B \C]
)
