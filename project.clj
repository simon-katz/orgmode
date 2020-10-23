(defproject com.nomistech/orgmode "0.8.0"
  :description "Org-mode parser"
  :url "https://github.com/simon-katz/orgmode"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [hiccup "1.0.5"]
                 [org.apache.commons/commons-lang3 "3.11"]]
  :profiles {:dev {:dependencies [[midje "1.9.9"]]
                   :plugins [[lein-midje "3.2.1"]]}}
  :deploy-repositories
  [["releases"  {:sign-releases false :url "https://clojars.org/repo"}]
   ["snapshots" {:sign-releases false :url "https://clojars.org/repo"}]])
