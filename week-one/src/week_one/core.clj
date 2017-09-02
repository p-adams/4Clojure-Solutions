(ns week-one.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn add-to-set [the-set el]
  (let [new-set (conj the-set el)]
    new-set))
  
(def a-set #{1 2 3})

(add-to-set a-set 4)


