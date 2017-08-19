(ns exercise3)

(defn fibonacci
  "Returns the nth fibonacci number."
  [n]
  (if (<= n 1)
    n
    (+ (fibonacci (- n 1)) (fibonacci (- n 2)))
  )
)