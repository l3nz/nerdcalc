(ns nerdcalc.prod
  (:require [nerdcalc.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
