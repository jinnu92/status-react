(ns fiddle.design-system.colors
  (:require [reagent.core :as reagent]))

(def white "#FFFFFF")
(def black "#000000")

(def light-theme
  {:positive-01    "#44D058"               ; Primary Positive, text, icons color
   :positive-02    "rgba(78,188,96,0.1)"   ; Secondary Positive, Supporting color for success illustrations
   :negative-01    "#FF2D55"               ; Primary Negative, text, icons color
   :negative-02    "rgba(255,45,85,0.1))"  ; Secondary Negative, Supporting color for errors illustrations
   :interactive-01 "#4360DF"               ; Accent color, buttons, own message, actions, active state
   :interactive-02 "#ECEFFC"               ; Light Accent, buttons background, actions background, messages
   :interactive-03 "rgba(255,255,255,0.1)" ; Background for interactive above accent
   :ui-background  "#FFFFFF"               ; Default view background
   :ui-01          "#EEF2F5"               ; Secondary background
   :ui-02          "rgba(0,0,0,0.1)"       ; Deviders
   :text-01        "#000000"               ; Main text color
   :text-02        "#939BA1"               ; Secondary text
   :text-03        "rgba(255,255,255,0.7)" ; Secondary on accent
   :text-04        "#4360DF"               ; Links text color
   :icon-01        "#000000"               ; Primary icons
   :icon-02        "#939BA1"               ; Secondary icons
   :icon-03        "rgba(255,255,255,0.4)" ; Secondary icons on accent bg
   :icon-04        "#FFFFFF"               ; Icons on inverse background
   :shadow-01      "rgba(0, 9, 26, 0.12)"  ; Main shadow color
   })

(def dark-theme
  {:positive-01    "#44D058"                ; Primary Positive, text, icons color
   :positive-02    "rgba(78,188,96,0.1)"    ; Secondary Positive, Supporting color for success illustrations
   :negative-01    "#FC5F5F"                ; Primary Negative, text, icons color
   :negative-02    "rgba(252, 95, 95, 0.1)" ; Secondary Negative, Supporting color for errors illustrations
   :interactive-01 "#6177E5"                ; Accent color, buttons, own message, actions, active state
   :interactive-02 "#23252F"                ; Light Accent, buttons background, actions background, messages
   :interactive-03 "rgba(255,255,255,0.1)"  ; Background for interactive above accent
   :ui-background  "#141414"                ; Default view background
   :ui-01          "#252528"                ; Secondary background
   :ui-02          "rgba(0,0,0,0.1)"        ; Deviders
   :text-01        "#FFFFFF"                ; Main text color
   :text-02        "#838C91"                ; Secondary text
   :text-03        "rgba(255,255,255,0.7)"  ; Secondary on accent
   :text-04        "#6177E5"                ; Links text color
   :icon-01        "#FFFFFF"                ; Primary icons
   :icon-02        "#838C91"                ; Secondary icons
   :icon-03        "rgba(255,255,255,0.4)"  ; Secondary icons on accent bg
   :icon-04        "#141414"                ; Icons on inverse background
   :shadow-01      "rgba(0, 0, 0, 0.75)"    ; Main shadow color
   })

(def theme (reagent/atom light-theme))
