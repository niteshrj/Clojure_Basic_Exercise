(def pallindrome? 
  (comp 
   (partial every? (comp (partial apply =) (juxt first last)))  
   (partial take-while (comp not empty?))
   (partial iterate (comp rest butlast))
  )
)
