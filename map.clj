(defn my-map 
  [f coll]
  (loop [c coll final []]
    (if(empty? c)
        final
        (recur (rest c) (conj final (f (first c))))
    )
  )
)