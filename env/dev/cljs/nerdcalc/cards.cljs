(ns nerdcalc.cards
  (:require [reagent.core :as reagent :refer [atom]]
            [nerdcalc.core :as core]
            [devcards.core :as dc])
  (:require-macros
   [devcards.core
    :as dc
    :refer [defcard defcard-doc defcard-rg deftest]]))

;(defcard-rg first-card
;  [:div>h1 "This is your first devcard!"])

(defcard-rg scheda
            [core/conticino {:testo "1 + 1" :risultato? 3 :stato :nonso}])


(defcard-rg home-page-card
  [core/home-page])

(reagent/render [:div] (.getElementById js/document "app"))

;; remember to run 'lein figwheel devcards' and then browse to
;; http://localhost:3449/cards
