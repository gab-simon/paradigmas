module Question where

-- (*) Reverse a list.

revertList :: [a] -> [a]
revertList [] = []
revertList (x:xs) = revertList xs ++ [x]

main = do
    print $ revertList [1,2,3,4]
    print $ revertList [1..100]
