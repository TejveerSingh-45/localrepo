n=int(input("enter an even number"))
if n%2==0 and n>0:
    for i in range(2, n+1,2):
        print(i, end='')
else:
    print("enter a positive number")
