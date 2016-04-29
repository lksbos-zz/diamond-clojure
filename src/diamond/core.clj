(ns diamond.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn letters-from-A-to [letter]
  (map char (range 65 (inc (int letter))))
)
