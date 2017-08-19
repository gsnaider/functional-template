(ns exercise4)

(defn summary
  "Returns the sum of all elements from a collection."
  [collection]
  (reduce + 0 collection)
)