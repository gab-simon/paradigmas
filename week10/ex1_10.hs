module Questions10 where

-- (*) Find the last element of a list. Solutions

myLast :: [a] -> a
myLast [x] = x
myLast (_:xs) = myLast xs
myLast [] = error "Empty list"

main = do
    print $ myLast [1,2,3,4]
    print $ myLast ['x','y','z']