n=int(input("enter a positive integer n"))
if n>0:
    print("odd number from 1 to",n, "are:")
    for i in range(1,n+1,2):
        print(i,end=' ')
else:
    print("enter a positive integer")