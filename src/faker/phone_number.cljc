(ns faker.phone-number
  "Generate fake phone numbers."
  (:require [clojure.string :as string]))

(defn phone-number []
  "Lazy sequence of random phone numbers."
  (string/replace "###-###-####"
                  #"#"
                  (fn [_] (str (rand-int 10)))))

