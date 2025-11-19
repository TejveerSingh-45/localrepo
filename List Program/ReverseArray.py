# a=[3,2,4,5,6,7,8]
list=list(map(int,input().split()))
rev=[]
for i in range(len(list)-1,-2,-2):
    rev.append(list[i])
print(rev)