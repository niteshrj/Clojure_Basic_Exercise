(defn my-filter
  [f coll]
  (loop [c coll final []]
    (if (empty? c)
      final
      (recur (rest c) (if (f (first c)) (conj final (first c)) final)))))