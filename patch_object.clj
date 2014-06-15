;cannot be done

;http://grokbase.com/t/gg/clojure/122ae7qw49/protocols-and-interfaces

(extend Object
  clojure.lang.IFn
  (invoke [this]
          42
          )
  
  )

;; But in clojurescript:
(extend-type js/Object
  IFn
  (-invoke
    ([this]
       42)))
