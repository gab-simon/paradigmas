module Calc where

calcularReajuste :: Float -> Float
calcularReajuste salario  = salario * 1.25

mediaPonderada :: Float -> Float -> Float -> Float
mediaPonderada m1 m2 m3 = (m1 + m2 + m3)/3

converteTempo :: Float -> Float
converteTempo celsius = celsius * (9 / 5) + 32

calcularIdade :: Int -> Int
calcularIdade ano = 2032 - ano

calcularMinutos :: Int -> Int -> Int
calcularMinutos h m = (h * 60) + m

calcularSalario :: Float -> Float
calcularSalario salario = salario + (salario * 0.05) - (salario * 0.07)

main = do
    print $ calcularReajuste 1000
    print $ mediaPonderada 1 2 3
    print $ converteTempo 40
    print $ calcularIdade 2003
    print $ calcularMinutos 1 30
    print $ calcularSalario 1000