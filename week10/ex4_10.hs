module Question where

-- (*) Find the number of elements in a list. 

myLength           :: [a] -> Int
myLength []        =  0
myLength (_:xs)    =  1 + myLength xs

main = do 
    print $ myLength [1,2,3]
    print $ myLength [1..100]