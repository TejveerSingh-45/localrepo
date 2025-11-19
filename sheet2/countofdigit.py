n=int(input())
sum=0
while n>0:
    digit=n%10
# count number of digit
    # sum=sum+1
# sum of digit
    sum+=digit
    n//=10
print(sum)