module ListComprehension where

listComprehensionThree :: [Int] -> [Int]
listComprehensionThree xs = [x * 3 | x <- xs]

listInList :: [Int] -> [[Int]]
listInList xs = [[x] | x <- xs]

main = do
    print $ listComprehensionThree [1..5]
    print $ listInList [1..5]