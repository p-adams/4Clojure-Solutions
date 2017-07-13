(ns week-one.core-test
  (:require [clojure.test :refer :all]
            [week-one.core :refer :all]
            [clojure.set]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

; day one problems 

(deftest prob-one
  (testing "problem #1."
    (is (= true true))))

(deftest prob-three
  (testing "problem #3."
    (is
     (= "HELLO WORLD" (.toUpperCase "hello world")))))

(deftest prob-four
  (testing "problem #4."
    (is
     (= (list :a :b :c) '(:a :b :c)))))

(deftest prob-five-a
  (testing "problem #5.A"
    (is
     (= '(1 2 3 4) (conj '(2 3 4) 1)))))

(deftest prob-five-b
  (testing "problem #5.B"
    (is
     (= '(1 2 3 4) (conj '(3 4) 2 1)))))

(deftest prob-six-a
  (testing "problem #6.A"
    (is
     (= [:a :b :c] (list :a :b :c)))))

(deftest prob-six-b
  (testing "problem #6.B"
    (is
     (= [:a :b :c] (vec '(:a :b :c))))))

(deftest prob-six-c
  (testing "problem #6.C"
    (is
     (= [:a :b :c] (vector :a :b :c)))))


(deftest prob-seven-a
  (testing "problem #7.A"
    (is
     (= [1 2 3 4] (conj [1 2 3] 4)))))

(deftest prob-seven-b
  (testing "problem #7.B"
    (is
     (= [1 2 3 4] (conj [1 2] 3 4)))))

(deftest prob-eight-a
  (testing "problem #8.A"
    (is
     (= #{:a :b :c :d} (set '(:a :a :b :c :c :c :d :d))))))

(deftest prob-eight-b
  (testing "problem #8.B"
    (is
     (= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d})))))

(deftest prob-nine
  (testing "problem #9"
    (is
     (= #{1 2 3 4} (conj #{1 3 4} 2)))))

(deftest prob-ten-a
  (testing "problem #10.A"
    (is
     (= 20 ((hash-map :a 10 :b 20 :c 30) :b)))))

(deftest prob-ten-b
  (testing "problem #10.B"
    (is
     (= 20 (:b {:a 10 :b 20 :c 30})))))

(deftest eleven
  (testing "problem #11"
    (is
     (= {:a 1 :b 2 :c 3} (conj {:a 1} [:b 2] [:c 3])))))

(deftest twelve-a
  (testing "problem #12.A"
    (is
     (= 3 (first '(3 2 1))))))

(deftest twelve-b
  (testing "problem #12.B"
    (is
     (= 3 (second [2 3 4])))))

(deftest twelve-c
  (testing "problem #12.C"
    (is
     (= 3 (last (list 1 2 3))))))

; day two problems

(deftest thirteen
  (testing "problem #13"
    (is
     (= '(20 30 40) (rest
                     [10 20 30 40])))))
