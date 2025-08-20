N=int(input("enter a positive integer N "))
if(N>0):
    for i in range(N,0,-1):
        print(i, end=' ')
else:
    print("enter a positive number")