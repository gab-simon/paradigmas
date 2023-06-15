module List where

sumAll :: [Int] -> Int
sumAll [] = 0
sumAll (x:xs) = x + sumAll xs

removePar :: [Int] -> [Int]
removePar [] = []
removePar (x:xs) 
    | mod x 2 == 0 = removePar xs
    | otherwise = x : removePar xs

reverseList :: [Int] -> [Int]
reverseList [] = []
reverseList (x:xs) = reverseList xs ++ [x]

firstLetter :: [String] -> [String]
firstLetter [] = []
firstLetter (x:xs) = [head x] : firstLetter xs

main = do 
    print $ sumAll [1,2,3]
    print $ removePar [1,2,3,4,5,6,7,8,9,10]
    print $ reverseList [1,2,3,4,5,6,7,8,9,10]
    print $ firstLetter ["Hello", "World"]