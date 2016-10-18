(ns takelist.middleware.product
  (:import [java.util UUID]))

(def ^:private dummy-product
  {:name "Club Mate" :id (UUID/randomUUID)})

(defn wrap-product [handler]
  (fn [request]
    (handler (assoc request :product dummy-product))))
