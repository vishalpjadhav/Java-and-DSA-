* Find if number is prime 
Definition :- A prime number is a natural number greater than 1 that has exactly two factors:

1
The number itself

In other words, a prime number is divisible only by 1 and itself.

* pseudocode
START

INPUT n

IF n <= 1 THEN
    PRINT "Not Prime"
ELSE
    SET isPrime = true

    FOR i = 2 TO n - 1
        IF n MOD i = 0 THEN
            SET isPrime = false
            BREAK
        END IF
    END FOR

    IF isPrime = true THEN
        PRINT "Prime Number"
    ELSE
        PRINT "Not Prime Number"
    END IF
END IF

END