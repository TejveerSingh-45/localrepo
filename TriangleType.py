a=float(input("enter first angle"))
b=float(input("enter second angle"))
c=float(input("enter third angle"))
if(a==90)&(b==90)|(c==90):
    print("right angle triangle")
elif(a>90) |(a<180) | (b>90)|(b<180) |(c>90)|(c<180):
    print("obstube angle triangle")
else:
    print("actute angle triangle")