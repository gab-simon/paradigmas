module Questions where

--(*) Find out whether a list is a palindrome

isPalindrome :: (Eq a) => [a] -> Bool
isPalindrome xs = xs == (reverse xs)

main = do 
    print $ isPalindrome "madamimadam"
    print $ isPalindrome [1,2,4,8,16,8,4,2,1]