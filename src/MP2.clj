(ns MP2)

;;TODO: Write Or Parser
(defn orExpression [expList]
  (cond
    (some true? expList) true
    (some symbol? (rest expList)) (cond
                                    (<= 2 (count (remove false? (rest expList)))) (remove false? expList)
                                    (> 2 (count (remove false? (rest expList)))) (last (remove false? (rest expList)))
                                    )
    :else false
    )
    )
