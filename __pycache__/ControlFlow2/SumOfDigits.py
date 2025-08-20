n=int(input("enter an integer n"))
n=abs(n)
digit_sum=0
while n>0:
    digit_sum+=n%10
    n//=10
print("sum of digit is",digit_sum)
