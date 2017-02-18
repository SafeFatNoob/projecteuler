#! python3

prime = 600851475143
current = 2

while (prime > current):
    if(prime%current) == 0:
        prime = prime/current
        current = 2
    else:
        current += 1
print(current)
    
