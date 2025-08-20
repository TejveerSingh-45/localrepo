n=int(input("enter any num"))
sum=0
while(n>0):
    digit=n%10
    n=n//10
    sum=sum+digit
print(sum)
