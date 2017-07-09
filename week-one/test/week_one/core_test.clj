(ns week-one.core-test
  (:require [clojure.test :refer :all]
            [week-one.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

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
  (testing "problem 5.B"
    (is
     (= '(1 2 3 4) (conj '(3 4) 2 1)))))
