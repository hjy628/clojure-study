(print "hello clojure!\n")


(defn hello [name]
  (println "hello," name))
(hello "netease")

(print (clojure.string/join "," [1 2 3]))