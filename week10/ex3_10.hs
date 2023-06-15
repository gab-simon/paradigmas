module Question where

-- (*) Find the K'th element of a list. Solutions 

elementAt :: [a] -> Int -> a
elementAt [] _ = error "Index out of bounds"
elementAt (x:_) 1 = x
elementAt (_:xs) k
    | k < 1 = error "Index out of bounds"
    | otherwise = elementAt xs (k - 1)

main = do
    print $ elementAt [1,2,3] 2
    print $ elementAt "haskell" 5