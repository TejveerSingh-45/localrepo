a=int(input("enter an integer a"))
even_sum=0
for i in range(1,a+1):
    if i%2==0:
        even_sum+=i
print("sum of even number from 1 to",a,"is",even_sum)