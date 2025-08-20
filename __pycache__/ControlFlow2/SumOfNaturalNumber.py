n=int(input("enter an integer n"))
if n<1:
    print("enter a natural number greater than 1 ")
else:
    total_sum=n*(n+1)//2
    print("sum of natural number from 1 to",n,"is", total_sum)