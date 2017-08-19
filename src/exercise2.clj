(ns exercise2)

(defn- greater-than-five
  [x]
  (> x 5)
)

(defn only-greater-than-five
  "Filters a collection keeping only the elements that are greater than five."
  [collection]
  (filter greater-than-five collection)
)