n=int(input())
a=n
for i in range(1,4):
    j=n%10
    n=n//10
    print(j,end="")
if n==a:
    print("palindrome")
else:
    print("not a palindrome")