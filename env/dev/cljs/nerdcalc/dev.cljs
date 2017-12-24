(ns ^:figwheel-no-load nerdcalc.dev
  (:require
    [nerdcalc.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)
