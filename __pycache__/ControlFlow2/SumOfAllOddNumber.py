n=int(input("enter an integer a"))
odd_sum=0
for i in range(1,n+1):
    if i%2!=0:
        odd_sum+=i
print("sum of odd number from 1 to",n,"is",odd_sum)