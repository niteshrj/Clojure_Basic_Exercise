(def repeat-num
  (comp
   (partial apply repeat)
   (partial repeat 2)))

(def possible-factors
  (comp
   (partial apply map vector)
   (juxt repeat-num (partial range 2))))

(def prime?
  (comp
   (partial every?(comp not zero? (partial apply rem)))
   (partial possible-factors)))