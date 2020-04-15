(ns fiddle.components.safe-area
  (:require [status-im.react-native.js-dependencies :refer [safe-area-context]]
            [reagent.core :as reagent]
            [oops.core :refer [oget]]))

(def provider (reagent/adapt-react-class (oget safe-area-context "SafeAreaProvider")))
(def consumer-raw (reagent/adapt-react-class (oget safe-area-context "SafeAreaConsumer")))
(def view (reagent/adapt-react-class (oget safe-area-context "SafeAreaView")))

(defn consumer [component]
  [consumer-raw
   (fn [insets]
     (reagent/as-element
      [component {:insets (js->clj insets :keywordize-keys true)}]))])
