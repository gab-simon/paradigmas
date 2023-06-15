module Compress where

-- (**) Eliminate consecutive duplicates of list elements.

compress :: Eq a => [a] -> [a]
compress [] = []
compress [x] = [x]
compress (x:xs) = if x == head xs then compress xs else x : compress xs

main = do 
    print $ compress "aaaabccaadeeee"
