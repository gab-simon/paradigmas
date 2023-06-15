module Questions10 where

-- (*) Find the last-but-one (or second-last) element of a list. 

lastButOne :: [a] -> a
lastButOne [x, _] = x
lastButOne (_:xs) = lastButOne xs
lastButOne _ = error "List does not have at least two elements"

main = do
    print $ lastButOne [1,2,3,4]
    print $ lastButOne ['x','y','z']